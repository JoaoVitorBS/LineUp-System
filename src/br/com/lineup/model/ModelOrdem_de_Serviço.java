package br.com.lineup.model;

import java.sql.Date;

/**
*
* @author Siqueira
*/
public class ModelOrdem_de_Serviço {

    private int os;
    private Date dataos;
    private String statusOS;
    private String aparelho;
    private String defeito;
    private String servico;
    private String tecnico;
    private float valorservico;
    private int id_cli;

    /**
    * Construtor
    */
    public ModelOrdem_de_Serviço(){}

    /**
    * seta o valor de os
    * @param pOs
    */
    public void setOs(int pOs){
        this.os = pOs;
    }
    /**
    * return pk_os
    */
    public int getOs(){
        return this.os;
    }

    /**
    * seta o valor de dataos
    * @param pDataos
    */
    public void setDataos(Date pDataos){
        this.dataos = pDataos;
    }
    /**
    * return dataos
    */
    public Date getDataos(){
        return this.dataos;
    }

    /**
    * seta o valor de statusOS
    * @param pStatusOS
    */
    public void setStatusOS(String pStatusOS){
        this.statusOS = pStatusOS;
    }
    /**
    * return statusOS
    */
    public String getStatusOS(){
        return this.statusOS;
    }

    /**
    * seta o valor de aparelho
    * @param pAparelho
    */
    public void setAparelho(String pAparelho){
        this.aparelho = pAparelho;
    }
    /**
    * return aparelho
    */
    public String getAparelho(){
        return this.aparelho;
    }

    /**
    * seta o valor de defeito
    * @param pDefeito
    */
    public void setDefeito(String pDefeito){
        this.defeito = pDefeito;
    }
    /**
    * return defeito
    */
    public String getDefeito(){
        return this.defeito;
    }

    /**
    * seta o valor de servico
    * @param pServico
    */
    public void setServico(String pServico){
        this.servico = pServico;
    }
    /**
    * return servico
    */
    public String getServico(){
        return this.servico;
    }

    /**
    * seta o valor de tecnico
    * @param pTecnico
    */
    public void setTecnico(String pTecnico){
        this.tecnico = pTecnico;
    }
    /**
    * return tecnico
    */
    public String getTecnico(){
        return this.tecnico;
    }

    /**
    * seta o valor de valorservico
    * @param pValorservico
    */
    public void setValorservico(float pValorservico){
        this.valorservico = pValorservico;
    }
    /**
    * return valorservico
    */
    public float getValorservico(){
        return this.valorservico;
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

    @Override
    public String toString(){
        return "ModelOrdem_de_Serviço {" + "::os = " + this.os + "::dataos = " + this.dataos + "::statusOS = " + this.statusOS + "::aparelho = " + this.aparelho + "::defeito = " + this.defeito + "::servico = " + this.servico + "::tecnico = " + this.tecnico + "::valorservico = " + this.valorservico + "::id_cli = " + this.id_cli +  "}";
    }
}