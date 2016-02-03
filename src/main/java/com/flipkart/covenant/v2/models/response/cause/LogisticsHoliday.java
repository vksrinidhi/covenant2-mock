package com.flipkart.covenant.v2.models.response.cause;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
public class LogisticsHoliday extends Holiday {
    @Override
    public boolean isDisplayable() {
        return false;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
