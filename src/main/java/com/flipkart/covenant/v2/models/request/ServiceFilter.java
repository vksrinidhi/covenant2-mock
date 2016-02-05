package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Describes a filter for a type of service, allowing filtering on that service type's attributes
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ForwardFilter.class, name = "FORWARD"),
        @JsonSubTypes.Type(value = ReverseFilter.class, name = "REVERSE"),
        @JsonSubTypes.Type(value = HandInHandFilter.class, name = "HAND_IN_HAND")
})
abstract class ServiceFilter {
}