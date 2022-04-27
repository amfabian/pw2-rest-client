package dev.rpmhub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

// 1 - Registrando um cliente rest
@RegisterRestClient(baseUri = "http://localhost:4444/serviceb")
public interface MyRemoteService {

    // 2 - Declaração do método da interface
    @GET
    @Path("/pessoa/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    public Person pessoa(@PathParam("a") long a);
}
