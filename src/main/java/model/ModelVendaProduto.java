package model;

import controller.VendaProduto;

import java.util.List;
import java.util.LinkedList;

public class ModelVendaProduto {

    private List<VendaProduto> vendasProduto = new LinkedList<VendaProduto>();

    public ModelVendaProduto(int ven_pro_quant, int ven_pro_desconto, fk_produto_pdt_id, fk_venda_ven_id){

        addVendaProduto( new VendaProduto(ven_pro_quant, ven_pro_desconto, fk_produto_pdt_id, fk_venda_ven_id));

    }

    public VendaProduto buscaVendasProduto(int fk_produto_pdt_id, int fk_venda_ven_id){

        for(VendaProduto vendaproduto:vendasproduto){

            if((vendaproduto.getFk_Produto_Pdt_Id()) == (fk_produto_pdt_id && (vendaproduto.getFk_Venda_Ven_Id())){

                return vendaproduto;

            }

        }

        return null;

    }

    public List<vendasProduto> getVendaProduto(){

        return vendasProduto;

    }