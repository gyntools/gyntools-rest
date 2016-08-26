package unit.com.github.gyntools.rest;

import com.github.gyntools.rest.exceptions.impl.client.*;
import com.github.gyntools.rest.exceptions.impl.server.ApplicationInternalErrorException;
import com.github.gyntools.rest.exceptions.impl.server.MissingImplementationException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by rafael on 8/26/16.
 */
@Path("/dummies")
public class DummyEndpoint {

    @GET
    @Path("/400")
    public Response willBeBadRequest(){
        InvalidRequestException ex = new InvalidRequestException();
        throw ex;
    }

    @GET
    @Path("/401f")
    public Response willBeAuthenticationFailed(){
        throw new AuthenticationFailedException();
    }

    @GET
    @Path("/401r")
    public Response willBeAuthenticationRequired(){
        throw new AuthenticationRequiredException();
    }

    @GET
    @Path("/403")
    public Response willBeForbidden(){
        throw new ForbiddenException();
    }

    @GET
    @Path("/405")
    public Response willBeNotAllowed(){
        throw new MethodNotAllowedException();
    }


    @GET
    @Path("/406")
    public Response willBeNotAcceptable(){
        throw new NotAcceptableException();
    }

    @GET
    @Path("/500")
    public Response willBeInternalError(){
        throw new ApplicationInternalErrorException();
    }

    @GET
    @Path("/501")
    public Response willBeNotImplemented(){
        throw new MissingImplementationException();
    }


}
