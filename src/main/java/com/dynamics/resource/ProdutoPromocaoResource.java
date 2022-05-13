package com.dynamics.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.dynamics.domain.ProdutoPromocaoDomain;
import com.dynamics.service.ProdutoPromocaoService;

@Path("/vincular")
public class ProdutoPromocaoResource {
	
	ProdutoPromocaoService vincularService = new ProdutoPromocaoService();
	
	@GET
	public List<ProdutoPromocaoDomain> getProdutoPromocao(){
		return vincularService.getProdutoPromocao();
	}

	
    @POST
    @Path("/promocaoproduto")
    @Transactional
      public Response vincularPromocaoProduto(@QueryParam("IdPromocao") Short idpromocao,
                                            @QueryParam("IdProduto") Short idproduto){


        return vincularService.vincularPromocaoProduto(idpromocao, idproduto);
    }
}

