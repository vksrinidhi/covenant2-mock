package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * An FSE service to deliver inventory from a <i>source</i> to the customer.
 */
@JsonTypeName("FORWARD")
@Data
public class ForwardServiceRequest extends ServiceRequest {
}
