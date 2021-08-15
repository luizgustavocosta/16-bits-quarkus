package com.costa.luiz.profile;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "greeting.message")
    String message;

//    @ConfigProperty(name = "staging.message")
//    String messageFromStaging;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
//        System.out.println(messageFromStaging);
        return Optional.ofNullable(message).orElse("Greeting message not found :(");
    }
}