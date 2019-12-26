package br.com.lineup.controller;

import br.com.lineup.model.ModelProduto;
import br.com.lineup.DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pIdproduto
    * return ModelProduto
    */
    public ModelProduto getProdutoController(int pIdproduto){
        return this.daoProduto.getProdutoDAO(pIdproduto);
    }

    /**
    * recupera uma lista deProduto
    * @param pIdproduto
    * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pIdproduto
    * return boolean
    */
    public boolean excluirProdutoController(int pIdproduto){
        return this.daoProduto.excluirProdutoDAO(pIdproduto);
    }
}