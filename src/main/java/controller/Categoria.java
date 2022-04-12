package controller;

public class Categoria{

    private int cat_id;
    private String cat_descricao;

    public Categoria (int cat_id, String cat_descricao) {

        this.cat_id = cat_id;
        this.cat_descricao = cat_descricao;

    }

    public int getCat_Id(){
        return this.cat_id;
    }

    public String getCat_Descricao(){
        return this.cat_descricao;
    }

}