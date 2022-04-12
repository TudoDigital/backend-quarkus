package controller;

public class Venda{

    private int ven_id;
    private int ven_nf;
    private Date ven_dt_venda;
    private float ven_preco_total;
    private float ven_preco_desc;

    public Venda (int ven_id, int ven_nf, Date ven_dt_venda, float ven_preco_total, float ven_preco_desc) {

        this.ven_id = ven_id;
        this.ven_nf = ven_nf;
        this.ven_dt_venda = ven_dt_venda;
        this.ven_preco_total = ven_preco_total;
        this.ven_preco_desc = ven_preco_desc;

    }

    public int getVen_Id(){
        return this.ven_id;
    }
    
    public int getVen_Nf(){
        return this.ven_nf;
    }

    public Date getVen_Dt_Venda(){
        return this.ven_dt_venda;
    }

    public float getVen_Preco_Total(){
        return this.ven_preco_total;
    }

    public float getVen_Preco_Desc(){
        return this.ven_preco_desc;
    }

}