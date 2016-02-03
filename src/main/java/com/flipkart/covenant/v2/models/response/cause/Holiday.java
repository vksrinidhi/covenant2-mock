package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.response.TimeRange;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
public abstract class Holiday implements Cause {

    @JsonProperty
    TimeRange holidayTime;
}
