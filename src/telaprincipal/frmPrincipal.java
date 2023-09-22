/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaprincipal;



import comecajogo.frmJogar;
import dao.ConnectionFactory;
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;
import telalogin.frmLogin;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author DANIEL
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setIcon();

        //Iniciando a barra de progesso  
        new Thread() {
            public void run() {
                for (int i = 0; i <= 101; i++) {
                    try {
                        sleep(200);
                        jProgressBar1.setValue(i);

                        if (jProgressBar1.getValue() <= 40) {
                            lblMensagem.setText("Conectando o Banco de Dados...");
                        } else if (jProgressBar1.getValue() <= 60) {

                            ConnectionFactory.getConnection();
                            
                            if (ConnectionFactory.getConnection() != null) {
                                //lblMensagem.setText("Conectando ao banco de Dados...");
                                lblMensagem.setText("Conexão criada com sucesso...");
                            } else {
                                lblMensagem.setText("Erro ao conectar ao banco...");
                            }

                        } else if (jProgressBar1.getValue() <= 90) {
                            lblMensagem.setText("Iniciando o Sistema...");
                        } else {
                            lblMensagem.setText("Iniciando o Sistema...");
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //Mostra a Tela Login
                frmLogin l = new frmLogin();
                l.setVisible(true);
                
                // Codigo para esconder a tela Principal
                dispose();// esconder a tela 
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcone = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblFundo1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoo.png"))); // NOI18N
        getContentPane().add(lblIcone);
        lblIcone.setBounds(510, 270, 210, 180);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brincando e Aprendendo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 160, 250, 50);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblMensagem);
        lblMensagem.setBounds(50, 340, 270, 20);

        lblFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bannerLibras (5).png"))); // NOI18N
        getContentPane().add(lblFundo1);
        lblFundo1.setBounds(0, 0, 740, 490);

        jProgressBar1.setBackground(new java.awt.Color(204, 51, 0));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(40, 360, 500, 17);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("© Copyright 20016-2017 SOSLibras LTDA. - All Rights Reserved");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 420, 390, 14);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/00bannerLibras.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 740, 490);

        setSize(new java.awt.Dimension(738, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundo1;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone1.png")));
    }
}
