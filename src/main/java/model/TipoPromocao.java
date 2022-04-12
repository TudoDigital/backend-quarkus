package model;

// import controller.TipoPromocao;

import java.util.List;
import java.util.LinkedList;

public class TipoPromocao {

    private List<TipoPromocao> tiposPromocao = new LinkedList<TipoPromocao>();

    public TipoPromocao (int tip_id, String tip_descricao){

        addTipoPromocao( new TipoPromocao(tip_id, tip_descricao));

    }

    public TipoPromocao buscaTiposPromocao(int tip_id){

        for(TipoPromocao tipoPromocao:tiposPromocao){

            if((tipoPromocao.getTip_Id()) == tip_id){

                return tipoPromocao;

            }

        }

        return null;

    }

    public List<TipoPromocao> getTiposPromocao() {

        return tiposPromocao;

    }

    public void addTipoPromocao(TipoPromocao t)
    { }

    public int getTip_Id() 
    { return 0; }
}
