package com.service.khdmaa.ui.setting.appinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.databinding.DataBindingUtil;

import com.service.khdmaa.Config;
import com.service.khdmaa.R;
import com.service.khdmaa.databinding.ActivityAppInfoBinding;
import com.service.khdmaa.ui.common.PSAppCompactActivity;
import com.service.khdmaa.utils.Constants;
import com.service.khdmaa.utils.MyContextWrapper;

public class AppInfoActivity extends PSAppCompactActivity {

    //region Override Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityAppInfoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_app_info);

        // Init all UI
        initUI(binding);

    }

    @Override
    protected void attachBaseContext(Context newBase) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(newBase);
        String CURRENT_LANG_CODE = preferences.getString(Constants.LANGUAGE_CODE, Config.DEFAULT_LANGUAGE);
        String CURRENT_LANG_COUNTRY_CODE = preferences.getString(Constants.LANGUAGE_COUNTRY_CODE, Config.DEFAULT_LANGUAGE_COUNTRY_CODE);

        super.attachBaseContext(MyContextWrapper.wrap(newBase, CURRENT_LANG_CODE, CURRENT_LANG_COUNTRY_CODE, true));

    }
    //endregion


    //region Private Methods

    private void initUI(ActivityAppInfoBinding binding) {

        // Toolbar
        initToolbar(binding.toolbar, getResources().getString(R.string.about_us__title));

        // setup Fragment

        setupFragment(new AppInfoFragment());
    }

    //endregion

}
