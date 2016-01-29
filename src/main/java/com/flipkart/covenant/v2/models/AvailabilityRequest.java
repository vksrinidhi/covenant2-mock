package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by saurabh.agrawal on 28/01/16.
 */
public class AvailabilityRequest {
    @JsonProperty
    @ApiModelProperty(value = "If true, check the availability of the listing; " +
            "otherwise it is assumed to be available")
    boolean checkInventory = true;

    @JsonProperty
    @ApiModelProperty(value = "If specified, inventory is only considered from these sources")
    List<String> sources = null;
}
