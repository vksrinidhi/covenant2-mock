package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
@Data
public class PromiseContext {
    @JsonProperty
    private SalesChannel salesChannel = SalesChannel.WEBSITE;

    @JsonProperty
    private CustomerSubscription subscription = CustomerSubscription.REGULAR;

    @JsonProperty
    @ApiModelProperty("The start time to be considered for promise computation")
    private Date startTime = new Date();

    @JsonProperty
    @ApiModelProperty("The source from where inventory was previously dispatched. Required for REVERSE promise")
    private String previousSource;

}
