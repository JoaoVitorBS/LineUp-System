package br.com.lineup.DAO;

import br.com.lineup.model.ModelVendas_Produtos;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOVendas_Produtos extends ConexaoMySql {

    /**
    * grava Vendas_Produtos
    * @param pModelVendas_Produtos
    * return int
    */
    public int salvarVendas_ProdutosDAO(ModelVendas_Produtos pModelVendas_Produtos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbvendas_produtos ("
                    + "pk_id_venda_produto,"
                    + "fk_idproduto,"
                    + "fk_id_venda,"
                    + "valor_prod_venda,"
                    + "qtde_prod_venda"
                + ") VALUES ("
                    + "'" + pModelVendas_Produtos.getId_venda_produto() + "',"
                    + "'" + pModelVendas_Produtos.getIdproduto() + "',"
                    + "'" + pModelVendas_Produtos.getId_venda() + "',"
                    + "'" + pModelVendas_Produtos.getValorProd_venda() + "',"
                    + "'" + pModelVendas_Produtos.getQtdeProd_venda() + "'"
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
    * recupera Vendas_Produtos
    * @param pId_venda_produto
    * return ModelVendas_Produtos
    */
    public ModelVendas_Produtos getVendas_ProdutosDAO(int pId_venda_produto){
        ModelVendas_Produtos modelVendas_Produtos = new ModelVendas_Produtos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_idproduto,"
                    + "fk_id_venda,"
                    + "valor_prod_venda,"
                    + "qtde_prod_venda"
                 + " FROM"
                     + " tbvendas_produtos"
                 + " WHERE"
                     + " pk_id_venda_produto = '" + pId_venda_produto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas_Produtos.setId_venda_produto(this.getResultSet().getInt(1));
                modelVendas_Produtos.setIdproduto(this.getResultSet().getInt(2));
                modelVendas_Produtos.setId_venda(this.getResultSet().getInt(3));
                modelVendas_Produtos.setValorProd_venda(this.getResultSet().getFloat(4));
                modelVendas_Produtos.setQtdeProd_venda(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas_Produtos;
    }

    /**
    * recupera uma lista de Vendas_Produtos
        * return ArrayList
    */
    public ArrayList<ModelVendas_Produtos> getListaVendas_ProdutosDAO(){
        ArrayList<ModelVendas_Produtos> listamodelVendas_Produtos = new ArrayList();
        ModelVendas_Produtos modelVendas_Produtos = new ModelVendas_Produtos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_idproduto,"
                    + "fk_id_venda,"
                    + "valor_prod_venda,"
                    + "qtde_prod_venda"
                 + " FROM"
                     + " tbvendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas_Produtos = new ModelVendas_Produtos();
                modelVendas_Produtos.setId_venda_produto(this.getResultSet().getInt(1));
                modelVendas_Produtos.setIdproduto(this.getResultSet().getInt(2));
                modelVendas_Produtos.setId_venda(this.getResultSet().getInt(3));
                modelVendas_Produtos.setValorProd_venda(this.getResultSet().getFloat(4));
                modelVendas_Produtos.setQtdeProd_venda(this.getResultSet().getInt(5));
                listamodelVendas_Produtos.add(modelVendas_Produtos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas_Produtos;
    }

    /**
    * atualiza Vendas_Produtos
    * @param pModelVendas_Produtos
    * return boolean
    */
    public boolean atualizarVendas_ProdutosDAO(ModelVendas_Produtos pModelVendas_Produtos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbvendas_produtos SET "
                    + "pk_id_venda_produto = '" + pModelVendas_Produtos.getId_venda_produto() + "',"
                    + "fk_idproduto = '" + pModelVendas_Produtos.getIdproduto() + "',"
                    + "fk_id_venda = '" + pModelVendas_Produtos.getId_venda() + "',"
                    + "valor_prod_venda = '" + pModelVendas_Produtos.getValorProd_venda() + "',"
                    + "qtde_prod_venda = '" + pModelVendas_Produtos.getQtdeProd_venda() + "'"
                + " WHERE "
                    + "pk_id_venda_produto = '" + pModelVendas_Produtos.getId_venda_produto() + "'"
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
    * exclui Vendas_Produtos
    * @param pId_venda_produto
    * return boolean
    */
    public boolean excluirVendas_ProdutosDAO(int pId_venda_produto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbvendas_produtos "
                + " WHERE "
                    + "pk_id_venda_produto = '" + pId_venda_produto + "'"
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