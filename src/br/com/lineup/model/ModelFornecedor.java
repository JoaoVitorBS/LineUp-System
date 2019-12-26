package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelFornecedor {

    private int idfornecedor;
    private String nomefornecedor;
    private String razaosocial;
    private String nomefantasia;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String CNPJ;
    private String email;
    private String telefone;
    private String celular;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de idfornecedor
    * @param pIdfornecedor
    */
    public void setIdfornecedor(int pIdfornecedor){
        this.idfornecedor = pIdfornecedor;
    }
    /**
    * return pk_idfornecedor
    */
    public int getIdfornecedor(){
        return this.idfornecedor;
    }

    /**
    * seta o valor de nomefornecedor
    * @param pNomefornecedor
    */
    public void setNomefornecedor(String pNomefornecedor){
        this.nomefornecedor = pNomefornecedor;
    }
    /**
    * return nomefornecedor
    */
    public String getNomefornecedor(){
        return this.nomefornecedor;
    }

    /**
    * seta o valor de razaosocial
    * @param pRazaosocial
    */
    public void setRazaosocial(String pRazaosocial){
        this.razaosocial = pRazaosocial;
    }
    /**
    * return razaosocial
    */
    public String getRazaosocial(){
        return this.razaosocial;
    }

    /**
    * seta o valor de nomefantasia
    * @param pNomefantasia
    */
    public void setNomefantasia(String pNomefantasia){
        this.nomefantasia = pNomefantasia;
    }
    /**
    * return nomefantasia
    */
    public String getNomefantasia(){
        return this.nomefantasia;
    }

    /**
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * return endereco
    */
    public String getEndereco(){
        return this.endereco;
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
    * seta o valor de uf
    * @param pUf
    */
    public void setUf(String pUf){
        this.uf = pUf;
    }
    /**
    * return uf
    */
    public String getUf(){
        return this.uf;
    }

    /**
    * seta o valor de CNPJ
    * @param pCNPJ
    */
    public void setCNPJ(String pCNPJ){
        this.CNPJ = pCNPJ;
    }
    /**
    * return CNPJ
    */
    public String getCNPJ(){
        return this.CNPJ;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * return email
    */
    public String getEmail(){
        return this.email;
    }

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * return telefone
    */
    public String getTelefone(){
        return this.telefone;
    }

    /**
    * seta o valor de celular
    * @param pCelular
    */
    public void setCelular(String pCelular){
        this.celular = pCelular;
    }
    /**
    * return celular
    */
    public String getCelular(){
        return this.celular;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::idfornecedor = " + this.idfornecedor + "::nomefornecedor = " + this.nomefornecedor + "::razaosocial = " + this.razaosocial + "::nomefantasia = " + this.nomefantasia + "::endereco = " + this.endereco + "::complemento = " + this.complemento + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::uf = " + this.uf + "::CNPJ = " + this.CNPJ + "::email = " + this.email + "::telefone = " + this.telefone + "::celular = " + this.celular +  "}";
    }
}