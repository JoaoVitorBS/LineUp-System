package br.com.lineup.controller;

import br.com.lineup.model.ModelOrdem_de_Serviço;
import br.com.lineup.DAO.DAOOrdem_de_Serviço;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerOrdem_de_Serviço {

    private DAOOrdem_de_Serviço daoOrdem_de_Serviço = new DAOOrdem_de_Serviço();

    /**
    * grava Ordem_de_Serviço
    * @param pModelOrdem_de_Serviço
    * return int
    */
    public int salvarOrdem_de_ServiçoController(ModelOrdem_de_Serviço pModelOrdem_de_Serviço){
        return this.daoOrdem_de_Serviço.salvarOrdem_de_ServiçoDAO(pModelOrdem_de_Serviço);
    }

    /**
    * recupera Ordem_de_Serviço
    * @param pOs
    * return ModelOrdem_de_Serviço
    */
    public ModelOrdem_de_Serviço getOrdem_de_ServiçoController(int pOs){
        return this.daoOrdem_de_Serviço.getOrdem_de_ServiçoDAO(pOs);
    }

    /**
    * recupera uma lista deOrdem_de_Serviço
    * @param pOs
    * return ArrayList
    */
    public ArrayList<ModelOrdem_de_Serviço> getListaOrdem_de_ServiçoController(){
        return this.daoOrdem_de_Serviço.getListaOrdem_de_ServiçoDAO();
    }
    
    public ArrayList<ModelOrdem_de_Serviço> getListaOSDAO(){
        return this.daoOrdem_de_Serviço.getListaOSDAO();
    }

    /**
    * atualiza Ordem_de_Serviço
    * @param pModelOrdem_de_Serviço
    * return boolean
    */
    public boolean atualizarOrdem_de_ServiçoController(ModelOrdem_de_Serviço pModelOrdem_de_Serviço){
        return this.daoOrdem_de_Serviço.atualizarOrdem_de_ServiçoDAO(pModelOrdem_de_Serviço);
    }

    /**
    * exclui Ordem_de_Serviço
    * @param pOs
    * return boolean
    */
    public boolean excluirOrdem_de_ServiçoController(int pOs){
        return this.daoOrdem_de_Serviço.excluirOrdem_de_ServiçoDAO(pOs);
    }
}