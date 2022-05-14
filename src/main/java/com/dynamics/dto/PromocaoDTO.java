package com.dynamics.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.dynamics.domain.ProdutoDomain;
import com.dynamics.domain.PromocaoDomain;
import com.dynamics.domain.TipoPromocaoDomain;

public abstract class PromocaoDTO {

	public Short Id;
    public String Descricao;
    public BigDecimal Desconto;
    public Date datainicio;
    public Date datafim;
    public Integer QtdeMin;
    public Integer QtdeBonus;
    public Boolean Ativo;
    public short idTipoPromocao;
    public List<ProdutoDomain> produtos;
    
    
//			public PromocaoDTO(Short id, String descricao, BigDecimal desconto, Date datainicio, Date datafim,
//					Integer qtdeMin, Integer qtdeBonus, Boolean ativo, TipoPromocaoDomain tipoPromocao) {
//				//List<ProdutoDomain> produtos) {
//				
//				Id = id;
//				Descricao = descricao;
//				Desconto = desconto;
//				this.datainicio = datainicio;
//				this.datafim = datafim;
//				QtdeMin = qtdeMin;
//				QtdeBonus = qtdeBonus;
//				Ativo = ativo;
//				id = id;
//				this.produtos = produtos;
//			}
    
			public PromocaoDTO(PromocaoDomain promocaoDomain) {
				//List<ProdutoDomain> produtos) {
				
				Id = promocaoDomain.getId();
				Descricao = promocaoDomain.getDescricao();
				Desconto = promocaoDomain.Desconto;
				this.datainicio = promocaoDomain.getDatainicio();
				this.datafim = promocaoDomain.getDatafim();
				QtdeMin = promocaoDomain.getQtdeMin();
				QtdeBonus = promocaoDomain.getQtdeBonus();
				Ativo = promocaoDomain.Ativo;
				idTipoPromocao = promocaoDomain.getTipoPromocao().getId();
				this.produtos = promocaoDomain.getProdutos();
			}
    
	
}
