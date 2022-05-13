package com.dynamics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ProdutoPromocao")
@IdClass(ProdutoPromocaoDomain.class)
public class ProdutoPromocaoDomain extends PanacheEntityBase implements Serializable {

    @Id
    @Column(name = "IdProduto")
    public Short IdProduto;

    @Id
    @Column(name = "IdPromocao")
    public Short IdPromocao;
}
