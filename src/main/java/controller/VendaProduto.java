package controller;

public class VendaProduto {

    private int ven_pro_quant;
    private int ven_pro_desconto;
    private int fk_produto_pdt_id;
    private int fk_venda_ven_id;

    public VendaProduto (int ven_pro_quant, int ven_pro_desconto, int fk_produto_pdt_id, int fk_venda_ven_id) {

        this.ven_pro_quant = ven_pro_quant;
        this.ven_pro_desconto = ven_pro_desconto;
        this.fk_produto_pdt_id = fk_produto_pdt_id;
        this.fk_venda_ven_id = fk_venda_ven_id;

    }

    public getVen_Pro_Quant() {
        return this.ven_pro_quant;
    }

    public getVen_Preco_Desc() {
        return this.ven_pro_desconto;
    }

    public getFk_Produto_Pdt_Id() {
        return this.fk_produto_pdt_id;
    }

    public getFk_Venda_Ven_Id() {
        return this.fk_venda_ven_id;
    }

}