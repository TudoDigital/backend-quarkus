package com.dynamics.service;

import java.util.List;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.dynamics.dao.ProdutoPromocaoDAO;
import com.dynamics.domain.ProdutoPromocaoDomain;

public class ProdutoPromocaoService {
	
	ProdutoPromocaoDAO vincularDAO = new ProdutoPromocaoDAO();
	
	 public Response vincularPromocaoProduto(@QueryParam("IdPromocao") Short idpromocao,
             @QueryParam("IdProduto") Short idproduto){

		 return vincularDAO.vincularPromocaoProduto(idpromocao, idproduto);
	 }

	public List<ProdutoPromocaoDomain> getProdutoPromocao() {
		
		return vincularDAO.getProdutoPromocao();
	}	

}
