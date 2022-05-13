package com.dynamics.dao;

import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.domain.PromocaoDomain;
import com.dynamics.domain.TipoPromocaoDomain;


public class PromocaoDAO {
	
		
	    public List<PromocaoDomain> getPromocao(){
	        return PromocaoDomain.listAll();
	    }

	  
	    public PromocaoDomain getPromocaoById(@PathParam Short id) {
	        PromocaoDomain promocao = PromocaoDomain.findById(id);
	        if (promocao == null) {
	            throw new WebApplicationException("Promoção com id: " + id + " não existe.", 404);
	        }
	        return promocao;
	    }
	
		
		public Response insertPromocao (PromocaoDomain promocao) {
			promocao.persist();
			return Response.ok(promocao).status(201).build();
		}
	
	
	   
	    public Response deletePromocao(@PathParam Short id) {
	        PromocaoDomain promocao = PromocaoDomain.findById(id);
	        if (promocao == null) {
	            throw new WebApplicationException("Promoção com o id: " + id + " não existe.", 404);
	        }
	        promocao.delete();
	        return Response.status(204).build();
	    }

	    
	   
	    public PromocaoDomain updatePromocao(@PathParam Short id, PromocaoDomain promocao) {

	        PromocaoDomain objeto = PromocaoDomain.findById(id);

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
	            TipoPromocaoDomain tipopromocao = TipoPromocaoDomain.findById(promocao.TipoPromocao.Id);
	            if (tipopromocao != null) {
	                System.out.println("tipopromocao existe");//Mensagem no terminal
	                objeto.TipoPromocao = promocao.TipoPromocao;
	            }
	        }
	        return objeto;
	    }


}
