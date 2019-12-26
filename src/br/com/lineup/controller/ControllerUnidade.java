package br.com.lineup.controller;

import br.com.lineup.model.ModelUnidade;
import br.com.lineup.DAO.DAOUnidade;
import java.util.ArrayList;

/**
*
* @author Siqueira
*/
public class ControllerUnidade {

    private DAOUnidade daoUnidade = new DAOUnidade();

    /**
    * grava Unidade
    * @param pModelUnidade
    * return int
    */
    public int salvarUnidadeController(ModelUnidade pModelUnidade){
        return this.daoUnidade.salvarUnidadeDAO(pModelUnidade);
    }

    /**
    * recupera Unidade
    * @param pIdunidade
    * return ModelUnidade
    */
    public ModelUnidade getUnidadeController(int pIdunidade){
        return this.daoUnidade.getUnidadeDAO(pIdunidade);
    }

    /**
    * recupera uma lista deUnidade
    * @param pIdunidade
    * return ArrayList
    */
    public ArrayList<ModelUnidade> getListaUnidadeController(){
        return this.daoUnidade.getListaUnidadeDAO();
    }

    /**
    * atualiza Unidade
    * @param pModelUnidade
    * return boolean
    */
    public boolean atualizarUnidadeController(ModelUnidade pModelUnidade){
        return this.daoUnidade.atualizarUnidadeDAO(pModelUnidade);
    }

    /**
    * exclui Unidade
    * @param pIdunidade
    * return boolean
    */
    public boolean excluirUnidadeController(int pIdunidade){
        return this.daoUnidade.excluirUnidadeDAO(pIdunidade);
    }
}