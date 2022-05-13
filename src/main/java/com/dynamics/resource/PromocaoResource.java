package com.dynamics.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.domain.PromocaoDomain;
import com.dynamics.service.PromocaoService;

@Path("/promocao")
public class PromocaoResource{

	PromocaoService promocaoService = new PromocaoService();
	
    @GET
    public List<PromocaoDomain> getPromocao(){
        return promocaoService.getPromocao();
    }

    @GET
    @Path("/{id}")
    public PromocaoDomain getPromocaoById(@PathParam Short id) {
        return promocaoService.getPromocaoById(id);
    }

    
    @POST
    @Transactional
    public Response insertPromocao(PromocaoDomain promocao){
    	
        return promocaoService.insertPromocao(promocao);
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deletePromocao(@PathParam Short id) {


        return promocaoService.deletePromocao(id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public PromocaoDomain updatePromocao(@PathParam Short id, PromocaoDomain promocao) {

   
        return promocaoService.updatePromocao(id, promocao);
    }

}
