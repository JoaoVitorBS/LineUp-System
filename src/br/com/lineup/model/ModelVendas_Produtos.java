package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelVendas_Produtos {

    private int id_venda_produto;
    private int idproduto;
    private int id_venda;
    private float valorProd_venda;
    private int qtdeProd_venda;

    /**
    * Construtor
    */
    public ModelVendas_Produtos(){}

    /**
    * seta o valor de id_venda_produto
    * @param pId_venda_produto
    */
    public void setId_venda_produto(int pId_venda_produto){
        this.id_venda_produto = pId_venda_produto;
    }
    /**
    * return pk_id_venda_produto
    */
    public int getId_venda_produto(){
        return this.id_venda_produto;
    }

    /**
    * seta o valor de idproduto
    * @param pIdproduto
    */
    public void setIdproduto(int pIdproduto){
        this.idproduto = pIdproduto;
    }
    /**
    * return fk_idproduto
    */
    public int getIdproduto(){
        return this.idproduto;
    }

    /**
    * seta o valor de id_venda
    * @param pId_venda
    */
    public void setId_venda(int pId_venda){
        this.id_venda = pId_venda;
    }
    /**
    * return fk_id_venda
    */
    public int getId_venda(){
        return this.id_venda;
    }

    /**
    * seta o valor de valorProd_venda
    * @param pValorProd_venda
    */
    public void setValorProd_venda(float pValorProd_venda){
        this.valorProd_venda = pValorProd_venda;
    }
    /**
    * return valorProd_venda
    */
    public float getValorProd_venda(){
        return this.valorProd_venda;
    }

    /**
    * seta o valor de qtdeProd_venda
    * @param pQtdeProd_venda
    */
    public void setQtdeProd_venda(int pQtdeProd_venda){
        this.qtdeProd_venda = pQtdeProd_venda;
    }
    /**
    * return qtdeProd_venda
    */
    public int getQtdeProd_venda(){
        return this.qtdeProd_venda;
    }

    @Override
    public String toString(){
        return "ModelVendas_Produtos {" + "::id_venda_produto = " + this.id_venda_produto + "::idproduto = " + this.idproduto + "::id_venda = " + this.id_venda + "::valorProd_venda = " + this.valorProd_venda + "::qtdeProd_venda = " + this.qtdeProd_venda +  "}";
    }
}