package com.android.year.january.main.fragment;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;

import com.android.year.january.common.adapter.RecyclerListAdapter;
import com.android.year.january.common.fragment.RecyclerFragment;
import com.android.year.january.main.model.MainRecommendModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016. 12. 5..
 */

public class MainRecommendFragment extends RecyclerFragment<MainRecommendModel> {

    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final List<MainRecommendModel> mItemList = new ArrayList<>();

    public static MainRecommendFragment newInstance() {
        return new MainRecommendFragment();
    }

    @NonNull
    @Override
    public RecyclerListAdapter createAdapter() {
        return null;
    }

}
