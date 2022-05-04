package com.service.khdmaa.repository.reporteditem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

import com.service.khdmaa.AppExecutors;
import com.service.khdmaa.Config;
import com.service.khdmaa.api.ApiResponse;
import com.service.khdmaa.api.PSApiService;
import com.service.khdmaa.db.PSCoreDb;
import com.service.khdmaa.db.ReportedItemDao;
import com.service.khdmaa.repository.common.NetworkBoundResource;
import com.service.khdmaa.repository.common.PSRepository;
import com.service.khdmaa.utils.Utils;
import com.service.khdmaa.viewobject.ReportedItem;
import com.service.khdmaa.viewobject.common.Resource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ReportedItemRepository extends PSRepository {

    private final ReportedItemDao reportedItemDao;

    @Inject
    ReportedItemRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db, ReportedItemDao reportedItemDao) {
        super(psApiService, appExecutors, db);
        this.reportedItemDao = reportedItemDao;
    }

    public LiveData<Resource<List<ReportedItem>>> getReportedItemList(String limit, String offset, String loginUserId) {

        return new NetworkBoundResource<List<ReportedItem>, List<ReportedItem>>(appExecutors) {



            @Override
            protected void saveCallResult(@NonNull List<ReportedItem> item) {
                Utils.psLog("SaveCallResult of related products.");

                try {
                    db.runInTransaction(() -> {
                        db.reportedItemDao().deleteReportedItem();

                        db.reportedItemDao().insertALL(item);

                    });
                } catch (Exception ex) {
                    Utils.psErrorLog("Error at ", ex);
                }
            }

            @Override
            protected boolean shouldFetch(@Nullable List<ReportedItem> data) {
                return connectivity.isConnected();
            }

            @NonNull
            @Override
            protected LiveData<List<ReportedItem>> loadFromDb() {
                return db.reportedItemDao().getAllReportedItemListData(limit);
            }

            @NonNull
            @Override
            protected LiveData<ApiResponse<List<ReportedItem>>> createCall() {
                Utils.psLog("Call API Service to get related.");
                return psApiService.getReportedItem(Config.API_KEY,limit, offset, Utils.checkUserId(loginUserId));
            }

            @Override
            protected void onFetchFailed(int code, String message) {
                Utils.psLog("Fetch Failed (getRelated) : " + message);

                if (code == Config.ERROR_CODE_10001) {
                    try {
                        appExecutors.diskIO().execute(() -> db.runInTransaction(() -> db.reportedItemDao().deleteReportedItem()));

                    } catch (Exception ex) {
                        Utils.psErrorLog("Error at ", ex);
                    }
                }
            }

        }.asLiveData();
        }

    public LiveData<Resource<Boolean>> getNextPageReportedItemList(String limit, String offset, String loginUserId) {

        final MediatorLiveData<Resource<Boolean>> statusLiveData = new MediatorLiveData<>();

        LiveData<ApiResponse<List<ReportedItem>>> apiResponse = psApiService.getReportedItem(Config.API_KEY, limit, offset, Utils.checkUserId(loginUserId));

        statusLiveData.addSource(apiResponse, response -> {

            statusLiveData.removeSource(apiResponse);

            //noinspection Constant Conditions
            if (response.isSuccessful()) {

                appExecutors.diskIO().execute(() -> {

                    try {
                        db.runInTransaction(() -> {
                            db.reportedItemDao().insertALL(response.body);
                        });
                    } catch (Exception ex) {
                        Utils.psErrorLog("Error at ", ex);
                    }

                    statusLiveData.postValue(Resource.success(true));
                });

            } else {
                statusLiveData.postValue(Resource.error(response.errorMessage, null));
            }
        });

        return statusLiveData;
    }
}



