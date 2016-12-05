package com.android.year.january.common.utils;

import android.content.Context;

/**
 * Created by admin on 2016. 12. 5..
 */

public class DensityUtil {
    public static float dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return dpValue * scale;
    }
}
