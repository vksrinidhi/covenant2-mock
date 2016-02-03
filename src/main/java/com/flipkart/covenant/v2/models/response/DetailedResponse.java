package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.response.cause.Cause;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
@Data
public class DetailedResponse<T> {
    @ApiModelProperty("The value of this response")
    @JsonProperty
    private final T value;

    @ApiModelProperty("A cause/reason/explanation for the response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty
    private Cause cause = null;
}
