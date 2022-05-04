package com.service.khdmaa.ui.dashboard;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.ads.AdRequest;
import com.service.khdmaa.Config;
import com.service.khdmaa.MainActivity;
import com.service.khdmaa.R;
import com.service.khdmaa.binding.FragmentDataBindingComponent;
import com.service.khdmaa.databinding.FragmentDashboardSearchBinding;
import com.service.khdmaa.ui.common.DataBoundListAdapter;
import com.service.khdmaa.ui.common.PSFragment;
import com.service.khdmaa.utils.AutoClearedValue;
import com.service.khdmaa.utils.Constants;
import com.service.khdmaa.utils.PSDialogMsg;
import com.service.khdmaa.viewmodel.item.ItemViewModel;

public class DashBoardSearchFragment extends PSFragment implements DataBoundListAdapter.DiffUtilDispatchedInterface {

    private final androidx.databinding.DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);
    private String catId = Constants.NO_DATA;
    private String subCatId = Constants.NO_DATA;
    private String typeId = Constants.NO_DATA;
    private String priceTypeId = Constants.NO_DATA;
    private String dealOptionId = Constants.NO_DATA;
    private String conditionId = Constants.NO_DATA;
    private String locationId = Constants.EMPTY_STRING;
    private String currencyId = Constants.EMPTY_STRING;
    private String locationTownshipId = Constants.NO_DATA;
    private PSDialogMsg psDialogMsg;
    private ItemViewModel itemViewModel;


    @VisibleForTesting
    private AutoClearedValue<FragmentDashboardSearchBinding> binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDashboardSearchBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard_search, container, false, dataBindingComponent);

        binding = new AutoClearedValue<>(this, dataBinding);

        return binding.get().getRoot();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Constants.REQUEST_CODE__SEARCH_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_CATEGORY) {

            this.catId = data.getStringExtra(Constants.CATEGORY_ID);
            binding.get().categoryTextView.setText(data.getStringExtra(Constants.CATEGORY_NAME));
            itemViewModel.holder.cat_id = this.catId;
            this.subCatId ="";
            itemViewModel.holder.sub_cat_id = this.subCatId;
            binding.get().subCategoryTextView.setText("");

        } else if (requestCode == Constants.REQUEST_CODE__SEARCH_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_SUBCATEGORY) {

            this.subCatId = data.getStringExtra(Constants.SUBCATEGORY_ID);
            binding.get().subCategoryTextView.setText(data.getStringExtra(Constants.SUBCATEGORY_NAME));
            itemViewModel.holder.sub_cat_id = this.subCatId;
        } else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_LOCATION_TYPE) {

            this.locationId = data.getStringExtra(Constants.ITEM_LOCATION_TYPE_ID);
            binding.get().locationTextView.setText(data.getStringExtra(Constants.ITEM_LOCATION_TYPE_NAME));
            itemViewModel.holder.location_id = this.locationId;

            this.locationTownshipId = "";
            binding.get().townshipTextView.setText("");

        } else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_TOWNSHIP_TYPE) {

            this.locationTownshipId = data.getStringExtra(Constants.ITEM_TOWNSHIP_TYPE_ID);
            binding.get().townshipTextView.setText(data.getStringExtra(Constants.ITEM_TOWNSHIP_TYPE_NAME));
            itemViewModel.holder.location_township_id = this.locationTownshipId;

        }
        else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_TYPE) {

            this.typeId = data.getStringExtra(Constants.ITEM_TYPE_ID);
            binding.get().typeTextView.setText(data.getStringExtra(Constants.ITEM_TYPE_NAME));
            itemViewModel.holder.type_id = this.typeId;
        }
        else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_PRICE_TYPE) {

            this.priceTypeId = data.getStringExtra(Constants.ITEM_PRICE_TYPE_ID);
            binding.get().priceTypeTextView.setText(data.getStringExtra(Constants.ITEM_PRICE_TYPE_NAME));
            itemViewModel.holder.price_type_id = this.priceTypeId;
        }
        else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_CONDITION_TYPE) {

            this.conditionId = data.getStringExtra(Constants.ITEM_CONDITION_TYPE_ID);
            binding.get().itemConditionTextView.setText(data.getStringExtra(Constants.ITEM_CONDITION_TYPE_NAME));
            itemViewModel.holder.condition_id = this.conditionId;
        }
        else if (requestCode == Constants.REQUEST_CODE__SEARCH_VIEW_FRAGMENT && resultCode == Constants.RESULT_CODE__SEARCH_WITH_ITEM_OPTION_TYPE) {

            this.dealOptionId = data.getStringExtra(Constants.ITEM_OPTION_TYPE_ID);
            binding.get().dealOptionTextView.setText(data.getStringExtra(Constants.ITEM_OPTION_TYPE_NAME));
            itemViewModel.holder.deal_option_id = this.dealOptionId;
        }

    }

    @Override
    public void onDispatched() {


    }

    @Override
    protected void initUIAndActions() {
        if(getActivity() instanceof MainActivity)  {
            ((MainActivity) getActivity()).setToolbarText(((MainActivity) getActivity()).binding.toolbar, getString(R.string.menu__search));
            ((MainActivity) this.getActivity()).binding.toolbar.setBackgroundColor(getResources().getColor(R.color.global__primary));
            ((MainActivity)getActivity()).updateToolbarIconColor(Color.WHITE);
            ((MainActivity)getActivity()).updateMenuIconWhite();
            ((MainActivity) getActivity()).refreshPSCount();
        }

        psDialogMsg = new PSDialogMsg(getActivity(), false);

        if (Config.SHOW_ADMOB && connectivity.isConnected()) {
            AdRequest adRequest = new AdRequest.Builder()
                    .build();
      //      binding.get().adView.loadAd(adRequest);
        } else {
        //    binding.get().adView.setVisibility(View.GONE);
        }

        binding.get().setItemName.setHint(R.string.search__notSet);
        binding.get().categoryTextView.setHint(R.string.search__notSet);
        binding.get().subCategoryTextView.setHint(R.string.search__notSet);

        String locationName = selected_location_name;
        String locationTownshipName = selected_township_name;

        itemViewModel.holder.location_id = selected_location_id;
        itemViewModel.holder.location_township_id = selected_township_id;

        binding.get().locationTextView.setText(locationName);
        binding.get().townshipTextView.setText(locationTownshipName);

        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        AutoClearedValue<AlertDialog.Builder> alertDialog = new AutoClearedValue<>(this, builder);
        alertDialog.get().setTitle(getResources().getString(R.string.Feature_UI__search_alert_cat_title));

        binding.get().categoryTextView.setText("");
        binding.get().subCategoryTextView.setText("");

        if(Config.ENABLE_SUB_LOCATION){
            binding.get().townshipTitleTextView.setVisibility(View.VISIBLE);
            binding.get().townshipCardView.setVisibility(View.VISIBLE);
        } else {
            binding.get().townshipTitleTextView.setVisibility(View.GONE);
            binding.get().townshipCardView.setVisibility(View.GONE);
        }


        binding.get().categorySelectionView.setOnClickListener(view -> navigationController.navigateToSearchActivityCategoryFragment(this.getActivity(), Constants.CATEGORY, catId, subCatId));

        binding.get().subCategorySelectionView.setOnClickListener(view -> {

            if (catId.equals(Constants.NO_DATA) || catId.isEmpty()) {

                psDialogMsg.showWarningDialog(getString(R.string.error_message__choose_category), getString(R.string.app__ok));

                psDialogMsg.show();

            } else {
                navigationController.navigateToSearchActivityCategoryFragment(this.getActivity(), Constants.SUBCATEGORY, catId, subCatId);
            }
        });

        binding.get().locationCardView.setOnClickListener(view -> navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_LOCATION_TYPE, typeId, priceTypeId, conditionId, dealOptionId, currencyId, locationId));

        binding.get().townshipCardView.setOnClickListener(view -> {

            if (locationId.equals(Constants.NO_DATA) || locationId.isEmpty()) {

                psDialogMsg.showWarningDialog(getString(R.string.error_message__choose_city), getString(R.string.app__ok));

                psDialogMsg.show();

            } else {
                navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_TOWNSHIP_TYPE, typeId, priceTypeId, conditionId, dealOptionId, currencyId, locationId);
            }
        });

        binding.get().typeCardView.setOnClickListener(view -> navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_TYPE, typeId, priceTypeId, conditionId, dealOptionId,currencyId,locationId));

        binding.get().itemConditionCardView.setOnClickListener(view -> navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_CONDITION_TYPE, typeId, priceTypeId, conditionId, dealOptionId,currencyId,locationId));

        binding.get().priceTypeCardView.setOnClickListener(view -> navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_PRICE_TYPE, typeId, priceTypeId, conditionId, dealOptionId,currencyId,locationId));

        binding.get().dealOptionCardView.setOnClickListener(view -> navigationController.navigateToSearchViewActivity(this.getActivity(), Constants.ITEM_DEAL_OPTION_TYPE, typeId, priceTypeId, conditionId, dealOptionId,currencyId,locationId));

        binding.get().filter.setOnClickListener(view -> {

            // Get Name
            itemViewModel.holder.keyword = binding.get().setItemName.getText().toString();
            itemViewModel.holder.max_price = binding.get().highestPriceEditText1.getText().toString();
            itemViewModel.holder.min_price = binding.get().lowestPriceEditText1.getText().toString();
//            itemViewModel.holder.location_id = selected_location_id;
            itemViewModel.holder.type_name = binding.get().typeTextView.getText().toString();
            itemViewModel.holder.condition_name = binding.get().itemConditionTextView.getText().toString();
            itemViewModel.holder.price_type_name = binding.get().priceTypeTextView.getText().toString();
            itemViewModel.holder.deal_option_name = binding.get().dealOptionTextView.getText().toString();
            itemViewModel.holder.isPaid = Constants.PAIDITEMFIRST;

            // Set to Intent
            navigationController.navigateToHomeFilteringActivity(this.getActivity(), itemViewModel.holder, null , itemViewModel.holder.lat,itemViewModel.holder.lng,Constants.MAP_MILES);

        });

    }

    @Override
    protected void initViewModels() {
        itemViewModel = new ViewModelProvider(this, viewModelFactory).get(ItemViewModel.class);
    }

    @Override
    protected void initAdapters() {

    }

    @Override
    protected void initData() {
    }
}
