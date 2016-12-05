package com.android.year.january.main.model;

import android.text.TextUtils;

import com.android.year.january.common.model.CursorModel;

/**
 * Created by admin on 2016. 12. 5..
 */

public class MainRecommendModel implements CursorModel {

    public static final String MORE_CURSOR = "more_cursor";

    private final String mCursor;

    private final String mTitle;
    private final String mContent;
    private final String mAuthor;
    private final String mColor;

    public MainRecommendModel(String mTitle, String mContent, String mAuthor, String mColor) {
        this.mCursor = MORE_CURSOR;

        this.mTitle = mTitle;
        this.mContent = mContent;
        this.mAuthor = mAuthor;
        this.mColor = mColor;
    }

    public MainRecommendModel(String mTitle, String mContent, String mColor) {
        this(mTitle, mContent, "dinus", mColor);
    }

    public String getTitle() {
        return mTitle;
    }

    public String getContent() {
        return mContent;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getColor() {
        return mColor;
    }

    @Override
    public boolean hasMore() {
        return !TextUtils.isEmpty(mCursor);
    }

}
