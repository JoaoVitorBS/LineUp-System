package br.com.lineup.model;

import java.sql.Date;

/**
*
* @author Siqueira
*/
public class ModelVendas {

    private int id_venda;
    private int id_cli;
    private Date data_venda;
    private float valor_venda;
    private float desc_venda;
    private float valorTotal_venda;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de id_venda
    * @param pId_venda
    */
    public void setId_venda(int pId_venda){
        this.id_venda = pId_venda;
    }
    /**
    * return pk_id_venda
    */
    public int getId_venda(){
        return this.id_venda;
    }

    /**
    * seta o valor de id_cli
    * @param pId_cli
    */
    public void setId_cli(int pId_cli){
        this.id_cli = pId_cli;
    }
    /**
    * return fk_id_cli
    */
    public int getId_cli(){
        return this.id_cli;
    }

    /**
    * seta o valor de data_venda
    * @param pData_venda
    */
    public void setData_venda(Date pData_venda){
        this.data_venda = pData_venda;
    }
    /**
    * return data_venda
    */
    public Date getData_venda(){
        return this.data_venda;
    }

    /**
    * seta o valor de valor_venda
    * @param pValor_venda
    */
    public void setValor_venda(float pValor_venda){
        this.valor_venda = pValor_venda;
    }
    /**
    * return valor_venda
    */
    public float getValor_venda(){
        return this.valor_venda;
    }

    /**
    * seta o valor de desc_venda
    * @param pDesc_venda
    */
    public void setDesc_venda(float pDesc_venda){
        this.desc_venda = pDesc_venda;
    }
    /**
    * return desc_venda
    */
    public float getDesc_venda(){
        return this.desc_venda;
    }

    /**
    * seta o valor de valorTotal_venda
    * @param pValorTotal_venda
    */
    public void setValorTotal_venda(float pValorTotal_venda){
        this.valorTotal_venda = pValorTotal_venda;
    }
    /**
    * return valorTotal_venda
    */
    public float getValorTotal_venda(){
        return this.valorTotal_venda;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::id_venda = " + this.id_venda + "::id_cli = " + this.id_cli + "::data_venda = " + this.data_venda + "::valor_venda = " + this.valor_venda + "::desc_venda = " + this.desc_venda + "::valorTotal_venda = " + this.valorTotal_venda +  "}";
    }
}