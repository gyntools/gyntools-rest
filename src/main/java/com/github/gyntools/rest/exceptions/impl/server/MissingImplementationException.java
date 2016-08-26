package com.github.gyntools.rest.exceptions.impl.server;

import com.github.gyntools.rest.exceptions.api.AbstractServerException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class MissingImplementationException extends AbstractServerException{
    public String getMotive() {
        return "Missing implementation for this method. The application cannot fulfill this request.";
    }

    public Response.Status getStatus() {
        return Response.Status.NOT_IMPLEMENTED;
    }
}
