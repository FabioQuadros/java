/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.EquipamentoVO;
import servicos.EquipamentoServicos;
import servicos.ServicosFactory;
/**
 *
 * @author Fabio
 */
public class UiBuscaEquipamento extends javax.swing.JInternalFrame {
    
            DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Patrimônio"});
    /**
     * Creates new form UiBuscaEquipamento
     */
    public UiBuscaEquipamento() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboFiltro = new javax.swing.JComboBox();
        jtPesq = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEquipamento = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalhe = new javax.swing.JTextArea();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbAtualizar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busca de Equipamento");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Patrimônio" }));

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jLayeredPane1.setLayer(jComboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Patrimônio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableEquipamento.getTableHeader().setReorderingAllowed(false);
        jtableEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableEquipamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableEquipamento);
        if (jtableEquipamento.getColumnModel().getColumnCount() > 0) {
            jtableEquipamento.getColumnModel().getColumn(0).setResizable(false);
            jtableEquipamento.getColumnModel().getColumn(1).setResizable(false);
            jtableEquipamento.getColumnModel().getColumn(2).setResizable(false);
        }

        jtDetalhe.setEditable(false);
        jtDetalhe.setColumns(20);
        jtDetalhe.setRows(5);
        jScrollPane2.setViewportView(jtDetalhe);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jLayeredPane3.setLayer(jbAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void  preencherTabela(){
        try {
            
            EquipamentoServicos es = ServicosFactory.getEquipamentoServicos();
            ArrayList<EquipamentoVO> eq = es.buscarEquipamento();
            
            for (int i = 0; i < eq.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(eq.get(i).getIdEquipamento()),
                    eq.get(i).getNomeEquipamento(),
                    eq.get(i).getPatrimonio()
                });
            }
            jtableEquipamento.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao buscar",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//fecha peencher tabela
    
    private void verificarProdutoSelecionado(){
        try {
            int linha = jtableEquipamento.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(this, 
                        "Selecione uma Linha !! ");
            } else {
                
                String id = (String) jtableEquipamento.getValueAt(linha, 0);
                String query = "where idequipamento = "+id;
                
                EquipamentoServicos es = ServicosFactory.getEquipamentoServicos();
                ArrayList<EquipamentoVO> eq = es.filtrar(query);
                
                for (int i = 0; i < eq.size(); i++) {
                    jtDetalhe.setText(
                            eq.get(i).toString());
                }
                jtableEquipamento.setModel(dtm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro!! "+e.getMessage());
        }
    }//fechaa verificar selecao
    
    private void deletar(){
        try {
            int linha = jtableEquipamento.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(this, 
                    "Selecione uma Linha !! "); 
            } else {
                String id = jtableEquipamento.getValueAt(linha, 0).toString();
                
                int op = JOptionPane.showConfirmDialog(rootPane,
                        "Você tem certeza que deseja deletar?!?!",
                        "Alerta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                
                if (op == 0) {
                    EquipamentoServicos es = ServicosFactory.getEquipamentoServicos();
                    es.deletarEquipamento(Long.parseLong(id));
                }
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro!"+e.getMessage());
        }
    }
    
    private void filtrar(){
        try {
            if (jtPesq.getText().isEmpty()) {
                limparTabela();
                preencherTabela();
            } else {
                String query = "";
                String filtro = jComboFiltro.getSelectedItem().toString();
                
                if(filtro.equalsIgnoreCase("Código")){
                    query = "where idequipamento like '%"+jtPesq.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Nome")) {
                    query = "where nomeequipamento like '"+jtPesq.getText()+"%'";
                } else if(filtro.equalsIgnoreCase("Patrimônio")){
                    query = "where patrimonio like '"+jtPesq.getText()+"%'";
                } 
                EquipamentoServicos es = ServicosFactory.getEquipamentoServicos();
                ArrayList<EquipamentoVO> eq = es.filtrar(query);
                
                for (int i = 0; i < eq.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(eq.get(i).getIdEquipamento()),
                        String.valueOf(eq.get(i).getNomeEquipamento()),
                        String.valueOf(eq.get(i).getPatrimonio())
                    });
                }
                jtableEquipamento.setModel(dtm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro!! "+e.getMessage());
        }
    }
    
    private void limparTabela(){
        dtm.setNumRows(0);
        jtDetalhe.setText(null);
    }//limpar table 
    
    
    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesqKeyReleased

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
       deletar();
       limparTabela();
       preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
       limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtableEquipamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableEquipamentoMouseClicked
        verificarProdutoSelecionado();
    }//GEN-LAST:event_jtableEquipamentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboFiltro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JTextArea jtDetalhe;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTable jtableEquipamento;
    // End of variables declaration//GEN-END:variables
}
