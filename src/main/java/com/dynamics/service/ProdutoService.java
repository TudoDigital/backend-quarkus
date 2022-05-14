package com.dynamics.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
//import org.hibernate.mapping.List;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.dao.ProdutoDAO;
import com.dynamics.domain.ProdutoDomain;
import com.dynamics.dto.ProdutoDTO;


public class ProdutoService {

	ProdutoDAO produtoDAO = new ProdutoDAO();
	
	
//	public List<ProdutoDomain> getProduto(){
//        return produtoDAO.getProduto();
//    }
//	
//    public ProdutoDomain getProdutoById(@PathParam Short id) {
//        
//        return produtoDAO.getProdutoById(id);
//    }

	public List<ProdutoDTO> getProduto(){
		List<ProdutoDomain> entity = produtoDAO.getProduto();
		List<ProdutoDTO> dto = new ArrayList<ProdutoDTO> () {};
        return dto;
    }
	
    public ProdutoDTO getProdutoById(@PathParam Short id) {
        ProdutoDomain entity = produtoDAO.getProdutoById(id);
        ProdutoDTO dto = new ProdutoDTO(entity);
        return dto;
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
