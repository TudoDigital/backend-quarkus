package com.dynamics.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "TipoPromocao")
public class TipoPromocaoDomain extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    public Short Id;

    @Column(name = "Descricao")
    public String Descricao;
}
