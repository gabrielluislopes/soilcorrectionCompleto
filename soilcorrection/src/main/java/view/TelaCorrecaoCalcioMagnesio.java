/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import converte.ConverteCMolcDm3EmMgDm3;
import converte.ConverteMgDm3EmKgHa;
import correcao_fonte_nutrientes.calcio_magnesio.CorrecaoCalcioMagnesio;
import correcao_fonte_nutrientes.potassio.CorrecaoPotassio;
import ctc.EquilibrioCorrecaoCTC;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author gabri
 */
public class TelaCorrecaoCalcioMagnesio extends javax.swing.JFrame {

    /**
     * Creates new form CorreçãoCalcioMagnesio
     */
    public TelaCorrecaoCalcioMagnesio() {
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

        rtTitulo = new javax.swing.JLabel();
        rtCalcio = new javax.swing.JLabel();
        rtParticipacaoAtual = new javax.swing.JLabel();
        cxParticipacaoAtualCalcio = new javax.swing.JTextField();
        rtUnidadeParticipacaoAtual = new javax.swing.JLabel();
        rtPorcentParticipacao = new javax.swing.JLabel();
        cxPorcentParticipacao = new javax.swing.JTextField();
        rtUnidadePorcentParticipacao = new javax.swing.JLabel();
        rtMagnesio = new javax.swing.JLabel();
        rtParticipacaoAtual1 = new javax.swing.JLabel();
        cxParticipacaoAtualMagnesio = new javax.swing.JTextField();
        rtUnidadeParticipacaoAtual1 = new javax.swing.JLabel();
        rtFonteCorretivo = new javax.swing.JLabel();
        rtPRNT = new javax.swing.JLabel();
        cxPRNT = new javax.swing.JTextField();
        rtUnidadePRNT = new javax.swing.JLabel();
        rtTeorCao = new javax.swing.JLabel();
        cxTeorCao = new javax.swing.JTextField();
        rtUnidadeTeorCao = new javax.swing.JLabel();
        rtQuantidadeAplicar = new javax.swing.JLabel();
        cxQuantidadeAplicar = new javax.swing.JTextField();
        rtUnidadeQuantidadeaplicar = new javax.swing.JLabel();
        rtCusto = new javax.swing.JLabel();
        cxCusto = new javax.swing.JTextField();
        rtCalcioIdeal = new javax.swing.JLabel();
        rtMagnesioIdeal = new javax.swing.JLabel();
        rtValorFonte = new javax.swing.JLabel();
        cxValorFonte = new javax.swing.JTextField();
        cxFonte = new javax.swing.JTextField();
        rtFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correção Cálcio Magnésio");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        rtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtTitulo.setText("Correção Cálcio Magnésio");
        rtTitulo.setPreferredSize(new java.awt.Dimension(600, 75));
        getContentPane().add(rtTitulo);
        rtTitulo.setBounds(212, 56, 600, 75);

        rtCalcio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtCalcio.setForeground(new java.awt.Color(0, 0, 0));
        rtCalcio.setText("Cálcio");
        getContentPane().add(rtCalcio);
        rtCalcio.setBounds(125, 193, 51, 25);

        rtParticipacaoAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoAtual.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoAtual.setText("Participação atual na CTC do solo:");
        getContentPane().add(rtParticipacaoAtual);
        rtParticipacaoAtual.setBounds(125, 238, 268, 25);

        cxParticipacaoAtualCalcio.setEditable(false);
        cxParticipacaoAtualCalcio.setBackground(new java.awt.Color(204, 204, 204));
        cxParticipacaoAtualCalcio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxParticipacaoAtualCalcio.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoAtualCalcio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxParticipacaoAtualCalcio);
        cxParticipacaoAtualCalcio.setBounds(411, 238, 150, 30);

        rtUnidadeParticipacaoAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaoAtual.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaoAtual.setText("%");
        getContentPane().add(rtUnidadeParticipacaoAtual);
        rtUnidadeParticipacaoAtual.setBounds(579, 238, 15, 25);

        rtPorcentParticipacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPorcentParticipacao.setForeground(new java.awt.Color(0, 0, 0));
        rtPorcentParticipacao.setText("% de participação de Cálcio na CTC, desejada:");
        getContentPane().add(rtPorcentParticipacao);
        rtPorcentParticipacao.setBounds(125, 286, 361, 25);

