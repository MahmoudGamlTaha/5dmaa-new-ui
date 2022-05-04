package com.service.khdmaa.di;


import com.service.khdmaa.MainActivity;
import com.service.khdmaa.ui.apploading.AppLoadingActivity;
import com.service.khdmaa.ui.apploading.AppLoadingFragment;
import com.service.khdmaa.ui.blockuser.BlockUserActivity;
import com.service.khdmaa.ui.blockuser.BlockUserFragment;
import com.service.khdmaa.ui.blog.detail.BlogDetailActivity;
import com.service.khdmaa.ui.blog.detail.BlogDetailFragment;
import com.service.khdmaa.ui.blog.list.BlogListActivity;
import com.service.khdmaa.ui.blog.list.BlogListFragment;
import com.service.khdmaa.ui.category.categoryfilter.CategoryFilterFragment;
import com.service.khdmaa.ui.category.categorysorting.CategorySortingListActivity;
import com.service.khdmaa.ui.category.categorysorting.CategorySortingListFragment;
import com.service.khdmaa.ui.category.list.CategoryListActivity;
import com.service.khdmaa.ui.category.list.CategoryListFragment;
import com.service.khdmaa.ui.chat.chat.ChatActivity;
import com.service.khdmaa.ui.chat.chat.ChatFragment;
import com.service.khdmaa.ui.chat.chatimage.ChatImageFullScreenActivity;
import com.service.khdmaa.ui.chat.chatimage.ChatImageFullScreenFragment;
import com.service.khdmaa.ui.chathistory.BuyerFragment;
import com.service.khdmaa.ui.chathistory.MessageFragment;
import com.service.khdmaa.ui.chathistory.SellerFragment;
import com.service.khdmaa.ui.city.menu.CityMenuFragment;
import com.service.khdmaa.ui.city.selectedcity.SelectedCityActivity;
import com.service.khdmaa.ui.city.selectedcity.SelectedCityFragment;
import com.service.khdmaa.ui.contactus.ContactUsFragment;
import com.service.khdmaa.ui.customcamera.CameraActivity;
import com.service.khdmaa.ui.customcamera.CameraFragment;
import com.service.khdmaa.ui.customcamera.setting.CameraSettingActivity;
import com.service.khdmaa.ui.customcamera.setting.CameraSettingFragment;
import com.service.khdmaa.ui.dashboard.DashBoardSearchCategoryFragment;
import com.service.khdmaa.ui.dashboard.DashBoardSearchFragment;
import com.service.khdmaa.ui.dashboard.DashBoardSearchSubCategoryFragment;
import com.service.khdmaa.ui.dashboard.DashboardSearchByCategoryActivity;
import com.service.khdmaa.ui.forceupdate.ForceUpdateActivity;
import com.service.khdmaa.ui.forceupdate.ForceUpdateFragment;
import com.service.khdmaa.ui.gallery.GalleryActivity;
import com.service.khdmaa.ui.gallery.GalleryFragment;
import com.service.khdmaa.ui.gallery.detail.GalleryDetailActivity;
import com.service.khdmaa.ui.gallery.detail.GalleryDetailFragment;
import com.service.khdmaa.ui.inapppurchase.InAppPurchaseActivity;
import com.service.khdmaa.ui.inapppurchase.InAppPurchaseFragment;
import com.service.khdmaa.ui.item.detail.ItemActivity;
import com.service.khdmaa.ui.item.detail.ItemFragment;
import com.service.khdmaa.ui.item.entry.ItemEntryActivity;
import com.service.khdmaa.ui.item.entry.ItemEntryFragment;
import com.service.khdmaa.ui.item.favourite.FavouriteListActivity;
import com.service.khdmaa.ui.item.favourite.FavouriteListFragment;
import com.service.khdmaa.ui.item.featured.FeaturedListActivity;
import com.service.khdmaa.ui.item.featured.FeaturedListFragment;
import com.service.khdmaa.ui.item.history.HistoryFragment;
import com.service.khdmaa.ui.item.history.UserHistoryListActivity;
import com.service.khdmaa.ui.item.itemcondition.ItemConditionFragment;
import com.service.khdmaa.ui.item.itemcurrency.ItemCurrencyTypeFragment;
import com.service.khdmaa.ui.item.itemdealoption.ItemDealOptionTypeFragment;
import com.service.khdmaa.ui.item.itemfromfollower.ItemFromFollowerListActivity;
import com.service.khdmaa.ui.item.itemfromfollower.ItemFromFollowerListFragment;
import com.service.khdmaa.ui.item.itemlocation.ItemEntryLocationFragment;
import com.service.khdmaa.ui.item.itemlocation.ItemLocationFragment;
import com.service.khdmaa.ui.item.itemlocationfilter.ItemLocationFilterActivity;
import com.service.khdmaa.ui.item.itemlocationfilter.ItemLocationFilterFragment;
import com.service.khdmaa.ui.item.itempricetype.ItemPriceTypeFragment;
import com.service.khdmaa.ui.item.itemtownshiplocation.ItemTownshipLocationFragment;
import com.service.khdmaa.ui.item.itemtownshiplocation.TownshipLocationActivity;
import com.service.khdmaa.ui.item.itemtownshiplocation.townshipLocationFilter.ItemTownshipLocationFilterActivity;
import com.service.khdmaa.ui.item.itemtownshiplocation.townshipLocationFilter.ItemTownshipLocationFilterFragment;
import com.service.khdmaa.ui.item.itemtype.ItemTypeFragment;
import com.service.khdmaa.ui.item.itemtype.SearchViewActivity;
import com.service.khdmaa.ui.item.loginUserItem.LoginUserItemFragment;
import com.service.khdmaa.ui.item.loginUserItem.LoginUserItemListActivity;
import com.service.khdmaa.ui.item.loginUserItem.LoginUserPaidItemFragment;
import com.service.khdmaa.ui.item.map.MapActivity;
import com.service.khdmaa.ui.item.map.MapFragment;
import com.service.khdmaa.ui.item.map.PickMapFragment;
import com.service.khdmaa.ui.item.map.mapFilter.MapFilteringActivity;
import com.service.khdmaa.ui.item.map.mapFilter.MapFilteringFragment;
import com.service.khdmaa.ui.item.promote.ItemPromoteActivity;
import com.service.khdmaa.ui.item.promote.ItemPromoteFragment;
import com.service.khdmaa.ui.item.rating.RatingListActivity;
import com.service.khdmaa.ui.item.rating.RatingListFragment;
import com.service.khdmaa.ui.item.readmore.ReadMoreActivity;
import com.service.khdmaa.ui.item.readmore.ReadMoreFragment;
import com.service.khdmaa.ui.item.reporteditem.ReportedItemActivity;
import com.service.khdmaa.ui.item.reporteditem.ReportedItemFragment;
import com.service.khdmaa.ui.item.search.searchlist.SearchListActivity;
import com.service.khdmaa.ui.item.search.searchlist.SearchListFragment;
import com.service.khdmaa.ui.item.search.specialfilterbyattributes.FilteringActivity;
import com.service.khdmaa.ui.item.search.specialfilterbyattributes.FilteringFragment;
import com.service.khdmaa.ui.language.LanguageFragment;
import com.service.khdmaa.ui.location.LocationActivity;
import com.service.khdmaa.ui.notification.detail.NotificationActivity;
import com.service.khdmaa.ui.notification.detail.NotificationFragment;
import com.service.khdmaa.ui.notification.list.NotificationListActivity;
import com.service.khdmaa.ui.notification.list.NotificationListFragment;
import com.service.khdmaa.ui.notification.setting.NotificationSettingActivity;
import com.service.khdmaa.ui.notification.setting.NotificationSettingFragment;
import com.service.khdmaa.ui.offer.OfferBuyerFragment;
import com.service.khdmaa.ui.offer.OfferSellerFragment;
import com.service.khdmaa.ui.offer.OfferContainerFragment;
import com.service.khdmaa.ui.offer.OfferListActivity;
import com.service.khdmaa.ui.offlinepayment.OfflinePaymentActivity;
import com.service.khdmaa.ui.offlinepayment.OfflinePaymentHeaderListFragment;
import com.service.khdmaa.ui.paystack.PaystackActivity;
import com.service.khdmaa.ui.paystack.PaystackFragment;
import com.service.khdmaa.ui.paystackrequest.PaystackRequestActivity;
import com.service.khdmaa.ui.paystackrequest.PaystackRequestFragment;
import com.service.khdmaa.ui.privacypolicy.PrivacyPolicyActivity;
import com.service.khdmaa.ui.privacypolicy.PrivacyPolicyFragment;
import com.service.khdmaa.ui.safetytip.SafetyTipFragment;
import com.service.khdmaa.ui.safetytip.SafetyTipsActivity;
import com.service.khdmaa.ui.setting.SettingActivity;
import com.service.khdmaa.ui.setting.SettingFragment;
import com.service.khdmaa.ui.setting.appinfo.AppInfoActivity;
import com.service.khdmaa.ui.setting.appinfo.AppInfoFragment;
import com.service.khdmaa.ui.stripe.StripeActivity;
import com.service.khdmaa.ui.stripe.StripeFragment;
import com.service.khdmaa.ui.subcategory.SubCategoryActivity;
import com.service.khdmaa.ui.subcategory.SubCategoryFragment;
import com.service.khdmaa.ui.user.PasswordChangeActivity;
import com.service.khdmaa.ui.user.PasswordChangeFragment;
import com.service.khdmaa.ui.user.ProfileEditActivity;
import com.service.khdmaa.ui.user.ProfileEditFragment;
import com.service.khdmaa.ui.user.ProfileFragment;
import com.service.khdmaa.ui.user.UserFBRegisterActivity;
import com.service.khdmaa.ui.user.UserFBRegisterFragment;
import com.service.khdmaa.ui.user.UserForgotPasswordActivity;
import com.service.khdmaa.ui.user.UserForgotPasswordFragment;
import com.service.khdmaa.ui.user.UserLoginActivity;
import com.service.khdmaa.ui.user.UserLoginFragment;
import com.service.khdmaa.ui.user.UserRegisterActivity;
import com.service.khdmaa.ui.user.UserRegisterFragment;
import com.service.khdmaa.ui.user.editphone.EditPhoneActivity;
import com.service.khdmaa.ui.user.editphone.EditPhoneFragment;
import com.service.khdmaa.ui.user.editphoneverify.VerifyMobileEditActivity;
import com.service.khdmaa.ui.user.editphoneverify.VerifyMobileEditFragment;
import com.service.khdmaa.ui.user.more.MoreActivity;
import com.service.khdmaa.ui.user.more.MoreFragment;
import com.service.khdmaa.ui.user.phonelogin.PhoneLoginActivity;
import com.service.khdmaa.ui.user.phonelogin.PhoneLoginFragment;
import com.service.khdmaa.ui.user.userlist.UserListActivity;
import com.service.khdmaa.ui.user.userlist.UserListFragment;
import com.service.khdmaa.ui.user.userlist.detail.UserDetailActivity;
import com.service.khdmaa.ui.user.userlist.detail.UserDetailFragment;
import com.service.khdmaa.ui.user.verifyemail.VerifyEmailActivity;
import com.service.khdmaa.ui.user.verifyemail.VerifyEmailFragment;
import com.service.khdmaa.ui.user.verifyphone.VerifyMobileActivity;
import com.service.khdmaa.ui.user.verifyphone.VerifyMobileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//import com.panaceasoft.psbuyandsell.ui.followinguser.FollowingUserActivity;
//import com.panaceasoft.psbuyandsell.ui.followinguser.FollowingUserFragment;
//import com.panaceasoft.psbuyandsell.ui.followinguser.detail.FollowingUserDetailActivity;
//import com.panaceasoft.psbuyandsell.ui.followinguser.detail.FollowingUserDetailFragment;

