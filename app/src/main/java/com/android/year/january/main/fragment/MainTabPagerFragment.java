package com.android.year.january.main.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.android.year.january.R;
import com.android.year.january.common.fragment.TabPagerFragment;

/**
 * Created by admin on 2016. 12. 5..
 */

public class MainTabPagerFragment extends TabPagerFragment {

    public static MainTabPagerFragment newInstance() {
        return new MainTabPagerFragment();
    }

    @Override
    public void onBuildTabPager(@NonNull Builder builder) {
        FragmentEntry.buildTabPager(builder, getActivity());
    }

    private enum FragmentEntry {
        RECOMMEND(
                R.string.tab_recommend,
                MainRecommendFragment.class),
        MAP(
                R.string.tab_map,
                MainMapFragment.class),
        STAMP(
                R.string.tab_stamp,
                MainStampFragment.class);

        final int titleResource;
        final Class<? extends Fragment> fragmentClass;

        FragmentEntry(int indicatorResource, Class<? extends Fragment> fragmentClass) {
            this.titleResource = indicatorResource;
            this.fragmentClass = fragmentClass;
        }

        static void buildTabPager(Builder builder, Context context) {
            for (FragmentEntry e : FragmentEntry.values()) {
                builder.addTab(context.getString(e.titleResource), e.fragmentClass, null);
            }
        }

    }

}
