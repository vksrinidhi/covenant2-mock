package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by saurabh.agrawal on 28/01/16.
 */
@Data
public class TimeRange {
    @JsonProperty
    Date from;

    @JsonProperty
    Date to;
}
