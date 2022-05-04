package com.service.khdmaa.ui.offlinepayment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.service.khdmaa.Config;
import com.service.khdmaa.R;
import com.service.khdmaa.databinding.ActivityOfflineBinding;
import com.service.khdmaa.ui.common.PSAppCompactActivity;
import com.service.khdmaa.utils.Constants;
import com.service.khdmaa.utils.MyContextWrapper;

public class OfflinePaymentActivity extends PSAppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityOfflineBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_offline);

        initUI(binding);

    }

    @Override
    protected void attachBaseContext(Context newBase) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(newBase);
        String CURRENT_LANG_CODE = preferences.getString(Constants.LANGUAGE_CODE, Config.DEFAULT_LANGUAGE);
        String CURRENT_LANG_COUNTRY_CODE = preferences.getString(Constants.LANGUAGE_COUNTRY_CODE, Config.DEFAULT_LANGUAGE_COUNTRY_CODE);

        super.attachBaseContext(MyContextWrapper.wrap(newBase, CURRENT_LANG_CODE, CURRENT_LANG_COUNTRY_CODE, true));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.content_frame);
        if (fragment != null) {
            fragment.onActivityResult(requestCode, resultCode, data);
        }

    }

    private void initUI(ActivityOfflineBinding binding) {

        // Toolbar
        initToolbar(binding.toolbar, getResources().getString(R.string.item_promote__offline));

        // setup Fragment
        setupFragment(new OfflinePaymentHeaderListFragment());

    }
}
