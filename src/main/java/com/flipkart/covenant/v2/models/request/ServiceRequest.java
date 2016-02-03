package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ForwardServiceRequest.class, name = "FORWARD"),
        @JsonSubTypes.Type(value = ReverseServiceRequest.class, name = "REVERSE"),
        @JsonSubTypes.Type(value = HandInHandServiceRequest.class, name = "HAND_IN_HAND")
})
@Data
public abstract class ServiceRequest {

    @JsonProperty
    @ApiModelProperty("Filters to restrict the desired promise options. " +
            "If an attribute is set, only matching service options are computed.")
    private Set<ServiceFilter> filters = new HashSet();
}
