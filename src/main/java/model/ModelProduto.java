package model;

import controller.Produto;
import java.util.List;
import java.util.LinkedList;

public class ModelProduto {

	private List<Produto> produtos = new LinkedList<Produto>();
	
	public ModelProduto(int pdt_id, String pdt_nome, Float pdt_preco, String pdt_descricao, int fk_categoria_cat_id) {
		
		addProduto(new Produto(nome, preco, descricao, idCategoria));
		
	}

	public void addProduto(Produto produto) {

		produto.addProduto(produto);

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
	
}
