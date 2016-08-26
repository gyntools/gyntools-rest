package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class AuthenticationRequiredException extends AbstractClientException {

    public String getMotive() {
        return "This resource requires authentication.";
    }

    public Response.Status getStatus() {
        return Response.Status.UNAUTHORIZED;
    }

}
