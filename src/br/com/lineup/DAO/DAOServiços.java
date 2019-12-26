package br.com.lineup.DAO;

import br.com.lineup.model.ModelServiços;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOServiços extends ConexaoMySql {

    /**
    * grava Serviços
    * @param pModelServiços
    * return int
    */
    public int salvarServiçosDAO(ModelServiços pModelServiços){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbserviços ("
                    + "id_servico,"
                    + "descricao_servico,"
                    + "valor_servico"
                + ") VALUES ("
                    + "'" + pModelServiços.getId_servico() + "',"
                    + "'" + pModelServiços.getDescricao_servico() + "',"
                    + "'" + pModelServiços.getValor_servico() + "'"
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
    * recupera Serviços
    * @param pId_servico
    * return ModelServiços
    */
    public ModelServiços getServiçosDAO(int pId_servico){
        ModelServiços modelServiços = new ModelServiços();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_servico,"
                    + "descricao_servico,"
                    + "valor_servico"
                 + " FROM"
                     + " tbserviços"
                 + " WHERE"
                     + " id_servico = '" + pId_servico + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelServiços.setId_servico(this.getResultSet().getInt(1));
                modelServiços.setDescricao_servico(this.getResultSet().getString(2));
                modelServiços.setValor_servico(this.getResultSet().getFloat(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelServiços;
    }
    
    public ModelServiços getServiçosDAO(String pDescricao_servico){
        ModelServiços modelServiços = new ModelServiços();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_servico,"
                    + "descricao_servico,"
                    + "valor_servico"
                 + " FROM"
                     + " tbserviços"
                 + " WHERE"
                     + " descricao_servico = '" + pDescricao_servico + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelServiços.setId_servico(this.getResultSet().getInt(1));
                modelServiços.setDescricao_servico(this.getResultSet().getString(2));
                modelServiços.setValor_servico(this.getResultSet().getFloat(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelServiços;
    }

    /**
    * recupera uma lista de Serviços
        * return ArrayList
    */
    public ArrayList<ModelServiços> getListaServiçosDAO(){
        ArrayList<ModelServiços> listamodelServiços = new ArrayList();
        ModelServiços modelServiços = new ModelServiços();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_servico,"
                    + "descricao_servico,"
                    + "valor_servico"
                 + " FROM"
                     + " tbserviços"
                + ";"
            );

            while(this.getResultSet().next()){
                modelServiços = new ModelServiços();
                modelServiços.setId_servico(this.getResultSet().getInt(1));
                modelServiços.setDescricao_servico(this.getResultSet().getString(2));
                modelServiços.setValor_servico(this.getResultSet().getFloat(3));
                listamodelServiços.add(modelServiços);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelServiços;
    }

    /**
    * atualiza Serviços
    * @param pModelServiços
    * return boolean
    */
    public boolean atualizarServiçosDAO(ModelServiços pModelServiços){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbserviços SET "
                    + "id_servico = '" + pModelServiços.getId_servico() + "',"
                    + "descricao_servico = '" + pModelServiços.getDescricao_servico() + "',"
                    + "valor_servico = '" + pModelServiços.getValor_servico() + "'"
                + " WHERE "
                    + "id_servico = '" + pModelServiços.getId_servico() + "'"
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
    * exclui Serviços
    * @param pId_servico
    * return boolean
    */
    public boolean excluirServiçosDAO(int pId_servico){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbserviços "
                + " WHERE "
                    + "id_servico = '" + pId_servico + "'"
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