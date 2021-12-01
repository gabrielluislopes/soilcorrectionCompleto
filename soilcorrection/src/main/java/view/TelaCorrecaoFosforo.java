/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;



/**
 *
 * @author gabri
 */
public class TelaCorrecaoFosforo extends javax.swing.JFrame {

    /**
     * Creates new form CorrecaoFosforo
     */
    public TelaCorrecaoFosforo() {
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
        rtValorFonte = new javax.swing.JLabel();
        cxValorFonte = new javax.swing.JTextField();
        cxFonte = new javax.swing.JTextField();
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

        cxFosforoSolo.setEditable(false);
        cxFosforoSolo.setBackground(new java.awt.Color(204, 204, 204));
        cxFosforoSolo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxFosforoSolo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxFosforoSolo);
        cxFosforoSolo.setBounds(415, 172, 150, 30);

        rtTeorFosforo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtTeorFosforo.setForeground(new java.awt.Color(0, 0, 0));
        rtTeorFosforo.setText("Teor de Fósforo a atingir: ");
        getContentPane().add(rtTeorFosforo);
        rtTeorFosforo.setBounds(181, 223, 205, 25);

        cxTeorFosforo.setEditable(false);
        cxTeorFosforo.setBackground(new java.awt.Color(204, 204, 204));
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

        cxEficienciaFosforo.setEditable(false);
        cxEficienciaFosforo.setBackground(new java.awt.Color(204, 204, 204));
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

        rtValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        rtValorFonte.setText("Valor/Ton. (R$)");
        getContentPane().add(rtValorFonte);
        rtValorFonte.setBounds(670, 268, 130, 25);

        cxValorFonte.setEditable(false);
        cxValorFonte.setBackground(new java.awt.Color(204, 204, 204));
        cxValorFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxValorFonte.setForeground(new java.awt.Color(0, 0, 0));
        cxValorFonte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(cxValorFonte);
        cxValorFonte.setBounds(800, 268, 150, 30);

        cxFonte.setEditable(false);
        cxFonte.setBackground(new java.awt.Color(204, 204, 204));
        cxFonte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cxFonte.setForeground(new java.awt.Color(0, 0, 0));
        cxFonte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxFonte.setPreferredSize(new java.awt.Dimension(213, 31));
        getContentPane().add(cxFonte);
        cxFonte.setBounds(415, 268, 243, 30);

        rtFundo.setBackground(new java.awt.Color(255, 255, 255));
        rtFundo.setForeground(new java.awt.Color(0, 0, 0));
        rtFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\OneDrive\\Documentos\\UTFPR\\2021 - semestre 2\\Arquitetura de Software\\soilcorrectionCompleto\\soilcorrection\\src\\main\\java\\imagens\\background.png")); // NOI18N
        rtFundo.setText("Enviar");
        rtFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rtFundo);
        rtFundo.setBounds(-10, -10, 1050, 790);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarCorrecaoFosforo(DadosCorrecaoFosforo dados){
        cxFosforoSolo.setText(Double.toString(dados.getSolo()));
        cxTeorFosforo.setText(Double.toString(dados.getAtingir()));
        cxFonte.setText(dados.getFonte());
        cxValorFonte.setText(Double.toString(dados.getValor()));
        cxQuantidadeAplicada.setText(Double.toString(dados.getQtdAplicar()));
        cxEficienciaFosforo.setText(Double.toString(dados.getEficiencia()));
        cxCusto.setText(Double.toString(dados.getCusto()));
        if(dados.getNomeAdicional2().length() > 0){
            cxCorrecaoAdicional.setText(
                    dados.getNomeAdicional()+": "
                    +Double.toString(dados.getValorCorrecao())+" e "
                    +dados.getNomeAdicional2()+": "
                    +Double.toString(dados.getValorCorrecao2()));
        }
        else{
            cxCorrecaoAdicional.setText(
                    dados.getNomeAdicional()+": "
                    +Double.toString(dados.getValorCorrecao()));
        }
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
            java.util.logging.Logger.getLogger(TelaCorrecaoFosforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoFosforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoFosforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCorrecaoFosforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCorrecaoFosforo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxCorrecaoAdicional;
    private javax.swing.JTextField cxCusto;
    private javax.swing.JTextField cxEficienciaFosforo;
    private javax.swing.JTextField cxFonte;
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

    
}
