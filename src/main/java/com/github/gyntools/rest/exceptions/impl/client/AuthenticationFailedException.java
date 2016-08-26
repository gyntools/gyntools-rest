package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class AuthenticationFailedException extends AbstractClientException {

    public String getMotive() {
        return "Authentication Failed. Change request content and try again";
    }

    public Response.Status getStatus() {
        return Response.Status.UNAUTHORIZED;
    }
    
}
