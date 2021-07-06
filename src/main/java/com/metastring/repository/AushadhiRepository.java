package com.metastring.repository;

import com.metastring.entity.Aushadhi;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class AushadhiRepository implements PanacheRepository<Aushadhi> {


    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        List<Aushadhi> aushadhis = Aushadhi.listAll();
        return Response.ok(aushadhis).build();
    }

}
