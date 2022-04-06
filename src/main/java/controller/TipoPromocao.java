package controller;

public class TipoProduto {

    private int tip_id;
    private String tip_descricao;

    public TipoProduto(int tip_id, String tip_descricao) {

        this.tip_id = tip_id;
        this.tip_descricao = tip_descricao;

    }

    public getTip_Id(){
        return this.tip_id;
    }

    public getTip_Descricao(){
        return this.tip_descricao;
    }

}