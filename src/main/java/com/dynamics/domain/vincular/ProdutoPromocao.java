package com.dynamics.domain.vincular;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ProdutoPromocao")
@IdClass(ProdutoPromocao.class)
public class ProdutoPromocao extends PanacheEntityBase implements Serializable {

    @Id
    @Column(name = "IdProduto")
    public Short IdProduto;

    @Id
    @Column(name = "IdPromocao")
    public Short IdPromocao;
}
