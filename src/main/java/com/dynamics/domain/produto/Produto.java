package com.dynamics.domain.produto;

import com.dynamics.domain.categoria.Categoria;
import com.dynamics.domain.promocao.Promocao;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Produto")
public class Produto extends PanacheEntityBase {
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
    public Categoria Categoria;

//    @ManyToMany(mappedBy = "produtos")
//    public List<Promocao> promocoes;
}
