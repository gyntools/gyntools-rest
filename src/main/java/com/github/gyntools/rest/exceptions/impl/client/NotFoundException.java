package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class NotFoundException extends AbstractClientException{
    public String getMotive() {
        return "The resource requested cannot be found.";
    }

    public Response.Status getStatus() {
        return Response.Status.NOT_FOUND;
    }
}
