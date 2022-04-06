package model;

import controller.Categoria;
import controller.Venda;

import java.util.List;
import java.util.LinkedList;

public class ModelCategoria {

    private List<Venda> vendas = new LinkedList<Venda>();

    public ModelCategoria(int cat_id, String cat_descricao) {

        addCategoria(new Categoria(cat_id, cat_descricao));

    }

    public Categoria buscaCategoria(int cat_id) {

        for(Categoria categoria:categorias){

            if((categoria.getCat_Id()) == cat_id) {

                return categoria;

            }

        }

        return null;

    }

    public List<Categoria> getCategorias() {

        return categorias;

    }

}