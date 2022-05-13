package com.dynamics.dao;

import java.util.List;

import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.dynamics.domain.ProdutoDomain;
import com.dynamics.domain.ProdutoPromocaoDomain;
import com.dynamics.domain.PromocaoDomain;

public class ProdutoPromocaoDAO {
	
	
	public List<ProdutoPromocaoDomain> getProdutoPromocao(){
		return ProdutoPromocaoDomain.listAll();
	}
	
	
	public Response vincularPromocaoProduto(@QueryParam("IdPromocao") Short idpromocao,
			@QueryParam("IdProduto") Short idproduto){
		System.out.println(idpromocao);
		System.out.println(idproduto);
		ProdutoDomain objetoProduto = ProdutoDomain.findById(idproduto);
		PromocaoDomain objetoPromocao = PromocaoDomain.findById(idpromocao);

		System.out.println(objetoProduto.Nome);
		System.out.println(objetoPromocao.Descricao);

		if (objetoPromocao == null || objetoProduto == null) {
			throw new WebApplicationException("Produto ou Promoção não existe",404);
		}

		ProdutoPromocaoDomain objeto = new ProdutoPromocaoDomain();
		objeto.IdProduto = idproduto;
		objeto.IdPromocao = idpromocao;

		objeto.persist();
		System.out.println("Produto: "+objeto.IdProduto+" vinculado com a promoção: "+objeto.IdPromocao);
		return Response.ok().status(201).build();
	}

}
