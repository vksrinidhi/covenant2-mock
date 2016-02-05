package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.response.TimeRange;
import lombok.Data;

/**
 * A holiday as a cause.
 */
@Data
public abstract class Holiday implements Cause {

    /**
     * The time span of this holiday.
     */
    @JsonProperty
    private final TimeRange holidayTime;

}
