package com.sample.app.enpoint.echo;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")
public class Hello {

    @GET
    public String get() {
        return "hello";
    }
}
