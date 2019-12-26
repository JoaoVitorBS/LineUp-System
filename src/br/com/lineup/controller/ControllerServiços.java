package br.com.lineup.controller;

import br.com.lineup.model.ModelServiços;
import br.com.lineup.DAO.DAOServiços;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerServiços {

    private DAOServiços daoServiços = new DAOServiços();

    /**
    * grava Serviços
    * @param pModelServiços
    * return int
    */
    public int salvarServiçosController(ModelServiços pModelServiços){
        return this.daoServiços.salvarServiçosDAO(pModelServiços);
    }

    /**
    * recupera Serviços
    * @param pId_servico
    * return ModelServiços
    */
    public ModelServiços getServiçosController(int pId_servico){
        return this.daoServiços.getServiçosDAO(pId_servico);
    }
    
    /**
    * recupera Serviços
    * @param pdescricao_servico
    * return ModelServiços
    */
    public ModelServiços getServiçosController(String pDescricao_servico){
        return this.daoServiços.getServiçosDAO(pDescricao_servico);
    }

    /**
    * recupera uma lista deServiços
    * @param pId_servico
    * return ArrayList
    */
    public ArrayList<ModelServiços> getListaServiçosController(){
        return this.daoServiços.getListaServiçosDAO();
    }

    /**
    * atualiza Serviços
    * @param pModelServiços
    * return boolean
    */
    public boolean atualizarServiçosController(ModelServiços pModelServiços){
        return this.daoServiços.atualizarServiçosDAO(pModelServiços);
    }

    /**
    * exclui Serviços
    * @param pId_servico
    * return boolean
    */
    public boolean excluirServiçosController(int pId_servico){
        return this.daoServiços.excluirServiçosDAO(pId_servico);
    }
}