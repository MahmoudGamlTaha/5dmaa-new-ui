package com.service.khdmaa.viewmodel.itemcurrency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.service.khdmaa.repository.itemcurrency.ItemCurrencyTypeRepository;
import com.service.khdmaa.utils.AbsentLiveData;
import com.service.khdmaa.utils.Utils;
import com.service.khdmaa.viewmodel.common.PSViewModel;
import com.service.khdmaa.viewobject.ItemCurrency;
import com.service.khdmaa.viewobject.common.Resource;
import com.service.khdmaa.viewobject.holder.CategoryParameterHolder;

import java.util.List;

import javax.inject.Inject;

public class ItemCurrencyViewModel extends PSViewModel {


    //region Variables

    private final LiveData<Resource<List<ItemCurrency>>> itemTypeListData;
    private MutableLiveData<ItemCurrencyViewModel.TmpDataHolder> itemTypeListObj = new MutableLiveData<>();

    private final LiveData<Resource<Boolean>> nextPageLoadingStateData;
    private MutableLiveData<ItemCurrencyViewModel.TmpDataHolder> nextPageLoadingStateObj = new MutableLiveData<>();


    public CategoryParameterHolder categoryParameterHolder = new CategoryParameterHolder();

    //endregion

    //region Constructors

    @Inject
    ItemCurrencyViewModel(ItemCurrencyTypeRepository repository) {

        Utils.psLog("ItemCurrencyViewModel");

        itemTypeListData = Transformations.switchMap(itemTypeListObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("ItemCurrencyViewModel : categories");
            return repository.getAllItemCurrencyList(obj.limit, obj.offset);
        });

        nextPageLoadingStateData = Transformations.switchMap(nextPageLoadingStateObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("Category List.");
            return repository.getNextPageItemCurrencyList(obj.limit, obj.offset);
        });


    }

    //endregion

    public void setItemCurrencyListObj(String limit, String offset) {
        if (!isLoading) {
            TmpDataHolder tmpDataHolder = new TmpDataHolder();
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            itemTypeListObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<List<ItemCurrency>>> getItemCurrencyListData() {
        return itemTypeListData;
    }

    public void setNextPageLoadingStateObj(String limit, String offset) {

        if (!isLoading) {
            ItemCurrencyViewModel.TmpDataHolder tmpDataHolder = new ItemCurrencyViewModel.TmpDataHolder();
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            nextPageLoadingStateObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<Boolean>> getNextPageLoadingStateData() {
        return nextPageLoadingStateData;
    }

    class TmpDataHolder {
        public String limit = "";
        public String offset = "";
        public String cityId = "";
    }
}