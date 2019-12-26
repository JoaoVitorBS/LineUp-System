package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelCliente {

    private int id_cli;
    private String nome_cli;
    private String fone_cli;
    private String celular_cli;
    private String email_cli;
    private String end_cli;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String RG_cli;
    private String cpf_cli;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de id_cli
    * @param pId_cli
    */
    public void setId_cli(int pId_cli){
        this.id_cli = pId_cli;
    }
    /**
    * return pk_id_cli
    */
    public int getId_cli(){
        return this.id_cli;
    }

    /**
    * seta o valor de nome_cli
    * @param pNome_cli
    */
    public void setNome_cli(String pNome_cli){
        this.nome_cli = pNome_cli;
    }
    /**
    * return nome_cli
    */
    public String getNome_cli(){
        return this.nome_cli;
    }

    /**
    * seta o valor de fone_cli
    * @param pFone_cli
    */
    public void setFone_cli(String pFone_cli){
        this.fone_cli = pFone_cli;
    }
    /**
    * return fone_cli
    */
    public String getFone_cli(){
        return this.fone_cli;
    }

    /**
    * seta o valor de celular_cli
    * @param pCelular_cli
    */
    public void setCelular_cli(String pCelular_cli){
        this.celular_cli = pCelular_cli;
    }
    /**
    * return celular_cli
    */
    public String getCelular_cli(){
        return this.celular_cli;
    }

    /**
    * seta o valor de email_cli
    * @param pEmail_cli
    */
    public void setEmail_cli(String pEmail_cli){
        this.email_cli = pEmail_cli;
    }
    /**
    * return email_cli
    */
    public String getEmail_cli(){
        return this.email_cli;
    }

    /**
    * seta o valor de end_cli
    * @param pEnd_cli
    */
    public void setEnd_cli(String pEnd_cli){
        this.end_cli = pEnd_cli;
    }
    /**
    * return end_cli
    */
    public String getEnd_cli(){
        return this.end_cli;
    }

    /**
    * seta o valor de complemento
    * @param pComplemento
    */
    public void setComplemento(String pComplemento){
        this.complemento = pComplemento;
    }
    /**
    * return complemento
    */
    public String getComplemento(){
        return this.complemento;
    }

    /**
    * seta o valor de bairro
    * @param pBairro
    */
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    /**
    * return bairro
    */
    public String getBairro(){
        return this.bairro;
    }

    /**
    * seta o valor de cidade
    * @param pCidade
    */
    public void setCidade(String pCidade){
        this.cidade = pCidade;
    }
    /**
    * return cidade
    */
    public String getCidade(){
        return this.cidade;
    }

    /**
    * seta o valor de estado
    * @param pEstado
    */
    public void setEstado(String pEstado){
        this.estado = pEstado;
    }
    /**
    * return estado
    */
    public String getEstado(){
        return this.estado;
    }

    /**
    * seta o valor de RG_cli
    * @param pRG_cli
    */
    public void setRG_cli(String pRG_cli){
        this.RG_cli = pRG_cli;
    }
    /**
    * return RG_cli
    */
    public String getRG_cli(){
        return this.RG_cli;
    }

    /**
    * seta o valor de cpf_cli
    * @param pCpf_cli
    */
    public void setCpf_cli(String pCpf_cli){
        this.cpf_cli = pCpf_cli;
    }
    /**
    * return cpf_cli
    */
    public String getCpf_cli(){
        return this.cpf_cli;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::id_cli = " + this.id_cli + "::nome_cli = " + this.nome_cli + "::fone_cli = " + this.fone_cli + "::celular_cli = " + this.celular_cli + "::email_cli = " + this.email_cli + "::end_cli = " + this.end_cli + "::complemento = " + this.complemento + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::estado = " + this.estado + "::RG_cli = " + this.RG_cli + "::cpf_cli = " + this.cpf_cli +  "}";
    }
}