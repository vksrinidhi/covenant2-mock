package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Specifies the location of the customer.
 *
 * @see com.flipkart.covenant.v2.models.request.Address
 * @see com.flipkart.covenant.v2.models.request.PickupCenter
 * @see com.flipkart.covenant.v2.models.request.Pincode
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Address.class, name = "ADDRESS"),
        @JsonSubTypes.Type(value = PickupCenter.class, name = "PICKUP_HUB"),
        @JsonSubTypes.Type(value = Pincode.class, name = "PINCODE")
})
public interface Location {

}
