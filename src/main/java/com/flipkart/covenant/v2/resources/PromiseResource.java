package com.flipkart.covenant.v2.resources;

import com.flipkart.covenant.v2.models.request.FinalizePromiseRequest;
import com.flipkart.covenant.v2.models.request.FinalizeType;
import com.flipkart.covenant.v2.models.request.GetPromiseRequest;
import com.flipkart.covenant.v2.models.request.UpdatePromiseRequest;
import com.flipkart.covenant.v2.models.response.FinalizePromiseResponse;
import com.flipkart.covenant.v2.models.response.FinalizedPromise;
import com.flipkart.covenant.v2.models.response.GetPromiseResponse;
import io.swagger.annotations.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Jersey resource class for all operations on the Promise entity
 */
@SwaggerDefinition(
        info = @Info(
                description = "The new Promise Engine APIs",
                title = "The Promise Engine APIs",
                contact = @Contact(
                        name = "Saurabh Agrawal",
                        email = "saurabh.agrawal@flipkart.com"
                ),
                version = "v0.1"),
        consumes = {"application/json"},
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTP},
        externalDocs = @ExternalDocs(value = "Confluence Doc", url = "https://confluence.fkinternal.com/display/FF/PE+Scope+Definition")
)
@Api("Promises Resource")
@Path("promises")
public class PromiseResource {

    /**
     * Returns promise options for the listings requested.<p>
     * <b>Note:</b> No resource like inventory or vendor capacity will be reserved by this method.
     *
     * @param   request The request parameters
     * @return  The response containing a list of promise options.
     * @see com.flipkart.covenant.v2.models.request.GetPromiseRequest
     * @see com.flipkart.covenant.v2.models.response.GetPromiseResponse
     */
    @POST
    @ApiOperation(value = "Get Promise Options",
            notes = "This API gives promise options for the requested listings")
    public GetPromiseResponse getPromiseOptions(GetPromiseRequest request) {
        return null;
    }

    /**
     * Returns reserved promise id for the listings requested.<p>
     *
     * @param   request The request parameters
     * @param   finalizeType Type which determines the resources to be blocked
     * @return  Reference id of the reserved resource.
     * @see com.flipkart.covenant.v2.models.request.FinalizePromiseRequest
     * @see com.flipkart.covenant.v2.models.response.FinalizePromiseResponse
     */
    @POST
    @Path("/finalize/{finalizeType}")
    @ApiOperation(value = "Finalize Promise Options",
            notes = "This API reserves promise options for the requested listings")
    public FinalizePromiseResponse finalizePromiseOption(FinalizePromiseRequest request,
                                                         @ApiParam(value = "Finalize type", required = true) @PathParam("finalizeType") FinalizeType finalizeType) {
        return null;
    }

    /**
     * Returns reserved promise id for the listings requested.<p>
     *
     * @param   promiseId Id for which promises are to be obtained
     * @return  The response containing details of finalized promise
     * @see com.flipkart.covenant.v2.models.response.FinalizedPromise
     */
    @GET
    @Path("/{promiseId}")
    @ApiOperation(value = "Get promise details for the id",
            notes = "This API gets promise details for a given id")
    public FinalizedPromise getPromiseById(@ApiParam(value = "Id of reserved promise", required = true) @PathParam("promiseId") String promiseId) {
        return null;
    }

    /**
     * Deletes the promise reserved.<p>
     *
     * @param   promiseId Id for which promises are to be deleted
     * @return  200 on success
     */
    @DELETE
    @Path("/{promiseId}")
    @ApiOperation(value = "Delete promise details for an id",
            notes = "This API deletes the reserved promise")
    public Response deleteById(@ApiParam(value = "Id of reserved promise", required = true) @PathParam("promiseId") String promiseId) {
        return null;
    }

    /**
     * Updates reserved promise object.<p>
     *
     * @param   updatePromiseRequest
     * @param   promiseId Id which is to be updated
     * @see com.flipkart.covenant.v2.models.request.UpdatePromiseRequest
     * @return  200 on success
     */
    @POST
    @Path("/{promiseId}/update")
    @ApiOperation(value = "Update promise details for the id",
            notes = "This API updates promise details of the given id")
    public Response updatePromise(UpdatePromiseRequest updatePromiseRequest, @ApiParam(value = "Id of reserved promise", required = true) @PathParam("promiseId") String promiseId) {
        return null;
    }

    /**
     * Confirm the reserved promise. This internally confirms the plan promised. <p>
     *
     * @param   promiseId Id which is to be updated
     * @return  200 on success
     */
    @POST
    @Path("/{promiseId}/confirm")
    @ApiOperation(value = "Confirm promise details for the id",
            notes = "This API confirms the reserved promise")
    public Response confirmPromise(@ApiParam(value = "Id of reserved promise", required = true) @PathParam("promiseId") String promiseId) {
        return null;
    }



}
