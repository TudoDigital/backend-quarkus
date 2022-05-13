package com.dynamics.domain;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dynamics.domain.ProdutoDomain;
import com.dynamics.domain.TipoPromocaoDomain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Promocao")
public class PromocaoDomain extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    public Short Id;

    @Column(name="Descricao")
    public String Descricao;

    @Column(name = "Desconto")
    public BigDecimal Desconto;

    @Column(name = "DataInicio")
    public Date datainicio;

    @Column(name = "DataFim")
    public Date datafim;

    @Column(name = "QtdeMin")
    public Integer QtdeMin;

    @Column(name = "QtdeBonus")
    public Integer QtdeBonus;

    @Column(name = "Ativo")
    public Boolean Ativo;

    @ManyToOne
    @JoinColumn(name = "IdTipoPromocao")
    public TipoPromocaoDomain TipoPromocao;

    @ManyToMany
    @JoinTable(name = "ProdutoPromocao",
            joinColumns = @JoinColumn(name = "IdPromocao"),
            inverseJoinColumns = @JoinColumn(name = "IdProduto"))
    public List<ProdutoDomain> produtos;
    
    
}
