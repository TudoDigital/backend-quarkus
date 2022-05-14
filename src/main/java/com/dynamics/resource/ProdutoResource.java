package com.dynamics.resource;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.domain.ProdutoDomain;
import com.dynamics.service.ProdutoService;

@Path("/produto")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class ProdutoResource{

	ProdutoService produtoService = new ProdutoService();
	
	
    @GET
    public List<ProdutoDomain> getProduto(){
        return produtoService.getProduto();
    }

    @GET
    @Path("/{id}")
    public ProdutoDomain getProdutoById(@PathParam Short id) {
       
        return produtoService.getProdutoById(id);
    }

    
    @POST
    @Transactional
    public Response insertProduto(@RequestBody ProdutoDomain produto){

        return produtoService.insertProduto(produto);
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteProduto(@PathParam Short id) {
      
        return produtoService.deleteProduto(id);
    }

    @PUT
    @Path("{id}")
    @Transactional
    public ProdutoDomain updateProduto(@PathParam Short id, ProdutoDomain produto) {
    	
    	return produtoService.updateProduto(id, produto);
    }

}
