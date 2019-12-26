package br.com.lineup.controller;

import br.com.lineup.model.ModelGrupo;
import br.com.lineup.DAO.DAOGrupo;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerGrupo {

    private DAOGrupo daoGrupo = new DAOGrupo();

    /**
    * grava Grupo
    * @param pModelGrupo
    * return int
    */
    public int salvarGrupoController(ModelGrupo pModelGrupo){
        return this.daoGrupo.salvarGrupoDAO(pModelGrupo);
    }

    /**
    * recupera Grupo
    * @param pIdgrupo
    * return ModelGrupo
    */
    public ModelGrupo getGrupoController(int pIdgrupo){
        return this.daoGrupo.getGrupoDAO(pIdgrupo);
    }

    /**
    * recupera uma lista deGrupo
    * @param pIdgrupo
    * return ArrayList
    */
    public ArrayList<ModelGrupo> getListaGrupoController(){
        return this.daoGrupo.getListaGrupoDAO();
    }

    /**
    * atualiza Grupo
    * @param pModelGrupo
    * return boolean
    */
    public boolean atualizarGrupoController(ModelGrupo pModelGrupo){
        return this.daoGrupo.atualizarGrupoDAO(pModelGrupo);
    }

    /**
    * exclui Grupo
    * @param pIdgrupo
    * return boolean
    */
    public boolean excluirGrupoController(int pIdgrupo){
        return this.daoGrupo.excluirGrupoDAO(pIdgrupo);
    }
}