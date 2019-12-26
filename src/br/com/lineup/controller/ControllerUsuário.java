package br.com.lineup.controller;

import br.com.lineup.model.ModelUsuário;
import br.com.lineup.DAO.DAOUsuário;
import java.util.ArrayList;

/**
 *
 * @author Siqueira
 */
public class ControllerUsuário {

    private DAOUsuário daoUsuário = new DAOUsuário();

    /**
     * grava Usuário
     *
     * @param pModelUsuário return int
     */
    public int salvarUsuárioController(ModelUsuário pModelUsuário) {
        return this.daoUsuário.salvarUsuárioDAO(pModelUsuário);
    }

    /**
     * recupera Usuário
     *
     * @param pIduser return ModelUsuário
     */
    public ModelUsuário getUsuárioController(int pIduser) {
        return this.daoUsuário.getUsuárioDAO(pIduser);
    }

    /**
     * recupera uma lista deUsuário
     *
     * @param pIduser return ArrayList
     */
    public ArrayList<ModelUsuário> getListaUsuárioController() {
        return this.daoUsuário.getListaUsuárioDAO();
    }
    
    
    public ArrayList<ModelUsuário> getListaTécnicoController() {
        return this.daoUsuário.getListaTécnicoDAO();
    }

    /**
     * atualiza Usuário
     *
     * @param pModelUsuário return boolean
     */
    public boolean atualizarUsuárioController(ModelUsuário pModelUsuário) {
        return this.daoUsuário.atualizarUsuárioDAO(pModelUsuário);
    }

    /**
     * exclui Usuário
     *
     * @param pIduser return boolean
     */
    public boolean excluirUsuárioController(int pIduser) {
        return this.daoUsuário.excluirUsuárioDAO(pIduser);
    }

    public boolean getLoginUsuario(ModelUsuário pModelUsuário) {
        return this.daoUsuário.getLoginUsuario(pModelUsuário);
    }

}
