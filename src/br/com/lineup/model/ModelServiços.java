package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelServiços {

    private int id_servico;
    private String descricao_servico;
    private float valor_servico;

    /**
    * Construtor
    */
    public ModelServiços(){}

    /**
    * seta o valor de id_servico
    * @param pId_servico
    */
    public void setId_servico(int pId_servico){
        this.id_servico = pId_servico;
    }
    /**
    * return id_servico
    */
    public int getId_servico(){
        return this.id_servico;
    }

    /**
    * seta o valor de descricao_servico
    * @param pDescricao_servico
    */
    public void setDescricao_servico(String pDescricao_servico){
        this.descricao_servico = pDescricao_servico;
    }
    /**
    * return descricao_servico
    */
    public String getDescricao_servico(){
        return this.descricao_servico;
    }

    /**
    * seta o valor de valor_servico
    * @param pValor_servico
    */
    public void setValor_servico(float pValor_servico){
        this.valor_servico = pValor_servico;
    }
    /**
    * return valor_servico
    */
    public float getValor_servico(){
        return this.valor_servico;
    }

    @Override
    public String toString(){
        return "ModelServiços {" + "::id_servico = " + this.id_servico + "::descricao_servico = " + this.descricao_servico + "::valor_servico = " + this.valor_servico +  "}";
    }
}