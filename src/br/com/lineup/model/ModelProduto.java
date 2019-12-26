package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelProduto {

    private int idproduto;
    private String codbarras;
    private String nomeproduto;
    private int quantidade;
    private String unidadecomercial;
    private String grupo;
    private String marca;
    private String fornecedor;
    private Double precovenda;
    private Double precocusto;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de idproduto
    * @param pIdproduto
    */
    public void setIdproduto(int pIdproduto){
        this.idproduto = pIdproduto;
    }
    /**
    * return pk_idproduto
    */
    public int getIdproduto(){
        return this.idproduto;
    }

    /**
    * seta o valor de codbarras
    * @param pCodbarras
    */
    public void setCodbarras(String pCodbarras){
        this.codbarras = pCodbarras;
    }
    /**
    * return codbarras
    */
    public String getCodbarras(){
        return this.codbarras;
    }

    /**
    * seta o valor de nomeproduto
    * @param pNomeproduto
    */
    public void setNomeproduto(String pNomeproduto){
        this.nomeproduto = pNomeproduto;
    }
    /**
    * return nomeproduto
    */
    public String getNomeproduto(){
        return this.nomeproduto;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    /**
    * seta o valor de unidadecomercial
    * @param pUnidadecomercial
    */
    public void setUnidadecomercial(String pUnidadecomercial){
        this.unidadecomercial = pUnidadecomercial;
    }
    /**
    * return unidadecomercial
    */
    public String getUnidadecomercial(){
        return this.unidadecomercial;
    }

    /**
    * seta o valor de grupo
    * @param pGrupo
    */
    public void setGrupo(String pGrupo){
        this.grupo = pGrupo;
    }
    /**
    * return grupo
    */
    public String getGrupo(){
        return this.grupo;
    }

    /**
    * seta o valor de marca
    * @param pMarca
    */
    public void setMarca(String pMarca){
        this.marca = pMarca;
    }
    /**
    * return marca
    */
    public String getMarca(){
        return this.marca;
    }

    /**
    * seta o valor de fornecedor
    * @param pFornecedor
    */
    public void setFornecedor(String pFornecedor){
        this.fornecedor = pFornecedor;
    }
    /**
    * return fornecedor
    */
    public String getFornecedor(){
        return this.fornecedor;
    }

    /**
    * seta o valor de precovenda
    * @param pPrecovenda
    */
    public void setPrecovenda(Double pPrecovenda){
        this.precovenda = pPrecovenda;
    }
    /**
    * return precovenda
    */
    public Double getPrecovenda(){
        return this.precovenda;
    }

    /**
    * seta o valor de precocusto
    * @param pPrecocusto
    */
    public void setPrecocusto(Double pPrecocusto){
        this.precocusto = pPrecocusto;
    }
    /**
    * return precocusto
    */
    public Double getPrecocusto(){
        return this.precocusto;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::idproduto = " + this.idproduto + "::codbarras = " + this.codbarras + "::nomeproduto = " + this.nomeproduto + "::quantidade = " + this.quantidade + "::unidadecomercial = " + this.unidadecomercial + "::grupo = " + this.grupo + "::marca = " + this.marca + "::fornecedor = " + this.fornecedor + "::precovenda = " + this.precovenda + "::precocusto = " + this.precocusto +  "}";
    }
}