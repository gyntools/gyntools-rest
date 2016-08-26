package com.github.gyntools.rest.handler;

import com.github.gyntools.rest.exceptions.api.RestException;
import com.github.gyntools.rest.model.ErrorMessage;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by rafael on 8/26/16.
 */
@Provider
public class RestExceptionMapper implements ExceptionMapper<WebApplicationException> {
    public Response toResponse(WebApplicationException ex) {
        ErrorMessage error = new ErrorMessage(Response.Status.fromStatusCode(ex.getResponse().getStatus()),ex.getMessage());
        return Response.status(ex.getResponse().getStatus()).entity(error).type(MediaType.APPLICATION_JSON).build();
    }
}
