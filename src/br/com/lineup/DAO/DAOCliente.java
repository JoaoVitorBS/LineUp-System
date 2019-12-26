package br.com.lineup.DAO;

import br.com.lineup.model.ModelCliente;
import br.com.lineup.conexoes.ConexaoMySql;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Siqueira
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param pModelCliente return int
     */
    public int salvarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbclientes ("
                    + "nome_cli,"
                    + "fone_cli,"
                    + "celular_cli,"
                    + "email_cli,"
                    + "end_cli,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "RG_cli,"
                    + "cpf_cli"
                    + ") VALUES ("
                    + "'" + pModelCliente.getNome_cli() + "',"
                    + "'" + pModelCliente.getFone_cli() + "',"
                    + "'" + pModelCliente.getCelular_cli() + "',"
                    + "'" + pModelCliente.getEmail_cli() + "',"
                    + "'" + pModelCliente.getEnd_cli() + "',"
                    + "'" + pModelCliente.getComplemento() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCidade() + "',"
                    + "'" + pModelCliente.getEstado() + "',"
                    + "'" + pModelCliente.getRG_cli() + "',"
                    + "'" + pModelCliente.getCpf_cli() + "'"
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
     * recupera Cliente
     *
     * @param pId_cli return ModelCliente
     */
    public ModelCliente getClienteDAO(int pId_cli) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cli,"
                    + "nome_cli,"
                    + "fone_cli,"
                    + "celular_cli,"
                    + "email_cli,"
                    + "end_cli,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "RG_cli,"
                    + "cpf_cli"
                    + " FROM"
                    + " tbclientes"
                    + " WHERE"
                    + " id_cli = '" + pId_cli + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setId_cli(this.getResultSet().getInt(1));
                modelCliente.setNome_cli(this.getResultSet().getString(2));
                modelCliente.setFone_cli(this.getResultSet().getString(3));
                modelCliente.setCelular_cli(this.getResultSet().getString(4));
                modelCliente.setEmail_cli(this.getResultSet().getString(5));
                modelCliente.setEnd_cli(this.getResultSet().getString(6));
                modelCliente.setComplemento(this.getResultSet().getString(7));
                modelCliente.setBairro(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setRG_cli(this.getResultSet().getString(11));
                modelCliente.setCpf_cli(this.getResultSet().getString(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera Cliente
     *
     * @param pId_cli return ModelCliente
     */
    public ModelCliente getClienteDAO(String pNome_cli) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cli,"
                    + "nome_cli,"
                    + "fone_cli,"
                    + "celular_cli,"
                    + "email_cli,"
                    + "end_cli,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "RG_cli,"
                    + "cpf_cli"
                    + " FROM"
                    + " tbclientes"
                    + " WHERE"
                    + " nome_cli = '" + pNome_cli + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setId_cli(this.getResultSet().getInt(1));
                modelCliente.setNome_cli(this.getResultSet().getString(2));
                modelCliente.setFone_cli(this.getResultSet().getString(3));
                modelCliente.setCelular_cli(this.getResultSet().getString(4));
                modelCliente.setEmail_cli(this.getResultSet().getString(5));
                modelCliente.setEnd_cli(this.getResultSet().getString(6));
                modelCliente.setComplemento(this.getResultSet().getString(7));
                modelCliente.setBairro(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setRG_cli(this.getResultSet().getString(11));
                modelCliente.setCpf_cli(this.getResultSet().getString(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelCliente> getListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_cli,"
                    + "nome_cli,"
                    + "fone_cli,"
                    + "celular_cli,"
                    + "email_cli,"
                    + "end_cli,"
                    + "complemento,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "RG_cli,"
                    + "cpf_cli"
                    + " FROM"
                    + " tbclientes"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setId_cli(this.getResultSet().getInt(1));
                modelCliente.setNome_cli(this.getResultSet().getString(2));
                modelCliente.setFone_cli(this.getResultSet().getString(3));
                modelCliente.setCelular_cli(this.getResultSet().getString(4));
                modelCliente.setEmail_cli(this.getResultSet().getString(5));
                modelCliente.setEnd_cli(this.getResultSet().getString(6));
                modelCliente.setComplemento(this.getResultSet().getString(7));
                modelCliente.setBairro(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setRG_cli(this.getResultSet().getString(11));
                modelCliente.setCpf_cli(this.getResultSet().getString(12));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente return boolean
     */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbclientes SET "
                    + "id_cli = '" + pModelCliente.getId_cli() + "',"
                    + "nome_cli = '" + pModelCliente.getNome_cli() + "',"
                    + "fone_cli = '" + pModelCliente.getFone_cli() + "',"
                    + "celular_cli = '" + pModelCliente.getCelular_cli() + "',"
                    + "email_cli = '" + pModelCliente.getEmail_cli() + "',"
                    + "end_cli = '" + pModelCliente.getEnd_cli() + "',"
                    + "complemento = '" + pModelCliente.getComplemento() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "estado = '" + pModelCliente.getEstado() + "',"
                    + "RG_cli = '" + pModelCliente.getRG_cli() + "',"
                    + "cpf_cli = '" + pModelCliente.getCpf_cli() + "'"
                    + " WHERE "
                    + "id_cli = '" + pModelCliente.getId_cli() + "'"
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
     * exclui Cliente
     *
     * @param pId_cli return boolean
     */
    public boolean excluirClienteDAO(int pId_cli) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbclientes "
                    + " WHERE "
                    + "id_cli = '" + pId_cli + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
