package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Describe the request for a type of service.
 * @see com.flipkart.covenant.v2.models.request.ForwardServiceRequest
 * @see com.flipkart.covenant.v2.models.request.ReverseServiceRequest
 * @see com.flipkart.covenant.v2.models.request.HandInHandServiceRequest
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

    /**
     * A set of {@code ServiceFilter}s to restrict the desired promise options. <p>
     * If an attribute is set, only matching service options are computed. <p>
     * <b>Optional.</b> Defaults to no filter
     */
    @JsonProperty
    @ApiModelProperty("Filters to restrict the desired promise options. " +
            "If an attribute is set, only matching service options are computed.")
    private Set<? extends ServiceFilter> filters = new HashSet();

    /**
     * Compute serviceability options such that the promised time is after {@code promiseAfter}<p>
     * This is for future use.
     * <b>Optional.</b> Defaults to the current date and time.
     */
    @JsonProperty
    @ApiModelProperty("Compute serviceability such that the promised time is after promiseAfter")
    private Date promiseAfter = new Date();
}
