package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by saurabh.agrawal on 01/02/16.
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

