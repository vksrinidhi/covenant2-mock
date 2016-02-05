package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

/**
 * Defines the parameters of a service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ForwardServiceDefinition.class, name = "FORWARD"),
        @JsonSubTypes.Type(value = HandInHandServiceDefinition.class, name = "HAND_IN_HAND"),
        @JsonSubTypes.Type(value = ReverseServiceDefinition.class, name = "REVERSE")
})
@Data
abstract class ServiceDefinition {
}
