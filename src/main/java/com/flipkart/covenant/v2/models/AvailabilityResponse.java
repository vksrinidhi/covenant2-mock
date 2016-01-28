package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@ApiModel
class AvailabilityResponse {

    @ApiModelProperty(value = "Whether the requested quantity of the listing is available")
    @JsonProperty
    boolean value;

//            int maxQuantity;
}
