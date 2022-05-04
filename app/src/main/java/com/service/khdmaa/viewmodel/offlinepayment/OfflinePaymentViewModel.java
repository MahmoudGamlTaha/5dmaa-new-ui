package com.service.khdmaa.viewmodel.offlinepayment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.service.khdmaa.Config;
import com.service.khdmaa.repository.offlinepayment.OfflinePaymentRepository;
import com.service.khdmaa.utils.AbsentLiveData;
import com.service.khdmaa.utils.Utils;
import com.service.khdmaa.viewmodel.common.PSViewModel;
import com.service.khdmaa.viewobject.OfflinePaymentMethodHeader;
import com.service.khdmaa.viewobject.common.Resource;


import javax.inject.Inject;

public class OfflinePaymentViewModel extends PSViewModel {

    //region Variables

    private final LiveData<Resource<OfflinePaymentMethodHeader>> offlinePaymentHeaderData;
    private MutableLiveData<TmpDataHolder> offlinePaymetHeadertObj = new MutableLiveData<>();

    //endregion

    //region Constructors

    @Inject
    OfflinePaymentViewModel(OfflinePaymentRepository repository) {

        Utils.psLog("OfflinePaymentViewModel");

        offlinePaymentHeaderData = Transformations.switchMap(offlinePaymetHeadertObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }
            return repository.getOfflinePaymentHeaderList(Config.API_KEY, obj.limit, obj.offset);
        });


    }

    public void setOfflinePaymentHeaderListObj( String limit, String offset) {
        if (!isLoading) {
            TmpDataHolder tmpDataHolder = new TmpDataHolder();
            tmpDataHolder.limit = limit;
            tmpDataHolder.offset = offset;
            offlinePaymetHeadertObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<OfflinePaymentMethodHeader>> getOfflinePaymentHeaderData() {
        return offlinePaymentHeaderData;
    }

    class TmpDataHolder {
        public String limit = "";
        public String offset = "";
    }
}
