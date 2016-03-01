package com.flipkart.covenant.v2.models.request;

/**
 * Created by srinidhi.vk on 22/02/16.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Describes the request for the {@code updatePromise(UpdatePromiseRequest)} method.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#updatePromise(UpdatePromiseRequest, String)
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePromiseRequest {
    /**
     * TTL on promise entity.
     */
    @JsonProperty
    @ApiModelProperty("TTL of promise entity")
    @Min(1)
    @Max(10000L)
    private final Long ttl;
}
