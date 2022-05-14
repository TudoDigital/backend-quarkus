package com.dynamics.dto;

import java.math.BigDecimal;
import java.sql.Date;

import com.dynamics.domain.PromocaoDomain;
import com.dynamics.domain.TipoPromocaoDomain;

public abstract class PromocaoDTOFindAll {

	public Short Id;
    public String Descricao;
    public BigDecimal Desconto;
    public Date datainicio;
    public Date datafim;
    public Integer QtdeMin;
    public Integer QtdeBonus;
    public Boolean Ativo;
    public short id;
//            joinColumns = @JoinColumn(name = "IdPromocao"),
//            inverseJoinColumns = @JoinColumn(name = "IdProduto"))
//    public List<ProdutoDomain> produtos;
    
    
			public PromocaoDTOFindAll(Short id, String descricao, BigDecimal desconto, Date datainicio, Date datafim,
					Integer qtdeMin, Integer qtdeBonus, Boolean ativo, TipoPromocaoDomain tipoPromocao) {
				//List<ProdutoDomain> produtos) {
				
				Id = id;
				Descricao = descricao;
				Desconto = desconto;
				this.datainicio = datainicio;
				this.datafim = datafim;
				QtdeMin = qtdeMin;
				QtdeBonus = qtdeBonus;
				Ativo = ativo;
				id = id;
//				this.produtos = produtos;
			}
    
			public PromocaoDTOFindAll(PromocaoDomain promocaoDomain) {
				//List<ProdutoDomain> produtos) {
				
				Id = promocaoDomain.getId();
				Descricao = promocaoDomain.getDescricao();
				Desconto = promocaoDomain.Desconto;
				this.datainicio = promocaoDomain.getDatainicio();
				this.datafim = promocaoDomain.getDatafim();
				QtdeMin = promocaoDomain.getQtdeMin();
				QtdeBonus = promocaoDomain.getQtdeBonus();
				Ativo = promocaoDomain.Ativo;
				id = promocaoDomain.getTipoPromocao().getId();
//				this.produtos = produtos;
			}
    
	
}
