package controller;

import java.util.Date;

public class Promocao {

    private int pro_id;
    private Date pro_dt_inicio;
    private Date pro_dt_fim;
    private int pro_desconto;
    private String pro_descricao;
    private int pro_quant_min;
    private int pro_quant_bonus;
    private int fk_categoria_cat_id;
    private int fk_tipo_promocao_tip_id;

    public Promocao (int pro_id, Date pro_dt_inicio, Date pro_dt_fim, int pro_desconto, String pro_descricao, int pro_quant_min, int pro_quant_bonus, int fk_categoria_cat_id, int fk_tipo_promocao_tip_id) {

        this.pro_id = pro_id;
        this.pro_dt_inicio = pro_dt_inicio;
        this.pro_dt_fim = pro_dt_fim;
        this.pro_desconto = pro_desconto;
        this.pro_descricao = pro_descricao;
        this.pro_quant_min = pro_quant_min;
        this.pro_quant_bonus = pro_quant_bonus;
        this.fk_categoria_cat_id = fk_categoria_cat_id;
        this.fk_tipo_promocao_tip_id = fk_tipo_promocao_tip_id;

    }
    public void addPromocao(Promocao promocao)
    { }

    public int getPro_Id() {
        return this.pro_id;
    }

    public Date getPro_Dt_Inicio() {
        return this.pro_dt_inicio;
    }
    
    public Date getPro_Dt_Fim() {
        return this.pro_dt_fim;
    }

    public int getPro_Desconto() {
        return this.pro_desconto;
    }

    public String getDescricao() {
        return this.pro_descricao;
    }

    public int getPro_Quant_Min() {
        return this.pro_quant_min;
    }

    public int getPro_Quant_Bonus() {
        return this.pro_quant_bonus;
    }

    public int getFk_Categoria_Cat_Id() {
        return this.fk_categoria_cat_id;
    }

    public int getFk_Tipo_Promocao_Tip_Id() {
        return this.fk_tipo_promocao_tip_id;
    }

}