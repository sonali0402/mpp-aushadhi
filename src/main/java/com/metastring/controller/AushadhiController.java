package com.metastring.controller;

import com.metastring.Repository.AushadhiRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/aushadhi")
public class AushadhiController {

    @Inject
    private AushadhiRepository aushadhiRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAushadhis(){
        return aushadhiRepository.getAll();
    }

}
