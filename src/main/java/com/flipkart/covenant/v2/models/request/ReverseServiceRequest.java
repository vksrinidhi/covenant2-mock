package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collection;

/**
 * An FSE service to pickup an item from a customer's location.
 * <p>
 *     This is used for returns.
 * </p>
 *
 */
@JsonTypeName("REVERSE")
public class ReverseServiceRequest extends ServiceRequest {

    @JsonProperty
    @ApiModelProperty("The sources from where inventory was previously dispatched")
    private Collection<String> previousSources;

}
