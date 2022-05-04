package com.service.khdmaa.viewmodel.homelist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.service.khdmaa.repository.itemcategory.ItemCategoryRepository;
import com.service.khdmaa.utils.AbsentLiveData;
import com.service.khdmaa.utils.Utils;
import com.service.khdmaa.viewmodel.common.PSViewModel;
import com.service.khdmaa.viewobject.ItemCategory;
import com.service.khdmaa.viewobject.common.Resource;
import com.service.khdmaa.viewobject.holder.CategoryParameterHolder;

import java.util.List;

import javax.inject.Inject;

public class HomeTrendingCategoryListViewModel extends PSViewModel {


    //region Variables

    private final LiveData<Resource<List<ItemCategory>>> categoryListData;
    private MutableLiveData<HomeTrendingCategoryListViewModel.TmpDataHolder> categoryListObj = new MutableLiveData<>();

    private final LiveData<Resource<Boolean>> nextPageLoadingStateData;
    private MutableLiveData<HomeTrendingCategoryListViewModel.TmpDataHolder> nextPageLoadingStateObj = new MutableLiveData<>();

    public CategoryParameterHolder categoryParameterHolder = new CategoryParameterHolder();

    //endregion

    //region Constructors

    @Inject
    HomeTrendingCategoryListViewModel(ItemCategoryRepository repository) {

        Utils.psLog("ItemCategoryViewModel");

        categoryListData = Transformations.switchMap(categoryListObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("ItemCategoryViewModel : categories");
            return repository.getAllSearchCityCategory(obj.limit, obj.offset, obj.loginUserId, obj.parameterHolder);
        });

        nextPageLoadingStateData = Transformations.switchMap(nextPageLoadingStateObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }

            Utils.psLog("Category List.");
            return repository.getNextSearchCityCategory(obj.limit, obj.offset, obj.loginUserId, obj.parameterHolder);
        });

    }

    //endregion

    public void setCategoryListObj(String limit, String offset, String loginUserId, CategoryParameterHolder parameterHolder) {
        if (!isLoading) {
            HomeTrendingCategoryListViewModel.TmpDataHolder tmpDataHolder = new HomeTrendingCategoryListViewModel.TmpDataHolder(limit, offset, loginUserId, parameterHolder);
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            tmpDataHolder.loginUserId = loginUserId;
            tmpDataHolder.parameterHolder = parameterHolder;
            categoryListObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<List<ItemCategory>>> getCategoryListData() {
        return categoryListData;
    }

    //Get Latest Category Next Page
    public void setNextPageLoadingStateObj(String limit, String offset, String loginUserId, CategoryParameterHolder parameterHolder) {

        if (!isLoading) {
            HomeTrendingCategoryListViewModel.TmpDataHolder tmpDataHolder = new HomeTrendingCategoryListViewModel.TmpDataHolder(limit, offset, loginUserId, parameterHolder);
            tmpDataHolder.offset = offset;
            tmpDataHolder.limit = limit;
            tmpDataHolder.loginUserId = loginUserId;
            tmpDataHolder.parameterHolder = parameterHolder;
            nextPageLoadingStateObj.setValue(tmpDataHolder);

            // start loading
            setLoadingState(true);
        }
    }

    public LiveData<Resource<Boolean>> getNextPageLoadingStateData() {
        return nextPageLoadingStateData;
    }

    class TmpDataHolder {

        private String limit, offset,loginUserId;
        private CategoryParameterHolder parameterHolder;

        public TmpDataHolder(String limit, String offset, String loginUserId, CategoryParameterHolder parameterHolder) {
            this.limit = limit;
            this.offset = offset;
            this.loginUserId = loginUserId;
            this.parameterHolder = parameterHolder;
        }
    }


//    class TmpDataHolder {
//
//        public String limit = "";
//        public String offset = "";
//        public String cityId = "";
//
//    }
}
