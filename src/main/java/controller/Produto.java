package controller;

import model.ModelProduto;

public class Produto {

	private int pdt_id;
	private String pdt_nome;
	private float pdt_preco;
	private String pdt_descricao;
	private int fk_categoria_cat_id;
    private ModelProduto modelProduto;

	public Produto (int pdt_id, String pdt_nome, float pdt_preco, String pdt_descricao, int fk_categoria_cat_id) {

		this.pdt_id = pdt_id;
		this.pdt_nome = pdt_nome;
		this.pdt_preco = pdt_preco;
		this.pdt_descricao = pdt_descricao;
		this.fk_categoria_cat_id = fk_categoria_cat_id;
        this.modelProduto = new ModelProduto(pdt_id, pdt_nome, pdt_preco, pdt_descricao, fk_categoria_cat_id);
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

	public boolean buscaExistePromocao(int idProduto){

        boolean result = modelProduto.getExistePromocao(idProduto);

        if(result == true){

            return true;

        }

        else{

            return false;

        }

    }

    public String[] buscaTipoPromocao(int idProduto)
    {
        

        String[] result = modelProduto.buscaTipoPromocao(idProduto);

        return result;

    }

    public void aplicaDesconto(String tip_descricao, int pro_desconto, int pro_quant_min, int pro_quant_bonus, String pdt_nome, float pdt_preco){

        float valor_final = (pdt_preco * pro_desconto)/100;
        float valor_descontado = (pdt_preco - valor_final);

        /** Métodos do tipo void não retornam
            return ("O produto selecionado foi:" + pdt_nome);
            return ("Valor do Produto:" + pdt_preco);
            return ("Tipo de desconto aplicado:" + tip_descricao + ", com o desconto de:" + pro_desconto + "%");
            return ("Valor final com descontos: R$" + valor_final);
            return ("Valor descontado: -R$" +valor_descontado);
        */
    }

    public void aplicaQuantDesconto(String tip_descricao, int pro_desconto, int pro_quant_min, int pro_quant_bonus, String pdt_nome, float pdt_preco){

        int pro_quant_total = pro_quant_min + pro_quant_bonus;
        float valor_final = pdt_preco * pro_quant_total;
        float valor_descontado = (pdt_preco * pro_quant_bonus);

        /** Métodos do tipo void não retornam
            return ("O produto selecionado foi:" + pdt_nome);
            return ("Valor do Produto:" + pdt_preco);
            return ("Tipo de desconto aplicado:" + tip_descricao);
            return ("Valor final com descontos: R$" + valor_final);
            return ("Quantidade:" + pro_quant_total);
            return ("Valor descontado: -R$" + valor_descontado);        
        */
    }

    /*public getPromocoes(int idProduto){

        if (buscaExistePromocao(idProduto) == true){

            String[] result = buscaTipoPromocao(idProduto);

            String tip_descricao = result[0];
            int pro_desconto = Integer.valueOf(result[1]);
            int pro_quant_min = Integer.valueOf(result[2]);
            int pro_quant_bonus = Integer.valueOf(result[3]);
            String pdt_nome = result[4];
            Float pdt_preco = Float.parseFloat(result[5]);

            if (tip_descricao == "desconto"){

                aplicaDesconto(tip_descricao, pro_desconto, pro_quant_min, pro_quant_bonus, pdt_nome, pdt_preco);

            }

            if (tip_descricao == "quantitativo"){

                aplicaQuantDesconto(tip_descricao, pro_desconto, pro_quant_min, pro_quant_bonus, pdt_nome, pdt_preco);

            }

        }

    }*/

    public int addProduto()
    { return 0; }
	
}
