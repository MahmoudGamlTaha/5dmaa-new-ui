package com.service.khdmaa.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.service.khdmaa.viewmodel.ItemPaidHistoryViewModel.ItemPaidHistoryViewModel;
import com.service.khdmaa.viewmodel.aboutus.AboutUsViewModel;
import com.service.khdmaa.viewmodel.apploading.PSAPPLoadingViewModel;
import com.service.khdmaa.viewmodel.blockuser.BlockUserViewModel;
import com.service.khdmaa.viewmodel.blog.BlogViewModel;
import com.service.khdmaa.viewmodel.chat.ChatViewModel;
import com.service.khdmaa.viewmodel.chathistory.ChatHistoryViewModel;
import com.service.khdmaa.viewmodel.city.CityViewModel;
import com.service.khdmaa.viewmodel.city.FeaturedCitiesViewModel;
import com.service.khdmaa.viewmodel.city.PopularCitiesViewModel;
import com.service.khdmaa.viewmodel.city.RecentCitiesViewModel;
import com.service.khdmaa.viewmodel.clearalldata.ClearAllDataViewModel;
import com.service.khdmaa.viewmodel.common.NotificationViewModel;
import com.service.khdmaa.viewmodel.common.PSNewsViewModelFactory;
import com.service.khdmaa.viewmodel.contactus.ContactUsViewModel;
import com.service.khdmaa.viewmodel.homelist.HomeTrendingCategoryListViewModel;
import com.service.khdmaa.viewmodel.image.ImageViewModel;
import com.service.khdmaa.viewmodel.item.DisabledViewModel;
import com.service.khdmaa.viewmodel.item.FavouriteViewModel;
import com.service.khdmaa.viewmodel.item.FeaturedItemViewModel;
import com.service.khdmaa.viewmodel.item.HistoryViewModel;
import com.service.khdmaa.viewmodel.item.PendingViewModel;
import com.service.khdmaa.viewmodel.item.PopularItemViewModel;
import com.service.khdmaa.viewmodel.item.RecentItemViewModel;
import com.service.khdmaa.viewmodel.item.RejectedViewModel;
import com.service.khdmaa.viewmodel.item.SpecsViewModel;
import com.service.khdmaa.viewmodel.item.TouchCountViewModel;
import com.service.khdmaa.viewmodel.itemcategory.ItemCategoryViewModel;
import com.service.khdmaa.viewmodel.itemcondition.ItemConditionViewModel;
import com.service.khdmaa.viewmodel.itemcurrency.ItemCurrencyViewModel;
import com.service.khdmaa.viewmodel.itemdealoption.ItemDealOptionViewModel;
import com.service.khdmaa.viewmodel.itemfromfollower.ItemFromFollowerViewModel;
import com.service.khdmaa.viewmodel.itemlocation.ItemLocationViewModel;
import com.service.khdmaa.viewmodel.itempricetype.ItemPriceTypeViewModel;
import com.service.khdmaa.viewmodel.itemsubcategory.ItemSubCategoryViewModel;
import com.service.khdmaa.viewmodel.itemtownshiplocation.ItemTownshipLocationViewModel;
import com.service.khdmaa.viewmodel.itemtype.ItemTypeViewModel;
import com.service.khdmaa.viewmodel.notification.NotificationsViewModel;
import com.service.khdmaa.viewmodel.offer.OfferViewModel;
import com.service.khdmaa.viewmodel.offlinepayment.OfflinePaymentViewModel;
import com.service.khdmaa.viewmodel.paypal.PaypalViewModel;
import com.service.khdmaa.viewmodel.pscount.PSCountViewModel;
import com.service.khdmaa.viewmodel.rating.RatingViewModel;
import com.service.khdmaa.viewmodel.reporteditem.ReportedItemViewModel;
import com.service.khdmaa.viewmodel.user.UserViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Panacea-Soft on 11/16/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Module
abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(PSNewsViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindUserViewModel(UserViewModel userViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(AboutUsViewModel.class)
    abstract ViewModel bindAboutUsViewModel(AboutUsViewModel aboutUsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemLocationViewModel.class)
    abstract ViewModel bindItemLocationViewModel(ItemLocationViewModel itemLocationViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemTownshipLocationViewModel.class)
    abstract ViewModel bindItemTownshipLocationViewModel(ItemTownshipLocationViewModel itemTownshipLocationViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(ItemDealOptionViewModel.class)
    abstract ViewModel bindItemDealOptionViewModel(ItemDealOptionViewModel itemDealOptionViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemConditionViewModel.class)
    abstract ViewModel bindItemConditionViewModel(ItemConditionViewModel itemConditionViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ImageViewModel.class)
    abstract ViewModel bindImageViewModel(ImageViewModel imageViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemTypeViewModel.class)
    abstract ViewModel bindItemTypeViewModel(ItemTypeViewModel itemTypeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RatingViewModel.class)
    abstract ViewModel bindRatingViewModel(RatingViewModel ratingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationViewModel.class)
    abstract ViewModel bindNotificationViewModel(NotificationViewModel notificationViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(OfflinePaymentViewModel.class)
    abstract ViewModel bindOfflinePaymentViewModel(OfflinePaymentViewModel offlinePaymentViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemFromFollowerViewModel.class)
    abstract ViewModel bindItemFromFollowerViewModel(ItemFromFollowerViewModel itemFromFollowerViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemPriceTypeViewModel.class)
    abstract ViewModel bindItemPriceTypeViewModel(ItemPriceTypeViewModel itemPriceTypeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemCurrencyViewModel.class)
    abstract ViewModel bindItemCurrencyViewModel(ItemCurrencyViewModel itemCurrencyViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(ContactUsViewModel.class)
    abstract ViewModel bindContactUsViewModel(ContactUsViewModel contactUsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DisabledViewModel.class)
    abstract ViewModel bindDisabledViewModel(DisabledViewModel disabledViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RejectedViewModel.class)
    abstract ViewModel bindRejectedViewModel(RejectedViewModel rejectedViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PendingViewModel.class)
    abstract ViewModel bindPendingViewModel(PendingViewModel pendingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FavouriteViewModel.class)
    abstract ViewModel bindFavouriteViewModel(FavouriteViewModel favouriteViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(TouchCountViewModel.class)
    abstract ViewModel bindTouchCountViewModel(TouchCountViewModel touchCountViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SpecsViewModel.class)
    abstract ViewModel bindProductSpecsViewModel(SpecsViewModel specsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel.class)
    abstract ViewModel bindHistoryProductViewModel(HistoryViewModel historyViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemCategoryViewModel.class)
    abstract ViewModel bindCityCategoryViewModel(ItemCategoryViewModel itemCategoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel.class)
    abstract ViewModel bindNotificationListViewModel(NotificationsViewModel notificationListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeTrendingCategoryListViewModel.class)
    abstract ViewModel bindHomeTrendingCategoryListViewModel(HomeTrendingCategoryListViewModel transactionListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(BlogViewModel.class)
    abstract ViewModel bindNewsFeedViewModel(BlogViewModel blogViewModel);

//    @Binds
//    @IntoMap
//    @ViewModelKey(PSAppInfoViewModel.class)
//    abstract ViewModel bindPSAppInfoViewModel(PSAppInfoViewModel psAppInfoViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ClearAllDataViewModel.class)
    abstract ViewModel bindClearAllDataViewModel(ClearAllDataViewModel clearAllDataViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(CityViewModel.class)
    abstract ViewModel bindCityViewModel(CityViewModel cityViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(com.service.khdmaa.viewmodel.item.ItemViewModel.class)
    abstract ViewModel bindItemViewModel(com.service.khdmaa.viewmodel.item.ItemViewModel itemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PopularItemViewModel.class)
    abstract ViewModel bindPopularItemViewModel(PopularItemViewModel popularItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FeaturedItemViewModel.class)
    abstract ViewModel bindFeaturedItemViewModel(FeaturedItemViewModel featuredItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RecentItemViewModel.class)
    abstract ViewModel bindRecentItemViewModel(RecentItemViewModel recentItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PSAPPLoadingViewModel.class)
    abstract ViewModel bindPSAPPLoadingViewModel(PSAPPLoadingViewModel psappLoadingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PopularCitiesViewModel.class)
    abstract ViewModel bindPopularCitiesViewModel(PopularCitiesViewModel popularCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(FeaturedCitiesViewModel.class)
    abstract ViewModel bindFeaturedCitiesViewModel(FeaturedCitiesViewModel featuredCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(RecentCitiesViewModel.class)
    abstract ViewModel bindRecentCitiesViewModel(RecentCitiesViewModel recentCitiesViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemSubCategoryViewModel.class)
    abstract ViewModel bindItemSubCategoryViewModel(ItemSubCategoryViewModel itemSubCategoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChatViewModel.class)
    abstract ViewModel bindChatViewModel(ChatViewModel chatViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ChatHistoryViewModel.class)
    abstract ViewModel bindSellerViewModel(ChatHistoryViewModel chatHistoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PSCountViewModel.class)
    abstract ViewModel bindPSCountViewModel(PSCountViewModel psCountViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PaypalViewModel.class)
    abstract ViewModel bindPaypalViewModel(PaypalViewModel paypalViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ItemPaidHistoryViewModel.class)
    abstract ViewModel bindItemPaidHistoryViewModel(ItemPaidHistoryViewModel itemPaidHistoryViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(OfferViewModel.class)
    abstract ViewModel bindOfferListViewModel(OfferViewModel offerListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ReportedItemViewModel.class)
    abstract ViewModel bindReportedItemViewModel(ReportedItemViewModel reportedItemViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(BlockUserViewModel.class)
    abstract ViewModel bindBlockUserViewModel(BlockUserViewModel blockUserViewModel);
}


