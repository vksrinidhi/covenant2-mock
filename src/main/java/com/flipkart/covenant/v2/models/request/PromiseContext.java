package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Non-listing attributes required for computing a promise
 */
@Data
public class PromiseContext {
    @JsonProperty
    private final SalesChannel salesChannel;

    @JsonProperty
    private final CustomerSubscription subscription;

}
