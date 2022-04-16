package com.dynamics.domain.categoria;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Categoria extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    public Short Id;

    @Column(name="Descricao")
    public String Descricao;
}
