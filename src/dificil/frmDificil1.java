/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dificil;


import comecajogo.frmJogar;
import comecajogo.frmMsgCerto;
import facil.frmFimdejogo;
import javax.swing.JOptionPane;


/**
 *
 * @author DANIEL_VE160
 */
public class frmDificil1 extends javax.swing.JInternalFrame {


    /**
     * Creates new form frmQuizTela
     */
    private  int chances = 1;
    private boolean passou = false;
    private boolean selecao = false;
    
    public frmDificil1() {
        initComponents();
        
    }
    
    frmFimdejogo fim = new frmFimdejogo();
    //Mostra a mensagem na tela se Acertou ou Errou a Alternativa selecionada
    public void mensagemTela(){
        //JOptionPane.showMessageDialog(null, "Resposta errada você tem "+chances+" chances");
        // Instanciando o formulario frmMsgCerto e setando a imgem para errado e mostrando quantas chances tem
        //quando for a respota errada mostre o formulario com a imagem e numero de chances        
        frmMsgCerto errado = new frmMsgCerto(null, rootPaneCheckingEnabled);
        errado.lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/msgErrado.jpg")));
        errado.lblChance3.setText("0"); 
        frmJogar.play2("/audio/errou");                
        errado.setVisible(true);//Mostrando o formulario frmMsgCerto        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        lblVisualiza = new javax.swing.JLabel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnOk1 = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        txtD = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        txtConfiRes = new javax.swing.JTextField();
        lblPotuacao = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        lblChances = new javax.swing.JLabel();
        lblTemChance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotChance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCabecalho = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTextPane1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("O que devemos fazer no caso de encontrarmos com uma vitima que está se afogando?");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 20, 570, 60);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblVisualiza.setBackground(new java.awt.Color(255, 255, 255));
        lblVisualiza.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblVisualiza.setForeground(new java.awt.Color(255, 255, 255));
        lblVisualiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/questD1p.jpg"))); // NOI18N
        lblVisualiza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVisualiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVisualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 346, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(20, 90, 640, 350);

