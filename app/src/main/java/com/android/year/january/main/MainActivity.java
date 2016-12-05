package com.android.year.january.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.year.january.R;
import com.android.year.january.main.fragment.MainTabPagerFragment;

/**
 * Created by admin on 2016. 12. 5..
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, MainTabPagerFragment.newInstance())
                .commit();
    }
}
