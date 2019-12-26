package br.com.lineup.DAO;

import br.com.lineup.model.ModelProduto;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOProduto extends ConexaoMySql {

    /**
    * grava Produto
    * @param pModelProduto
    * return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbprodutos ("
                    + "codbarras,"
                    + "nomeproduto,"
                    + "quantidade,"
                    + "unidadecomercial,"
                    + "grupo,"
                    + "marca,"
                    + "fornecedor,"
                    + "precovenda,"
                    + "precocusto"
                + ") VALUES ("
                    + "'" + pModelProduto.getCodbarras() + "',"
                    + "'" + pModelProduto.getNomeproduto() + "',"
                    + "'" + pModelProduto.getQuantidade() + "',"
                    + "'" + pModelProduto.getUnidadecomercial() + "',"
                    + "'" + pModelProduto.getGrupo() + "',"
                    + "'" + pModelProduto.getMarca() + "',"
                    + "'" + pModelProduto.getFornecedor() + "',"
                    + "'" + pModelProduto.getPrecovenda() + "',"
                    + "'" + pModelProduto.getPrecocusto() + "'"
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
    * recupera Produto
    * @param pIdproduto
    * return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pIdproduto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idproduto,"
                    + "codbarras,"
                    + "nomeproduto,"
                    + "quantidade,"
                    + "unidadecomercial,"
                    + "grupo,"
                    + "marca,"
                    + "fornecedor,"
                    + "precovenda,"
                    + "precocusto"
                 + " FROM"
                     + " tbprodutos"
                 + " WHERE"
                     + " idproduto = '" + pIdproduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setIdproduto(this.getResultSet().getInt(1));
                modelProduto.setCodbarras(this.getResultSet().getString(2));
                modelProduto.setNomeproduto(this.getResultSet().getString(3));
                modelProduto.setQuantidade(this.getResultSet().getInt(4));
                modelProduto.setUnidadecomercial(this.getResultSet().getString(5));
                modelProduto.setGrupo(this.getResultSet().getString(6));
                modelProduto.setMarca(this.getResultSet().getString(7));
                modelProduto.setFornecedor(this.getResultSet().getString(8));
                modelProduto.setPrecovenda(this.getResultSet().getDouble(9));
                modelProduto.setPrecocusto(this.getResultSet().getDouble(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idproduto,"
                    + "codbarras,"
                    + "nomeproduto,"
                    + "quantidade,"
                    + "unidadecomercial,"
                    + "grupo,"
                    + "marca,"
                    + "fornecedor,"
                    + "precovenda,"
                    + "precocusto"
                 + " FROM"
                     + " tbprodutos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setIdproduto(this.getResultSet().getInt(1));
                modelProduto.setCodbarras(this.getResultSet().getString(2));
                modelProduto.setNomeproduto(this.getResultSet().getString(3));
                modelProduto.setQuantidade(this.getResultSet().getInt(4));
                modelProduto.setUnidadecomercial(this.getResultSet().getString(5));
                modelProduto.setGrupo(this.getResultSet().getString(6));
                modelProduto.setMarca(this.getResultSet().getString(7));
                modelProduto.setFornecedor(this.getResultSet().getString(8));
                modelProduto.setPrecovenda(this.getResultSet().getDouble(9));
                modelProduto.setPrecocusto(this.getResultSet().getDouble(10));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbprodutos SET "
                    + "idproduto = '" + pModelProduto.getIdproduto() + "',"
                    + "codbarras = '" + pModelProduto.getCodbarras() + "',"
                    + "nomeproduto = '" + pModelProduto.getNomeproduto() + "',"
                    + "quantidade = '" + pModelProduto.getQuantidade() + "',"
                    + "unidadecomercial = '" + pModelProduto.getUnidadecomercial() + "',"
                    + "grupo = '" + pModelProduto.getGrupo() + "',"
                    + "marca = '" + pModelProduto.getMarca() + "',"
                    + "fornecedor = '" + pModelProduto.getFornecedor() + "',"
                    + "precovenda = '" + pModelProduto.getPrecovenda() + "',"
                    + "precocusto = '" + pModelProduto.getPrecocusto() + "'"
                + " WHERE "
                    + "idproduto = '" + pModelProduto.getIdproduto() + "'"
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
    * exclui Produto
    * @param pIdproduto
    * return boolean
    */
    public boolean excluirProdutoDAO(int pIdproduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbprodutos "
                + " WHERE "
                    + "idproduto = '" + pIdproduto + "'"
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