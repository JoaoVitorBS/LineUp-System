package br.com.lineup.DAO;

import br.com.lineup.model.ModelGrupo;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOGrupo extends ConexaoMySql {

    /**
    * grava Grupo
    * @param pModelGrupo
    * return int
    */
    public int salvarGrupoDAO(ModelGrupo pModelGrupo){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbgrupo ("
                    + "idgrupo,"
                    + "descricao"
                + ") VALUES ("
                    + "'" + pModelGrupo.getIdgrupo() + "',"
                    + "'" + pModelGrupo.getDescricao() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Grupo
    * @param pIdgrupo
    * return ModelGrupo
    */
    public ModelGrupo getGrupoDAO(int pIdgrupo){
        ModelGrupo modelGrupo = new ModelGrupo();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idgrupo,"
                    + "descricao"
                 + " FROM"
                     + " tbgrupo"
                 + " WHERE"
                     + " idgrupo = '" + pIdgrupo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelGrupo.setIdgrupo(this.getResultSet().getInt(1));
                modelGrupo.setDescricao(this.getResultSet().getString (2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelGrupo;
    }

    /**
    * recupera uma lista de Grupo
        * return ArrayList
    */
    public ArrayList<ModelGrupo> getListaGrupoDAO(){
        ArrayList<ModelGrupo> listamodelGrupo = new ArrayList();
        ModelGrupo modelGrupo = new ModelGrupo();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idgrupo,"
                    + "descricao"
                 + " FROM"
                     + " tbgrupo"
                + ";"
            );

            while(this.getResultSet().next()){
                modelGrupo = new ModelGrupo();
                modelGrupo.setIdgrupo(this.getResultSet().getInt(1));
                modelGrupo.setDescricao(this.getResultSet().getString (2));
                listamodelGrupo.add(modelGrupo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelGrupo;
    }

    /**
    * atualiza Grupo
    * @param pModelGrupo
    * return boolean
    */
    public boolean atualizarGrupoDAO(ModelGrupo pModelGrupo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbgrupo SET "
                    + "idgrupo = '" + pModelGrupo.getIdgrupo() + "',"
                    + "descricao = '" + pModelGrupo.getDescricao() + "'"
                + " WHERE "
                    + "idgrupo = '" + pModelGrupo.getIdgrupo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Grupo
    * @param pIdgrupo
    * return boolean
    */
    public boolean excluirGrupoDAO(int pIdgrupo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbgrupo "
                + " WHERE "
                    + "idgrupo = '" + pIdgrupo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}