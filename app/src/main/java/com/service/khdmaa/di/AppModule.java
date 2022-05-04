package com.service.khdmaa.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.room.Room;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.khdmaa.Config;
import com.service.khdmaa.api.PSApiService;
import com.service.khdmaa.db.AboutUsDao;
import com.service.khdmaa.db.BlockUserDao;
import com.service.khdmaa.db.BlogDao;
import com.service.khdmaa.db.ChatHistoryDao;
import com.service.khdmaa.db.CityDao;
import com.service.khdmaa.db.CityMapDao;
import com.service.khdmaa.db.DeletedObjectDao;
import com.service.khdmaa.db.HistoryDao;
import com.service.khdmaa.db.ImageDao;
import com.service.khdmaa.db.ItemCategoryDao;
import com.service.khdmaa.db.ItemCollectionHeaderDao;
import com.service.khdmaa.db.ItemConditionDao;
import com.service.khdmaa.db.ItemCurrencyDao;
import com.service.khdmaa.db.ItemDao;
import com.service.khdmaa.db.ItemDealOptionDao;
import com.service.khdmaa.db.ItemLocationDao;
import com.service.khdmaa.db.ItemMapDao;
import com.service.khdmaa.db.ItemPaidHistoryDao;
import com.service.khdmaa.db.ItemPriceTypeDao;
import com.service.khdmaa.db.ItemSubCategoryDao;
import com.service.khdmaa.db.ItemTownshipLocationDao;
import com.service.khdmaa.db.ItemTypeDao;
import com.service.khdmaa.db.MessageDao;
import com.service.khdmaa.db.NotificationDao;
import com.service.khdmaa.db.OfferDao;
import com.service.khdmaa.db.OfflinePaymentDao;
import com.service.khdmaa.db.PSAppInfoDao;
import com.service.khdmaa.db.PSAppVersionDao;
import com.service.khdmaa.db.PSCoreDb;
import com.service.khdmaa.db.PSCountDao;
import com.service.khdmaa.db.RatingDao;
import com.service.khdmaa.db.ReportedItemDao;
import com.service.khdmaa.db.UserDao;
import com.service.khdmaa.db.UserMapDao;
import com.service.khdmaa.utils.AppLanguage;
import com.service.khdmaa.utils.Connectivity;
import com.service.khdmaa.utils.LiveDataCallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Panacea-Soft on 11/15/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Module(includes = ViewModelModule.class)
class AppModule {

    @Singleton
    @Provides
    PSApiService providePSApiService() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .writeTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build();

        return new Retrofit.Builder()
                .baseUrl(Config.APP_API_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .build()
                .create(PSApiService.class);

    }

    @Singleton
    @Provides
    PSCoreDb provideDb(Application app) {
        return Room.databaseBuilder(app, PSCoreDb.class, "psmulticity.db")
                //.addMigrations(MIGRATION_1_2)
                .fallbackToDestructiveMigration()
                .build();
    }

