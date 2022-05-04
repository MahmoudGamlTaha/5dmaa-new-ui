package com.service.khdmaa.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.service.khdmaa.db.common.Converters;
import com.service.khdmaa.viewobject.AboutUs;
import com.service.khdmaa.viewobject.BlockUser;
import com.service.khdmaa.viewobject.Blog;
import com.service.khdmaa.viewobject.ChatHistory;
import com.service.khdmaa.viewobject.ChatHistoryMap;
import com.service.khdmaa.viewobject.City;
import com.service.khdmaa.viewobject.CityMap;
import com.service.khdmaa.viewobject.DeletedObject;
import com.service.khdmaa.viewobject.Image;
import com.service.khdmaa.viewobject.Item;
import com.service.khdmaa.viewobject.ItemCategory;
import com.service.khdmaa.viewobject.ItemCollection;
import com.service.khdmaa.viewobject.ItemCollectionHeader;
import com.service.khdmaa.viewobject.ItemCondition;
import com.service.khdmaa.viewobject.ItemCurrency;
import com.service.khdmaa.viewobject.ItemDealOption;
import com.service.khdmaa.viewobject.ItemFavourite;
import com.service.khdmaa.viewobject.ItemFromFollower;
import com.service.khdmaa.viewobject.ItemHistory;
import com.service.khdmaa.viewobject.ItemLocation;
import com.service.khdmaa.viewobject.ItemMap;
import com.service.khdmaa.viewobject.ItemPaidHistory;
import com.service.khdmaa.viewobject.ItemPriceType;
import com.service.khdmaa.viewobject.ItemSpecs;
import com.service.khdmaa.viewobject.ItemSubCategory;
import com.service.khdmaa.viewobject.ItemTownshipLocation;
import com.service.khdmaa.viewobject.ItemType;
import com.service.khdmaa.viewobject.Noti;
import com.service.khdmaa.viewobject.Offer;
import com.service.khdmaa.viewobject.OfferMap;
import com.service.khdmaa.viewobject.OfflinePayment;
import com.service.khdmaa.viewobject.OfflinePaymentMethodHeader;
import com.service.khdmaa.viewobject.PSAppInfo;
import com.service.khdmaa.viewobject.PSAppSetting;
import com.service.khdmaa.viewobject.PSAppVersion;
import com.service.khdmaa.viewobject.PSCount;
import com.service.khdmaa.viewobject.Rating;
import com.service.khdmaa.viewobject.ReportedItem;
import com.service.khdmaa.viewobject.User;
import com.service.khdmaa.viewobject.UserLogin;
import com.service.khdmaa.viewobject.UserMap;
import com.service.khdmaa.viewobject.messageHolder.Message;


/**
 * Created by Panacea-Soft on 11/20/17.
 * Contact Email : teamps.is.cool@gmail.com
 */

@Database(entities = {
        Image.class,
        User.class,
        UserLogin.class,
        AboutUs.class,
        ItemFavourite.class,
        Noti.class,
        ItemHistory.class,
        Blog.class,
        Rating.class,
        PSAppInfo.class,
        PSAppVersion.class,
        DeletedObject.class,
        City.class,
        CityMap.class,
        Item.class,
        ItemMap.class,
        ItemCategory.class,
        ItemCollectionHeader.class,
        ItemCollection.class,
        ItemSubCategory.class,
        ItemSpecs.class,
        ItemCurrency.class,
        ItemPriceType.class,
        ItemType.class,
        ItemLocation.class,
        ItemTownshipLocation.class,
        ItemDealOption.class,
        ItemCondition.class,
        ItemFromFollower.class,
        Message.class,
        ChatHistory.class,
        ChatHistoryMap.class,
        Offer.class,
        OfferMap.class,
        PSAppSetting.class,
        UserMap.class,
        PSCount.class,
        ItemPaidHistory.class,
        OfflinePaymentMethodHeader.class,
        OfflinePayment.class,
        ReportedItem.class,
        BlockUser.class

}, version = 14, exportSchema = false)
// app version 3.2 = db version 14
// app version 3.1 = db version 13
// app version 3.0 = db version 12
// app version 2.9 = db version 11
// app version 2.8 = db version 10
// app version 2.7 = db version 9
// app version 2.6 = db version 8
// app version 2.5 = db version 7
// app version 2.4 = db version 7
// app version 2.3 = db version 6
// app version 2.2 = db version 6
// app version 2.1 = db version 6
// app version 2.0 = db version 6
// app version 1.9 = db version 6
// app version 1.8 = db version 5
// app version 1.7 = db version 4
// app version 1.6 = db version 4
// app version 1.5 = db version 4
// app version 1.4 = db version 3
// app version 1.3 = db version 3
// app version 1.2 = db version 2
// app version 1.0 = db version 1


@TypeConverters({Converters.class})

public abstract class PSCoreDb extends RoomDatabase {

    abstract public UserDao userDao();

    abstract public UserMapDao userMapDao();

    abstract public HistoryDao historyDao();

    abstract public SpecsDao specsDao();

    abstract public AboutUsDao aboutUsDao();

    abstract public ImageDao imageDao();

    abstract public ItemDealOptionDao itemDealOptionDao();

    abstract public ItemConditionDao itemConditionDao();

    abstract public ItemLocationDao itemLocationDao();

    abstract public ItemTownshipLocationDao itemTownshipLocationDao();

    abstract public ItemCurrencyDao itemCurrencyDao();

    abstract public ItemPriceTypeDao itemPriceTypeDao();

    abstract public OfflinePaymentDao offlinePaymentDao();

    abstract public ItemTypeDao itemTypeDao();

    abstract public RatingDao ratingDao();

    abstract public NotificationDao notificationDao();

    abstract public BlogDao blogDao();

    abstract public PSAppInfoDao psAppInfoDao();

    abstract public PSAppVersionDao psAppVersionDao();

    abstract public DeletedObjectDao deletedObjectDao();

    abstract public CityDao cityDao();

    abstract public CityMapDao cityMapDao();

    abstract public ItemDao itemDao();

    abstract public ItemMapDao itemMapDao();

    abstract public ItemCategoryDao itemCategoryDao();

    abstract public ItemCollectionHeaderDao itemCollectionHeaderDao();

    abstract public ItemSubCategoryDao itemSubCategoryDao();

    abstract public ChatHistoryDao chatHistoryDao();

    abstract public OfferDao offerDao();

    abstract public MessageDao messageDao();

    abstract public PSCountDao psCountDao();

    abstract public ItemPaidHistoryDao itemPaidHistoryDao();

    abstract public ReportedItemDao reportedItemDao();

    abstract public BlockUserDao blockUserDao();


//    /**
//     * Migrate from:
//     * version 1 - using Room
//     * to
//     * version 2 - using Room where the {@link } has an extra field: addedDateStr
//     */
//    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//            database.execSQL("ALTER TABLE news "
//                    + " ADD COLUMN addedDateStr INTEGER NOT NULL DEFAULT 0");
//        }
//    };

    /* More migration write here */
}