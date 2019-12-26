package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelUnidade {

    private int idunidade;
    private String  sigla_unidade;
    private String  descricao;

    /**
    * Construtor
    */
    public ModelUnidade(){}

    /**
    * seta o valor de idunidade
    * @param pIdunidade
    */
    public void setIdunidade(int pIdunidade){
        this.idunidade = pIdunidade;
    }
    /**
    * return idunidade
    */
    public int getIdunidade(){
        return this.idunidade;
    }

    /**
    * seta o valor de sigla_unidade
    * @param pSigla_unidade
    */
    public void setSigla_unidade(String  pSigla_unidade){
        this.sigla_unidade = pSigla_unidade;
    }
    /**
    * return sigla_unidade
    */
    public String  getSigla_unidade(){
        return this.sigla_unidade;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String  pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * return descricao
    */
    public String  getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString(){
        return "ModelUnidade {" + "::idunidade = " + this.idunidade + "::sigla_unidade = " + this.sigla_unidade + "::descricao = " + this.descricao +  "}";
    }
}