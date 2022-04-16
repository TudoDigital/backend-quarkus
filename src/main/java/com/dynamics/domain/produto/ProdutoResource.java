package com.dynamics.domain.produto;

import com.dynamics.domain.categoria.Categoria;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/produto")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class ProdutoResource{

    @GET
    public List<Produto> getProduto(){
        return Produto.listAll();
    }

    @GET
    @Path("/{id}")
    public Produto getProdutoById(@PathParam Short id) {
        Produto produto = Produto.findById(id);
        if (produto == null) {
            throw new WebApplicationException("Produto com id: " + id + " não existe.", 404);
        }
        return produto;
    }

    @POST
    @Transactional
    public Response insertProduto(@RequestBody Produto produto){
        produto.persist();
        return Response.ok(produto).status(201).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteProduto(@PathParam Short id) {
        Produto produto = Produto.findById(id);
        if (produto == null) {
            throw new WebApplicationException("Produto com o id: " + id + " não existe.", 404);
        }
        produto.delete();
        return Response.status(204).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Produto updateProduto(@PathParam Short id, Produto produto) {

        Produto objeto = Produto.findById(id);

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
            Categoria categoria = Categoria.findById(produto.Categoria.Id);
            if (categoria != null) {
                System.out.println("Categoria existe");
                objeto.Categoria = produto.Categoria;
            }
        }

        return objeto;
    }

}