/**
 * Created by Panacea-Soft on 11/15/17.
 * Contact Email : teamps.is.cool@gmail.com
 */


@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FavouriteListModule.class)
    abstract FavouriteListActivity contributeFavouriteListActivity();

    @ContributesAndroidInjector(modules = FeaturedListModule.class)
    abstract FeaturedListActivity contributeFeaturedListActivity();

    @ContributesAndroidInjector(modules = UserHistoryModule.class)
    abstract UserHistoryListActivity contributeUserHistoryListActivity();

    @ContributesAndroidInjector(modules = BlockUserModule.class)
    abstract BlockUserActivity contributeBlockUserActivity();

    @ContributesAndroidInjector(modules = ReportItemModule.class)
    abstract ReportedItemActivity contributeReportItemActivity();

    @ContributesAndroidInjector(modules = OfferListModule.class)
    abstract OfferListActivity contributeOfferListActivity();

    @ContributesAndroidInjector(modules = UserRegisterModule.class)
    abstract UserRegisterActivity contributeUserRegisterActivity();

    @ContributesAndroidInjector(modules = UserFBRegisterModule.class)
    abstract UserFBRegisterActivity contributeUserFBRegisterActivity();

    @ContributesAndroidInjector(modules = UserForgotPasswordModule.class)
    abstract UserForgotPasswordActivity contributeUserForgotPasswordActivity();

    @ContributesAndroidInjector(modules = UserLoginModule.class)
    abstract UserLoginActivity contributeUserLoginActivity();

    @ContributesAndroidInjector(modules = PasswordChangeModule.class)
    abstract PasswordChangeActivity contributePasswordChangeActivity();

    @ContributesAndroidInjector(modules = FilteringModule.class)
    abstract FilteringActivity filteringActivity();

    @ContributesAndroidInjector(modules = SubCategoryActivityModule.class)
    abstract SubCategoryActivity subCategoryActivity();

    @ContributesAndroidInjector(modules = NotificationModule.class)
    abstract NotificationListActivity notificationActivity();

    @ContributesAndroidInjector(modules = CameraSettingActivityModule.class)
    abstract CameraSettingActivity cameraSettingActivity();

   @ContributesAndroidInjector(modules = PhoneLoginActivityModule.class)
    abstract PhoneLoginActivity contributePhoneLoginActivity();

    @ContributesAndroidInjector(modules = PhoneEditActivityModule.class)
    abstract EditPhoneActivity contributePhoneEditActivity();

    @ContributesAndroidInjector(modules = VerifyPhoneEditActivityModule.class)
    abstract VerifyMobileEditActivity contributeVerifyPhoneEditActivity();


    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchListActivity contributeSearchListActivity();

    @ContributesAndroidInjector(modules = CameraActivityModule.class)
    abstract CameraActivity contributeCameraActivity();

    @ContributesAndroidInjector(modules = ItemEntryActivityModule.class)
    abstract ItemEntryActivity contributeItemEntryActivity();

    @ContributesAndroidInjector(modules = ItemPromoteEntryActivityModule.class)
    abstract ItemPromoteActivity contributeItemPromoteEntryActivity();

    @ContributesAndroidInjector(modules = InAppPurchaseActivityModule.class)
    abstract InAppPurchaseActivity contributeInAppPurchaseActivity();

    @ContributesAndroidInjector(modules = OfflinePaymentActivityModule.class)
    abstract OfflinePaymentActivity contributeOfflinePaymentActivity();

    @ContributesAndroidInjector(modules = NotificationDetailModule.class)
    abstract NotificationActivity notificationDetailActivity();

    @ContributesAndroidInjector(modules = ItemActivityModule.class)
    abstract ItemActivity itemActivity();

    @ContributesAndroidInjector(modules = SafetyTipsActivityModule.class)
    abstract SafetyTipsActivity safetyTipsActivity();

    @ContributesAndroidInjector(modules = GalleryDetailActivityModule.class)
    abstract GalleryDetailActivity galleryDetailActivity();

    @ContributesAndroidInjector(modules = GalleryActivityModule.class)
    abstract GalleryActivity galleryActivity();

    @ContributesAndroidInjector(modules = SearchByCategoryActivityModule.class)
    abstract DashboardSearchByCategoryActivity searchByCategoryActivity();

    @ContributesAndroidInjector(modules = readMoreActivityModule.class)
    abstract ReadMoreActivity readMoreActivity();

    @ContributesAndroidInjector(modules = EditSettingModule.class)
    abstract SettingActivity editSettingActivity();

    @ContributesAndroidInjector(modules = EditMoreModule.class)
    abstract MoreActivity editMoreActivity();

    @ContributesAndroidInjector(modules = LanguageChangeModule.class)
    abstract NotificationSettingActivity languageChangeActivity();

    @ContributesAndroidInjector(modules = ProfileEditModule.class)
    abstract ProfileEditActivity contributeProfileEditActivity();

    @ContributesAndroidInjector(modules = AppInfoModule.class)
    abstract AppInfoActivity AppInfoActivity();

    @ContributesAndroidInjector(modules = CategoryListActivityAppInfoModule.class)
    abstract CategoryListActivity categoryListActivity();

    @ContributesAndroidInjector(modules = CategorySortingListActivityAppInfoModule.class)
    abstract CategorySortingListActivity categorySortingListActivity();


    @ContributesAndroidInjector(modules = RatingListActivityModule.class)
    abstract RatingListActivity ratingListActivity();

    @ContributesAndroidInjector(modules = SelectedCityModule.class)
    abstract SelectedCityActivity selectedShopActivity();

    @ContributesAndroidInjector(modules = SelectedShopListBlogModule.class)
    abstract BlogListActivity selectedShopListBlogActivity();

    @ContributesAndroidInjector(modules = BlogDetailModule.class)
    abstract BlogDetailActivity blogDetailActivity();

    @ContributesAndroidInjector(modules = MapActivityModule.class)
    abstract MapActivity mapActivity();

    @ContributesAndroidInjector(modules = forceUpdateModule.class)
    abstract ForceUpdateActivity forceUpdateActivity();

    @ContributesAndroidInjector(modules = MapFilteringModule.class)
    abstract MapFilteringActivity mapFilteringActivity();

    @ContributesAndroidInjector(modules = SearchViewActivityModule.class)
    abstract SearchViewActivity searchViewActivity();

    @ContributesAndroidInjector(modules = LoginUserItemListActivityModule.class)
    abstract LoginUserItemListActivity loginUserItemListActivity();

    @ContributesAndroidInjector(modules = chatActivityModule.class)
    abstract ChatActivity chatActivity();

    @ContributesAndroidInjector(modules = ImageFullScreenModule.class)
    abstract ChatImageFullScreenActivity imageFullScreenActivity();

