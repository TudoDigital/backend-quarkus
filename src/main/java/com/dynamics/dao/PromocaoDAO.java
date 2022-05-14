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

	        if (objeto.getDescricao() != null) {
	            objeto.setDescricao(promocao.getDescricao());
	        }
	        if (objeto.getDesconto() != null) {
	            objeto.setDesconto(promocao.getDesconto());
	        }
	        if (objeto.getDatainicio() != null) {
	            objeto.setDatainicio(promocao.getDatainicio());
	        }
	        if (objeto.getDatafim() != null) {
	            objeto.setDatafim(promocao.getDatafim());
	        }
	        if (objeto.getQtdeMin() != null) {
	            objeto.setQtdeMin(promocao.getQtdeMin());
	        }
	        if (objeto.getQtdeBonus() != null) {
	            objeto.setQtdeBonus(promocao.getQtdeBonus());
	        }
	        if (objeto.getAtivo() != null) {
	            objeto.setAtivo(promocao.getAtivo());
	        }
	        if (promocao.getTipoPromocao() != null ){
	            TipoPromocaoDomain tipopromocao = TipoPromocaoDomain.findById(promocao.getTipoPromocao().Id);
	            if (tipopromocao != null) {
	                objeto.setTipoPromocao(promocao.getTipoPromocao());
	            }
	        }
	        return objeto;
	    }


}
