package com.dynamics.dto;

import com.dynamics.domain.ProdutoDomain;

public  class ProdutoDTO {

	public Short id;
	public String nome;
	public  java.math.BigDecimal preco;
	public short IdCategoria;
	
	public ProdutoDTO() {
		
	}

//	public ProdutoDTO(Short id, String nome, BigDecimal preco, CategoriaDomain categoria) {
//		
//		id = id;
//		nome = nome;
//		preco = preco;
//		categoria = categoria;
//	}
	
	
	public ProdutoDTO(ProdutoDomain produtoDomain) {

		id = produtoDomain.getId();
		nome = produtoDomain.getNome();
		preco = produtoDomain.getPreco();
		IdCategoria = produtoDomain.getCategoria().getId();
	}
	
}
