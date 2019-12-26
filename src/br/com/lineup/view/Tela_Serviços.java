/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lineup.view;

import br.com.lineup.controller.ControllerServiços;
import br.com.lineup.model.ModelServiços;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siqueira
 */
public class Tela_Serviços extends javax.swing.JFrame {

    ControllerServiços controllerServiços = new ControllerServiços();
    ModelServiços modelServiços = new ModelServiços();
    ArrayList<ModelServiços> listaModelServiços = new ArrayList<>();

    /**
     * Creates new form Tela_AddUnidade
     */
    public Tela_Serviços() {
        initComponents();
        busca_serviço();
    }

    private void Combo_Serviço() {
        listaModelServiços = controllerServiços.getListaServiçosController();
        Tela_OS.combo_Serviço.removeAllItems();

        for (int i = 0; i < listaModelServiços.size(); i++) {
            Tela_OS.combo_Serviço.addItem(listaModelServiços.get(i).getDescricao_servico());
        }
    }
    
    private void busca_serviço() {
        listaModelServiços = controllerServiços.getListaServiçosController();
        DefaultTableModel tabela = (DefaultTableModel) tabelaserviço.getModel();
        tabela.setNumRows(0);

        int tam_lista = listaModelServiços.size();
        for (int i = 0; i < tam_lista; i++) {
            tabela.addRow(new Object[]{
                listaModelServiços.get(i).getId_servico(),
                listaModelServiços.get(i).getDescricao_servico(),
                listaModelServiços.get(i).getValor_servico(),});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_IdServiço = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaserviço = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        rSButtonMetro2 = new rojerusan.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jLabel10 = new javax.swing.JLabel();
        txt_Descrição = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Valor = new javax.swing.JTextField();
        btn_Cadastrar1 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_IdServiço.setEditable(false);
        txt_IdServiço.setBackground(new java.awt.Color(255, 255, 255));
        txt_IdServiço.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_IdServiço.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_IdServiço.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_IdServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdServiçoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_IdServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, 30));

        jLabel5.setBackground(new java.awt.Color(0, 66, 109));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("*Código:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        tabelaserviço.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabelaserviço.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaserviço.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaserviço.setRowHeight(25);
        tabelaserviço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaserviçoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaserviço);
        if (tabelaserviço.getColumnModel().getColumnCount() > 0) {
            tabelaserviço.getColumnModel().getColumn(0).setResizable(false);
            tabelaserviço.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaserviço.getColumnModel().getColumn(1).setResizable(false);
            tabelaserviço.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelaserviço.getColumnModel().getColumn(2).setResizable(false);
            tabelaserviço.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 480, 123));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 440, 30));

        rSButtonMetro2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons24px/Busca_24px.png"))); // NOI18N
        jPanel1.add(rSButtonMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 30, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastrar Serviço");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 0, -1, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/Serviços_50px.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 80));

        rSButtonMetro1.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons24px/Close.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(204, 0, 0));
        rSButtonMetro1.setColorNormal(new java.awt.Color(0, 102, 153));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel10.setBackground(new java.awt.Color(0, 66, 109));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("*Descrição:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 90, -1));

        txt_Descrição.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_Descrição.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_Descrição.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txt_Descrição, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 230, 30));

        jLabel6.setBackground(new java.awt.Color(0, 66, 109));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("*Valor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        txt_Valor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_Valor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txt_Valor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txt_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 140, 30));

        btn_Cadastrar1.setBackground(new java.awt.Color(0, 66, 109));
        btn_Cadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/Adicionar_32px.png"))); // NOI18N
        btn_Cadastrar1.setText("Cadastrar");
        btn_Cadastrar1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadastrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadastrar1ActionPerformed
        // TODO add your handling code here:
        modelServiços.setDescricao_servico(this.txt_Descrição.getText());
        modelServiços.setValor_servico(Float.parseFloat(this.txt_Valor.getText()));

        if (controllerServiços.salvarServiçosController(modelServiços) > 0) {
            JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao tentar cadastrar serviço!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        // Setando os campos como nulo:
        txt_IdServiço.setText(null);
        txt_Descrição.setText(null);
        txt_Valor.setText(null);
        
        busca_serviço();  
        Combo_Serviço();
    }//GEN-LAST:event_btn_Cadastrar1ActionPerformed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void txt_IdServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdServiçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdServiçoActionPerformed

    private void tabelaserviçoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaserviçoMouseClicked
        // TODO add your handling code here:
        int set = tabelaserviço.getSelectedRow();
        txt_IdServiço.setText(tabelaserviço.getModel().getValueAt(set, 0).toString());
        txt_Descrição.setText(tabelaserviço.getModel().getValueAt(set, 1).toString());
        txt_Valor.setText(tabelaserviço.getModel().getValueAt(set, 2).toString());
    }//GEN-LAST:event_tabelaserviçoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Serviços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Serviços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Serviços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Serviços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Serviços().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro btn_Cadastrar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rojerusan.RSButtonMetro rSButtonMetro2;
    private javax.swing.JTable tabelaserviço;
    private javax.swing.JTextField txt_Descrição;
    private javax.swing.JTextField txt_IdServiço;
    private javax.swing.JTextField txt_Valor;
    // End of variables declaration//GEN-END:variables

}
