package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * The availability request.
 */
@Data
public class AvailabilityRequest {
    /**
     * Flag determining whether inventory is to be considered for this promise request.<p>
     * <b>Optional.</b> Defaults to true.
     */
    @JsonProperty
    @ApiModelProperty(value = "If true, check the availability of the listing; " +
            "otherwise it is assumed to be available")
    private boolean checkInventory = true;

}
