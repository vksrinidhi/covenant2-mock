package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * A Date range
 */
@Data
public class TimeRange {
    /**
     * The start of the range
     */
    @JsonProperty
    Date from;

    /**
     * The end of the range
     */
    @JsonProperty
    Date to;
}
