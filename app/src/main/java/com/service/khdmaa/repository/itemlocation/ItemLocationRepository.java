package com.service.khdmaa.repository.itemlocation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

import com.service.khdmaa.AppExecutors;
import com.service.khdmaa.Config;
import com.service.khdmaa.api.ApiResponse;
import com.service.khdmaa.api.PSApiService;
import com.service.khdmaa.db.ItemLocationDao;
import com.service.khdmaa.db.PSCoreDb;
import com.service.khdmaa.repository.common.NetworkBoundResource;
import com.service.khdmaa.repository.common.PSRepository;
import com.service.khdmaa.utils.Utils;
import com.service.khdmaa.viewobject.ItemLocation;
import com.service.khdmaa.viewobject.common.Resource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemLocationRepository extends PSRepository {
    private ItemLocationDao itemLocationDao;


    @Inject
    ItemLocationRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db, ItemLocationDao itemLocationDao) {

        super(psApiService, appExecutors, db);
        this.itemLocationDao = itemLocationDao;
    }

    public LiveData<Resource<List<ItemLocation>>> getItemLocationList( String limit, String offset,String loginUserId,String keyword,String orderBy,String orderType) {

        return new NetworkBoundResource<List<ItemLocation>, List<ItemLocation>>(appExecutors) {

            @Override
            protected void saveCallResult(@NonNull List<ItemLocation> itemTypeList) {
                Utils.psLog("SaveCallResult of getAllCategoriesWithUserId");

                try {
                    db.runInTransaction(() -> {
                        itemLocationDao.deleteAllItemLocation();

                        itemLocationDao.insertAll(itemTypeList);
                    });
                } catch (Exception ex) {
                    Utils.psErrorLog("Error at ", ex);
                }
            }


            @Override
            protected boolean shouldFetch(@Nullable List<ItemLocation> data) {

                return connectivity.isConnected();
            }

            @NonNull
            @Override
            protected LiveData<List<ItemLocation>> loadFromDb() {

                Utils.psLog("Load From Db (All Categories)");

                return itemLocationDao.getAllItemLocation();

            }

            @NonNull
            @Override
            protected LiveData<ApiResponse<List<ItemLocation>>> createCall() {
                Utils.psLog("Call Get All Categories webservice.");

                return psApiService.getItemLocationList(Config.API_KEY, limit,offset,Utils.checkUserId(loginUserId),keyword,orderBy,orderType);

            }

            @Override
            protected void onFetchFailed(int code, String message) {
                Utils.psLog("Fetch Failed of About Us");

                if (code == Config.ERROR_CODE_10001) {
                    try {
                        appExecutors.diskIO().execute(() -> db.runInTransaction(() -> db.itemLocationDao().deleteAllItemLocation()));

                    } catch (Exception ex) {
                        Utils.psErrorLog("Error at ", ex);
                    }
                }
            }

        }.asLiveData();
    }

    public LiveData<Resource<Boolean>> getNextPageLocationList( String limit, String offset,String loginUserId,String keyword,String orderBy,String orderType) {

        final MediatorLiveData<Resource<Boolean>> statusLiveData = new MediatorLiveData<>();
        LiveData<ApiResponse<List<ItemLocation>>> apiResponse = psApiService.getItemLocationList(Config.API_KEY, limit,Config.API_KEY,Utils.checkUserId(loginUserId),keyword,orderBy,orderType);

        statusLiveData.addSource(apiResponse, response -> {

            statusLiveData.removeSource(apiResponse);

            //noinspection Constant Conditions
            if (response.isSuccessful()) {

                appExecutors.diskIO().execute(() -> {

                    try {
                        db.runInTransaction(() -> {
                            if (apiResponse.getValue() != null) {

                                itemLocationDao.insertAll(apiResponse.getValue().body);
                            }
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