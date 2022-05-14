package com.dynamics.dto;

import com.dynamics.domain.ProdutoDomain;

public  class ProdutoDTO {

	public Short id;
	public String nome;
	public java.math.BigDecimal preco;
	public short IdCategoria;

	
	public ProdutoDTO(ProdutoDomain produtoDomain) {

		id = produtoDomain.getId();
		nome = produtoDomain.getNome();
		preco = produtoDomain.getPreco();
		IdCategoria = produtoDomain.getCategoria().getId();
	}
	
}