        cxPorcentParticipacao.setEditable(false);
        cxPorcentParticipacao.setBackground(new java.awt.Color(204, 204, 204));
        cxPorcentParticipacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxPorcentParticipacao.setForeground(new java.awt.Color(0, 0, 0));
        cxPorcentParticipacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxPorcentParticipacao);
        cxPorcentParticipacao.setBounds(504, 286, 150, 30);

        rtUnidadePorcentParticipacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadePorcentParticipacao.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadePorcentParticipacao.setText("%");
        getContentPane().add(rtUnidadePorcentParticipacao);
        rtUnidadePorcentParticipacao.setBounds(672, 286, 15, 25);

        rtMagnesio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtMagnesio.setForeground(new java.awt.Color(0, 0, 0));
        rtMagnesio.setText("Magnésio");
        getContentPane().add(rtMagnesio);
        rtMagnesio.setBounds(125, 332, 83, 25);

        rtParticipacaoAtual1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtParticipacaoAtual1.setForeground(new java.awt.Color(0, 0, 0));
        rtParticipacaoAtual1.setText("Participação atual na CTC do solo:");
        getContentPane().add(rtParticipacaoAtual1);
        rtParticipacaoAtual1.setBounds(125, 377, 268, 25);

        cxParticipacaoAtualMagnesio.setEditable(false);
        cxParticipacaoAtualMagnesio.setBackground(new java.awt.Color(204, 204, 204));
        cxParticipacaoAtualMagnesio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxParticipacaoAtualMagnesio.setForeground(new java.awt.Color(0, 0, 0));
        cxParticipacaoAtualMagnesio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxParticipacaoAtualMagnesio);
        cxParticipacaoAtualMagnesio.setBounds(411, 377, 150, 30);

        rtUnidadeParticipacaoAtual1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeParticipacaoAtual1.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeParticipacaoAtual1.setText("%");
        getContentPane().add(rtUnidadeParticipacaoAtual1);
        rtUnidadeParticipacaoAtual1.setBounds(579, 377, 15, 25);

        rtFonteCorretivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtFonteCorretivo.setForeground(new java.awt.Color(0, 0, 0));
        rtFonteCorretivo.setText("Fonte de corretivo a usar:");
        getContentPane().add(rtFonteCorretivo);
        rtFonteCorretivo.setBounds(125, 444, 201, 25);

        rtPRNT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPRNT.setForeground(new java.awt.Color(0, 0, 0));
        rtPRNT.setText("PRNT:");
        getContentPane().add(rtPRNT);
        rtPRNT.setBounds(125, 492, 47, 25);

        cxPRNT.setEditable(false);
        cxPRNT.setBackground(new java.awt.Color(204, 204, 204));
        cxPRNT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxPRNT.setForeground(new java.awt.Color(0, 0, 0));
        cxPRNT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxPRNT);
        cxPRNT.setBounds(190, 489, 150, 30);

        rtUnidadePRNT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadePRNT.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadePRNT.setText("%");
        getContentPane().add(rtUnidadePRNT);
        rtUnidadePRNT.setBounds(358, 492, 15, 25);

        rtTeorCao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtTeorCao.setForeground(new java.awt.Color(0, 0, 0));
        rtTeorCao.setText("Teor de CaO do corretivo:");
        getContentPane().add(rtTeorCao);
        rtTeorCao.setBounds(125, 540, 205, 25);

        cxTeorCao.setEditable(false);
        cxTeorCao.setBackground(new java.awt.Color(204, 204, 204));
        cxTeorCao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxTeorCao.setForeground(new java.awt.Color(0, 0, 0));
        cxTeorCao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxTeorCao);
        cxTeorCao.setBounds(348, 537, 150, 30);

        rtUnidadeTeorCao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeTeorCao.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeTeorCao.setText("%");
        getContentPane().add(rtUnidadeTeorCao);
        rtUnidadeTeorCao.setBounds(516, 540, 15, 25);

        rtQuantidadeAplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtQuantidadeAplicar.setForeground(new java.awt.Color(0, 0, 0));
        rtQuantidadeAplicar.setText("Quantidade a aplicar:");
        getContentPane().add(rtQuantidadeAplicar);
        rtQuantidadeAplicar.setBounds(125, 588, 167, 25);

        cxQuantidadeAplicar.setEditable(false);
        cxQuantidadeAplicar.setBackground(new java.awt.Color(204, 204, 204));
        cxQuantidadeAplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxQuantidadeAplicar.setForeground(new java.awt.Color(0, 0, 0));
        cxQuantidadeAplicar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxQuantidadeAplicar);
        cxQuantidadeAplicar.setBounds(310, 585, 210, 30);

        rtUnidadeQuantidadeaplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeQuantidadeaplicar.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeQuantidadeaplicar.setText("Ton./ha");
        getContentPane().add(rtUnidadeQuantidadeaplicar);
        rtUnidadeQuantidadeaplicar.setBounds(538, 588, 60, 25);

        rtCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCusto.setForeground(new java.awt.Color(0, 0, 0));
        rtCusto.setText("Custo - R$/ha:");
        getContentPane().add(rtCusto);
        rtCusto.setBounds(125, 636, 114, 25);

        cxCusto.setEditable(false);
        cxCusto.setBackground(new java.awt.Color(204, 204, 204));
        cxCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxCusto.setForeground(new java.awt.Color(0, 0, 0));
        cxCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxCusto);
        cxCusto.setBounds(257, 633, 210, 30);

        rtCalcioIdeal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCalcioIdeal.setForeground(new java.awt.Color(0, 0, 0));
        rtCalcioIdeal.setText("(Ideal: 45% a 55%)");
        getContentPane().add(rtCalcioIdeal);
        rtCalcioIdeal.setBounds(700, 288, 146, 25);

        rtMagnesioIdeal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtMagnesioIdeal.setForeground(new java.awt.Color(0, 0, 0));
        rtMagnesioIdeal.setText("(Ideal: 10% a 15%)");
        getContentPane().add(rtMagnesioIdeal);
        rtMagnesioIdeal.setBounds(610, 379, 146, 25);

        rtValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        rtValorFonte.setText("Valor/Ton (R$)");
        getContentPane().add(rtValorFonte);
        rtValorFonte.setBounds(560, 444, 114, 25);

        cxValorFonte.setEditable(false);
        cxValorFonte.setBackground(new java.awt.Color(204, 204, 204));
        cxValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        cxValorFonte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxValorFonte);
        cxValorFonte.setBounds(690, 441, 150, 30);

        cxFonte.setEditable(false);
        cxFonte.setBackground(new java.awt.Color(204, 204, 204));
        cxFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxFonte.setForeground(new java.awt.Color(0, 0, 0));
        cxFonte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxFonte.setPreferredSize(new java.awt.Dimension(207, 31));
        getContentPane().add(cxFonte);
        cxFonte.setBounds(344, 441, 200, 30);

        rtFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\UTFPR\\2021 - semestre 2\\Arquitetura de Software\\soilcorrectionCompleto\\soilcorrection\\src\\main\\java\\gui\\imagens\\background.png")); // NOI18N
        getContentPane().add(rtFundo);
        rtFundo.setBounds(-10, -10, 1050, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarCorrecaoCalcioMagnesio(DadosCorrecaoCalcioMagnesio dados){
        cxParticipacaoAtualCalcio.setText(Double.toString(dados.getCalcioSolo()));
        cxPorcentParticipacao.setText(Double.toString(dados.getCalcioDesejado()));
        rtCalcioIdeal.setText(dados.getCalcioIdeal());
        cxParticipacaoAtualMagnesio.setText(Double.toString(dados.getMagnesioSolo()));
        rtMagnesioIdeal.setText(dados.getMagnesioIdeal());
        cxFonte.setText(dados.getFonte());
        cxValorFonte.setText(Double.toString(dados.getValorFonte()));
        cxPRNT.setText(Double.toString(dados.getPrnt()));
        cxTeorCao.setText(Double.toString(dados.getTeorCorretivo()));
        cxQuantidadeAplicar.setText(Double.toString(dados.getQtdAplicar()));
        cxCusto.setText(Double.toString(dados.getCusto()));
    }
    
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
            java.util.logging.Logger.getLogger(TelaCorrecaoCalcioMagnesio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoCalcioMagnesio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoCalcioMagnesio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoCalcioMagnesio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCorrecaoCalcioMagnesio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxCusto;
    private javax.swing.JTextField cxFonte;
    private javax.swing.JTextField cxPRNT;
    private javax.swing.JTextField cxParticipacaoAtualCalcio;
    private javax.swing.JTextField cxParticipacaoAtualMagnesio;
    private javax.swing.JTextField cxPorcentParticipacao;
    private javax.swing.JTextField cxQuantidadeAplicar;
    private javax.swing.JTextField cxTeorCao;
    private javax.swing.JTextField cxValorFonte;
    private javax.swing.JLabel rtCalcio;
    private javax.swing.JLabel rtCalcioIdeal;
    private javax.swing.JLabel rtCusto;
    private javax.swing.JLabel rtFonteCorretivo;
    private javax.swing.JLabel rtFundo;
    private javax.swing.JLabel rtMagnesio;
    private javax.swing.JLabel rtMagnesioIdeal;
    private javax.swing.JLabel rtPRNT;
    private javax.swing.JLabel rtParticipacaoAtual;
    private javax.swing.JLabel rtParticipacaoAtual1;
    private javax.swing.JLabel rtPorcentParticipacao;
    private javax.swing.JLabel rtQuantidadeAplicar;
    private javax.swing.JLabel rtTeorCao;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JLabel rtUnidadePRNT;
    private javax.swing.JLabel rtUnidadeParticipacaoAtual;
    private javax.swing.JLabel rtUnidadeParticipacaoAtual1;
    private javax.swing.JLabel rtUnidadePorcentParticipacao;
    private javax.swing.JLabel rtUnidadeQuantidadeaplicar;
    private javax.swing.JLabel rtUnidadeTeorCao;
    private javax.swing.JLabel rtValorFonte;
    // End of variables declaration//GEN-END:variables

}
