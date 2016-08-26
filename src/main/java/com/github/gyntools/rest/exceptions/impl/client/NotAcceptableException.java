package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class NotAcceptableException extends AbstractClientException {
    public String getMotive() {
        return "The requested resource is capable of generating only content not acceptable according to the " +
                "Accept headers sent in the request.";
    }

    public Response.Status getStatus() {
        return Response.Status.NOT_ACCEPTABLE;
    }
}
