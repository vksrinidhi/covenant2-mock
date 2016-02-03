package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by saurabh.agrawal on 29/01/16.
 */
public class Location {
    public enum Type {
        PINCODE,
        ADDRESS,
        PICKUP_HUB
    }

    @JsonProperty
    Type type = Type.PINCODE;

    @JsonProperty
    @ApiModelProperty(example = "560102")
    String id;
}
