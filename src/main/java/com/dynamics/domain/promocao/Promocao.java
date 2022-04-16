package com.dynamics.domain.promocao;

import com.dynamics.domain.produto.Produto;
import com.dynamics.domain.tipopromocao.TipoPromocao;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="Promocao")
public class Promocao extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    public Short Id;

    @Column(name="Descricao")
    public String Descricao;

    @Column(name = "Desconto")
    public BigDecimal Desconto;

    @Column(name = "DataInicio")
    public Date datainicio;

    @Column(name = "DataFim")
    public Date datafim;

    @Column(name = "QtdeMin")
    public Integer QtdeMin;

    @Column(name = "QtdeBonus")
    public Integer QtdeBonus;

    @Column(name = "Ativo")
    public Boolean Ativo;

    @ManyToOne
    @JoinColumn(name = "IdTipoPromocao")
    public TipoPromocao TipoPromocao;

//    @ManyToMany
//    @JoinTable(name = "ProdutoPromocao",
//            joinColumns = @JoinColumn(name = "IdPromocao"),
//            inverseJoinColumns = @JoinColumn(name = "IdProduto"))
//    public List<Produto> produtos;
}
