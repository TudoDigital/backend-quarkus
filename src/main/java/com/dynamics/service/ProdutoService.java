package com.dynamics.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.dao.ProdutoDAO;
import com.dynamics.domain.ProdutoDomain;


public class ProdutoService {

	ProdutoDAO produtoDAO = new ProdutoDAO();
	
	
	public List<ProdutoDomain> getProduto(){
        return produtoDAO.getProduto();
    }
	
    public ProdutoDomain getProdutoById(@PathParam Short id) {
        
        return produtoDAO.getProdutoById(id);
    }

  public Response insertProduto(@RequestBody ProdutoDomain produto){
        
        return produtoDAO.insertProduto(produto);
    }

    
    public Response deleteProduto(@PathParam Short id) {
      
        return produtoDAO.deleteProduto(id);
    }

    
    public ProdutoDomain updateProduto(@PathParam Short id, ProdutoDomain produto) {
    	
    	return produtoDAO.updateProduto(id, produto);
    }
	
}