//    @ContributesAndroidInjector(modules = LoginUserItemModule.class)
//    abstract LoginUserItemListActivity contributeLoginUserItemListActivity();

    @ContributesAndroidInjector(modules = FollowerUserModule.class)
    abstract UserListActivity contributeFollowerUserListActivity();

    @ContributesAndroidInjector(modules = VerifyEmailModule.class)
    abstract VerifyEmailActivity contributeVerifyEmailActivity();

    @ContributesAndroidInjector(modules = VerifyMobileModule.class)
    abstract VerifyMobileActivity contributeVerifyMobileActivity();

    @ContributesAndroidInjector(modules = FollowerUserDetailModule.class)
    abstract UserDetailActivity contributeFollowerUserDetailActivity();

    @ContributesAndroidInjector(modules = AppLoadingActivityModule.class)
    abstract AppLoadingActivity appLoadingActivity();

    @ContributesAndroidInjector(modules = ItemFromFollowerListModule.class)
    abstract ItemFromFollowerListActivity itemFromFollowerListActivity();

    @ContributesAndroidInjector(modules = LocationActivityModule.class)
    abstract LocationActivity locationActivity();

    @ContributesAndroidInjector(modules = TownshipLocationActivityModule.class)
    abstract TownshipLocationActivity townshiplocationActivity();

    @ContributesAndroidInjector(modules = PrivacyAndPolicyActivityModule.class)
    abstract PrivacyPolicyActivity privacyPolicyActivity();

    @ContributesAndroidInjector(modules = StripeModule.class)
    abstract StripeActivity stripeActivity();

    @ContributesAndroidInjector(modules = PayStackModule.class)
    abstract PaystackActivity payStackActivity();

    @ContributesAndroidInjector(modules = PayStackRequestModule.class)
    abstract PaystackRequestActivity payStackRequestActivity();

    @ContributesAndroidInjector(modules = LocationFilterActivityModule.class)
    abstract ItemLocationFilterActivity itemLocationFilterActivity();

    @ContributesAndroidInjector(modules = TownshipLocationFilterActivityModule.class)
    abstract ItemTownshipLocationFilterActivity itemTownshipLocationFilterActivity();
}


