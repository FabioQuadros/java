/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.EquipamentoVO;
import servicos.EquipamentoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Fabio
 */
public class UiCadEquipamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form UiCadEquipamento
     */
    public UiCadEquipamento() {
        initComponents();
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
        jlNome = new javax.swing.JLabel();
        jlNumSerie = new javax.swing.JLabel();
        jlPatrimonio = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlTecnologia = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtNumSerie = new javax.swing.JTextField();
        jtPatrimonio = new javax.swing.JTextField();
        jtDescricao = new javax.swing.JTextField();
        jtMarca = new javax.swing.JTextField();
        jttecnologia = new javax.swing.JTextField();
        jlNomeErro = new javax.swing.JLabel();
        jlNumErro = new javax.swing.JLabel();
        jlPatrimonioErro = new javax.swing.JLabel();
        jlDescricaoErro = new javax.swing.JLabel();
        jlMaarcaErro = new javax.swing.JLabel();
        jltecErro = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Castro de Equipamentos");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jlNumSerie.setText("Numero de Serie");

        jlPatrimonio.setText("patrimonio");

        jlDescricao.setText("Descrição");

        jlMarca.setText("Marca");

        jlTecnologia.setText("Tecnologia");

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });

        jtNumSerie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNumSerieFocusLost(evt);
            }
        });

        jtPatrimonio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPatrimonioFocusLost(evt);
            }
        });

        jtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDescricaoFocusLost(evt);
            }
        });

        jtMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtMarcaFocusLost(evt);
            }
        });

        jttecnologia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jttecnologiaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNome)
                    .addComponent(jlPatrimonio)
                    .addComponent(jlNumSerie))
                .addGap(51, 51, 51)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPatrimonioErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlNumErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlNomeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addComponent(jlMarca)
                    .addComponent(jlTecnologia))
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jttecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlMaarcaErro, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(jlDescricaoErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jltecErro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNome)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlDescricao)
                        .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNomeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlDescricaoErro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNumErro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlMaarcaErro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumSerie)
                            .addComponent(jlMarca)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPatrimonioErro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jltecErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPatrimonio)
                            .addComponent(jttecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlTecnologia))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNumSerie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlPatrimonio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlTecnologia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtNumSerie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtPatrimonio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtMarca, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jttecnologia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNomeErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNumErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlPatrimonioErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlDescricaoErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlMaarcaErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jltecErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cadastrar(){
        try {
            EquipamentoVO eVO = new EquipamentoVO();
            if (jtNome.getText().isEmpty()) {
                    throw  new NumberFormatException("Preencha o nome");
                }else{
                    eVO.setNomeEquipamento(jtNome.getText());
            }
            if (jtNumSerie.getText().isEmpty()) {
                throw new NumberFormatException("Preencha o número de série");
            }else{
                eVO.setNumSerie(Integer.parseInt(jtNumSerie.getText()));
            }
            if (jtPatrimonio.getText().isEmpty()) {
                    throw new NumberFormatException("Preencha o patrimonio");
            } else {
                eVO.setPatrimonio(jtPatrimonio.getText());
            }
            if (jtDescricao.getText().isEmpty()) {
                throw new NumberFormatException("Preencha a descrção");
            } else {
                eVO.setDescricao(jtDescricao.getText());
            }
            if (jtMarca.getText().isEmpty()) {
                throw new NumberFormatException("Preencha campo marca");
            } else {
                eVO.setMarca(jtMarca.getText());
            }
            if (jttecnologia.getText().isEmpty()) {
                throw new NumberFormatException("Preencha o campo tecnologia ");
            } else {
                eVO.setTecnologio(jttecnologia.getText());
            }
        
            EquipamentoServicos es = ServicosFactory.getEquipamentoServicos();
            es.cadastrarEquipamento(eVO);

                JOptionPane.showMessageDialog(rootPane, 
                        "Cadastrado com sucesso!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                "Erro ao cadastrar!! "+e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limpar(){
        jtNome.setText(null);
        jtNumSerie.setText(null);
        jtPatrimonio.setText(null);
        jtDescricao.setText(null);
        jtMarca.setText(null);
        jttecnologia.setText(null);
    }
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if(jtNome.getText().isEmpty()){
            jtNome.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jlNomeErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jtNome.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jlNomeErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtNumSerieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNumSerieFocusLost
        if(jtNumSerie.getText().isEmpty()){
            jtNumSerie.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jlNumErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jtNumSerie.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jlNumErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }
    }//GEN-LAST:event_jtNumSerieFocusLost

    private void jtPatrimonioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPatrimonioFocusLost
        if(jtPatrimonio.getText().isEmpty()){
            jtPatrimonio.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jlPatrimonioErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jtPatrimonio.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jlPatrimonioErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }
    }//GEN-LAST:event_jtPatrimonioFocusLost

    private void jtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDescricaoFocusLost
        if(jtDescricao.getText().isEmpty()){
            jtDescricao.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jlDescricaoErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jtDescricao.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jlDescricaoErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }    
    }//GEN-LAST:event_jtDescricaoFocusLost

    private void jtMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMarcaFocusLost
        if(jtMarca.getText().isEmpty()){
            jtMarca.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jlMaarcaErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jtDescricao.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jlDescricaoErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }
    }//GEN-LAST:event_jtMarcaFocusLost

    private void jttecnologiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jttecnologiaFocusLost
        if(jttecnologia.getText().isEmpty()){
            jttecnologia.setBorder(
                    BorderFactory.createLineBorder(Color.red));
            jltecErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/exit.png")));
        }else{
            jttecnologia.setBorder(
                    BorderFactory.createLineBorder(Color.gray));
            jltecErro.setIcon(
                new ImageIcon(getClass().getResource("/icones/accept.png")));
        }
    }//GEN-LAST:event_jttecnologiaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlDescricaoErro;
    private javax.swing.JLabel jlMaarcaErro;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeErro;
    private javax.swing.JLabel jlNumErro;
    private javax.swing.JLabel jlNumSerie;
    private javax.swing.JLabel jlPatrimonio;
    private javax.swing.JLabel jlPatrimonioErro;
    private javax.swing.JLabel jlTecnologia;
    private javax.swing.JLabel jltecErro;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumSerie;
    private javax.swing.JTextField jtPatrimonio;
    private javax.swing.JTextField jttecnologia;
    // End of variables declaration//GEN-END:variables
}
