package com.dynamics.dao;

import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.domain.CategoriaDomain;
import com.dynamics.domain.ProdutoDomain;
import com.dynamics.domain.ProdutoPromocaoDomain;


public class ProdutoDAO {
	

	public List<ProdutoDomain> getProduto(){
        return ProdutoPromocaoDomain.listAll();
    }
	
    public ProdutoDomain getProdutoById(@PathParam Short id) {
    	ProdutoDomain produto = ProdutoDomain.findById(id);
        if (produto == null) {
            throw new WebApplicationException("Produto com id: " + id + " não existe.", 404);
        }
        return produto;
    }

  
    public Response insertProduto(@RequestBody ProdutoDomain produto){
        produto.persist();
        return Response.ok(produto).status(201).build();
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
        System.out.println(produto.Id);
        System.out.println(produto.Preco);
        System.out.println(produto.Nome);

        if (objeto.Nome != null) {
            objeto.Nome = produto.Nome;
        }
        if (objeto.Preco != null) {
            objeto.Preco = produto.Preco;
        }
        if (produto.Categoria != null ){
            System.out.println("Categoria não é nulo");
            CategoriaDomain categoria = CategoriaDomain.findById(produto.Categoria.Id);
            if (categoria != null) {
                System.out.println("Categoria existe");
                objeto.Categoria = produto.Categoria;
            }
        }

        return objeto;
    }

}
