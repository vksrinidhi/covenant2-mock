package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
public class ThresholdExceeded implements Cause {

    @JsonProperty
    Number limit;

    @Override
    public boolean isDisplayable() {
        return false;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
