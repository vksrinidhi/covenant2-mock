package com.flipkart.covenant.v2.models.request;

import java.util.ArrayList;

/**
 * Describes all the services being requested for.
 *
 * This is an ordered list of service requests. Each of the service requests
 * should be of a different type.
 *
 * @see com.flipkart.covenant.v2.models.request.ServiceRequest
 */
public class MultiServiceRequest extends ArrayList<ServiceRequest> {

    static MultiServiceRequest getDefault() {
        MultiServiceRequest request = new MultiServiceRequest();
        request.add(new ForwardServiceRequest());
        return request;
    }
}