@Module
abstract class MainModule {

    @ContributesAndroidInjector
    abstract ContactUsFragment contributeContactUsFragment();

    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();

    @ContributesAndroidInjector
    abstract PhoneLoginFragment contributePhoneLoginFragment();

    @ContributesAndroidInjector
    abstract BuyerFragment contributeBuyerFragment();

    @ContributesAndroidInjector
    abstract SellerFragment contributeSellerFragment();

    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();

    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();

    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();

    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();

    @ContributesAndroidInjector
    abstract NotificationSettingFragment contributeNotificationSettingFragment();

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract LanguageFragment contributeLanguageFragment();

    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteListFragment();

    @ContributesAndroidInjector
    abstract FeaturedListFragment contributeFeaturedListFragment();

    @ContributesAndroidInjector
    abstract LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();

    @ContributesAndroidInjector
    abstract SettingFragment contributEditSettingFragment();

    @ContributesAndroidInjector
    abstract HistoryFragment historyFragment();

    @ContributesAndroidInjector
    abstract NotificationListFragment contributeNotificationFragment();

    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract SearchListFragment contributeSearchListFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryListFragment();

    @ContributesAndroidInjector
    abstract MessageFragment contributeMessageFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();

    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();

    @ContributesAndroidInjector
    abstract OfferSellerFragment contributeOfferSellerFragment();

