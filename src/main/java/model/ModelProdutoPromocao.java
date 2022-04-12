package model;

import controller.ProdutoPromocao;
import java.util.List;
import java.util.LinkedList;

public class ModelProdutoPromocao {

    private List<ProdutoPromocao> produtosPromocao = new LinkedList<ProdutoPromocao>();

    public ModelProdutoPromocao(int fk_promocao_pro_id, int fk_produto_pdt_id){

        addProdutoPromocao( new ProdutoPromocao(fk_promocao_pro_id, fk_produto_pdt_id));

    }

    public void addProdutoPromocao(ProdutoPromocao produtoPromocao)
    { }

    public ProdutoPromocao buscaProdutoPromocao(int fk_promocao_pro_id, int fk_produto_pdt_id){

        for (ProdutoPromocao produtoPromocao:produtosPromocao){

            if (fk_promocao_pro_id == fk_produto_pdt_id)
                return produtoPromocao;

        }

        return null;

    }

    public List<ProdutoPromocao> getProdutosPromocao(){

        return produtosPromocao;

    }

}