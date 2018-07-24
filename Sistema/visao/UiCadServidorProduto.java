/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import modelo.ServidorProdutoVO;
import modelo.ServidorVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;
import servicos.ServidorProdutoServicos;
import servicos.ServidorServicos;

/**
 *
 * @author Fabio
 */
public class UiCadServidorProduto extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome"});
    /**
     * Creates new form UiCadServidorProduto
     */
    public UiCadServidorProduto() {
        initComponents();
        
        preencherListaServidor();
        preencherListaProduto();
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
        jtableFuncionario = new javax.swing.JTable();
        jbAdicionarFuncionario = new javax.swing.JButton();
        jbRemoverFuncionario = new javax.swing.JButton();
        jlListaproduto = new javax.swing.JLabel();
        jlListaFuncionario = new javax.swing.JLabel();
        jlDados = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListaProduto = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaFuncionario = new javax.swing.JList();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Selecionar produto pra instalação");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableFuncionario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableFuncionario);
        if (jtableFuncionario.getColumnModel().getColumnCount() > 0) {
            jtableFuncionario.getColumnModel().getColumn(0).setResizable(false);
            jtableFuncionario.getColumnModel().getColumn(1).setResizable(false);
        }

        jbAdicionarFuncionario.setText("Adicionar funcionario");
        jbAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarFuncionarioActionPerformed(evt);
            }
        });

        jbRemoverFuncionario.setText("Remover funcionario");
        jbRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverFuncionarioActionPerformed(evt);
            }
        });

        jlListaproduto.setText("Lista de produtos");

        jlListaFuncionario.setText("Lista de funcionarios");

        jlDados.setText("Dados da movimentação");

        jScrollPane4.setViewportView(jListaProduto);

        jScrollPane2.setViewportView(jListaFuncionario);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlListaproduto))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbAdicionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDados)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jbRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jlListaFuncionario))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlListaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDados))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAdicionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlListaproduto)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbAdicionarFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbRemoverFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlListaproduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlListaFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jLayeredPane2.setLayer(jbRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherListaServidor() {
        try {
                
            ServidorServicos ss = ServicosFactory.getServidorServicos();
            ArrayList<ServidorVO> serv =  ss.buscarServidor();
            
            limparTabela();

            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < serv.size(); i++) {
                dlm.addElement(serv.get(i));
            }
            jListaFuncionario.setModel(dlm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista ! " + e.getMessage());
        }
    }
    
    private void preencherListaProduto() {
        try {
                
            ProdutoServicos ps = servicos.ServicosFactory.getProdutoServicos();
            ArrayList<ProdutoVO> prod = ps.buscarProduto();
            
            limparTabela();

            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < prod.size(); i++) {
                dlm.addElement(prod.get(i));
            }
           jListaProduto.setModel(dlm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista! " + e.getMessage());
        }
    }
   
    private void remover() {
        int linha = jtableFuncionario.getSelectedRow();
        if (linha != -1) {
            dtm.removeRow(linha);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma pessoa na tabela!");
        }
    }
        
    private void adicionar() {
        ServidorVO sVO = (ServidorVO) jListaFuncionario.getSelectedValue();
            
        dtm.addRow(new String[]{
            String.valueOf(sVO.getIdServidor()),
            sVO.getNomeServidor(),
            String.valueOf(sVO.getMatricula())
        });
        jtableFuncionario.setModel(dtm);
        }
    
    private void limparTabela() {
        dtm.setNumRows(0);
    }
    
    private void cadastrarServidorProduto() {
        try {
            int qtdLinhas = jtableFuncionario.getRowCount();

            ArrayList<ServidorVO> fun = new ArrayList<>();

            if (qtdLinhas > 0) {
                for (int i = 0; i < jtableFuncionario.getRowCount(); i++) {
                    ServidorVO sVO = new ServidorVO();
                    sVO.setIdServidor(
                        Long.parseLong((String) jtableFuncionario.getValueAt( i, 0)));
                    sVO.setNomeServidor((String) jtableFuncionario.getValueAt(i, 1));
                    fun.add(sVO);
                }
                JOptionPane.showMessageDialog(this,
                        fun);
                
                ServidorProdutoServicos sps =ServicosFactory.getServidorProdutoServicos();
                ServidorProdutoVO spVO = new ServidorProdutoVO();

                ArrayList<ProdutoVO> prod = new ArrayList<>();
                prod.add((ProdutoVO)jListaProduto.getSelectedValue());
                
                spVO.setProduto(prod);
                spVO.setServidor(fun);
                
                sps.cadastrarSP(spVO);
                
                limparTabela();
                
                JOptionPane.showMessageDialog(this, 
                        "serviço selecionado!");
                
            } else {
                JOptionPane.showMessageDialog(this,
                        "Você não adicionou nada na tabela!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }
    
    private void jbAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarFuncionarioActionPerformed
       adicionar();
    }//GEN-LAST:event_jbAdicionarFuncionarioActionPerformed

    private void jbRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverFuncionarioActionPerformed
        remover();
    }//GEN-LAST:event_jbRemoverFuncionarioActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
       cadastrarServidorProduto();
    }//GEN-LAST:event_jbRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList jListaFuncionario;
    private javax.swing.JList jListaProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAdicionarFuncionario;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbRemoverFuncionario;
    private javax.swing.JLabel jlDados;
    private javax.swing.JLabel jlListaFuncionario;
    private javax.swing.JLabel jlListaproduto;
    private javax.swing.JTable jtableFuncionario;
    // End of variables declaration//GEN-END:variables
}
