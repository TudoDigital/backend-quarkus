package com.dynamics.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.dynamics.dao.PromocaoDAO;
import com.dynamics.domain.PromocaoDomain;
import com.dynamics.dto.PromocaoDTO;
import com.dynamics.dto.PromocaoDTOFindAll;

public class PromocaoService {
//	@Inject
	PromocaoDAO promocaoDAO = new PromocaoDAO();

		
	    public List<PromocaoDomain> getPromocao(){
	        return promocaoDAO.getPromocao();
	    }

	    
//	    public PromocaoDomain getPromocaoById(@PathParam Short id) {
//	        return promocaoDAO.getPromocaoById(id);
//	    }
	    
//	    public List<PromocaoDTOFindAll> getPromocao(){
//	        List<PromocaoDomain> entity = promocaoDAO.getPromocao();
//	    	List<PromocaoDTOFindAll> dto = new ArrayList<PromocaoDTOFindAll>();
//	    	
//	    	return dto;
//	    }
	    
	    public PromocaoDTO getPromocaoById(@PathParam Short id) {
	    	PromocaoDomain entity = promocaoDAO.getPromocaoById(id);
	    	PromocaoDTO dto = new PromocaoDTO(entity) {};
	        return dto;
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
