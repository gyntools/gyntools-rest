package com.github.gyntools.rest.exceptions.impl.server;

import com.github.gyntools.rest.exceptions.api.AbstractServerException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class ApplicationInternalErrorException extends AbstractServerException{
    public String getMotive() {
        return "There was an error processing this request, probabily due to an application bug or " +
                "unmapped situation";
    }

    public Response.Status getStatus() {
        return Response.Status.INTERNAL_SERVER_ERROR;
    }
}
