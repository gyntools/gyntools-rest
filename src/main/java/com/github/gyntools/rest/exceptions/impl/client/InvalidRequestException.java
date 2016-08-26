package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/25/16.
 */
public class InvalidRequestException extends AbstractClientException {

    public String getMotive() {
        return "The request could not be understood by the server due to malformed syntax.";
    }

    public Response.Status getStatus() {
        return Response.Status.BAD_REQUEST;
    }

}
