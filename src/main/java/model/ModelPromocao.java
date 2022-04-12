package model;

import controller.Promocao;
import java.util.List;
import java.util.LinkedList;
import java.util.Date;

public class ModelPromocao {

    private List<Promocao> promocoes = new LinkedList<Promocao>(); 

    public ModelPromocao (Date pro_dt_inicio, Date pro_dt_fim, int pro_desconto, String pro_descricao, int pro_quant_min, int pro_quant_bonus, int fk_categoria_cat_id, int fk_tipo_promocao_tip_id){
        addPromocao(new Promocao(0, pro_dt_inicio, pro_dt_fim, pro_desconto, pro_descricao, pro_quant_min, pro_quant_bonus, fk_categoria_cat_id, fk_tipo_promocao_tip_id));
    }

    public void addPromocao(Promocao promocao){

        promocao.addPromocao(promocao);

    }

    public Promocao buscaPromocao(int pro_id){

        for(Promocao promocao:promocoes){

            if((promocao.getPro_Id()) == pro_id){
                return promocao;
            }

        }

        return null;

    }

    public List<Promocao> getPromocoes(){

        return promocoes;

    }

}