package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
public class PromiseContext {
    @JsonProperty
    SalesChannel salesChannel = SalesChannel.WEBSITE;

    @JsonProperty
    CustomerSubscription subscription = CustomerSubscription.REGULAR;

    @JsonProperty
    @ApiModelProperty("The start time to be considered for promise computation")
    Date startTime = new Date();

}
