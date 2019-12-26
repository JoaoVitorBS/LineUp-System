package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelGrupo {

    private int idgrupo;
    private String  descricao;

    /**
    * Construtor
    */
    public ModelGrupo(){}

    /**
    * seta o valor de idgrupo
    * @param pIdgrupo
    */
    public void setIdgrupo(int pIdgrupo){
        this.idgrupo = pIdgrupo;
    }
    /**
    * return idgrupo
    */
    public int getIdgrupo(){
        return this.idgrupo;
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
        return "ModelGrupo {" + "::idgrupo = " + this.idgrupo + "::descricao = " + this.descricao +  "}";
    }
}