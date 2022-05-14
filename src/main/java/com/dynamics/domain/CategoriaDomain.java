package com.dynamics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;



@Entity
@Table(name="Categoria")
public class CategoriaDomain extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Short Id;

    @Column(name="Descricao")
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
