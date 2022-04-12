package model;

import controller.Produto;
import java.util.List;
import java.util.LinkedList;

public class ModelProduto {

	private Produto produto;
	private List<Produto> produtos = new LinkedList<Produto>();
	
	public ModelProduto(int pdt_id, String pdt_nome, Float pdt_preco, String pdt_descricao, int fk_categoria_cat_id) {
		produto = new Produto(pdt_id, pdt_nome, pdt_preco, pdt_descricao, fk_categoria_cat_id);
		addProduto();
	}

	public void addProduto() {

		produto.addProduto();

	}

	public Produto buscarProduto(int pdt_id) {

		for(Produto produto:produtos) {

			if((produto.getPdt_Id()) == pdt_id){
				return produto;
			}

		}

		return null;

	}

	public List<Produto> getProdutos() {

		return produtos;

	}

	public boolean getExistePromocao(int produtoId)
	{ return false; }

	public String[] buscaTipoPromocao(int produtoId)
	{ 
		String[] string = new String[0];

		return string;
	}
	
}
