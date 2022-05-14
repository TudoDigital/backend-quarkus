package com.dynamics.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.dao.PromocaoDAO;
import com.dynamics.domain.PromocaoDomain;
import com.dynamics.dto.PromocaoDTO;

public class PromocaoService {

	PromocaoDAO promocaoDAO = new PromocaoDAO();

		
	    public List<PromocaoDTO> getPromocao(){
	        return promocaoDAO.getPromocao();
	    }

	    
	    public PromocaoDTO getPromocaoById(@PathParam Short id) {
	        return promocaoDAO.getPromocaoById(id);
	    }

	    
	    public Response insertPromocao(PromocaoDomain promocao){
	    	return promocaoDAO.insertPromocao(promocao);
	    }

	    
	    public Response deletePromocao(@PathParam Short id) {
	    	return promocaoDAO.deletePromocao(id);
	    }

	    public PromocaoDomain updatePromocao(@PathParam Short id, PromocaoDomain promocao) {
	    	return promocaoDAO.updatePromocao(id, promocao);
	    }
}