    @ContributesAndroidInjector
    abstract OfferContainerFragment contributeOfferContainerFragment();

    @ContributesAndroidInjector
    abstract OfferBuyerFragment contributeOfferBuyerFragment();

    @ContributesAndroidInjector
    abstract ReportedItemFragment contributeReportedItemFragment();

    @ContributesAndroidInjector
    abstract BlockUserFragment contributeBlockUserFragment();

}

@Module
abstract class ProfileEditModule {
    @ContributesAndroidInjector
    abstract ProfileEditFragment contributeProfileEditFragment();
}

@Module
abstract class UserFBRegisterModule {
    @ContributesAndroidInjector
    abstract UserFBRegisterFragment contributeUserFBRegisterFragment();
}

@Module
abstract class ItemActivityModule {
    @ContributesAndroidInjector
    abstract ItemFragment contributeItemFragment();
}

@Module
abstract class SafetyTipsActivityModule {
    @ContributesAndroidInjector
    abstract SafetyTipFragment contributeSafetyTipFragment();
}

@Module
abstract class FavouriteListModule {
    @ContributesAndroidInjector
    abstract FavouriteListFragment contributeFavouriteFragment();
}

@Module
abstract class FeaturedListModule {
    @ContributesAndroidInjector
    abstract FeaturedListFragment contributeFeaturedListFragment();
}



