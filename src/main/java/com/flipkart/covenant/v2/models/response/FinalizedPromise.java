package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 22/02/16.
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * Response to a promise id.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#getPromiseById(String)
 */
@Data
public class FinalizedPromise {
    /**
     * One response for each quantity.
     */
    @JsonProperty
    @ApiModelProperty("One response for each quantity")
    private final Collection<UnitPromise> promises;

    /**
     * Timestamp till which the promise is valid.
     */
    @JsonProperty
    @ApiModelProperty("Timestamp till which the promise is valid")
    private final Timestamp validTill;

    /**
     * Collection of policies applied on this promise.
     */
    @JsonProperty
    @ApiModelProperty("Policies applied on this promise")
    private final Collection<PolicyDefinition> policies;

}
