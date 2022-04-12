package controller;

public class ProdutoPromocao {

    private int fk_promocao_pro_id;
    private int fk_produto_pdt_id;

    public ProdutoPromocao (int fk_promocao_pro_id, int fk_produto_pdt_id) {

        this.fk_promocao_pro_id = fk_promocao_pro_id;
        this.fk_produto_pdt_id = fk_produto_pdt_id;

    }

    public getFk_Promocao_Pro_Id() {
        return this.fk_promocao_pro_id;
    }

    public getFk_Produto_Pdt_Id() {
        return this.fk_produto_pdt_id;
    }

}