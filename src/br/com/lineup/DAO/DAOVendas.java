package br.com.lineup.DAO;

import br.com.lineup.model.ModelVendas;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOVendas extends ConexaoMySql {

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbvendas ("
                    + "pk_id_venda,"
                    + "fk_id_cli,"
                    + "data_venda,"
                    + "valor_venda,"
                    + "desc_venda,"
                    + "valor_total_venda"
                + ") VALUES ("
                    + "'" + pModelVendas.getId_venda() + "',"
                    + "'" + pModelVendas.getId_cli() + "',"
                    + "'" + pModelVendas.getData_venda() + "',"
                    + "'" + pModelVendas.getValor_venda() + "',"
                    + "'" + pModelVendas.getDesc_venda() + "',"
                    + "'" + pModelVendas.getValorTotal_venda() + "'"
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
    * recupera Vendas
    * @param pId_venda
    * return ModelVendas
    */
    public ModelVendas getVendasDAO(int pId_venda){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_id_cli,"
                    + "data_venda,"
                    + "valor_venda,"
                    + "desc_venda,"
                    + "valor_total_venda"
                 + " FROM"
                     + " tbvendas"
                 + " WHERE"
                     + " pk_id_venda = '" + pId_venda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setId_venda(this.getResultSet().getInt(1));
                modelVendas.setId_cli(this.getResultSet().getInt(2));
                modelVendas.setData_venda(this.getResultSet().getDate(3));
                modelVendas.setValor_venda(this.getResultSet().getFloat(4));
                modelVendas.setDesc_venda(this.getResultSet().getFloat(5));
                modelVendas.setValorTotal_venda(this.getResultSet().getFloat(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_id_cli,"
                    + "data_venda,"
                    + "valor_venda,"
                    + "desc_venda,"
                    + "valor_total_venda"
                 + " FROM"
                     + " tbvendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setId_venda(this.getResultSet().getInt(1));
                modelVendas.setId_cli(this.getResultSet().getInt(2));
                modelVendas.setData_venda(this.getResultSet().getDate(3));
                modelVendas.setValor_venda(this.getResultSet().getFloat(4));
                modelVendas.setDesc_venda(this.getResultSet().getFloat(5));
                modelVendas.setValorTotal_venda(this.getResultSet().getFloat(6));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbvendas SET "
                    + "pk_id_venda = '" + pModelVendas.getId_venda() + "',"
                    + "fk_id_cli = '" + pModelVendas.getId_cli() + "',"
                    + "data_venda = '" + pModelVendas.getData_venda() + "',"
                    + "valor_venda = '" + pModelVendas.getValor_venda() + "',"
                    + "desc_venda = '" + pModelVendas.getDesc_venda() + "',"
                    + "valor_total_venda = '" + pModelVendas.getValorTotal_venda() + "'"
                + " WHERE "
                    + "pk_id_venda = '" + pModelVendas.getId_venda() + "'"
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
    * exclui Vendas
    * @param pId_venda
    * return boolean
    */
    public boolean excluirVendasDAO(int pId_venda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbvendas "
                + " WHERE "
                    + "pk_id_venda = '" + pId_venda + "'"
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