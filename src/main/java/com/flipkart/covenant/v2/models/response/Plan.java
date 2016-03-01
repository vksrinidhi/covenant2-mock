package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 26/02/16.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Describe each plan details.
 * @see com.flipkart.covenant.v2.models.response.InventoryPlan
 * @see com.flipkart.covenant.v2.models.response.PreorderPlan
 * @see com.flipkart.covenant.v2.models.response.NonFAPlan
 * @see com.flipkart.covenant.v2.models.response.JitPlan
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = InventoryPlan.class, name = "INVENTORY"),
        @JsonSubTypes.Type(value = PreorderPlan.class, name = "PRE_ORDER"),
        @JsonSubTypes.Type(value = NonFAPlan.class, name = "NON_FA"),
        @JsonSubTypes.Type(value = JitPlan.class, name = "JIT")
})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public abstract class Plan {
    /**
     * Id that uniquely identifies a plan. <p>
     */
    @JsonProperty(required = true)
    private String id;

    /**
     * Id that uniquely identifies promised logistics services. <p>
     */
    @ApiModelProperty(value = "Id that uniquely identifies logistics services")
    @JsonProperty
    private String logisticsPromiseId;

    /**
     * Id that uniquely identifies promised dispatch slot. <p>
     */
    @ApiModelProperty(value = "Id that uniquely identifies promised dispatch slot")
    @JsonProperty
    private String dispatchSlotId;

    /**
     * Source from where inventory is promised
     */
    @ApiModelProperty(value = "Source from where inventory is promised")
    @JsonProperty(required = true)
    private String source;
}
