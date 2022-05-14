package com.dynamics.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.domain.CategoriaDomain;
import com.dynamics.domain.ProdutoDomain;
import com.dynamics.dto.ProdutoDTO;

public class ProdutoDAO {
	

	public List<ProdutoDTO> getProduto(){
        List<ProdutoDTO> produtosdto = new ArrayList<ProdutoDTO>();
        List<ProdutoDomain> produtos = new ArrayList<ProdutoDomain>();
        produtos = ProdutoDomain.listAll();
        
        produtos.stream().forEach(produto -> {
            ProdutoDTO dto = new ProdutoDTO(produto);
            produtosdto.add(dto);
        });
        return produtosdto;
    }
	
    public ProdutoDTO getProdutoById(@PathParam Short id) {
    	ProdutoDomain produto = ProdutoDomain.findById(id);
        if (produto == null) {
            throw new WebApplicationException("Produto com id: " + id + " não existe.", 404);
        }
        ProdutoDTO dto = new ProdutoDTO(produto);
        return dto;
    }

  
    public Response insertProduto(@RequestBody ProdutoDTO produto){
        ProdutoDomain entity = new ProdutoDomain();
        entity.setNome(produto.nome);
        entity.setPreco(produto.preco);
        CategoriaDomain categoria = new CategoriaDomain();
        categoria.setId(produto.IdCategoria);
        entity.setCategoria(categoria);

        entity.persist();
        return Response.ok(entity).status(201).build();
    }


 
    public Response deleteProduto(@PathParam Short id) {
        ProdutoDomain produto = ProdutoDomain.findById(id);
        if (produto == null) {
            throw new WebApplicationException("Produto com o id: " + id + " não existe.", 404);
        }
        produto.delete();
        return Response.status(204).build();
    }

   

    public ProdutoDomain updateProduto(@PathParam Short id, ProdutoDomain produto) {

        ProdutoDomain objeto = ProdutoDomain.findById(id);

        if (objeto == null) {
            throw new WebApplicationException("Produto com id: " + id + " não existe.", 404);
        }

        if (objeto.getNome() != null) {
            objeto.setNome(produto.getNome());
        }
        if (objeto.getPreco() != null) {
            objeto.setPreco(produto.getPreco());
        }
        if (produto.getCategoria() != null ){
            CategoriaDomain categoria = CategoriaDomain.findById(produto.getCategoria().getId());
            if (categoria != null) {
                objeto.setCategoria(produto.getCategoria());
            }
        }

        return objeto;
    }

}
