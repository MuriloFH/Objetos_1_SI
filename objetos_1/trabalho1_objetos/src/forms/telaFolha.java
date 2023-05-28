/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forms;

import classes.DadosFolha;
import functions.Funcoes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murilo.fernandes
 */
public class telaFolha extends javax.swing.JDialog {

    public telaFolha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNomeFunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldCompetencia = new javax.swing.JTextField();
        radioButtonFalta = new javax.swing.JRadioButton();
        spinnerHorasFaltas = new javax.swing.JSpinner();
        spinnerSalContratual = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        labelHorasFaltas = new javax.swing.JLabel();
        buttonLimpaDados = new javax.swing.JButton();
        buttonCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textFieldProcessamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldSubProcessamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecibo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Competência do Cálculo");

        textFieldCompetencia.setText("Ex: 05/2025");
        textFieldCompetencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCompetenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCompetenciaFocusLost(evt);
            }
        });
        textFieldCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCompetenciaActionPerformed(evt);
            }
        });

        radioButtonFalta.setText("Funcionário teve faltas?");
        radioButtonFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFaltaActionPerformed(evt);
            }
        });

        spinnerHorasFaltas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 220, 1));
        spinnerHorasFaltas.setEnabled(false);

        spinnerSalContratual.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel3.setText("Salario Contratual");

        labelHorasFaltas.setText("Horas Faltas");
        labelHorasFaltas.setEnabled(false);

        buttonLimpaDados.setBackground(new java.awt.Color(143, 0, 1));
        buttonLimpaDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonLimpaDados.setForeground(new java.awt.Color(255, 255, 255));
        buttonLimpaDados.setText("Limpar Dados");
        buttonLimpaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpaDadosActionPerformed(evt);
            }
        });

        buttonCalcular.setBackground(new java.awt.Color(78, 150, 19));
        buttonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Processamento");

        jLabel5.setText("Sub Processamento");

        tableRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Processamento", "Competência", "Valor Bruto", "Valor Liquido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRecibo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHorasFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerHorasFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonLimpaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButtonFalta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(textFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textFieldProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textFieldSubProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCompetencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spinnerSalContratual, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldSubProcessamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(spinnerSalContratual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(radioButtonFalta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerHorasFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHorasFaltas)
                    .addComponent(buttonCalcular)
                    .addComponent(buttonLimpaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void resetDados() {
        textFieldNomeFunc.setText("");
        textFieldCompetencia.setText("Ex: 05/2025");
        textFieldProcessamento.setText("");
        textFieldSubProcessamento.setText("");
        spinnerSalContratual.setValue(0);
        spinnerHorasFaltas.setValue(0);
        radioButtonFalta.setSelected(false);
        labelHorasFaltas.setEnabled(false);
        spinnerHorasFaltas.setEnabled(false);
    }

    ;
    
    public void mostraDadosTest(String nomeFunc, String competencia, String processamento, String subProcessamento, double salarioContratual, boolean faltas, int horasFaltas) {
        System.out.println(nomeFunc + "|" + competencia + "|" + processamento + "|" + subProcessamento + "|" + salarioContratual + "|" + faltas + "|" + horasFaltas);
    }

    private void textFieldCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCompetenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCompetenciaActionPerformed

    private void textFieldCompetenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCompetenciaFocusGained
        // TODO add your handling code here:
        if ("Ex: 05/2025".equals(textFieldCompetencia.getText())) {
            textFieldCompetencia.setText("");
        }
    }//GEN-LAST:event_textFieldCompetenciaFocusGained

    private void textFieldCompetenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCompetenciaFocusLost
        // TODO add your handling code here:
        if ("Ex: 05/2025".equals(textFieldCompetencia.getText()) || textFieldCompetencia.getText().isEmpty()) {
            textFieldCompetencia.setText("Ex: 05/2025");
        }
    }//GEN-LAST:event_textFieldCompetenciaFocusLost

    private void radioButtonFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFaltaActionPerformed
        // TODO add your handling code here:
        if (radioButtonFalta.isSelected()) {
            labelHorasFaltas.setEnabled(true);
            spinnerHorasFaltas.setEnabled(true);

        } else {
            labelHorasFaltas.setEnabled(false);
            spinnerHorasFaltas.setEnabled(false);
        }
    }//GEN-LAST:event_radioButtonFaltaActionPerformed

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        try {
            String nomeFunc = textFieldNomeFunc.getText();
            String competencia = textFieldCompetencia.getText();
            String processamento = textFieldProcessamento.getText();
            String subTipoProcessamento = textFieldSubProcessamento.getText();
            double salarioContratual = (double) spinnerSalContratual.getValue();
            boolean faltas = radioButtonFalta.isSelected();
            int horasFaltas = (int) spinnerHorasFaltas.getValue();

            if (!radioButtonFalta.isSelected()) {
                horasFaltas = 0;
            }

            DadosFolha dadosFolha = new DadosFolha(nomeFunc, competencia, processamento, subTipoProcessamento, salarioContratual, faltas, horasFaltas);

            mostraDadosTest(dadosFolha.getNomeFunc(), dadosFolha.getCompetencia(), dadosFolha.getTipoProcessamento(), dadosFolha.getSubTipoProcessamento(), dadosFolha.getSalarioContratual(), dadosFolha.isFaltas(), dadosFolha.getHorasFaltas());

            double liquido = Funcoes.calculaSalario(salarioContratual, horasFaltas);

            DefaultTableModel tabela = (DefaultTableModel) tableRecibo.getModel();

            Object[] newProduto = new Object[]{
                nomeFunc,
                processamento + "(" + subTipoProcessamento + ")",
                competencia,
                salarioContratual,
                liquido
            };

            tabela.addRow(newProduto);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sem dados para calcular, verifique se a hora mes foi cadastrada na aba 'cadastros' ou algum dado está faltando!");
        }
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void buttonLimpaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpaDadosActionPerformed
        // TODO add your handling code here:
        resetDados();
    }//GEN-LAST:event_buttonLimpaDadosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        resetDados();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(telaFolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaFolha dialog = new telaFolha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JButton buttonLimpaDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHorasFaltas;
    private javax.swing.JRadioButton radioButtonFalta;
    private javax.swing.JSpinner spinnerHorasFaltas;
    private javax.swing.JSpinner spinnerSalContratual;
    private javax.swing.JTable tableRecibo;
    private javax.swing.JTextField textFieldCompetencia;
    private javax.swing.JTextField textFieldNomeFunc;
    private javax.swing.JTextField textFieldProcessamento;
    private javax.swing.JTextField textFieldSubProcessamento;
    // End of variables declaration//GEN-END:variables
}
