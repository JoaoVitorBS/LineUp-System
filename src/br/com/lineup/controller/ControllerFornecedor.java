package br.com.lineup.controller;

import br.com.lineup.model.ModelFornecedor;
import br.com.lineup.DAO.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pIdfornecedor
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pIdfornecedor){
        return this.daoFornecedor.getFornecedorDAO(pIdfornecedor);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pIdfornecedor
    * return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pIdfornecedor
    * return boolean
    */
    public boolean excluirFornecedorController(int pIdfornecedor){
        return this.daoFornecedor.excluirFornecedorDAO(pIdfornecedor);
    }
}