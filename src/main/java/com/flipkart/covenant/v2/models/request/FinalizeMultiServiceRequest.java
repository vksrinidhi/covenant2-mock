package com.flipkart.covenant.v2.models.request;

/**
 * Created by srinidhi.vk on 23/02/16.
 */

import lombok.Data;

import java.util.ArrayList;

/**
 * Describes multi service option request that needs to be finalized.
 */
@Data
public class FinalizeMultiServiceRequest extends ArrayList<FinalizeServiceRequest> {
    public static FinalizeMultiServiceRequest getDefault() {
        FinalizeMultiServiceRequest options = new FinalizeMultiServiceRequest();
        options.add(new FinalizeServiceRequest());
        return options;
    }
}
