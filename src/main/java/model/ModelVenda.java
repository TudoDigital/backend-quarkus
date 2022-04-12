package model;

import controller.Venda;

import java.util.List;
import java.util.LinkedList;
import java.util.Date;

public class ModelVenda {

    private List<Venda> vendas = new LinkedList<Venda>(); 

    public ModelVenda(int ven_id, String ven_nf, Date ven_dt_venda, Float ven_preco_total, Float ven_preco_desc) {

        addVenda(new Venda(ven_id, ven_nf, ven_dt_venda, ven_preco_total, ven_preco_desc));

    }

    public void addVenda(Venda venda)
    { }

    public Venda buscaVenda(int ven_id) {

        for(Venda venda:vendas){

            if((venda.getVen_Id()) == ven_id){

                return venda;

            }

        }

        return null;

    }

    public List<Venda> getVendas(){

        return vendas;

    }

}
