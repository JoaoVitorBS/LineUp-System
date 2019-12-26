package br.com.lineup.controller;

import br.com.lineup.model.ModelVendas_Produtos;
import br.com.lineup.DAO.DAOVendas_Produtos;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerVendas_Produtos {

    private DAOVendas_Produtos daoVendas_Produtos = new DAOVendas_Produtos();

    /**
    * grava Vendas_Produtos
    * @param pModelVendas_Produtos
    * return int
    */
    public int salvarVendas_ProdutosController(ModelVendas_Produtos pModelVendas_Produtos){
        return this.daoVendas_Produtos.salvarVendas_ProdutosDAO(pModelVendas_Produtos);
    }

    /**
    * recupera Vendas_Produtos
    * @param pId_venda_produto
    * return ModelVendas_Produtos
    */
    public ModelVendas_Produtos getVendas_ProdutosController(int pId_venda_produto){
        return this.daoVendas_Produtos.getVendas_ProdutosDAO(pId_venda_produto);
    }

    /**
    * recupera uma lista deVendas_Produtos
    * @param pId_venda_produto
    * return ArrayList
    */
    public ArrayList<ModelVendas_Produtos> getListaVendas_ProdutosController(){
        return this.daoVendas_Produtos.getListaVendas_ProdutosDAO();
    }

    /**
    * atualiza Vendas_Produtos
    * @param pModelVendas_Produtos
    * return boolean
    */
    public boolean atualizarVendas_ProdutosController(ModelVendas_Produtos pModelVendas_Produtos){
        return this.daoVendas_Produtos.atualizarVendas_ProdutosDAO(pModelVendas_Produtos);
    }

    /**
    * exclui Vendas_Produtos
    * @param pId_venda_produto
    * return boolean
    */
    public boolean excluirVendas_ProdutosController(int pId_venda_produto){
        return this.daoVendas_Produtos.excluirVendas_ProdutosDAO(pId_venda_produto);
    }
}