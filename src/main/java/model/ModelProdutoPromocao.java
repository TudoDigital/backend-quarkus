package model;

import controller.ProdutoPromocao;
import java.util.List;
import java.util.LinkedList;

public class ModelProdutoPromocao {

    private List<produtoPromocao> produtosPromocao = new LinkedList<produtoPromocao>();

    public ModelProdutoPromocao(int fk_promocao_pro_id, int fk_produto_pdt_id){

        addProdutoPromocao( new ProdutoPromocao(fk_promocao_pro_id, fk_produto_pdt_id));

    }

    public ProdutoPromocao buscaProdutoPromocao(int fk_promocao_pro_id, int fk_produto_pdt_id){

        for (ProdutoPromocao produtosPromocao:produtoPromocao){

            if((fk_promocao_pro_id.getFk_Promocao_Pro_Id()) == fk_promocao_pro_id && (fk_produto_pdt_id.getFk_Produto_Pdt_Id()) == fk_produto_pdt_id){

                return produtoPromocao;

            }

        }

        return null;

    }

    public List<ProdutoPromocao> getProdutosPromocao(){

        return produtosPromocao;

    }

}