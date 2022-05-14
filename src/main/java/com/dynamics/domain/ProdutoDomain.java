package com.dynamics.domain;

// import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
// import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Produto")
public class ProdutoDomain extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Short Id;

    @Column(name="Nome")
    private String Nome;

    @Column(name="Preco")
    private java.math.BigDecimal Preco;

    @ManyToOne
    @JoinColumn(name="IdCategoria")
    private CategoriaDomain Categoria;

//    @ManyToMany(mappedBy = "produtos")
//    private Set<PromocaoDomain> promocoes;


    public Short getId() {
        return this.Id;
    }

    public void setId(Short Id) {
        this.Id = Id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public java.math.BigDecimal getPreco() {
        return this.Preco;
    }

    public void setPreco(java.math.BigDecimal Preco) {
        this.Preco = Preco;
    }

    public CategoriaDomain getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(CategoriaDomain Categoria) {
        this.Categoria = Categoria;
    }

    // public Set<PromocaoDomain> getPromocoes() {
    //     return this.promocoes;
    // }

    // public void setPromocoes(Set<PromocaoDomain> promocoes) {
    //     this.promocoes = promocoes;
    // }

}