    @Singleton
    @Provides
    Connectivity provideConnectivity(Application app) {
        return new Connectivity(app);
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(Application app) {
        return PreferenceManager.getDefaultSharedPreferences(app.getApplicationContext());
    }

    @Singleton
    @Provides
    UserDao provideUserDao(PSCoreDb db) {
        return db.userDao();
    }

    @Singleton
    @Provides
    UserMapDao provideUserMapDao(PSCoreDb db) {
        return db.userMapDao();
    }

    @Singleton
    @Provides
    AppLanguage provideCurrentLanguage(SharedPreferences sharedPreferences) {
        return new AppLanguage(sharedPreferences);
    }

    @Singleton
    @Provides
    AboutUsDao provideAboutUsDao(PSCoreDb db) {
        return db.aboutUsDao();
    }

    @Singleton
    @Provides
    ImageDao provideImageDao(PSCoreDb db) {
        return db.imageDao();
    }

    @Singleton
    @Provides
    ItemCurrencyDao provideItemCurrencyDao(PSCoreDb db) {
        return db.itemCurrencyDao();
    }

    @Singleton
    @Provides
    ItemTypeDao provideItemTypeDao(PSCoreDb db) {
        return db.itemTypeDao();
    }

    @Singleton
    @Provides
    ItemPriceTypeDao provideItemPriceTypeDao(PSCoreDb db) {
        return db.itemPriceTypeDao();
    }

    @Singleton
    @Provides
    HistoryDao provideHistoryDao(PSCoreDb db) {
        return db.historyDao();
    }

    @Singleton
    @Provides
    RatingDao provideRatingDao(PSCoreDb db) {
        return db.ratingDao();
    }

    @Singleton
    @Provides
    ItemDealOptionDao provideItemDealOptionDao(PSCoreDb db) {
        return db.itemDealOptionDao();
    }

    @Singleton
    @Provides
    ItemConditionDao provideItemConditionDao(PSCoreDb db) {
        return db.itemConditionDao();
    }

    @Singleton
    @Provides
    ItemLocationDao provideItemLocationDao(PSCoreDb db) {
        return db.itemLocationDao();
    }

    @Singleton
    @Provides
    ItemTownshipLocationDao provideItemTownshipLocationDao(PSCoreDb db) {
        return db.itemTownshipLocationDao();
    }

    @Singleton
    @Provides
    NotificationDao provideNotificationDao(PSCoreDb db) {
        return db.notificationDao();
    }

    @Singleton
    @Provides
    BlogDao provideNewsFeedDao(PSCoreDb db) {
        return db.blogDao();
    }

    @Singleton
    @Provides
    PSAppInfoDao providePSAppInfoDao(PSCoreDb db) {
        return db.psAppInfoDao();
    }

    @Singleton
    @Provides
    PSAppVersionDao providePSAppVersionDao(PSCoreDb db) {
        return db.psAppVersionDao();
    }

    @Singleton
    @Provides
    DeletedObjectDao provideDeletedObjectDao(PSCoreDb db) {
        return db.deletedObjectDao();
    }

    @Singleton
    @Provides
    CityDao provideCityDao(PSCoreDb db) {
        return db.cityDao();
    }

    @Singleton
    @Provides
    CityMapDao provideCityMapDao(PSCoreDb db) {
        return db.cityMapDao();
    }

    @Singleton
    @Provides
    ItemDao provideItemDao(PSCoreDb db) {
        return db.itemDao();
    }

    @Singleton
    @Provides
    ItemMapDao provideItemMapDao(PSCoreDb db) {
        return db.itemMapDao();
    }

    @Singleton
    @Provides
    ItemCategoryDao provideCityCategoryDao(PSCoreDb db) {
        return db.itemCategoryDao();
    }

    @Singleton
    @Provides
    ItemCollectionHeaderDao provideItemCollectionHeaderDao(PSCoreDb db) {
        return db.itemCollectionHeaderDao();
    }

    @Singleton
    @Provides
    ItemSubCategoryDao provideItemSubCategoryDao(PSCoreDb db) {
        return db.itemSubCategoryDao();
    }

    @Singleton
    @Provides
    ChatHistoryDao provideChatHistoryDao(PSCoreDb db) {
        return db.chatHistoryDao();
    }

    @Singleton
    @Provides
    OfferDao provideOfferListDao(PSCoreDb db){
        return db.offerDao();
    }

    @Singleton
    @Provides
    ReportedItemDao provideReportedItemDao(PSCoreDb db){
        return db.reportedItemDao();
    }

    @Singleton
    @Provides
    BlockUserDao provideBlockUserDao(PSCoreDb db){
        return db.blockUserDao();
    }

    @Singleton
    @Provides
    OfflinePaymentDao provideOfflinePaymentDao(PSCoreDb db){
        return db.offlinePaymentDao();
    }

    @Singleton
    @Provides
    MessageDao provideMessageDao(PSCoreDb db) {
        return db.messageDao();
    }

    @Singleton
    @Provides
    PSCountDao providePSCountDao(PSCoreDb db) {
        return db.psCountDao();
    }

    @Singleton
    @Provides
    ItemPaidHistoryDao provideItemPaidHistoryDao(PSCoreDb db) {
        return db.itemPaidHistoryDao();
    }
}