        btnA.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA.png"))); // NOI18N
        btnA.setBorder(null);
        btnA.setContentAreaFilled(false);
        btnA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnA.setFocusable(false);
        btnA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png"))); // NOI18N
        btnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png"))); // NOI18N
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnA);
        btnA.setBounds(680, 20, 70, 60);

        btnB.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB.png"))); // NOI18N
        btnB.setBorder(null);
        btnB.setContentAreaFilled(false);
        btnB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnB.setFocusable(false);
        btnB.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png"))); // NOI18N
        btnB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png"))); // NOI18N
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnB);
        btnB.setBounds(680, 100, 70, 60);

        btnC.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC.png"))); // NOI18N
        btnC.setBorder(null);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.setFocusable(false);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnC);
        btnC.setBounds(680, 170, 70, 60);

        btnD.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD.png"))); // NOI18N
        btnD.setBorder(null);
        btnD.setContentAreaFilled(false);
        btnD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnD.setFocusable(false);
        btnD.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png"))); // NOI18N
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png"))); // NOI18N
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnD);
        btnD.setBounds(680, 240, 70, 60);

        btnE.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE.png"))); // NOI18N
        btnE.setBorder(null);
        btnE.setContentAreaFilled(false);
        btnE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnE.setFocusable(false);
        btnE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png"))); // NOI18N
        btnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png"))); // NOI18N
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnE);
        btnE.setBounds(680, 310, 70, 60);

        btnOk1.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnOk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnL1.png"))); // NOI18N
        btnOk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnOk1.setContentAreaFilled(false);
        btnOk1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOk1.setFocusable(false);
        btnOk1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btn1.png"))); // NOI18N
        jDesktopPane1.add(btnOk1);
        btnOk1.setBounds(20, 20, 70, 60);

        btnOk.setFont(new java.awt.Font("Poetsen One", 0, 24)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnOK.png"))); // NOI18N
        btnOk.setBorder(null);
        btnOk.setContentAreaFilled(false);
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setFocusable(false);
        btnOk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnOK2.png"))); // NOI18N
        btnOk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnOK2.png"))); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnOk);
        btnOk.setBounds(680, 380, 70, 60);

        txtA.setEditable(false);
        txtA.setBackground(new java.awt.Color(0, 102, 102));
        txtA.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtA.setForeground(new java.awt.Color(255, 255, 255));
        txtA.setText(" Não Fazer Nada");
        txtA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtA.setFocusable(false);
        jDesktopPane1.add(txtA);
        txtA.setBounds(750, 20, 530, 60);

        txtB.setEditable(false);
        txtB.setBackground(new java.awt.Color(0, 102, 102));
        txtB.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtB.setForeground(new java.awt.Color(255, 255, 255));
        txtB.setText(" Jamais da água a vitima");
        txtB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtB.setFocusable(false);
        jDesktopPane1.add(txtB);
        txtB.setBounds(750, 100, 530, 60);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane3.setBackground(new java.awt.Color(0, 102, 102));
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane3.setText("Não podemos de maneira nenhuma tentar resgatar a vitima devemos manter a calma e ligar para os serviços de resgate");
        jScrollPane3.setViewportView(jTextPane3);

        jDesktopPane1.add(jScrollPane3);
        jScrollPane3.setBounds(750, 170, 530, 60);

        txtD.setEditable(false);
        txtD.setBackground(new java.awt.Color(0, 102, 102));
        txtD.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtD.setForeground(new java.awt.Color(255, 255, 255));
        txtD.setText(" Apenas as respostas C e E estão corretas");
        txtD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtD.setFocusable(false);
        jDesktopPane1.add(txtD);
        txtD.setBounds(750, 240, 530, 60);

        txtE1.setEditable(false);
        txtE1.setBackground(new java.awt.Color(0, 102, 102));
        txtE1.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtE1.setForeground(new java.awt.Color(255, 255, 255));
        txtE1.setText("  Tentar salvar e resgatar a vitima rapidamente");
        txtE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtE1.setFocusable(false);
        jDesktopPane1.add(txtE1);
        txtE1.setBounds(750, 310, 530, 60);

        txtConfiRes.setEditable(false);
        txtConfiRes.setBackground(new java.awt.Color(0, 102, 102));
        txtConfiRes.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        txtConfiRes.setForeground(new java.awt.Color(255, 255, 255));
        txtConfiRes.setText(" CONFIRMAR A RESPOSTA");
        txtConfiRes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtConfiRes.setFocusable(false);
        jDesktopPane1.add(txtConfiRes);
        txtConfiRes.setBounds(750, 380, 310, 60);

        lblPotuacao.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        lblPotuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPotuacao.setText("Pontuação:");
        jDesktopPane1.add(lblPotuacao);
        lblPotuacao.setBounds(520, 550, 210, 60);

        lblPontos.setFont(new java.awt.Font("Poetsen One", 0, 36)); // NOI18N
        lblPontos.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(lblPontos);
        lblPontos.setBounds(710, 560, 100, 40);

        lblChances.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        lblChances.setForeground(new java.awt.Color(0, 204, 102));
        lblChances.setText("Chances:");
        jDesktopPane1.add(lblChances);
        lblChances.setBounds(1010, 550, 180, 60);

        lblTemChance.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        lblTemChance.setForeground(new java.awt.Color(204, 0, 51));
        lblTemChance.setText("1");
        jDesktopPane1.add(lblTemChance);
        lblTemChance.setBounds(1170, 550, 50, 60);

        jLabel2.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("/");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(1200, 550, 40, 60);

        lblTotChance.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        lblTotChance.setForeground(new java.awt.Color(0, 204, 102));
        lblTotChance.setText("1");
        jDesktopPane1.add(lblTotChance);
        lblTotChance.setBounds(1220, 550, 50, 60);

        jLabel3.setFont(new java.awt.Font("Poetsen One", 0, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUESTÃO 1");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(40, 550, 280, 60);

        lblCabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lblCabecalho.png"))); // NOI18N
        lblCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jDesktopPane1.add(lblCabecalho);
        lblCabecalho.setBounds(-10, 530, 1400, 100);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01desktopFundo.png"))); // NOI18N
        lblFundo.setText(" Resposta");
        lblFundo.setToolTipText("");
        lblFundo.setFocusable(false);
        jDesktopPane1.add(lblFundo);
        lblFundo.setBounds(0, 0, 1380, 700);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1380, 700);

        setBounds(0, -27, 1378, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // BOTAO A     
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO B
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB.png")));
        btnB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO C
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC.png")));
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO D
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD.png")));
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png")));        
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO E
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE.png")));
        btnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png")));                   
        
        //MUDANDO A IMAGEM DO BOTÃO A PARA A IMAGEM SELECAO
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png")));      
        
        passou = false;
        selecao = true;
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // BOTÃO B      
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO A 
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA.png")));
        btnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png")));
        
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO C
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC.png")));
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO D
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD.png")));
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png")));        
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO E
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE.png")));
        btnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png")));        
        
        //MUDANDO A IMAGEM DO BOTÃO B PARA A IMAGEM SELECAO
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png")));
   
        passou = false;
        selecao = true;
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // BOTÃO C       
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO A 
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA.png")));
        btnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png")));
        
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO B
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB.png")));
        btnB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO D
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD.png")));
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png")));        
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO E
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE.png")));
        btnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png")));       
        
        //MUDANDO A IMAGEM DO BOTÃO C PARA A IMAGEM SELECAO
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png")));
        
        passou = true;
        selecao = true;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // BOTÃO D      
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO A 
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA.png")));
        btnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png")));
        
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO B
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB.png")));
        btnB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO C
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC.png")));
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png")));        
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO E
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE.png")));
        btnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png")));       
        
        //MUDANDO A IMAGEM DO BOTÃO D PARA A IMAGEM SELECAO
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png")));

        passou = false;
        selecao = true;
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // BOTÃO E    
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO A 
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA.png")));
        btnA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnA2.png")));
        
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO B
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB.png")));
        btnB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnB2.png")));
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO C
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC.png")));
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnC2.png")));        
 
        //VOLTANDO PARA A IMAGEM INICIAL DO BOTÃO D
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD.png")));
        btnD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnD2.png")));       
        
        //MUDANDO A IMAGEM DO BOTÃO E PARA A IMAGEM SELECAO
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnE2.png")));
        
        passou = false;
        selecao = true;
    }//GEN-LAST:event_btnEActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // BOTÃO OK
        if(selecao == true){
            if (passou == true) {
                lblVisualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/questD1r.jpg")));
                lblPontos.setText("10");
                frmJogar.play2("/audio/acertou");
                //JOptionPane.showMessageDialog(null, "Resposta Correta Passe Para Próxima Questão Você Tem "+chances+" chances");
                frmMsgCerto certo = new frmMsgCerto(null, rootPaneCheckingEnabled);
                certo.lblChance3.setText(""+chances);
                certo.setVisible(true);
                
                frmDificil2 D2 = new frmDificil2();
                jDesktopPane1.add(D2);
                D2.setVisible(true);
                
            }else{
                lblVisualiza.setIcon(null);
                lblVisualiza.setText("Resposta Errada");
                lblTemChance.setText("0");
                mensagemTela();
                //JOptionPane.showMessageDialog(null, "Suas Chances acabou");
                jDesktopPane1.add(fim);
                fim.setVisible(true);
                fim.lblTotChance.setText("1");
            }
        }else{
          JOptionPane.showMessageDialog(null, "Por favor selecione um questão"); 
        }
    }//GEN-LAST:event_btnOkActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOk1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblChances;
    private javax.swing.JLabel lblFundo;
    public javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPotuacao;
    public javax.swing.JLabel lblTemChance;
    private javax.swing.JLabel lblTotChance;
    private javax.swing.JLabel lblVisualiza;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtConfiRes;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtE1;
    // End of variables declaration//GEN-END:variables

}
