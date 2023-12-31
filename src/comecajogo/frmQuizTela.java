/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comecajogo;

import dificil.frmDificil;
import facil.frmFacil;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import medio.frmMedio;

/**
 *
 * @author DANIEL_VE160
 */
public class frmQuizTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmQuizTela
     */
    public frmQuizTela() {
        initComponents();

    }

    AudioClip audio;

    public void voz(String som) {
        URL url = getClass().getResource(som + ".wav");
        audio = Applet.newAudioClip(url);
        audio.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnHome = new javax.swing.JButton();
        btnComecaF = new javax.swing.JButton();
        btnFacil = new javax.swing.JButton();
        btnMedio = new javax.swing.JButton();
        btnDificil = new javax.swing.JButton();
        lblRegras = new javax.swing.JLabel();
        btnComecaM = new javax.swing.JButton();
        btnComecaD = new javax.swing.JButton();
        txtaNivel = new javax.swing.JTextArea();
        lblCabecalho = new javax.swing.JLabel();
        lblBonbeiro = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

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

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnHome.png"))); // NOI18N
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFocusPainted(false);
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(3);
        btnHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnHome2.png"))); // NOI18N
        btnHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnHome2.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnHome);
        btnHome.setBounds(20, 11, 60, 70);

        btnComecaF.setBackground(new java.awt.Color(102, 0, 0));
        btnComecaF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnComecaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar.png"))); // NOI18N
        btnComecaF.setBorder(null);
        btnComecaF.setContentAreaFilled(false);
        btnComecaF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComecaF.setFocusable(false);
        btnComecaF.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaF.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecaFActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnComecaF);
        btnComecaF.setBounds(150, 380, 160, 70);

        btnFacil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFacilLibra.png"))); // NOI18N
        btnFacil.setBorder(null);
        btnFacil.setBorderPainted(false);
        btnFacil.setContentAreaFilled(false);
        btnFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacil.setFocusable(false);
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnFacil);
        btnFacil.setBounds(290, 0, 210, 90);

        btnMedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnMedioLibra.png"))); // NOI18N
        btnMedio.setBorder(null);
        btnMedio.setBorderPainted(false);
        btnMedio.setContentAreaFilled(false);
        btnMedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMedio.setFocusable(false);
        btnMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnMedio);
        btnMedio.setBounds(600, 0, 210, 90);

        btnDificil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnDificilLibra.png"))); // NOI18N
        btnDificil.setBorder(null);
        btnDificil.setBorderPainted(false);
        btnDificil.setContentAreaFilled(false);
        btnDificil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDificil.setFocusable(false);
        btnDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDificilActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnDificil);
        btnDificil.setBounds(870, 0, 210, 90);

        lblRegras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRegras.setForeground(new java.awt.Color(204, 204, 204));
        lblRegras.setText("Regras");
        jDesktopPane1.add(lblRegras);
        lblRegras.setBounds(330, 130, 90, 30);

        btnComecaM.setBackground(new java.awt.Color(102, 0, 0));
        btnComecaM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnComecaM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar.png"))); // NOI18N
        btnComecaM.setBorder(null);
        btnComecaM.setContentAreaFilled(false);
        btnComecaM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComecaM.setFocusable(false);
        btnComecaM.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecaMActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnComecaM);
        btnComecaM.setBounds(290, 380, 160, 70);

        btnComecaD.setBackground(new java.awt.Color(102, 0, 0));
        btnComecaD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnComecaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar.png"))); // NOI18N
        btnComecaD.setBorder(null);
        btnComecaD.setContentAreaFilled(false);
        btnComecaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComecaD.setFocusable(false);
        btnComecaD.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnJogar1.png"))); // NOI18N
        btnComecaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecaDActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnComecaD);
        btnComecaD.setBounds(440, 380, 160, 70);

        txtaNivel.setEditable(false);
        txtaNivel.setBackground(new java.awt.Color(102, 0, 0));
        txtaNivel.setColumns(20);
        txtaNivel.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        txtaNivel.setForeground(new java.awt.Color(204, 204, 204));
        txtaNivel.setLineWrap(true);
        txtaNivel.setRows(5);
        txtaNivel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtaNivel.setOpaque(false);
        txtaNivel.setRequestFocusEnabled(false);
        jDesktopPane1.add(txtaNivel);
        txtaNivel.setBounds(140, 120, 470, 510);

        lblCabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lblCabecalho.png"))); // NOI18N
        lblCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jDesktopPane1.add(lblCabecalho);
        lblCabecalho.setBounds(-10, -10, 1420, 100);
        jDesktopPane1.add(lblBonbeiro);
        lblBonbeiro.setBounds(730, 90, 530, 600);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01desktopFundo.png"))); // NOI18N
        lblFundo.setToolTipText("");
        jDesktopPane1.add(lblFundo);
        lblFundo.setBounds(0, 0, 1380, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, -27, 1378, 818);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // BOTÃO VOLTA PARA TELA INICIAL DO JOGO
        if (audio != null) {
            audio.stop();
            dispose();
        }else{
            dispose();
        } 
        

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioActionPerformed
        // BOTÃO DO NIVEL MEDIO
        btnDificil.setSelected(false);// botão dificil desabilitar a seleção da imagem
        btnFacil.setSelected(false);  // botão facil desabilitar a seleção da imagem

        btnMedio.setSelected(true);
        btnMedio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnMedio.png")));

        //MUDANDO A MUDANDO A IMAGEM BOMBEIRO 
        lblBonbeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nivelBomMedio.png")));

        txtaNivel.setText("\n\n O Nível Médio: Contem dez perguntas\n"
                + " sobre primeiros socorros denominada\n"
                + " médio a cada acerto das perguntas\n"
                + " equivale a 10 pontos com apenas duas\n"
                + " chance de jogada para o nível médio");

        btnComecaM.setVisible(true);
        btnComecaF.setVisible(false);
        btnComecaD.setVisible(false);

        if (audio != null) {
            audio.stop();
            voz("/audio/nivelMedio");
        } else {
            voz("/audio/nivelMedio");
        }

    }//GEN-LAST:event_btnMedioActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDificilActionPerformed
        // BOTÃO DO NIVEL DIFICIL
        btnFacil.setSelected(false);// botão facil desabilitar a seleção da imagem
        btnMedio.setSelected(false);// botão medio desabilitar a seleção da imagem

        btnDificil.setSelected(true);// selecionado a imagem dificil verdade
        btnDificil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnDificil.png")));

        //MUDANDO A MUDANDO A IMAGEM BOMBEIRO 
        lblBonbeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nivelBomDificil.png")));

        txtaNivel.setText("\n\n O Nível Difícil: Contem dez perguntas\n"
                + " sobre primeiros socorros denominada\n"
                + " difícil a cada acerto das perguntas\n"
                + " equivale a 10 pontos com apenas uma\n"
                + " chance de jogada para o nível difícil");

        btnComecaD.setVisible(true);
        btnComecaF.setVisible(false);
        btnComecaM.setVisible(false);

        if (audio != null) {
            audio.stop();
            voz("/audio/nivelDificil");
        } else {
            voz("/audio/nivelDificil");
        }
    }//GEN-LAST:event_btnDificilActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // QUNADO O INETRNAL FRAME FOR ABERTO OS BOTÕES COMEÇARAM INVISIVEL
        btnComecaF.setVisible(false);
        btnComecaM.setVisible(false);
        btnComecaD.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnComecaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecaMActionPerformed
        // BOTÃO COMEÇAR MEDIO
        frmMedio medio = new frmMedio();
        jDesktopPane1.add(medio);
        medio.setVisible(true);
        audio.stop();
    }//GEN-LAST:event_btnComecaMActionPerformed

    private void btnComecaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecaDActionPerformed
        // BOTÃO COMEÇAR DIFICIL
        frmDificil dificil = new frmDificil();
        jDesktopPane1.add(dificil);
        dificil.setVisible(true);
        audio.stop();

    }//GEN-LAST:event_btnComecaDActionPerformed

    private void btnComecaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecaFActionPerformed
        // BOTÃO COMEÇAR FACIL
        frmFacil facil = new frmFacil();
        jDesktopPane1.add(facil);
        facil.setVisible(true);
        audio.stop();

    }//GEN-LAST:event_btnComecaFActionPerformed

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        // BOTÃO DO NIVEL FACIL  
        btnDificil.setSelected(false);// botão dicil desabilitar a seleção da imagem
        btnMedio.setSelected(false);// botão medio desabilitar a seleção da imagem

        //MUDANDO A IMAGEM DO BOTÃO FACIL
        btnFacil.setSelected(true);// selecionado a imagem dificil verdade
        btnFacil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFacil.png")));

        //MUDANDO A MUDANDO A IMAGEM BOMBEIRO 
        lblBonbeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nivelBomFacil.png")));

        txtaNivel.setText("\n\n O Nível Facíl: Contem dez perguntas\n"
                + " sobre primeiros socorros denominada\n"
                + " facíl a cada  acerto das  perguntas\n"
                + " equivale a 10 pontos com apenas três\n"
                + " chance de jogada para o nível facíl");

        // DEIXANDO INVISIVEL OS BOÕES COMEÇAR JOGO MENO O BOTÃO BTNCOMECAF
        btnComecaM.setVisible(false);
        btnComecaF.setVisible(true);
        btnComecaD.setVisible(false);

        if (audio != null) {
            audio.stop();
            voz("/audio/nivelFacil");
        } else {
            voz("/audio/nivelFacil");
        }

    }//GEN-LAST:event_btnFacilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComecaD;
    private javax.swing.JButton btnComecaF;
    private javax.swing.JButton btnComecaM;
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMedio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblBonbeiro;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRegras;
    private javax.swing.JTextArea txtaNivel;
    // End of variables declaration//GEN-END:variables

}
