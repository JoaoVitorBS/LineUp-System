package br.com.lineup.DAO;

import br.com.lineup.model.ModelUsuário;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Siqueira
 */
public class DAOUsuário extends ConexaoMySql {

    /**
     * grava Usuário
     *
     * @param pModelUsuário return int
     */
    public int salvarUsuárioDAO(ModelUsuário pModelUsuário) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbusuarios ("
                    + "iduser,"
                    + "nomeuser,"
                    + "foneuser,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + ") VALUES ("
                    + "'" + pModelUsuário.getIduser() + "',"
                    + "'" + pModelUsuário.getNomeuser() + "',"
                    + "'" + pModelUsuário.getFoneuser() + "',"
                    + "'" + pModelUsuário.getLogin() + "',"
                    + "'" + pModelUsuário.getSenha() + "',"
                    + "'" + pModelUsuário.getPerfil() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuário
     *
     * @param pIduser return ModelUsuário
     */
    public ModelUsuário getUsuárioDAO(int pIduser) {
        ModelUsuário modelUsuário = new ModelUsuário();
        return null;

    }

    /**
     * recupera uma lista de Usuário return ArrayList
     */
    public ArrayList<ModelUsuário> getListaUsuárioDAO() {
        ArrayList<ModelUsuário> listamodelUsuário = new ArrayList();
        ModelUsuário modelUsuário = new ModelUsuário();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nomeuser,"
                    + "foneuser,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + " FROM"
                    + " tbusuarios"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuário = new ModelUsuário();
                modelUsuário.setIduser(this.getResultSet().getInt(1));
                modelUsuário.setNomeuser(this.getResultSet().getString(2));
                modelUsuário.setFoneuser(this.getResultSet().getString(3));
                modelUsuário.setLogin(this.getResultSet().getString(4));
                modelUsuário.setSenha(this.getResultSet().getString(5));
                modelUsuário.setPerfil(this.getResultSet().getString(6));
                listamodelUsuário.add(modelUsuário);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuário;
    }

    public ArrayList<ModelUsuário> getListaTécnicoDAO() {
        ArrayList<ModelUsuário> listamodelUsuário_Técnico = new ArrayList();
        ModelUsuário modelUsuário = new ModelUsuário();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nomeuser,"
                    + "foneuser,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + " FROM"
                    + "`tbusuarios`"
                    + "WHERE"
                    + "`perfil` = 'técnico'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuário = new ModelUsuário();
                modelUsuário.setIduser(this.getResultSet().getInt(1));
                modelUsuário.setNomeuser(this.getResultSet().getString(2));
                modelUsuário.setFoneuser(this.getResultSet().getString(3));
                modelUsuário.setLogin(this.getResultSet().getString(4));
                modelUsuário.setSenha(this.getResultSet().getString(5));
                modelUsuário.setPerfil(this.getResultSet().getString(6));
                listamodelUsuário_Técnico.add(modelUsuário);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuário_Técnico;
    }

    /**
     * atualiza Usuário
     *
     * @param pModelUsuário return boolean
     */
    public boolean atualizarUsuárioDAO(ModelUsuário pModelUsuário) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbusuarios SET "
                    + "iduser = '" + pModelUsuário.getIduser() + "',"
                    + "nomeuser = '" + pModelUsuário.getNomeuser() + "',"
                    + "foneuser = '" + pModelUsuário.getFoneuser() + "',"
                    + "login = '" + pModelUsuário.getLogin() + "',"
                    + "senha = '" + pModelUsuário.getSenha() + "',"
                    + "perfil = '" + pModelUsuário.getPerfil() + "'"
                    + " WHERE "
                    + "iduser = '" + pModelUsuário.getIduser() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuário
     *
     * @param pIduser return boolean
     */
    public boolean excluirUsuárioDAO(int pIduser) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbusuarios "
                    + " WHERE "
                    + "iduser = '" + pIduser + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean getLoginUsuario(ModelUsuário pModelUsuário) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "iduser,"
                    + "nomeuser,"
                    + "foneuser,"
                    + "login,"
                    + "senha,"
                    + "perfil"
                    + " FROM"
                    + " tbusuarios"
                    + " WHERE"
                    + " login = '" + pModelUsuário.getLogin() + "' AND senha = '" + pModelUsuário.getSenha() + "'"
                    + ";"
            );
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
