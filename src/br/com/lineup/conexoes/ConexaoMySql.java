package br.com.lineup.conexoes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Siqueira
 */
public class ConexaoMySql {

    private boolean status = false;
    private String mensagem = "";   //variavel que vai informar o status da conexao
    private Connection con = null;  //variavel para conexao
    private Statement stm;
    public ResultSet rs;

    //Abre uma conexao com o banco
    public Connection conectar() {
        try {
            //Driver do MySql
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/LineUp";
            String user = "root";
            String password = "";
            this.setCon((Connection) DriverManager.getConnection(url, user, password));

            //se ocorrer tudo bem, ou seja, se conectar a linha a segui é executada
            this.status = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();
    }
    
    /**
     * Executa consultas SQL
     *
     * @param pSQL
     * @return int
     */
    public boolean executarSQL(String pSQL) {
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.setResultSet(getStatement().executeQuery(pSQL));

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean executarUpdateDeleteSQL(String pSQL) {
        try {

            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Executa insert SQL
     *
     * @param pSQL
     * @return boolean
     */
    public int insertSQL(String pSQL) {
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);

            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            //recupera o ultimo id inserido
            while (this.rs.next()) {
                status = this.rs.getInt(1);
            }

            //retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    /**
     * encerra a conexão corrente
     *
     * @return boolean
     */
    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.stm != null)) {
                this.getResultSet().close();
                this.stm.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return this.status;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return stm;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return rs;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.stm = statement;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.rs = resultSet;
    }
}