@Module
abstract class UserRegisterModule {
    @ContributesAndroidInjector
    abstract UserRegisterFragment contributeUserRegisterFragment();
}

@Module
abstract class UserForgotPasswordModule {
    @ContributesAndroidInjector
    abstract UserForgotPasswordFragment contributeUserForgotPasswordFragment();
}

@Module
abstract class UserLoginModule {
    @ContributesAndroidInjector
    abstract UserLoginFragment contributeUserLoginFragment();
}

@Module
abstract class PasswordChangeModule {
    @ContributesAndroidInjector
    abstract PasswordChangeFragment contributePasswordChangeFragment();
}


@Module
abstract class NotificationModule {
    @ContributesAndroidInjector
    abstract NotificationListFragment notificationFragment();
}

@Module
abstract class CameraSettingActivityModule {
    @ContributesAndroidInjector
    abstract CameraSettingFragment cameraSettingFragment();
}

@Module
abstract class PhoneLoginActivityModule {
    @ContributesAndroidInjector
    abstract PhoneLoginFragment cameraPhoneLoginFragment();
}

@Module
abstract class PhoneEditActivityModule {
    @ContributesAndroidInjector
    abstract EditPhoneFragment cameraPhoneEditFragment();
}

@Module
abstract class VerifyPhoneEditActivityModule {
    @ContributesAndroidInjector
    abstract VerifyMobileEditFragment cameraVerifyPhoneEditFragment();
}

@Module
abstract class NotificationDetailModule {
    @ContributesAndroidInjector
    abstract NotificationFragment notificationDetailFragment();
}

@Module
abstract class UserHistoryModule {
    @ContributesAndroidInjector
    abstract HistoryFragment contributeHistoryFragment();
}

@Module
abstract class BlockUserModule {
    @ContributesAndroidInjector
    abstract BlockUserFragment contributeBlockUserFragment();
}

@Module
abstract class ReportItemModule {
    @ContributesAndroidInjector
    abstract ReportedItemFragment contributeReportItemFragment();
}

@Module
abstract class OfferListModule {
    @ContributesAndroidInjector
    abstract OfferContainerFragment contributeOfferContainerFragment();

    @ContributesAndroidInjector
    abstract OfferSellerFragment contributeOfferSellerFragment();

    @ContributesAndroidInjector
    abstract OfferBuyerFragment contributeOfferBuyerFragment();
}


