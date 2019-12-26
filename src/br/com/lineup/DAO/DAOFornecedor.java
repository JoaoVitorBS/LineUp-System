package br.com.lineup.DAO;

import br.com.lineup.model.ModelFornecedor;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Siqueira
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbfornecedor ("
                    + "nomefornecedor,"
                    + "razaosocial,"
                    + "nomefantasia,"
                    + "endereco,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "CNPJ,"
                    + "email,"
                    + "telefone,"
                    + "celular"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getNomefornecedor() + "',"
                    + "'" + pModelFornecedor.getRazaosocial() + "',"
                    + "'" + pModelFornecedor.getNomefantasia() + "',"
                    + "'" + pModelFornecedor.getEndereco() + "',"
                    + "'" + pModelFornecedor.getComplemento() + "',"
                    + "'" + pModelFornecedor.getBairro() + "',"
                    + "'" + pModelFornecedor.getCidade() + "',"
                    + "'" + pModelFornecedor.getUf() + "',"
                    + "'" + pModelFornecedor.getCNPJ() + "',"
                    + "'" + pModelFornecedor.getEmail() + "',"
                    + "'" + pModelFornecedor.getTelefone() + "',"
                    + "'" + pModelFornecedor.getCelular() + "'"
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
    * recupera Fornecedor
    * @param pIdfornecedor
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pIdfornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idfornecedor,"
                    + "nomefornecedor,"
                    + "razaosocial,"
                    + "nomefantasia,"
                    + "endereco,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "CNPJ,"
                    + "email,"
                    + "telefone,"
                    + "celular"
                 + " FROM"
                     + " tbfornecedor"
                 + " WHERE"
                     + " idfornecedor = '" + pIdfornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setIdfornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomefornecedor(this.getResultSet().getString(2));
                modelFornecedor.setRazaosocial(this.getResultSet().getString(3));
                modelFornecedor.setNomefantasia(this.getResultSet().getString(4));
                modelFornecedor.setEndereco(this.getResultSet().getString(5));
                modelFornecedor.setComplemento(this.getResultSet().getString(6));
                modelFornecedor.setBairro(this.getResultSet().getString(7));
                modelFornecedor.setCidade(this.getResultSet().getString(8));
                modelFornecedor.setUf(this.getResultSet().getString(9));
                modelFornecedor.setCNPJ(this.getResultSet().getString(10));
                modelFornecedor.setEmail(this.getResultSet().getString(11));
                modelFornecedor.setTelefone(this.getResultSet().getString(12));
                modelFornecedor.setCelular(this.getResultSet().getString(13));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idfornecedor,"
                    + "nomefornecedor,"
                    + "razaosocial,"
                    + "nomefantasia,"
                    + "endereco,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "CNPJ,"
                    + "email,"
                    + "telefone,"
                    + "celular"
                 + " FROM"
                     + " tbfornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setIdfornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomefornecedor(this.getResultSet().getString(2));
                modelFornecedor.setRazaosocial(this.getResultSet().getString(3));
                modelFornecedor.setNomefantasia(this.getResultSet().getString(4));
                modelFornecedor.setEndereco(this.getResultSet().getString(5));
                modelFornecedor.setComplemento(this.getResultSet().getString(6));
                modelFornecedor.setBairro(this.getResultSet().getString(7));
                modelFornecedor.setCidade(this.getResultSet().getString(8));
                modelFornecedor.setUf(this.getResultSet().getString(9));
                modelFornecedor.setCNPJ(this.getResultSet().getString(10));
                modelFornecedor.setEmail(this.getResultSet().getString(11));
                modelFornecedor.setTelefone(this.getResultSet().getString(12));
                modelFornecedor.setCelular(this.getResultSet().getString(13));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbfornecedor SET "
                    + "idfornecedor = '" + pModelFornecedor.getIdfornecedor() + "',"
                    + "nomefornecedor = '" + pModelFornecedor.getNomefornecedor() + "',"
                    + "razaosocial = '" + pModelFornecedor.getRazaosocial() + "',"
                    + "nomefantasia = '" + pModelFornecedor.getNomefantasia() + "',"
                    + "endereco = '" + pModelFornecedor.getEndereco() + "',"
                    + "complemento = '" + pModelFornecedor.getComplemento() + "',"
                    + "bairro = '" + pModelFornecedor.getBairro() + "',"
                    + "cidade = '" + pModelFornecedor.getCidade() + "',"
                    + "uf = '" + pModelFornecedor.getUf() + "',"
                    + "CNPJ = '" + pModelFornecedor.getCNPJ() + "',"
                    + "email = '" + pModelFornecedor.getEmail() + "',"
                    + "telefone = '" + pModelFornecedor.getTelefone() + "',"
                    + "celular = '" + pModelFornecedor.getCelular() + "'"
                + " WHERE "
                    + "idfornecedor = '" + pModelFornecedor.getIdfornecedor() + "'"
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
    * exclui Fornecedor
    * @param pIdfornecedor
    * return boolean
    */
    public boolean excluirFornecedorDAO(int pIdfornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbfornecedor "
                + " WHERE "
                    + "idfornecedor = '" + pIdfornecedor + "'"
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