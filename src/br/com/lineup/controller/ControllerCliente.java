package br.com.lineup.controller;

import br.com.lineup.model.ModelCliente;
import br.com.lineup.DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pId_cli
    * return ModelCliente
    */
    public ModelCliente getClienteController(int pId_cli){
        return this.daoCliente.getClienteDAO(pId_cli);
    }

    public ModelCliente getClienteController(String pNome_cli){
        return this.daoCliente.getClienteDAO(pNome_cli);
    }
    
    /**
    * recupera uma lista deCliente
    * @param pId_cli
    * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pId_cli
    * return boolean
    */
    public boolean excluirClienteController(int pId_cli){
        return this.daoCliente.excluirClienteDAO(pId_cli);
    }
}