@Module
abstract class AppInfoModule {
    @ContributesAndroidInjector
    abstract AppInfoFragment contributeAppInfoFragment();
}

@Module
abstract class CategoryListActivityAppInfoModule {
    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

}

@Module
abstract class CategorySortingListActivityAppInfoModule {
    @ContributesAndroidInjector
    abstract CategorySortingListFragment contributeCategorySortingListFragment();

}

@Module
abstract class RatingListActivityModule {
    @ContributesAndroidInjector
    abstract RatingListFragment contributeRatingListFragment();
}

@Module
abstract class readMoreActivityModule {
    @ContributesAndroidInjector
    abstract ReadMoreFragment contributeReadMoreFragment();
}

@Module
abstract class EditSettingModule {
    @ContributesAndroidInjector
    abstract SettingFragment EditSettingFragment();
}

@Module
abstract class EditMoreModule {
    @ContributesAndroidInjector
    abstract MoreFragment EditMoreFragment();
}


@Module
abstract class LanguageChangeModule {
    @ContributesAndroidInjector
    abstract NotificationSettingFragment notificationSettingFragment();
}

@Module
abstract class EditProfileModule {
    @ContributesAndroidInjector
    abstract ProfileFragment ProfileFragment();
}

@Module
abstract class SubCategoryActivityModule {
    @ContributesAndroidInjector
    abstract SubCategoryFragment contributeSubCategoryFragment();

}

@Module
abstract class FilteringModule {

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract FilteringFragment contributeSpecialFilteringFragment();

}

@Module
abstract class SearchActivityModule {
    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment contributeCategoryFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

}


@Module
abstract class CameraActivityModule {
    @ContributesAndroidInjector
    abstract CameraFragment contributeCameraFragment();
}

@Module
abstract class ItemEntryActivityModule {
    @ContributesAndroidInjector
    abstract ItemEntryFragment contributeItemEntryFragment();
}

@Module
abstract class ItemPromoteEntryActivityModule {
    @ContributesAndroidInjector
    abstract ItemPromoteFragment contributeItemPromoteFragment();
}

@Module
abstract class InAppPurchaseActivityModule {
    @ContributesAndroidInjector
    abstract InAppPurchaseFragment contributeInAppPurchasedFragment();
}

@Module
abstract class OfflinePaymentActivityModule {
    @ContributesAndroidInjector
    abstract OfflinePaymentHeaderListFragment contributeOfflinePaymentFragment();
}

@Module
abstract class GalleryDetailActivityModule {
    @ContributesAndroidInjector
    abstract GalleryDetailFragment contributeGalleryDetailFragment();
}

@Module
abstract class GalleryActivityModule {
    @ContributesAndroidInjector
    abstract GalleryFragment contributeGalleryFragment();
}

@Module
abstract class SearchByCategoryActivityModule {

    @ContributesAndroidInjector
    abstract DashBoardSearchCategoryFragment contributeDashBoardSearchCategoryFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchSubCategoryFragment contributeDashBoardSearchSubCategoryFragment();
}

@Module
abstract class SelectedCityModule {

    @ContributesAndroidInjector
    abstract SearchListFragment contributefeaturedProductFragment();

    @ContributesAndroidInjector
    abstract CategoryListFragment categoryListFragment();

    @ContributesAndroidInjector
    abstract SelectedCityFragment contributeSelectedCityFragment();

    @ContributesAndroidInjector
    abstract CategoryFilterFragment contributeTypeFilterFragment();

    @ContributesAndroidInjector
    abstract CityMenuFragment contributeCityMenuFragment();

    @ContributesAndroidInjector
    abstract DashBoardSearchFragment contributeDashBoardSearchFragment();
}

@Module
abstract class SelectedShopListBlogModule {

    @ContributesAndroidInjector
    abstract BlogListFragment contributeSelectedShopListBlogFragment();

}

@Module
abstract class BlogDetailModule {

    @ContributesAndroidInjector
    abstract BlogDetailFragment contributeBlogDetailFragment();
}

@Module
abstract class MapActivityModule {

    @ContributesAndroidInjector
    abstract MapFragment contributeMapFragment();

    @ContributesAndroidInjector
    abstract PickMapFragment contributePickMapFragment();

}

@Module
abstract class forceUpdateModule {

    @ContributesAndroidInjector
    abstract ForceUpdateFragment contributeForceUpdateFragment();
}

