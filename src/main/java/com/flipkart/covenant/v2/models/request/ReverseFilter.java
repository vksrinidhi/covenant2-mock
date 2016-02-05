package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A filter for Reverse service.
 *
 * @see com.flipkart.covenant.v2.models.response.ReverseServiceDefinition
 * @see com.flipkart.covenant.v2.models.request.ReverseServiceRequest
 */
@JsonTypeName("REVERSE")
public class ReverseFilter extends ServiceFilter {
}
