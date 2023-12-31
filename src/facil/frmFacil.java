/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facil;


import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;




/**
 *
 * @author DANIEL_VE160
 */
public class frmFacil extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFacil
     */
    
    public frmFacil() {
        initComponents();
    }
    int tempo;
    
    
    public void cronometro(){
       //Cronometo do jogo que começa em 10:00 minutos e termina ate chegar em 0 fechando frmFacil
        new Thread(){
            public void run(){
                for(int i = 9;i >=0; i--){
                    if (i <= 9 ) {
                        lblTempo1.setText(String.format("%02d",i)+":");
                    }
                    for(tempo = 59;tempo >=0; tempo--){
                        try {
                            sleep(1000);
                            if (tempo <= 9) {
                                lblTempo.setText(String.format("%02d",tempo));
                            }else if(i <= 0 && tempo <= 59){
                                lblTempo.setText(""+tempo);
                                lblTempo1.setForeground(Color.red);
                                lblTempo.setForeground(Color.red);
                            }else{
                                lblTempo.setText(""+tempo);
                            } 
                        } catch (InterruptedException ex) {
                            JOptionPane.showMessageDialog(null, "Erro no Temporizador "+ex);
                            //Logger.getLogger(frmFacil.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }// fim do for segundos
                    if(i == 0){
                        dispose();
                   }
                }// fim do for minuto
            }// fim do public void run()   
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

        btnSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblTempo1 = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblCabecalho1 = new javax.swing.JLabel();
        dpFacil = new javax.swing.JDesktopPane();
        lblFundo1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar1.png"))); // NOI18N
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar2.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(40, 10, 170, 70);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tituloLibras_1.png"))); // NOI18N
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(480, 10, 380, 70);

        lblTempo1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTempo1.setForeground(new java.awt.Color(51, 255, 153));
        lblTempo1.setText("10:");
        getContentPane().add(lblTempo1);
        lblTempo1.setBounds(1110, 30, 60, 40);

        lblTempo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(51, 255, 153));
        lblTempo.setText("59");
        getContentPane().add(lblTempo);
        lblTempo.setBounds(1160, 30, 50, 40);

        lblCabecalho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lblCabecalho.png"))); // NOI18N
        lblCabecalho1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(lblCabecalho1);
        lblCabecalho1.setBounds(-10, -10, 1480, 100);

        lblFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01desktopFundo.png"))); // NOI18N
        lblFundo1.setText(" Resposta");
        lblFundo1.setToolTipText("");
        lblFundo1.setFocusable(false);
        dpFacil.add(lblFundo1);
        lblFundo1.setBounds(0, 0, 1380, 620);

        getContentPane().add(dpFacil);
        dpFacil.setBounds(0, 90, 1380, 620);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01desktopFundo.png"))); // NOI18N
        lblFundo.setText(" Resposta");
        lblFundo.setToolTipText("");
        lblFundo.setFocusable(false);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 150, 1370, 750);

        setBounds(0, -26, 1378, 734);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // QUANDO O FORMULARIO FOR ABERTO EXECUTE
        frmFacil1 f1 = new frmFacil1();
        dpFacil.add(f1);
        f1.setVisible(true);
        
        cronometro();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // QUANDO CLICADO VOLTE PARA A TELA ANTERIO OU SEJA FECHE O FORMULARIO ATUAL
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    public javax.swing.JDesktopPane dpFacil;
    private javax.swing.JLabel lblCabecalho1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundo1;
    public javax.swing.JLabel lblTempo;
    public javax.swing.JLabel lblTempo1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}
