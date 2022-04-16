package com.dynamics.domain.promocao;

import com.dynamics.domain.tipopromocao.TipoPromocao;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/promocao")
public class PromocaoResource{

    @GET
    public List<Promocao> getPromocao(){
        return Promocao.listAll();
    }

    @GET
    @Path("/{id}")
    public Promocao getPromocaoById(@PathParam Short id) {
        Promocao promocao = Promocao.findById(id);
        if (promocao == null) {
            throw new WebApplicationException("Promoção com id: " + id + " não existe.", 404);
        }
        return promocao;
    }

    @POST
    @Transactional
    public Response insertPromocao(Promocao promocao){
        promocao.persist();
        return Response.ok(promocao).status(201).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deletePromocao(@PathParam Short id) {
        Promocao promocao = Promocao.findById(id);
        if (promocao == null) {
            throw new WebApplicationException("Promoção com o id: " + id + " não existe.", 404);
        }
        promocao.delete();
        return Response.status(204).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Promocao updatePromocao(@PathParam Short id, Promocao promocao) {

        Promocao objeto = Promocao.findById(id);

        if (objeto == null) {
            throw new WebApplicationException("Promoção com id: " + id + " não existe.", 404);
        }
        System.out.println(promocao.Id);
        System.out.println(promocao.Descricao);
        System.out.println(promocao.Desconto);

        if (objeto.Descricao != null) {
            objeto.Descricao = promocao.Descricao;
        }
        if (objeto.Desconto != null) {
            objeto.Desconto = promocao.Desconto;
        }
        if (objeto.datainicio != null) {
            objeto.datainicio = promocao.datainicio;
        }
        if (objeto.datafim != null) {
            objeto.datafim = promocao.datafim;
        }
        if (objeto.QtdeMin != null) {
            objeto.QtdeMin = promocao.QtdeMin;
        }
        if (objeto.QtdeBonus != null) {
            objeto.QtdeBonus = promocao.QtdeBonus;
        }
        if (objeto.Ativo != null) {
            objeto.Ativo = promocao.Ativo;
        }
        if (promocao.TipoPromocao != null ){
            System.out.println("Atualizando tipopromocao");//Mensagem no terminal
            TipoPromocao tipopromocao = TipoPromocao.findById(promocao.TipoPromocao.Id);
            if (tipopromocao != null) {
                System.out.println("tipopromocao existe");//Mensagem no terminal
                objeto.TipoPromocao = promocao.TipoPromocao;
            }
        }
        return objeto;
    }

}
