package br.com.lineup.DAO;

import br.com.lineup.model.ModelOrdem_de_Serviço;
import br.com.lineup.conexoes.ConexaoMySql;
import br.com.lineup.model.ModelCliente;
import java.util.ArrayList;

/**
 *
 * @author Siqueira
 */
public class DAOOrdem_de_Serviço extends ConexaoMySql {

    /**
     * grava Ordem_de_Serviço
     *
     * @param pModelOrdem_de_Serviço return int
     */
    public int salvarOrdem_de_ServiçoDAO(ModelOrdem_de_Serviço pModelOrdem_de_Serviço) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbos ("
                    + "os,"
                    + "dataos,"
                    + "statusOs,"
                    + "aparelho,"
                    + "defeito,"
                    + "servico,"
                    + "tecnico,"
                    + "valorservico,"
                    + "id_cli"
                    + ") VALUES ("
                    + "'" + pModelOrdem_de_Serviço.getOs() + "',"
                    + "'" + pModelOrdem_de_Serviço.getDataos() + "',"
                    + "'" + pModelOrdem_de_Serviço.getStatusOS() + "',"
                    + "'" + pModelOrdem_de_Serviço.getAparelho() + "',"
                    + "'" + pModelOrdem_de_Serviço.getDefeito() + "',"
                    + "'" + pModelOrdem_de_Serviço.getServico() + "',"
                    + "'" + pModelOrdem_de_Serviço.getTecnico() + "',"
                    + "'" + pModelOrdem_de_Serviço.getValorservico() + "',"
                    + "'" + pModelOrdem_de_Serviço.getId_cli() + "'"
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
     * recupera Ordem_de_Serviço
     *
     * @param pOs return ModelOrdem_de_Serviço
     */
    public ModelOrdem_de_Serviço getOrdem_de_ServiçoDAO(int pOs) {
        ModelOrdem_de_Serviço modelOrdem_de_Serviço = new ModelOrdem_de_Serviço();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "os,"
                    + "dataos,"
                    + "statusOs,"
                    + "aparelho,"
                    + "defeito,"
                    + "servico,"
                    + "tecnico,"
                    + "valorservico,"
                    + "id_cli"
                    + " FROM"
                    + " tbos"
                    + " WHERE"
                    + " os = '" + pOs + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelOrdem_de_Serviço.setOs(this.getResultSet().getInt(1));
                modelOrdem_de_Serviço.setDataos(this.getResultSet().getDate(2));
                modelOrdem_de_Serviço.setStatusOS(this.getResultSet().getString(3));
                modelOrdem_de_Serviço.setAparelho(this.getResultSet().getString(4));
                modelOrdem_de_Serviço.setDefeito(this.getResultSet().getString(5));
                modelOrdem_de_Serviço.setServico(this.getResultSet().getString(6));
                modelOrdem_de_Serviço.setTecnico(this.getResultSet().getString(7));
                modelOrdem_de_Serviço.setValorservico(this.getResultSet().getFloat(8));
                modelOrdem_de_Serviço.setId_cli(this.getResultSet().getInt(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelOrdem_de_Serviço;
    }

    /**
     * recupera uma lista de Ordem_de_Serviço return ArrayList
     */
    public ArrayList<ModelOrdem_de_Serviço> getListaOrdem_de_ServiçoDAO() {
        ArrayList<ModelOrdem_de_Serviço> listamodelOrdem_de_Serviço = new ArrayList();
        ModelOrdem_de_Serviço modelOrdem_de_Serviço = new ModelOrdem_de_Serviço();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "os,"
                    + "dataos,"
                    + "statusOs,"
                    + "aparelho,"
                    + "defeito,"
                    + "servico,"
                    + "tecnico,"
                    + "valorservico,"
                    + "id_cli"
                    + " FROM"
                    + " tbos"
                    + ";"
            );
            while (this.getResultSet().next()) {
                modelOrdem_de_Serviço = new ModelOrdem_de_Serviço();
                modelOrdem_de_Serviço.setOs(this.getResultSet().getInt(1));
                modelOrdem_de_Serviço.setDataos(this.getResultSet().getDate(2));
                modelOrdem_de_Serviço.setStatusOS(this.getResultSet().getString(3));
                modelOrdem_de_Serviço.setAparelho(this.getResultSet().getString(4));
                modelOrdem_de_Serviço.setDefeito(this.getResultSet().getString(5));
                modelOrdem_de_Serviço.setServico(this.getResultSet().getString(6));
                modelOrdem_de_Serviço.setTecnico(this.getResultSet().getString(7));
                modelOrdem_de_Serviço.setValorservico(this.getResultSet().getFloat(8));
                modelOrdem_de_Serviço.setId_cli(this.getResultSet().getInt(9));

                listamodelOrdem_de_Serviço.add(modelOrdem_de_Serviço);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelOrdem_de_Serviço;
    }

    public ArrayList<ModelOrdem_de_Serviço> getListaOSDAO() {
        ArrayList<ModelOrdem_de_Serviço> listamodelOS = new ArrayList();
        ModelOrdem_de_Serviço modelOrdem_de_Serviço = new ModelOrdem_de_Serviço();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT `tbos`.*, `tbclientes`.`nome_cli` FROM `tbos` INNER JOIN `tbclientes` ON `tbos`.`id_cli` = `tbclientes`.`id_cli`;"
            );
            while (this.getResultSet().next()) {
                modelOrdem_de_Serviço = new ModelOrdem_de_Serviço();
                modelOrdem_de_Serviço.setOs(this.getResultSet().getInt(1));
                modelOrdem_de_Serviço.setDataos(this.getResultSet().getDate(2));
                modelOrdem_de_Serviço.setStatusOS(this.getResultSet().getString(3));
                modelOrdem_de_Serviço.setAparelho(this.getResultSet().getString(4));
                modelOrdem_de_Serviço.setDefeito(this.getResultSet().getString(5));
                modelOrdem_de_Serviço.setServico(this.getResultSet().getString(6));
                modelOrdem_de_Serviço.setTecnico(this.getResultSet().getString(7));
                modelOrdem_de_Serviço.setValorservico(this.getResultSet().getFloat(8));
                modelOrdem_de_Serviço.setId_cli(this.getResultSet().getInt(9));

                listamodelOS.add(modelOrdem_de_Serviço);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelOS;
    }

    /**
     * atualiza Ordem_de_Serviço
     *
     * @param pModelOrdem_de_Serviço return boolean
     */
    public boolean atualizarOrdem_de_ServiçoDAO(ModelOrdem_de_Serviço pModelOrdem_de_Serviço) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbos SET "
                    + "os = '" + pModelOrdem_de_Serviço.getOs() + "',"
                    + "dataos = '" + pModelOrdem_de_Serviço.getDataos() + "',"
                    + "statusOs = '" + pModelOrdem_de_Serviço.getStatusOS() + "',"
                    + "aparelho = '" + pModelOrdem_de_Serviço.getAparelho() + "',"
                    + "defeito = '" + pModelOrdem_de_Serviço.getDefeito() + "',"
                    + "servico = '" + pModelOrdem_de_Serviço.getServico() + "',"
                    + "tecnico = '" + pModelOrdem_de_Serviço.getTecnico() + "',"
                    + "valorservico = '" + pModelOrdem_de_Serviço.getValorservico() + "',"
                    + "id_cli = '" + pModelOrdem_de_Serviço.getId_cli() + "'"
                    + " WHERE "
                    + "os = '" + pModelOrdem_de_Serviço.getOs() + "'"
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
     * exclui Ordem_de_Serviço
     *
     * @param pOs return boolean
     */
    public boolean excluirOrdem_de_ServiçoDAO(int pOs) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbos "
                    + " WHERE "
                    + "os = '" + pOs + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public void Busca_OS() {

    }

}
