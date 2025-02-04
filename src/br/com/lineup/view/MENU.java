/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lineup.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Siqueira
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
        initComponents();
        new Trocar_Painel(Painel_Desktop, new Tela_Home());
        Data();
    }

    private void Data() {
        Date data = new Date();
        SimpleDateFormat Formato_Data = new SimpleDateFormat("dd/MM/yyyy");
        lbl_data.setText(Formato_Data.format(data));

        Timer hora_sistema = new Timer(1000, new hora());
        hora_sistema.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_Desktop = new javax.swing.JPanel();
        Painel_Usuário = new javax.swing.JPanel();
        btn_Usuário = new rsbuttom.RSButtonMetro();
        lbl_usuario = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        Menu_Cadastros = new javax.swing.JMenu();
        Cad_Usuários = new javax.swing.JMenuItem();
        Cad_Clientes = new javax.swing.JMenuItem();
        Cad_Fornecedores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Cad_Produtos = new javax.swing.JMenuItem();
        Cad_Unidade = new javax.swing.JMenuItem();
        Cad_Grupo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Cad_Serviços = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Menu_OS = new javax.swing.JMenu();
        OS_Orçamento = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        OS_NovaOS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menu_Venda = new javax.swing.JMenu();
        Ven_NovaVenda = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Menu_Relatórios = new javax.swing.JMenu();
        Rel_Usuários = new javax.swing.JMenuItem();
        Rel_Clientes = new javax.swing.JMenuItem();
        Rel_Fornecedores = new javax.swing.JMenuItem();
        Rel_Produtos = new javax.swing.JMenuItem();
        Rel_OS = new javax.swing.JMenuItem();
        Rel_Vendas = new javax.swing.JMenuItem();
        Menu_Ajuda = new javax.swing.JMenu();
        Aju_Sobre = new javax.swing.JMenuItem();
        Aju_Suporte = new javax.swing.JMenuItem();
        Aju_Contato = new javax.swing.JMenuItem();
        Menu_Opções = new javax.swing.JMenu();
        Opc_Sair = new javax.swing.JMenuItem();
        Opc_Logout = new javax.swing.JMenuItem();
        Opc_Backup = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel_Desktop.setBackground(new java.awt.Color(255, 255, 255));
        Painel_Desktop.setPreferredSize(new java.awt.Dimension(1000, 608));
        Painel_Desktop.setLayout(new java.awt.BorderLayout());

        Painel_Usuário.setBackground(new java.awt.Color(255, 255, 255));
        Painel_Usuário.setForeground(new java.awt.Color(255, 255, 255));

        btn_Usuário.setBackground(new java.awt.Color(255, 255, 255));
        btn_Usuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons24px/Usuário logado.png"))); // NOI18N
        btn_Usuário.setColorHover(new java.awt.Color(0, 204, 0));
        btn_Usuário.setColorNormal(new java.awt.Color(255, 255, 255));
        btn_Usuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuárioActionPerformed(evt);
            }
        });

        lbl_usuario.setBackground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 102, 153));
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_usuario.setText("USUÁRIO");

        lbl_hora.setBackground(new java.awt.Color(255, 255, 255));
        lbl_hora.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_hora.setForeground(new java.awt.Color(0, 102, 153));
        lbl_hora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_data.setBackground(new java.awt.Color(255, 255, 255));
        lbl_data.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_data.setForeground(new java.awt.Color(0, 102, 153));
        lbl_data.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout Painel_UsuárioLayout = new javax.swing.GroupLayout(Painel_Usuário);
        Painel_Usuário.setLayout(Painel_UsuárioLayout);
        Painel_UsuárioLayout.setHorizontalGroup(
            Painel_UsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_UsuárioLayout.createSequentialGroup()
                .addComponent(lbl_data, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(655, 655, 655)
                .addComponent(lbl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Usuário, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Painel_UsuárioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_data, lbl_hora});

        Painel_UsuárioLayout.setVerticalGroup(
            Painel_UsuárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Usuário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Painel_UsuárioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_data, lbl_hora});

        Barra_Menu.setBackground(new java.awt.Color(255, 255, 255));
        Barra_Menu.setBorder(null);
        Barra_Menu.setForeground(new java.awt.Color(255, 255, 255));

        Menu_Cadastros.setBorder(null);
        Menu_Cadastros.setForeground(new java.awt.Color(0, 66, 109));
        Menu_Cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/add_property_50px.png"))); // NOI18N
        Menu_Cadastros.setText("Cadastros");
        Menu_Cadastros.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_Cadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Cad_Usuários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/user_32px.png"))); // NOI18N
        Cad_Usuários.setText("Usuários");
        Cad_Usuários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_UsuáriosActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Usuários);

        Cad_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/user_group_man_woman_32px.png"))); // NOI18N
        Cad_Clientes.setText("Clientes");
        Cad_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_ClientesActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Clientes);

        Cad_Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/user_group_man_woman_32px.png"))); // NOI18N
        Cad_Fornecedores.setText("Fornecedores");
        Cad_Fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_FornecedoresActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Fornecedores);
        Menu_Cadastros.add(jSeparator1);

        Cad_Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/product_32px.png"))); // NOI18N
        Cad_Produtos.setText("Produtos");
        Cad_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_ProdutosActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Produtos);

        Cad_Unidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/design_32px.png"))); // NOI18N
        Cad_Unidade.setText("Unid. Medida");
        Cad_Unidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_UnidadeActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Unidade);

        Cad_Grupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/group_of_projects_32px.png"))); // NOI18N
        Cad_Grupo.setText("Grupo");
        Cad_Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_GrupoActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Grupo);
        Menu_Cadastros.add(jSeparator2);

        Cad_Serviços.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/service_32px.png"))); // NOI18N
        Cad_Serviços.setText("Serviços");
        Cad_Serviços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_ServiçosActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(Cad_Serviços);

        jMenuItem1.setText("Técnico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_Cadastros.add(jMenuItem1);

        Barra_Menu.add(Menu_Cadastros);

        Menu_OS.setBorder(null);
        Menu_OS.setForeground(new java.awt.Color(0, 66, 109));
        Menu_OS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/request_service_50px.png"))); // NOI18N
        Menu_OS.setText("Ordem de Serviço");
        Menu_OS.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_OS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        OS_Orçamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/orçamento_32px.png"))); // NOI18N
        OS_Orçamento.setText("Orçamento");
        OS_Orçamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OS_OrçamentoActionPerformed(evt);
            }
        });
        Menu_OS.add(OS_Orçamento);
        Menu_OS.add(jSeparator3);

        OS_NovaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/OS_32px.png"))); // NOI18N
        OS_NovaOS.setText("Nova OS");
        OS_NovaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OS_NovaOSActionPerformed(evt);
            }
        });
        Menu_OS.add(OS_NovaOS);

        Barra_Menu.add(Menu_OS);

        jMenu2.setForeground(new java.awt.Color(0, 66, 109));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/Estoque_50px.png"))); // NOI18N
        jMenu2.setText("Estoque");
        jMenu2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jMenuItem3.setText("Controle de Estoque");
        jMenu2.add(jMenuItem3);

        Barra_Menu.add(jMenu2);

        Menu_Venda.setBorder(null);
        Menu_Venda.setForeground(new java.awt.Color(0, 66, 109));
        Menu_Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/shopping_cart_50px.png"))); // NOI18N
        Menu_Venda.setText("Venda");
        Menu_Venda.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_Venda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Ven_NovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/cash_register_32px.png"))); // NOI18N
        Ven_NovaVenda.setText("Nova Venda");
        Ven_NovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ven_NovaVendaActionPerformed(evt);
            }
        });
        Menu_Venda.add(Ven_NovaVenda);

        jMenuItem2.setText("Movimentações");
        Menu_Venda.add(jMenuItem2);

        Barra_Menu.add(Menu_Venda);

        Menu_Relatórios.setBorder(null);
        Menu_Relatórios.setForeground(new java.awt.Color(0, 66, 109));
        Menu_Relatórios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/report_file_50px.png"))); // NOI18N
        Menu_Relatórios.setText(" Relatório");
        Menu_Relatórios.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_Relatórios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Rel_Usuários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_user_32px.png"))); // NOI18N
        Rel_Usuários.setText("Usuários");
        Menu_Relatórios.add(Rel_Usuários);

        Rel_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_clientes_32px.png"))); // NOI18N
        Rel_Clientes.setText("Clientes");
        Menu_Relatórios.add(Rel_Clientes);

        Rel_Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_clientes_32px.png"))); // NOI18N
        Rel_Fornecedores.setText("Fornecedores");
        Menu_Relatórios.add(Rel_Fornecedores);

        Rel_Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_product_32px.png"))); // NOI18N
        Rel_Produtos.setText("Produtos");
        Menu_Relatórios.add(Rel_Produtos);

        Rel_OS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_os_32px.png"))); // NOI18N
        Rel_OS.setText("Ordem de Serviço");
        Menu_Relatórios.add(Rel_OS);

        Rel_Vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/report_venda_32px.png"))); // NOI18N
        Rel_Vendas.setText("Vendas");
        Menu_Relatórios.add(Rel_Vendas);

        Barra_Menu.add(Menu_Relatórios);

        Menu_Ajuda.setBorder(null);
        Menu_Ajuda.setForeground(new java.awt.Color(0, 66, 109));
        Menu_Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/help_50px.png"))); // NOI18N
        Menu_Ajuda.setText("Ajuda");
        Menu_Ajuda.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_Ajuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Aju_Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/info_32px.png"))); // NOI18N
        Aju_Sobre.setText("Sobre");
        Menu_Ajuda.add(Aju_Sobre);

        Aju_Suporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/support_32px.png"))); // NOI18N
        Aju_Suporte.setText("Suporte");
        Aju_Suporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aju_SuporteActionPerformed(evt);
            }
        });
        Menu_Ajuda.add(Aju_Suporte);

        Aju_Contato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/contacts_32px.png"))); // NOI18N
        Aju_Contato.setText("Contato");
        Menu_Ajuda.add(Aju_Contato);

        Barra_Menu.add(Menu_Ajuda);

        Menu_Opções.setBorder(null);
        Menu_Opções.setForeground(new java.awt.Color(0, 66, 109));
        Menu_Opções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons50px/administrative_tools_50px.png"))); // NOI18N
        Menu_Opções.setText("Opções");
        Menu_Opções.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Menu_Opções.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Opc_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/exit_32px.png"))); // NOI18N
        Opc_Sair.setText(" Sair");
        Opc_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opc_SairActionPerformed(evt);
            }
        });
        Menu_Opções.add(Opc_Sair);

        Opc_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/logout_rounded_32px.png"))); // NOI18N
        Opc_Logout.setText("Logout");
        Opc_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opc_LogoutActionPerformed(evt);
            }
        });
        Menu_Opções.add(Opc_Logout);

        Opc_Backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lineup/icons32px/backup_database_32px.png"))); // NOI18N
        Opc_Backup.setText(" Backup");
        Menu_Opções.add(Opc_Backup);

        Barra_Menu.add(Menu_Opções);

        setJMenuBar(Barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Painel_Usuário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel_Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Painel_Usuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cad_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_ProdutosActionPerformed
        // TODO add your handling code here:
        new Trocar_Painel(Painel_Desktop, new Tela_Produtos());
    }//GEN-LAST:event_Cad_ProdutosActionPerformed

    private void Aju_SuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aju_SuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Aju_SuporteActionPerformed

    private void Ven_NovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ven_NovaVendaActionPerformed
        // TODO add your handling code here:
        Tela_Vendas venda = new Tela_Vendas();
        venda.setVisible(true);
    }//GEN-LAST:event_Ven_NovaVendaActionPerformed

    private void Cad_ServiçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_ServiçosActionPerformed
        // TODO add your handling code here:
        Tela_Serviços serviço = new Tela_Serviços();
        serviço.setVisible(true);
    }//GEN-LAST:event_Cad_ServiçosActionPerformed

    private void Cad_GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_GrupoActionPerformed
        // TODO add your handling code here:
        Tela_AddGrupo grupo = new Tela_AddGrupo();
        grupo.setVisible(true);
    }//GEN-LAST:event_Cad_GrupoActionPerformed

    private void Cad_UnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_UnidadeActionPerformed
        // TODO add your handling code here:
        Tela_AddUnidade unidade = new Tela_AddUnidade();
        unidade.setVisible(true);
    }//GEN-LAST:event_Cad_UnidadeActionPerformed

    private void Opc_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opc_LogoutActionPerformed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer Logout?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            Tela_Login login = new Tela_Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Opc_LogoutActionPerformed

    private void Opc_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opc_SairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Opc_SairActionPerformed

    private void Cad_UsuáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_UsuáriosActionPerformed
        // TODO add your handling code here:
        new Trocar_Painel(Painel_Desktop, new Tela_Funcionários());
    }//GEN-LAST:event_Cad_UsuáriosActionPerformed

    private void Cad_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_ClientesActionPerformed
        // TODO add your handling code here:
        new Trocar_Painel(Painel_Desktop, new Tela_Cliente());
    }//GEN-LAST:event_Cad_ClientesActionPerformed

    private void Cad_FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_FornecedoresActionPerformed
        // TODO add your handling code here:
        new Trocar_Painel(Painel_Desktop, new Tela_Fornecedores());
    }//GEN-LAST:event_Cad_FornecedoresActionPerformed

    private void OS_OrçamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OS_OrçamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OS_OrçamentoActionPerformed

    private void OS_NovaOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OS_NovaOSActionPerformed
        // TODO add your handling code here:
        new Trocar_Painel(Painel_Desktop, new Tela_OS());
    }//GEN-LAST:event_OS_NovaOSActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_UsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuárioActionPerformed
        // TODO add your handling code here:
        Informações_Usuário user = new Informações_Usuário();
        user.setVisible(true);
    }//GEN-LAST:event_btn_UsuárioActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aju_Contato;
    private javax.swing.JMenuItem Aju_Sobre;
    private javax.swing.JMenuItem Aju_Suporte;
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenuItem Cad_Clientes;
    private javax.swing.JMenuItem Cad_Fornecedores;
    private javax.swing.JMenuItem Cad_Grupo;
    private javax.swing.JMenuItem Cad_Produtos;
    private javax.swing.JMenuItem Cad_Serviços;
    private javax.swing.JMenuItem Cad_Unidade;
    private javax.swing.JMenuItem Cad_Usuários;
    private javax.swing.JMenu Menu_Ajuda;
    private javax.swing.JMenu Menu_Cadastros;
    private javax.swing.JMenu Menu_OS;
    private javax.swing.JMenu Menu_Opções;
    private javax.swing.JMenu Menu_Relatórios;
    private javax.swing.JMenu Menu_Venda;
    private javax.swing.JMenuItem OS_NovaOS;
    private javax.swing.JMenuItem OS_Orçamento;
    private javax.swing.JMenuItem Opc_Backup;
    private javax.swing.JMenuItem Opc_Logout;
    private javax.swing.JMenuItem Opc_Sair;
    public static javax.swing.JPanel Painel_Desktop;
    private javax.swing.JPanel Painel_Usuário;
    private javax.swing.JMenuItem Rel_Clientes;
    private javax.swing.JMenuItem Rel_Fornecedores;
    private javax.swing.JMenuItem Rel_OS;
    private javax.swing.JMenuItem Rel_Produtos;
    private javax.swing.JMenuItem Rel_Usuários;
    private javax.swing.JMenuItem Rel_Vendas;
    private javax.swing.JMenuItem Ven_NovaVenda;
    private rsbuttom.RSButtonMetro btn_Usuário;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Calendar hora_atual = Calendar.getInstance();
            lbl_hora.setText(String.format("%1$tH:%1$tM:%1$tS", hora_atual));
        }
    }
}
