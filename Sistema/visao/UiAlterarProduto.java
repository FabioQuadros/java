/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Fabio
 */
public class UiAlterarProduto extends javax.swing.JInternalFrame {
    
        DefaultTableModel dtm = new DefaultTableModel(
        new Object[][]{},
        new Object[]{"Código", "Nome","Número de Série","Patrimônio","Setor","Descrição","Estado físico","Marca", "Modelo", "Fabricante"});
    /**
     * Creates new form UiAlterarProduto
     */
    public UiAlterarProduto() {
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
        jtabelaAlterarProduto = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlNumSerie = new javax.swing.JLabel();
        jlPatrimonio = new javax.swing.JLabel();
        jlSetor = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlFabricante = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtNumSerie = new javax.swing.JTextField();
        jtPatrimonio = new javax.swing.JTextField();
        jtSetor = new javax.swing.JTextField();
        jtDescricao = new javax.swing.JTextField();
        jtEstado = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtFabricante = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbAlterar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alterar Produto");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtabelaAlterarProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        jtabelaAlterarProduto.getTableHeader().setReorderingAllowed(false);
        jtabelaAlterarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabelaAlterarProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabelaAlterarProduto);
        if (jtabelaAlterarProduto.getColumnModel().getColumnCount() > 0) {
            jtabelaAlterarProduto.getColumnModel().getColumn(0).setResizable(false);
            jtabelaAlterarProduto.getColumnModel().getColumn(1).setResizable(false);
            jtabelaAlterarProduto.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCodigo.setText("Código");

        jlNome.setText("Nome");

        jlNumSerie.setText("Número de série");

        jlPatrimonio.setText("Patrimônio");

        jlSetor.setText("Setor designado");

        jlDescricao.setText("Descrição");

        jlEstado.setText("Estado físico");

        jlMarca.setText("Marca");

        jlModelo.setText("Modelo");

        jlFabricante.setText("Fabricante");

        jtCodigo.setEditable(false);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addComponent(jlNome)
                    .addComponent(jlNumSerie)
                    .addComponent(jlPatrimonio)
                    .addComponent(jlSetor))
                .addGap(45, 45, 45)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtCodigo)
                    .addComponent(jtNome)
                    .addComponent(jtNumSerie)
                    .addComponent(jtPatrimonio)
                    .addComponent(jtSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addComponent(jlEstado)
                    .addComponent(jlMarca)
                    .addComponent(jlModelo)
                    .addComponent(jlFabricante))
                .addGap(57, 57, 57)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtMarca)
                    .addComponent(jtEstado)
                    .addComponent(jtDescricao)
                    .addComponent(jtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jtFabricante))
                .addGap(55, 55, 55))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCodigo)
                                    .addComponent(jlDescricao)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNome)
                            .addComponent(jlEstado)))
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNumSerie)
                        .addComponent(jlMarca))
                    .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlPatrimonio)
                        .addComponent(jlModelo))
                    .addComponent(jtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSetor)
                    .addComponent(jtSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFabricante))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jlCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlNumSerie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlPatrimonio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlSetor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlFabricante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtNumSerie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtPatrimonio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtSetor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtModelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtFabricante, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jLayeredPane3.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jbConfirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addGap(31, 31, 31)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void limparCampos(){
            jtCodigo.setText(null);
            jtNome.setText(null);
            jtNumSerie.setText(null);
            jtPatrimonio.setText(null);
            jtSetor.setText(null);
            jtDescricao.setText(null);
            jtMarca.setText(null);
            jtEstado.setText(null);
            jtModelo.setText(null);
            jtFabricante.setText(null);                 
        }// fecha limpar 
        
    private void confirmarAlteracao(){
            int linha = jtabelaAlterarProduto.getSelectedRow();
        
            if(linha == -1){
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
                return;
            }
            try {
            ProdutoVO p = new ProdutoVO();
            p.setIdProduto(Long.parseLong(jtCodigo.getText()));
            if (jtNome.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Nome");
            } else {
                p.setNomeProduto(jtNome.getText());
            }
            if (jtNumSerie.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Número de série");
            } else {
                p.setNumSerie(Integer.parseInt(jtNumSerie.getText()));
            }
            if (jtPatrimonio.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo patrimônio");
            } else {
                p.setPatrimonio(jtPatrimonio.getText());
            }
            if (jtSetor.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Setor");
            } else {
                p.setSetor(jtSetor.getText());
            }
            if (jtDescricao.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Descreição");
            } else {
                p.setDescricao(jtDescricao.getText());
            }
            if (jtMarca.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Marca");
            } else {
                p.setMarca(jtMarca.getText());
            }
            if (jtModelo.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Modelo");
            } else {
                p.setModelo(jtModelo.getText());
            }
            if (jtEstado.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Estado físico");
            } else {
                p.setEstado(jtEstado.getText());
            }
            if (jtFabricante.getText().isEmpty()) {
                throw  new NumberFormatException("Preencha o campo Fabricante");
            } else {
                p.setFabricante(jtFabricante.getText());
            }
                
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                ps.alterarProduto(p);
                
                JOptionPane.showMessageDialog(rootPane,
                        "Produto alterado com sucesso!! ");                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,
                    "Erro ao alterar!! "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            }
        }//fechaa confirmaralteracao
        
    private void alterar(){
            int linha = jtabelaAlterarProduto.getSelectedRow();

            if(linha == -1){
                JOptionPane.showMessageDialog(rootPane, "Selecione uma linha");
                return;
            }
            jtCodigo.setText(jtabelaAlterarProduto.getValueAt(linha, 0).toString());
            jtNome.setText(jtabelaAlterarProduto.getValueAt(linha, 1).toString());
            jtNumSerie.setText(jtabelaAlterarProduto.getValueAt(linha, 2).toString());
            jtPatrimonio.setText(jtabelaAlterarProduto.getValueAt(linha, 3).toString());
            jtSetor.setText(jtabelaAlterarProduto.getValueAt(linha, 4).toString());
            jtDescricao.setText(jtabelaAlterarProduto.getValueAt(linha, 5).toString());
            jtEstado.setText(jtabelaAlterarProduto.getValueAt(linha, 6).toString());
            jtMarca.setText(jtabelaAlterarProduto.getValueAt(linha, 7).toString());
            jtModelo.setText(jtabelaAlterarProduto.getValueAt(linha, 8).toString());
            jtFabricante.setText(jtabelaAlterarProduto.getValueAt(linha, 9).toString());
        }//fecha alterar
    
    private void limparTabela(){
        dtm.setNumRows(0);
        
       // jtDetalhe.setText(null);
        
    }//limpar table 
        
    private void  preencherTabela(){
        try {
            
            ProdutoServicos ps = servicos.ServicosFactory.getProdutoServicos();
            ArrayList<ProdutoVO> prod = ps.buscarProduto();
            
            for (int i = 0; i < prod.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getIdProduto()),
                    prod.get(i).getNomeProduto(),
                    String.valueOf(prod.get(i).getNumSerie()),
                    prod.get(i).getPatrimonio(),
                    prod.get(i).getSetor(),
                    prod.get(i).getDescricao(),
                    prod.get(i).getEstado(),
                    prod.get(i).getMarca(),
                    prod.get(i).getModelo(),
                    prod.get(i).getFabricante()
                });
            }
            jtabelaAlterarProduto.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao buscar"+e.getMessage());
        }
    }//fecha peencher tabela
    
    private void verificarProdutoSeleconado(){
        try {
            int linha = jtabelaAlterarProduto.getSelectedRow();
            
            if (linha == -1) {
                JOptionPane.showMessageDialog(this,
                        "Selecione uma linha! ");
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();
                ArrayList<ProdutoVO> prod = new ArrayList<>();
                
                String id = (String) jtabelaAlterarProduto.getValueAt(linha, 0);
                String query = "where idproduto = "+id;
                prod = ps.filtrar(query);
            
              /* for (int i = 0; i < prod.size(); i++) {
                    jtDetalhe.setText(
                            prod.get(i).toString());
                }//for
                */
                jtabelaAlterarProduto.setModel(dtm);
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro!! "+e.getMessage());
        }//FECHA CATCH
    }//fecha verificar
    
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
        limparCampos();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtabelaAlterarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabelaAlterarProdutoMouseClicked
       verificarProdutoSeleconado();
       alterar();
    }//GEN-LAST:event_jtabelaAlterarProdutoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFabricante;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumSerie;
    private javax.swing.JLabel jlPatrimonio;
    private javax.swing.JLabel jlSetor;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtFabricante;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumSerie;
    private javax.swing.JTextField jtPatrimonio;
    private javax.swing.JTextField jtSetor;
    private javax.swing.JTable jtabelaAlterarProduto;
    // End of variables declaration//GEN-END:variables
}
