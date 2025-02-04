package br.com.lineup.controller;

import br.com.lineup.model.ModelVendas;
import br.com.lineup.DAO.DAOVendas;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pId_venda
    * return ModelVendas
    */
    public ModelVendas getVendasController(int pId_venda){
        return this.daoVendas.getVendasDAO(pId_venda);
    }

    /**
    * recupera uma lista deVendas
    * @param pId_venda
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pId_venda
    * return boolean
    */
    public boolean excluirVendasController(int pId_venda){
        return this.daoVendas.excluirVendasDAO(pId_venda);
    }
}