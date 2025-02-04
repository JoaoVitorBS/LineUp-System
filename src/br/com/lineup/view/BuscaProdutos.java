/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lineup.view;

import br.com.lineup.controller.ControllerProduto;
import br.com.lineup.model.ModelProduto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siqueira
 */
public class BuscaProdutos extends javax.swing.JFrame {
    
    //Instânciando as classes
    ControllerProduto controllerProduto = new ControllerProduto();
    ModelProduto modelProduto = new ModelProduto();
    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();

    /**
     * Creates new form BuscaProdutos
     */
    public BuscaProdutos() {
        initComponents();
        Busca_produto();

    }

    //Listando todos os produtos do banco de dados e chamnado em uma tabela(JTable).
    private void Busca_produto() {
        listaModelProduto = controllerProduto.getListaProdutoController();
        DefaultTableModel tabela = (DefaultTableModel) tabela_produtos.getModel();
        tabela.setNumRows(0);

        int tam_lista = listaModelProduto.size();
        for (int i = 0; i < tam_lista; i++) {
            tabela.addRow(new Object[]{
                listaModelProduto.get(i).getIdproduto(),
                listaModelProduto.get(i).getNomeproduto(),
                listaModelProduto.get(i).getPrecovenda(),
                listaModelProduto.get(i).getQuantidade(),});
        }
    }

    //Preencher o nome do produto na caixa de texto.
    private void setar_nome() {
        int set = tabela_produtos.getSelectedRow();
        txtbuscaproduto.setText(tabela_produtos.getModel().getValueAt(set, 1).toString());
    }

    //Preencher campos com as informações do produto selecionado.
    private void setar_Produtos() {
        int set = tabela_produtos.getSelectedRow();
        Tela_Vendas.txt_Id_Prod.setText(tabela_produtos.getModel().getValueAt(set, 0).toString());
        Tela_Vendas.txt_nome_prod.setText(tabela_produtos.getModel().getValueAt(set, 1).toString());
        Tela_Vendas.txt_Valor_Un.setText(tabela_produtos.getModel().getValueAt(set, 2).toString());

        this.dispose();

        Tela_Vendas.txt_Qtde_Prod.setText("1");

        float valortotal;
        valortotal = Float.parseFloat(Tela_Vendas.txt_Valor_Un.getText()) * Integer.parseInt(Tela_Vendas.txt_Qtde_Prod.getText());
        Tela_Vendas.txt_ValorTotal_Prod.setText(String.valueOf(valortotal));
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
        txtbuscaproduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Adicionar_item = new rojerusan.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtbuscaproduto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtbuscaproduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscaprodutoKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Digite o nome do produto:");

        btn_Adicionar_item.setBackground(new java.awt.Color(255, 153, 0));
        btn_Adicionar_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/Add_Produto_32px.png"))); // NOI18N
        btn_Adicionar_item.setText("Adicionar");
        btn_Adicionar_item.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_Adicionar_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Adicionar_itemActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listar Produtos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 0, -1, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/ListarProdutos_50px.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, -1, 80));

        tabela_produtos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tabela_produtos.setForeground(new java.awt.Color(0, 102, 153));
        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Produto", " Nome do Produto", " Preço de Venda", " Estoque atual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.setFocusable(false);
        tabela_produtos.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_produtos.setRowHeight(25);
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_produtos);
        if (tabela_produtos.getColumnModel().getColumnCount() > 0) {
            tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabela_produtos.getColumnModel().getColumn(2).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela_produtos.getColumnModel().getColumn(3).setResizable(false);
            tabela_produtos.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Adicionar_item, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtbuscaproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_Adicionar_item, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscaprodutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaprodutoKeyReleased
        // TODO add your handling code here:
        //busca_produto();
    }//GEN-LAST:event_txtbuscaprodutoKeyReleased

    private void btn_Adicionar_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Adicionar_itemActionPerformed
        // TODO add your handling code here:
        setar_Produtos();
    }//GEN-LAST:event_btn_Adicionar_itemActionPerformed

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        // TODO add your handling code here:
        setar_nome();
    }//GEN-LAST:event_tabela_produtosMouseClicked

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
            java.util.logging.Logger.getLogger(BuscaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro btn_Adicionar_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JTextField txtbuscaproduto;
    // End of variables declaration//GEN-END:variables
}
