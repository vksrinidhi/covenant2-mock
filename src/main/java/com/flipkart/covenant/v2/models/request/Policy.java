package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

/**
 * A policy is a rule that must be applied on multiple {@code ListingRequest}
 */
@ApiModel(discriminator = "type",
        subTypes = ShipTogether.class)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BuyTogether.class, name = "BUY_TOGETHER"),
        @JsonSubTypes.Type(value = PickTogether.class, name = "PICK_TOGETHER"),
        @JsonSubTypes.Type(value = ShipTogether.class, name = "SHIP_TOGETHER")
})
public abstract class Policy {
}
