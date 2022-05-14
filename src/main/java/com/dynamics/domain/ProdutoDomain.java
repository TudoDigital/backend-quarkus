package com.dynamics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Produto")
public class ProdutoDomain extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    public Short Id;

    @Column(name="Nome")
    public String Nome;

    @Column(name="Preco")
    public  java.math.BigDecimal Preco;

    @ManyToOne
    @JoinColumn(name="IdCategoria")
    public CategoriaDomain Categoria;

	public Short getId() {
		return Id;
	}

	public void setId(Short id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public java.math.BigDecimal getPreco() {
		return Preco;
	}

	public void setPreco(java.math.BigDecimal preco) {
		Preco = preco;
	}

	public CategoriaDomain getCategoria() {
		return Categoria;
	}

	public void setCategoria(CategoriaDomain categoria) {
		Categoria = categoria;
	}

//    @ManyToMany(mappedBy = "produtos")
//    public List<Promocao> promocoes;
    
    
    
}
