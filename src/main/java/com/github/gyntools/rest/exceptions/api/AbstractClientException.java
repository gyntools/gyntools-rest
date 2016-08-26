package com.github.gyntools.rest.exceptions.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/25/16.
 */
public abstract class AbstractClientException extends RestException {

    public Response.Status.Family getStatusFamily() {
        return Response.Status.Family.CLIENT_ERROR;
    }


}
