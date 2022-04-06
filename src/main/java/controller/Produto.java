package controller;

public class Produto {

	private int pdt_id;
	private String pdt_nome;
	private float pdt_preco;
	private String pdt_descricao;
	private int fk_categoria_cat_id;

	public Produto (int pdt_id, String pdt_nome, float pdt_preco, String pdt_descricao, int fk_categoria_cat_id) {

		this.pdt_id = pdt_id;
		this.pdt_nome = pdt_nome;
		this.pdt_preco = pdt_preco;
		this.pdt_descricao = pdt_descricao;
		this.fk_categoria_cat_id = fk_categoria_cat_id;

	}

	public int getPdt_Id(){
		return this.pdt_id;
	}

	public String getPdt_Nome(){
		return this.pdt_nome;
	}

	public float getPdt_Preco(){
		return this.pdt_preco;
	} 

	public String getPdt_Descricao(){
		return this.pdt_descricao;
	} 

	public int getFk_Categoria_Cat_Id(){
		return this.fk_categoria_cat_id;
	} 
	
}
