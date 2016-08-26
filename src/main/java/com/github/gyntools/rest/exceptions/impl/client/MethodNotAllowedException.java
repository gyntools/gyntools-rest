package com.github.gyntools.rest.exceptions.impl.client;

import com.github.gyntools.rest.exceptions.api.AbstractClientException;
import com.github.gyntools.rest.exceptions.api.RestException;

import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
public class MethodNotAllowedException extends AbstractClientException{
    public String getMotive() {
        return "The method specified in the Request-Line is not allowed for the resource identified by the " +
                "Request-URI. The response MUST include an Allow header containing a list of valid methods for the " +
                "requested resource.";
    }

    public Response.Status getStatus() {
        return Response.Status.METHOD_NOT_ALLOWED;
    }
}
