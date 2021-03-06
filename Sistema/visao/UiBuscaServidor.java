/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ServidorVO;
import servicos.ServicosFactory;
import servicos.ServidorServicos;

/**
 *
 * @author Fabio
 */
public class UiBuscaServidor extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Mátricula"});
    /**
     * Creates new form UiBuscaServidor
     */
    public UiBuscaServidor() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelaServidor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalhe = new javax.swing.JTextArea();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbPreencherTabela = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jtPesq = new javax.swing.JTextField();
        jComboFiltro = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Busca de Servidores");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtabelaServidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Mátricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabelaServidor.getTableHeader().setReorderingAllowed(false);
        jtabelaServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabelaServidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabelaServidor);
        if (jtabelaServidor.getColumnModel().getColumnCount() > 0) {
            jtabelaServidor.getColumnModel().getColumn(0).setResizable(false);
            jtabelaServidor.getColumnModel().getColumn(1).setResizable(false);
            jtabelaServidor.getColumnModel().getColumn(2).setResizable(false);
        }

        jtDetalhe.setEditable(false);
        jtDetalhe.setColumns(20);
        jtDetalhe.setRows(5);
        jScrollPane2.setViewportView(jtDetalhe);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbPreencherTabela.setText("Preencher");
        jbPreencherTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherTabelaActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jbPreencherTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPreencherTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jLayeredPane2.setLayer(jbPreencherTabela, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Mátricula" }));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jLayeredPane3.setLayer(jtPesq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jComboFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(){
        try {
         
            ServidorServicos ss = ServicosFactory.getServidorServicos();
            ArrayList<ServidorVO> serv =  ss.buscarServidor();
            
            for (int i = 0; i < serv.size(); i++) {
                dtm.addRow(new String []{
                    String.valueOf(serv.get(i).getIdServidor()),
                    String.valueOf(serv.get(i).getNomeServidor()),
                    String.valueOf(serv.get(i).getMatricula())
                });
            }
            jtabelaServidor.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro na tabela!! "+e.getMessage());
        }//fecha catch
    }//feca limpar table
    
    private void limparTabela(){
        dtm.setNumRows(0);
        
        jtDetalhe.setText(null);
        
    }//limpar table 
    
    private void verificarServidorSeleconado(){
        try {
            int linha = jtabelaServidor.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(this,
                        "Selecione um produto! ");
            } else {
                ServidorServicos ss = ServicosFactory.getServidorServicos();
                ArrayList<ServidorVO> serv = new ArrayList<>();
                
                String id = (String) jtabelaServidor.getValueAt(linha, 0);
                String query = "where idservidor = "+id;
                serv = ss.filtrar(query);
            
                for (int i = 0; i < serv.size(); i++) {
                    jtDetalhe.setText(
                            serv.get(i).toString());
                }//for
                
                jtabelaServidor.setModel(dtm);
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro!! "+e.getMessage());
        }//FECHA CATCH
    }//fecha verificar 
    
    private void deletar(){
        try {
            int linha = jtabelaServidor.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(rootPane,
                        "Selecione uma linha!!");
            } else {
                String id = jtabelaServidor.getValueAt(linha, 0).toString();
                
                int op = JOptionPane.showConfirmDialog(
                        rootPane,
                        "Você tem certeza que quer excluir essa bosta?!?! ", 
                        "Alerta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                
                if (op == 0) {
                    ServidorServicos ss = ServicosFactory.getServidorServicos();
                    ss.deletarServidor(Long.parseLong(id));
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro!"+e.getMessage());
        }//fecha catch
    }//fecha deletar
    
    private void filtrar(){
        try {
            if (jtPesq.getText().isEmpty()) {
                limparTabela();
                preencherTabela();
            } else {
                String query = "";
                String filtro = jComboFiltro.getSelectedItem().toString();
               
                if(filtro.equalsIgnoreCase("Nome")){
                    query = "where nomeservidor like '"+jtPesq.getText()+"%'";
                } else  if(filtro.equalsIgnoreCase("Código")){
                    query = "where idservidor like '%"+jtPesq.getText()+"%'";
                } else if (filtro.equalsIgnoreCase("Mátricula")){
                    query = "where matricula like '"+jtPesq.getText()+"%'";
                }
                 ServidorServicos ss = ServicosFactory.getServidorServicos();
                ArrayList<ServidorVO> serv = ss.filtrar(query);
                
                for (int i = 0; i < serv.size(); i++) {
                    dtm.addRow(new String []{
                        String.valueOf(serv.get(i).getIdServidor()),
                        String.valueOf(serv.get(i).getNomeServidor()),
                        String.valueOf(serv.get(i).getMatricula())
                    });
                }
                jtabelaServidor.setModel(dtm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro!! "+e.getMessage());
        }//fecha catch
    }//fecha filtrar
            
    private void jbPreencherTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherTabelaActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbPreencherTabelaActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtabelaServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabelaServidorMouseClicked
        verificarServidorSeleconado();
    }//GEN-LAST:event_jtabelaServidorMouseClicked

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboFiltro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPreencherTabela;
    private javax.swing.JTextArea jtDetalhe;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTable jtabelaServidor;
    // End of variables declaration//GEN-END:variables
}
