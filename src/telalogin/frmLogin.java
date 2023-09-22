/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telalogin;

import comecajogo.frmAlfabetoLibras;
import comecajogo.frmJogar;
import dao.UsuarioDAO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL_VE160
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        txtUsuario.setCaretColor(java.awt.Color.white);//Muadr A cor do cusor piscando para branco
        pwdSenha.setCaretColor(Color.white);
        //pwdSenha.setCaretColor(pwdSenha.getBackground());//desabilitar o cursor piscando
        setIcone();
    }

    public void login() {
        UsuarioDAO dao = new UsuarioDAO();
        try {
            if (txtUsuario.getText().equals("") || pwdSenha.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "prencha os campos obrigatorios");
            } else if (dao.chekLogin(txtUsuario.getText(), Integer.parseInt(pwdSenha.getText()))) {
                new frmJogar().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha Invalida");
            }
        } catch (Exception e) {
            //System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro Valores Invalidos");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(370, 510));
        getContentPane().setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(0, 51, 153));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(130, 330, 170, 30);

        pwdSenha.setBackground(new java.awt.Color(0, 51, 153));
        pwdSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pwdSenha.setForeground(new java.awt.Color(255, 255, 255));
        pwdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pwdSenha);
        pwdSenha.setBounds(130, 370, 170, 30);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnCadastrar.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusable(false);
        btnCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnCadastrar2.png"))); // NOI18N
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnCadastrar2.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(10, 430, 170, 60);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnSair.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnSair2.png"))); // NOI18N
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnSair2.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(230, 0, 140, 50);

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLogin.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusable(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLogin2.png"))); // NOI18N
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLogin2.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(190, 430, 160, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 330, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 370, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loginAvatar.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 70, 220, 240);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 370, 530);

        setSize(new java.awt.Dimension(367, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new frmCadastrar().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // BOTÃO SAIR
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // BOTÃO LOGIN
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void pwdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdSenhaActionPerformed
        // CAMPO DE TEXTO SENHA
        login();

    }//GEN-LAST:event_pwdSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JPasswordField pwdSenha;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone1.png")));
    }
}