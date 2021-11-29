/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.telas;

import converte.ConverteKgHaEmP2O5;
import converte.ConverteMgDm3EmKgHa;
import correcao_fonte_nutrientes.NutrienteAdicional;
import correcao_fonte_nutrientes.fosforo.CorrecaoFosforo;
import correcao_fonte_nutrientes.fosforo.FonteFosforo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

/**
 *
 * @author gabri
 */
public class CorrecaoFosforoGUI extends javax.swing.JFrame {

    /**
     * Creates new form CorrecaoFosforo
     */
    public CorrecaoFosforoGUI() {
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
        rtFosforoSolo = new javax.swing.JLabel();
        cxFosforoSolo = new javax.swing.JTextField();
        rtTeorFosforo = new javax.swing.JLabel();
        cxTeorFosforo = new javax.swing.JTextField();
        rtUnidadeTeorFosforo = new javax.swing.JLabel();
        rtFonteFosforo = new javax.swing.JLabel();
        cbFonteFosforo = new javax.swing.JComboBox<>();
        rtQuantidadeAplicada = new javax.swing.JLabel();
        cxQuantidadeAplicada = new javax.swing.JTextField();
        rtUnidadeQuantidadeAplicada = new javax.swing.JLabel();
        rtEficienciaFosforo = new javax.swing.JLabel();
        cxEficienciaFosforo = new javax.swing.JTextField();
        rtUnidadeEficienciaFosforo = new javax.swing.JLabel();
        rtCusto = new javax.swing.JLabel();
        cxCusto = new javax.swing.JTextField();
        rtCorrecao = new javax.swing.JLabel();
        cxCorrecaoAdicional = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        rtValorFonte = new javax.swing.JLabel();
        cxValorFonte = new javax.swing.JTextField();
        rtFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correção Fósforo");
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        rtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtTitulo.setText("Correção Fósforo");
        rtTitulo.setPreferredSize(new java.awt.Dimension(400, 100));
        getContentPane().add(rtTitulo);
        rtTitulo.setBounds(312, 60, 400, 100);

        rtFosforoSolo.setBackground(new java.awt.Color(0, 0, 0));
        rtFosforoSolo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtFosforoSolo.setForeground(new java.awt.Color(0, 0, 0));
        rtFosforoSolo.setText("Fósforo no Solo:");
        getContentPane().add(rtFosforoSolo);
        rtFosforoSolo.setBounds(181, 175, 133, 25);

        cxFosforoSolo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxFosforoSolo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxFosforoSolo);
        cxFosforoSolo.setBounds(415, 172, 150, 30);

        rtTeorFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtTeorFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtTeorFosforo.setText("Teor de Fósforo a atingir: ");
        getContentPane().add(rtTeorFosforo);
        rtTeorFosforo.setBounds(181, 223, 205, 25);

        cxTeorFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxTeorFosforo.setForeground(new java.awt.Color(0, 0, 0));
        cxTeorFosforo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxTeorFosforo);
        cxTeorFosforo.setBounds(415, 220, 150, 30);

        rtUnidadeTeorFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeTeorFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeTeorFosforo.setText("(mg.dm³)");
        getContentPane().add(rtUnidadeTeorFosforo);
        rtUnidadeTeorFosforo.setBounds(583, 223, 75, 25);

        rtFonteFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtFonteFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtFonteFosforo.setText("Fonte de Fósforo a utilizar: ");
        getContentPane().add(rtFonteFosforo);
        rtFonteFosforo.setBounds(181, 271, 216, 25);

        cbFonteFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbFonteFosforo.setForeground(new java.awt.Color(0, 0, 0));
        cbFonteFosforo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Superfosfato Simples", "Superfosfato Triplo", "MAP" }));
        getContentPane().add(cbFonteFosforo);
        cbFonteFosforo.setBounds(415, 268, 243, 30);

        rtQuantidadeAplicada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtQuantidadeAplicada.setForeground(new java.awt.Color(0, 0, 0));
        rtQuantidadeAplicada.setText("Quantidade a ser aplicada: ");
        getContentPane().add(rtQuantidadeAplicada);
        rtQuantidadeAplicada.setBounds(181, 319, 214, 25);

        cxQuantidadeAplicada.setEditable(false);
        cxQuantidadeAplicada.setBackground(new java.awt.Color(204, 204, 204));
        cxQuantidadeAplicada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxQuantidadeAplicada.setForeground(new java.awt.Color(0, 0, 0));
        cxQuantidadeAplicada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxQuantidadeAplicada);
        cxQuantidadeAplicada.setBounds(415, 316, 150, 30);

        rtUnidadeQuantidadeAplicada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtUnidadeQuantidadeAplicada.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeQuantidadeAplicada.setText("kg/hectare");
        getContentPane().add(rtUnidadeQuantidadeAplicada);
        rtUnidadeQuantidadeAplicada.setBounds(583, 319, 84, 25);

        rtEficienciaFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEficienciaFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtEficienciaFosforo.setText("Eficiência do Fósforo % :");
        getContentPane().add(rtEficienciaFosforo);
        rtEficienciaFosforo.setBounds(181, 367, 194, 25);

        cxEficienciaFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxEficienciaFosforo.setForeground(new java.awt.Color(0, 0, 0));
        cxEficienciaFosforo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxEficienciaFosforo);
        cxEficienciaFosforo.setBounds(415, 364, 150, 30);

        rtUnidadeEficienciaFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtUnidadeEficienciaFosforo.setText("(É recomendado uma eficiência entre 70% e 90%)");
        getContentPane().add(rtUnidadeEficienciaFosforo);
        rtUnidadeEficienciaFosforo.setBounds(583, 374, 300, 16);

        rtCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCusto.setForeground(new java.awt.Color(0, 0, 0));
        rtCusto.setText("Custo - R$/ha : ");
        getContentPane().add(rtCusto);
        rtCusto.setBounds(181, 415, 124, 25);

        cxCusto.setEditable(false);
        cxCusto.setBackground(new java.awt.Color(204, 204, 204));
        cxCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxCusto.setForeground(new java.awt.Color(0, 0, 0));
        cxCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxCusto);
        cxCusto.setBounds(415, 412, 150, 30);

        rtCorrecao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCorrecao.setForeground(new java.awt.Color(0, 0, 0));
        rtCorrecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtCorrecao.setText("Essa correção de FÓSFORO, fornecerá também (kg/ha):");
        getContentPane().add(rtCorrecao);
        rtCorrecao.setBounds(287, 502, 450, 25);

        cxCorrecaoAdicional.setEditable(false);
        cxCorrecaoAdicional.setBackground(new java.awt.Color(204, 204, 204));
        cxCorrecaoAdicional.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxCorrecaoAdicional.setForeground(new java.awt.Color(0, 0, 0));
        cxCorrecaoAdicional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxCorrecaoAdicional.setPreferredSize(new java.awt.Dimension(70, 30));
        getContentPane().add(cxCorrecaoAdicional);
        cxCorrecaoAdicional.setBounds(162, 545, 700, 42);

        btEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btEnviar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btEnviar.setText("Enviar");
        btEnviar.setPreferredSize(new java.awt.Dimension(84, 42));
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btEnviar);
        btEnviar.setBounds(432, 616, 160, 50);

        rtValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        rtValorFonte.setText("Valor/Ton. (R$)");
        getContentPane().add(rtValorFonte);
        rtValorFonte.setBounds(670, 268, 130, 25);

        cxValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        cxValorFonte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxValorFonte);
        cxValorFonte.setBounds(800, 268, 150, 30);

        rtFundo.setBackground(new java.awt.Color(255, 255, 255));
        rtFundo.setForeground(new java.awt.Color(0, 0, 0));
        rtFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\UTFPR\\2021 - semestre 2\\Arquitetura de Software\\soilcorrectionCompleto\\soilcorrection\\src\\main\\java\\gui\\imagens\\background.png")); // NOI18N
        rtFundo.setText("Enviar");
        rtFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rtFundo);
        rtFundo.setBounds(-10, -10, 1050, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
         enviar();
    }//GEN-LAST:event_btEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(CorrecaoFosforoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorrecaoFosforoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorrecaoFosforoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorrecaoFosforoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorrecaoFosforoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JComboBox<String> cbFonteFosforo;
    private javax.swing.JTextField cxCorrecaoAdicional;
    private javax.swing.JTextField cxCusto;
    private javax.swing.JTextField cxEficienciaFosforo;
    private javax.swing.JTextField cxFosforoSolo;
    private javax.swing.JTextField cxQuantidadeAplicada;
    private javax.swing.JTextField cxTeorFosforo;
    private javax.swing.JTextField cxValorFonte;
    private javax.swing.JLabel rtCorrecao;
    private javax.swing.JLabel rtCusto;
    private javax.swing.JLabel rtEficienciaFosforo;
    private javax.swing.JLabel rtFonteFosforo;
    private javax.swing.JLabel rtFosforoSolo;
    private javax.swing.JLabel rtFundo;
    private javax.swing.JLabel rtQuantidadeAplicada;
    private javax.swing.JLabel rtTeorFosforo;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JLabel rtUnidadeEficienciaFosforo;
    private javax.swing.JLabel rtUnidadeQuantidadeAplicada;
    private javax.swing.JLabel rtUnidadeTeorFosforo;
    private javax.swing.JLabel rtValorFonte;
    // End of variables declaration//GEN-END:variables

    public void enviar() { 
        
        double necessarioMgDm3 = Double.parseDouble(cxTeorFosforo.getText().replace(",", ".")) - 
                                 Double.parseDouble(cxFosforoSolo.getText().replace(",", "."));
        double necessarioKgHa = new ConverteMgDm3EmKgHa().converte(necessarioMgDm3);
        double necessarioP2O5 = new ConverteKgHaEmP2O5().converte(necessarioKgHa);
        
        double necessidadeFosforo = new CorrecaoFosforo().calculaEficienciaNutriente(
                necessarioP2O5,
                (Double.parseDouble(cxEficienciaFosforo.getText().replace(",", ".")))/100);
        
        double qtdAplicar;
        double custo;
        Set<NutrienteAdicional> nutrientesAdicionais;
        String nomeNutrienteAdicional1;
        double valorCorrecaoAdicional1;
        String nomeNutrienteAdicional2;
        double valorCorrecaoAdicional2;
        switch (cbFonteFosforo.getSelectedItem().toString()){
            case "Superfosfato Simples":
                qtdAplicar = new CorrecaoFosforo().calculaQuantidadeAplicar(
                        necessidadeFosforo, 
                        FonteFosforo.SUPERFOSFATO_SIMPLES);
                BigDecimal bd1 = new BigDecimal(qtdAplicar).setScale(2, RoundingMode.HALF_EVEN);
                cxQuantidadeAplicada.setText(Double.toString(bd1.doubleValue()));
                
                custo = new CorrecaoFosforo().calculaCusto(Double.parseDouble(cxValorFonte.getText().replace(",", ".")), qtdAplicar);
                BigDecimal bd2 = new BigDecimal(custo).setScale(2, RoundingMode.HALF_EVEN);
                cxCusto.setText(Double.toString(bd2.doubleValue()));
                
                nutrientesAdicionais = new CorrecaoFosforo()
                                                                .getNutrientesAdicionais(
                                                                        qtdAplicar, 
                                                                        FonteFosforo.SUPERFOSFATO_SIMPLES);
                
                nomeNutrienteAdicional1 = nutrientesAdicionais.stream().skip(0).findFirst().get().getNome().toString();
                valorCorrecaoAdicional1 = nutrientesAdicionais.stream().skip(0).findFirst().get().getCorrecaoAdicional();
                BigDecimal bd3 = new BigDecimal(valorCorrecaoAdicional1).setScale(1, RoundingMode.HALF_EVEN);
                nomeNutrienteAdicional2 = nutrientesAdicionais.stream().skip(1).findFirst().get().getNome().toString();
                valorCorrecaoAdicional2 = nutrientesAdicionais.stream().skip(1).findFirst().get().getCorrecaoAdicional();
                BigDecimal bd4 = new BigDecimal(valorCorrecaoAdicional2).setScale(1, RoundingMode.HALF_EVEN);
                cxCorrecaoAdicional.setText(nomeNutrienteAdicional1+": "
                                            +Double.toString(bd3.doubleValue())+" e "
                        +nomeNutrienteAdicional2+": "
                        +Double.toString(bd4.doubleValue()));
                
                
                break;
            case "Superfosfato Triplo":
                qtdAplicar = new CorrecaoFosforo().calculaQuantidadeAplicar(
                        necessidadeFosforo, 
                        FonteFosforo.SUPERFOSFATO_TRIPO);
                BigDecimal bd5 = new BigDecimal(qtdAplicar).setScale(2, RoundingMode.HALF_EVEN);
                cxQuantidadeAplicada.setText(Double.toString(bd5.doubleValue()));
                
                custo = new CorrecaoFosforo().calculaCusto(Double.parseDouble(cxValorFonte.getText().replace(",", ".")), qtdAplicar);
                BigDecimal bd6 = new BigDecimal(custo).setScale(2, RoundingMode.HALF_EVEN);
                cxCusto.setText(Double.toString(bd6.doubleValue()));
                
                nutrientesAdicionais = new CorrecaoFosforo()
                                                                .getNutrientesAdicionais(
                                                                        qtdAplicar, 
                                                                        FonteFosforo.SUPERFOSFATO_TRIPO);
                
                nomeNutrienteAdicional1 = nutrientesAdicionais.stream().findFirst().get().getNome().toString();
                valorCorrecaoAdicional1 = nutrientesAdicionais.stream().findFirst().get().getCorrecaoAdicional();
                BigDecimal bd7 = new BigDecimal(valorCorrecaoAdicional1).setScale(1, RoundingMode.HALF_EVEN);
                cxCorrecaoAdicional.setText(nomeNutrienteAdicional1+": "
                                            +Double.toString(bd7.doubleValue()));
                
                break;
            case "MAP":
                qtdAplicar = new CorrecaoFosforo().calculaQuantidadeAplicar(
                        necessidadeFosforo, 
                        FonteFosforo.MAP);
                BigDecimal bd8 = new BigDecimal(qtdAplicar).setScale(2, RoundingMode.HALF_EVEN);
                cxQuantidadeAplicada.setText(Double.toString(bd8.doubleValue()));
                
                custo = new CorrecaoFosforo().calculaCusto(Double.parseDouble(cxValorFonte.getText().replace(",", ".")), qtdAplicar);
                BigDecimal bd9 = new BigDecimal(custo).setScale(2, RoundingMode.HALF_EVEN);
                cxCusto.setText(Double.toString(bd9.doubleValue()));
                
                nutrientesAdicionais = new CorrecaoFosforo()
                                                                .getNutrientesAdicionais(
                                                                        qtdAplicar, 
                                                                        FonteFosforo.MAP);
                
                nomeNutrienteAdicional1 = nutrientesAdicionais.stream().findFirst().get().getNome().toString();
                valorCorrecaoAdicional1 = nutrientesAdicionais.stream().findFirst().get().getCorrecaoAdicional();
                BigDecimal bd10 = new BigDecimal(valorCorrecaoAdicional1).setScale(1, RoundingMode.HALF_EVEN);
                cxCorrecaoAdicional.setText(nomeNutrienteAdicional1+": "
                                            +Double.toString(bd10.doubleValue()));
                
                break;
            default:
                qtdAplicar = 0;
                custo = 0;
                break;
        }
        
    }
}
