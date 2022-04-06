package model;

import controller.Venda;
import java.util.List;
import java.util.LinkedList;

public class ModelVenda {

    private List<Venda> vendas = new LinkedList<venda>(); 

    public ModelVenda(int ven_id, String ven_nf, Date ven_dt_venda, Float ven_preco_total, Float ven_preco_desc) {

        addVenda(new Venda(ven_id, ven_nf, ven_dt_venda, ven_preco_total, ven_preco_desc));

    }

    public Venda buscaVenda(int ven_id) {

        for(Venda venda:vendas){

            if((venda.getVen_Id()) == ven_id){

                return venda;

            }

        }

        return vendas;

    }

    public List<venda> getVendas(){

        return venda;

    }

}
