package com.github.gyntools.rest.exceptions.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.io.Serializable;

/**
 * Created by rafael on 8/25/16.
 */
public abstract class RestException extends WebApplicationException {

    public abstract Response.Status.Family getStatusFamily();
    public abstract String getMotive();
    public abstract Response.Status getStatus();

    @Override
    public String getMessage() {
        return getStatusFamily()+": "+getMotive();
    }


    @Override
    public Response getResponse() {
        return Response.status(getStatus()).build();
    }




}
