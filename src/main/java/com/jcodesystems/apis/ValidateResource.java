package com.jcodesystems.apis;

import java.util.List;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/validate")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ValidateResource {

    @GET
    public List<Payment> validateGet() {
        return Payment.listAll();
    }
    
    @POST
    public Response validatePost(Payment payment) {
        payment.persist();
        return Response.status(Response.Status.CREATED).entity(payment).build();
    }
}
