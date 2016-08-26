package com.github.gyntools.rest.model;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by rafael on 8/26/16.
 */
@XmlRootElement(name="error")
public class ErrorMessage implements Serializable {

    private Response.Status status;
    private String message;

    public ErrorMessage(Response.Status status, String message) {
        this.message=message;
        this.status=status;
    }

    public ErrorMessage(){}

    public Response.Status getStatus() {
        return status;
    }

    public void setStatus(Response.Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
