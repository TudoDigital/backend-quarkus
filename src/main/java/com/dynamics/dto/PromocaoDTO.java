package com.dynamics.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.dynamics.domain.ProdutoDomain;
import com.dynamics.domain.PromocaoDomain;

public class PromocaoDTO {

	public Short Id;
    public String Descricao;
    public BigDecimal Desconto;
    public Date datainicio;
    public Date datafim;
    public Integer QtdeMin;
    public Integer QtdeBonus;
    public Boolean Ativo;
    public short idTipoPromocao;
    public String descTipoPromocao;
    public List<ProdutoDomain> produtos;

    public PromocaoDTO(PromocaoDomain promocaoDomain) {
        Id = promocaoDomain.getId();
        Descricao = promocaoDomain.getDescricao();
        Desconto = promocaoDomain.getDesconto();
        this.datainicio = promocaoDomain.getDatainicio();
        this.datafim = promocaoDomain.getDatafim();
        QtdeMin = promocaoDomain.getQtdeMin();
        QtdeBonus = promocaoDomain.getQtdeBonus();
        Ativo = promocaoDomain.getAtivo();
        idTipoPromocao = promocaoDomain.getTipoPromocao().getId();
        descTipoPromocao = promocaoDomain.getTipoPromocao().getDescricao();
    }


}