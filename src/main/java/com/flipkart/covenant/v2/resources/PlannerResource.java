package com.flipkart.covenant.v2.resources;

/**
 * Created by srinidhi.vk on 26/02/16.
 */

import com.flipkart.covenant.v2.models.response.Plan;
import io.swagger.annotations.*;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Jersey resource class for all operations on the Plan entity
 */
@SwaggerDefinition(
        info = @Info(
                description = "The new Plan APIs",
                title = "Plan APIs",
                contact = @Contact(
                        name = "Srinidhi",
                        email = "srinidhi.vk@flipkart.com"
                ),
                version = "v0.1"),
        consumes = {"application/json"},
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTP},
        externalDocs = @ExternalDocs(value = "Confluence Doc", url = "https://confluence.fkinternal.com/display/FF/PE+Scope+Definition")
)
@Api("Plan Resource")
@Path("plan")
public class PlannerResource {
    /**
     * Returns reserved promise id for the listings requested.<p>
     *
     * @param   planId Id for which plan details are to be obtained
     * @return  The response containing a list of promise options.
     * @see com.flipkart.covenant.v2.models.response.Plan
     */
    @GET
    @Path("/{planId}")
    @ApiOperation(value = "Get plan details for the id",
            notes = "This API reserves promise options for the requested listings")
    public Plan getPromiseById(@ApiParam(value = "Id of reserved promise", required = true) @PathParam("planId") String planId) {
        return null;
    }

    /**
     * Deletes the reserved plan.<p>
     *
     * @param   planId Id for which plan is to be deleted
     * @return  204 on success
     */
    @DELETE
    @Path("/{planId}")
    @ApiOperation(value = "Delete plan details for an id",
            notes = "This API deletes the reserved plan")
    public Response deleteById(@ApiParam(value = "Id of reserved plan", required = true) @PathParam("planId") String planId) {
        return null;
    }
}
