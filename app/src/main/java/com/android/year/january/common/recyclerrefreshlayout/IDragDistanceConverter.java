package com.android.year.january.common.recyclerrefreshlayout;

/**
 * Created by admin on 2016. 12. 5..
 */

public interface IDragDistanceConverter {
    /**
     * @param scrollDistance the distance between the ACTION_DOWN point and the ACTION_MOVE point
     * @param refreshDistance the distance between the refresh point and the start point
     * @return the real distance of the refresh view moved
     */
    float convert(float scrollDistance, float refreshDistance);
}
