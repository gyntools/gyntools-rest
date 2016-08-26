package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class ForbiddenException extends AbstractClientException {
    public String getMotive() {
        return "The credentials sent has no sufficient rights to access this resource.";
    }

    public Response.Status getStatus() {
        return Response.Status.FORBIDDEN;
    }
}
