package br.com.lineup.DAO;

import br.com.lineup.model.ModelUnidade;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOUnidade extends ConexaoMySql {

    /**
    * grava Unidade
    * @param pModelUnidade
    * return int
    */
    public int salvarUnidadeDAO(ModelUnidade pModelUnidade){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbunidade ("
                    + "idunidade,"
                    + "siglaunidade,"
                    + "descricao"
                + ") VALUES ("
                    + "'" + pModelUnidade.getIdunidade() + "',"
                    + "'" + pModelUnidade.getSigla_unidade() + "',"
                    + "'" + pModelUnidade.getDescricao() + "'"
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
    * recupera Unidade
    * @param pIdunidade
    * return ModelUnidade
    */
    public ModelUnidade getUnidadeDAO(int pIdunidade){
        ModelUnidade modelUnidade = new ModelUnidade();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idunidade,"
                    + "siglaunidade,"
                    + "descricao"
                 + " FROM"
                     + " tbunidade"
                 + " WHERE"
                     + " idunidade = '" + pIdunidade + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUnidade.setIdunidade(this.getResultSet().getInt(1));
                modelUnidade.setSigla_unidade(this.getResultSet().getString (2));
                modelUnidade.setDescricao(this.getResultSet().getString (3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUnidade;
    }

    /**
    * recupera uma lista de Unidade
        * return ArrayList
    */
    public ArrayList<ModelUnidade> getListaUnidadeDAO(){
        ArrayList<ModelUnidade> listamodelUnidade = new ArrayList();
        ModelUnidade modelUnidade = new ModelUnidade();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idunidade,"
                    + "siglaunidade,"
                    + "descricao"
                 + " FROM"
                     + " tbunidade"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUnidade = new ModelUnidade();
                modelUnidade.setIdunidade(this.getResultSet().getInt(1));
                modelUnidade.setSigla_unidade(this.getResultSet().getString (2));
                modelUnidade.setDescricao(this.getResultSet().getString (3));
                listamodelUnidade.add(modelUnidade);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUnidade;
    }

    /**
    * atualiza Unidade
    * @param pModelUnidade
    * return boolean
    */
    public boolean atualizarUnidadeDAO(ModelUnidade pModelUnidade){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbunidade SET "
                    + "idunidade = '" + pModelUnidade.getIdunidade() + "',"
                    + "siglaunidade = '" + pModelUnidade.getSigla_unidade() + "',"
                    + "descricao = '" + pModelUnidade.getDescricao() + "'"
                + " WHERE "
                    + "idunidade = '" + pModelUnidade.getIdunidade() + "'"
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
    * exclui Unidade
    * @param pIdunidade
    * return boolean
    */
    public boolean excluirUnidadeDAO(int pIdunidade){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbunidade "
                + " WHERE "
                    + "idunidade = '" + pIdunidade + "'"
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