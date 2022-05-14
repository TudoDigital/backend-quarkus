package com.dynamics.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "TipoPromocao")
public class TipoPromocaoDomain extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Short Id;

    @Column(name = "Descricao")
    private String Descricao;


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

}
