package com.android.year.january.tips;

/**
 * Created by jdahn on 2016. 12. 5..
 */

public interface TipsHelper {
    void showEmpty();

    void hideEmpty();

    void showLoading(boolean firstPage);

    void hideLoading();

    void showError(boolean firstPage, Throwable error);

    void hideError();

    void showHasMore();

    void hideHasMore();
}
