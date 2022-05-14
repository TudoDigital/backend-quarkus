package com.dynamics.domain;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Promocao")
public class PromocaoDomain extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Short Id;

    @Column(name="Descricao")
    private String Descricao;

    @Column(name = "Desconto")
    private BigDecimal Desconto;

    @Column(name = "DataInicio")
    private Date datainicio;

    @Column(name = "DataFim")
    private Date datafim;

    @Column(name = "QtdeMin")
    private Integer QtdeMin;

    @Column(name = "QtdeBonus")
    private Integer QtdeBonus;

    @Column(name = "Ativo")
    private Boolean Ativo;

    @ManyToOne
    @JoinColumn(name = "IdTipoPromocao")
    private TipoPromocaoDomain TipoPromocao;

    @ManyToMany
    @JoinTable(name = "ProdutoPromocao",
            joinColumns = @JoinColumn(name = "IdPromocao"),
            inverseJoinColumns = @JoinColumn(name = "IdProduto")
            )
    private Set<ProdutoDomain> produtos;    

    public Short getId() {
        return this.Id;
    }

    public void setId(Short Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return this.Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public BigDecimal getDesconto() {
        return this.Desconto;
    }

    public void setDesconto(BigDecimal Desconto) {
        this.Desconto = Desconto;
    }

    public Date getDatainicio() {
        return this.datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return this.datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public Integer getQtdeMin() {
        return this.QtdeMin;
    }

    public void setQtdeMin(Integer QtdeMin) {
        this.QtdeMin = QtdeMin;
    }

    public Integer getQtdeBonus() {
        return this.QtdeBonus;
    }

    public void setQtdeBonus(Integer QtdeBonus) {
        this.QtdeBonus = QtdeBonus;
    }

    public Boolean isAtivo() {
        return this.Ativo;
    }

    public Boolean getAtivo() {
        return this.Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }

    public TipoPromocaoDomain getTipoPromocao() {
        return this.TipoPromocao;
    }

    public void setTipoPromocao(TipoPromocaoDomain TipoPromocao) {
        this.TipoPromocao = TipoPromocao;
    }

    public Set<ProdutoDomain> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Set<ProdutoDomain> produtos) {
        this.produtos = produtos;
    }
    
}
