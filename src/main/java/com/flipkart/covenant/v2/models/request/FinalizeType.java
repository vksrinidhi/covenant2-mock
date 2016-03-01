package com.flipkart.covenant.v2.models.request;

/**
 * Created by srinidhi.vk on 22/02/16.
 */

/**
 * Describes the type of finalize. Based on the type resources are blocked
 * <p>
 */
//TODO: Should we have different states?
public enum FinalizeType {
    /**
     * Book only inventory
     */
    availability,

    /**
     * Book both inventory and serviceability
     */
    buyability
}