@Module
abstract class MapFilteringModule {

    @ContributesAndroidInjector
    abstract MapFilteringFragment contributeMapFilteringFragment();
}

@Module
abstract class SearchViewActivityModule {

    @ContributesAndroidInjector
    abstract ItemCurrencyTypeFragment contributeItemConditionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemConditionFragment contributeItemConditionFragment();

//    @ContributesAndroidInjector
//    abstract ItemLocationFragment contributeItemLocationFragment();

    @ContributesAndroidInjector
    abstract ItemEntryLocationFragment contributeItemEntryLocationFragment();

    @ContributesAndroidInjector
    abstract ItemTownshipLocationFragment contributeItemTownshipLocationFragment();


    @ContributesAndroidInjector
    abstract ItemLocationFilterFragment contributeItemLocationFilterFragment();


    @ContributesAndroidInjector
    abstract ItemDealOptionTypeFragment contributeItemDealOptionTypeFragment();

    @ContributesAndroidInjector
    abstract ItemPriceTypeFragment contributeItemPriceTypeFragment();

    @ContributesAndroidInjector
    abstract ItemTypeFragment contributeItemTypeFragment();




}

@Module
abstract class LoginUserItemListActivityModule {

    @ContributesAndroidInjector
    abstract  LoginUserItemFragment contributeLoginUserItemFragment();

    @ContributesAndroidInjector
    abstract  LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();

}

@Module
abstract class chatActivityModule {

    @ContributesAndroidInjector
    abstract ChatFragment contributeChatFragment();
}

@Module
abstract class ImageFullScreenModule {

    @ContributesAndroidInjector
    abstract ChatImageFullScreenFragment contributeImageFullScreenFragment();

}

//@Module
//abstract class LoginUserItemModule {
//    @ContributesAndroidInjector
//    abstract LoginUserItemFragment contributeLoginUserItemFragment();
//}
//
//@Module
//abstract class LoginUserPaidItemModule {
//    @ContributesAndroidInjector
//    abstract LoginUserPaidItemFragment contributeLoginUserPaidItemFragment();
//}

@Module
abstract class FollowerUserModule {
    @ContributesAndroidInjector
    abstract UserListFragment contributeFollowerUserFragment();
}

@Module
abstract class VerifyEmailModule {
    @ContributesAndroidInjector
    abstract VerifyEmailFragment contributeVerifyEmailFragment();

}

@Module
abstract class VerifyMobileModule {
    @ContributesAndroidInjector
    abstract VerifyMobileFragment contributeVerifyMobileFragment();
}

@Module
abstract class FollowerUserDetailModule {
    @ContributesAndroidInjector
    abstract UserDetailFragment contributeFollowerUserDetailFragment();
}

@Module
abstract class AppLoadingActivityModule {

    @ContributesAndroidInjector
    abstract AppLoadingFragment contributeAppLoadingFragment();
}

@Module
abstract class ItemFromFollowerListModule {

    @ContributesAndroidInjector
    abstract ItemFromFollowerListFragment contributeItemFromFollowerListFragment();
}

@Module
abstract class LocationActivityModule {

    @ContributesAndroidInjector
    abstract ItemLocationFragment contributeItemLocationFragment();

}

@Module
abstract class TownshipLocationActivityModule {

    @ContributesAndroidInjector
    abstract ItemTownshipLocationFragment contributeItemTownshipLocationFragment();

}

@Module
abstract class LocationFilterActivityModule {

    @ContributesAndroidInjector
    abstract ItemLocationFilterFragment contributeItemLocationFilterFragment();

}

@Module
abstract class TownshipLocationFilterActivityModule {

    @ContributesAndroidInjector
    abstract ItemTownshipLocationFilterFragment contributeItemTownshipLocationFilterFragment();

}

@Module
abstract class PrivacyAndPolicyActivityModule {

    @ContributesAndroidInjector
    abstract PrivacyPolicyFragment contributePrivacyPolicyFragment();

}

@Module
abstract class StripeModule {

    @ContributesAndroidInjector
    abstract StripeFragment contributeStripeFragment();

}

@Module
abstract class PayStackModule {

    @ContributesAndroidInjector
    abstract PaystackFragment contributePayStackFragment();

}

@Module
abstract class PayStackRequestModule {

    @ContributesAndroidInjector
    abstract PaystackRequestFragment contributePayStackRequestFragment();

}
