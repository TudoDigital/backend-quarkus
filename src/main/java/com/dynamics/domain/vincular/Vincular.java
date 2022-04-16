package com.dynamics.domain.vincular;

import com.dynamics.domain.produto.Produto;
import com.dynamics.domain.promocao.Promocao;

import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("/vincular")
public class Vincular {

    @POST
    @Path("/promocaoproduto")
    @Transactional
    public Response vincularPromocaoProduto(@QueryParam("IdPromocao") Short idpromocao,
                                            @QueryParam("IdProduto") Short idproduto){
        System.out.println(idpromocao);
        System.out.println(idproduto);
        Produto objetoProduto = Produto.findById(idproduto);
        Promocao objetoPromocao = Promocao.findById(idpromocao);

        System.out.println(objetoProduto.Nome);
        System.out.println(objetoPromocao.Descricao);

        if (objetoPromocao == null || objetoProduto == null) {
            throw new WebApplicationException("Produto ou Promoção não existe",404);
        }

        ProdutoPromocao objeto = new ProdutoPromocao();
        objeto.IdProduto = idproduto;
        objeto.IdPromocao = idpromocao;

        objeto.persist();
        System.out.println("Produto: "+objeto.IdProduto+" vinculado com a promoção: "+objeto.IdPromocao);
        return Response.ok().status(201).build();
    }
}

