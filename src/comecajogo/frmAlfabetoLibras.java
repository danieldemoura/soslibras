/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comecajogo;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIEL_VE160
 */
public class frmAlfabetoLibras extends javax.swing.JInternalFrame {

    private String letraLibra;
    private String letraBotao;
    private int indice = -1;
    private int acertos = 0;
    private int erros = 0;
    private int totalLetra = 0;
    private boolean terminoujogo = false;

    /**
     * Creates new form frmQuizTela
     */
    public frmAlfabetoLibras() {
        initComponents();

    }

    AudioClip audio;

    public void voz(String som) {
        URL url = getClass().getResource(som + ".wav");
        audio = Applet.newAudioClip(url);
        audio.play();
        audio.loop();
    }

    public void certoErrado(String numero) {
        if (totalLetra <= 25) {
            letraBotao = "/imagens/libras/libra" + numero + ".jpg";
            if (letraLibra.equals(letraBotao)) {
                if (terminoujogo == false) {
                    lblMensagem.setForeground(Color.green);
                    lblMensagem.setText("Parabéns Você Acertou");
                    acertos++;
                    lblTotalAcertos.setText("Letras Que Acertou: " + acertos);
                    tempoDeEspera();
                    if (erros == 0) {
                        lblTotalErros.setText("Letras Que Errou: " + erros);
                    }
                }
            } else if (terminoujogo == false) {
                lblMensagem.setForeground(Color.red);
                lblMensagem.setText("Sinto Muito Mais Você Errou");
                erros++;
                lblTotalErros.setText("Letras Que Errou: " + erros);
                tempoDeEspera();
                if (acertos == 0) {
                    lblTotalAcertos.setText("Letras Que Acertou: " + acertos);
                }
            }
            totalLetra++;
            lblTotalLetra1.setText("Já mostrado: " + totalLetra);
        }
    }

    public void tempoDeEspera() {
        new Thread() {
            public void run() {
                for (int i = 0; i >= 0; i--) {
                    try {
                        sleep(1000);
                        if (i == 0) {
                            lblMensagem.setText("");
                            sorteiaLibra();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frmAlfabetoLibras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }

    public void sorteiaLibra() {
        //Random random = new Random();
        //int num = 0;
        //int vetor[] = {2,0,5,9,1,20,8,3,10,4,6,22,7,11,16,12,21,13,18,25,14,15,24,17,19,23,};
        //vetor[indice] = random.nextInt(26);
        if (indice <= 26) {
            indice++;
        }
        //JOptionPane.showMessageDialog(null, "Case: " + indice);
        //letraLibra = "/imagens/libras/libra" +indice+ ".jpg";

        switch (indice) {
            case 0:
                letraLibra = "/imagens/libras/libra2.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 1:
                letraLibra = "/imagens/libras/libra0.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 2:
                letraLibra = "/imagens/libras/libra5.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 3:
                letraLibra = "/imagens/libras/libra9.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 4:
                letraLibra = "/imagens/libras/libra1.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 5:
                letraLibra = "/imagens/libras/libra20.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 6:
                letraLibra = "/imagens/libras/libra8.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 7:
                letraLibra = "/imagens/libras/libra3.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 8:
                letraLibra = "/imagens/libras/libra10.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 9:
                letraLibra = "/imagens/libras/libra4.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 10:
                letraLibra = "/imagens/libras/libra6.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 11:
                letraLibra = "/imagens/libras/libra22.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 12:
                letraLibra = "/imagens/libras/libra7.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 13:
                letraLibra = "/imagens/libras/libra11.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 14:
                letraLibra = "/imagens/libras/libra16.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 15:
                letraLibra = "/imagens/libras/libra12.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 16:
                letraLibra = "/imagens/libras/libra21.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 17:
                letraLibra = "/imagens/libras/libra13.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 18:
                letraLibra = "/imagens/libras/libra18.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 19:
                letraLibra = "/imagens/libras/libra25.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 20:
                letraLibra = "/imagens/libras/libra14.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 21:
                letraLibra = "/imagens/libras/libra15.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 22:
                letraLibra = "/imagens/libras/libra24.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 23:
                letraLibra = "/imagens/libras/libra17.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 24:
                letraLibra = "/imagens/libras/libra19.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            case 25:
                letraLibra = "/imagens/libras/libra23.jpg";
                lblVerImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource(letraLibra)));
                break;
            default:
                lblVerImagem.setIcon(null);
                lblEscondePlacar.setVisible(false);
                terminoujogo = true;
                break;
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnHome = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblCabecalho = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblRestam = new javax.swing.JLabel();
        lblAcerteoAlfabeto = new javax.swing.JLabel();
        lblVerImagem = new javax.swing.JLabel();
        lblMensagemFinal = new javax.swing.JLabel();
        lblImagemBorda = new javax.swing.JLabel();
        jpTecladoPortugues = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        jpPlacardoJogo = new javax.swing.JPanel();
        lblPlacar = new javax.swing.JLabel();
        lblTotalLetra = new javax.swing.JLabel();
        lblTotalLetra1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFundoVerde2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblEscondePlacar = new javax.swing.JLabel();
        lblTotalErros = new javax.swing.JLabel();
        lblTotalAcertos = new javax.swing.JLabel();
        lblFundoVerdeEscuro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tituloLibras_1.png"))); // NOI18N
        jDesktopPane1.add(lblTitulo);
        lblTitulo.setBounds(460, 1, 380, 90);

        lblCabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lblCabecalho.png"))); // NOI18N
        lblCabecalho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jDesktopPane1.add(lblCabecalho);
        lblCabecalho.setBounds(-10, -10, 1420, 100);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setFocusable(false);
        jDesktopPane1.add(lblMensagem);
        lblMensagem.setBounds(110, 390, 430, 30);

        lblRestam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRestam.setForeground(new java.awt.Color(255, 255, 255));
        lblRestam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(lblRestam);
        lblRestam.setBounds(608, 120, 50, 30);

        lblAcerteoAlfabeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAcerteoAlfabeto.setForeground(new java.awt.Color(255, 255, 255));
        lblAcerteoAlfabeto.setText("ACERTE O ALFABETO");
        jDesktopPane1.add(lblAcerteoAlfabeto);
        lblAcerteoAlfabeto.setBounds(245, 93, 210, 22);
        jDesktopPane1.add(lblVerImagem);
        lblVerImagem.setBounds(8, 119, 650, 305);

        lblMensagemFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/libras/mensagefinal_1.jpg"))); // NOI18N
        jDesktopPane1.add(lblMensagemFinal);
        lblMensagemFinal.setBounds(8, 120, 649, 303);

        lblImagemBorda.setBackground(new java.awt.Color(51, 51, 51));
        lblImagemBorda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 0, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        lblImagemBorda.setOpaque(true);
        jDesktopPane1.add(lblImagemBorda);
        lblImagemBorda.setBounds(6, 118, 654, 308);

        jpTecladoPortugues.setBackground(new java.awt.Color(51, 51, 51));
        jpTecladoPortugues.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 0), new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpTecladoPortugues.setOpaque(false);
        jpTecladoPortugues.setLayout(null);

        btnA.setBackground(new java.awt.Color(255, 255, 255));
        btnA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnA);
        btnA.setBounds(10, 10, 70, 50);

        btnB.setBackground(new java.awt.Color(255, 255, 255));
        btnB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnB);
        btnB.setBounds(80, 10, 70, 50);

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnC);
        btnC.setBounds(150, 10, 70, 50);

        btnD.setBackground(new java.awt.Color(255, 255, 255));
        btnD.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnD);
        btnD.setBounds(220, 10, 70, 50);

        btnE.setBackground(new java.awt.Color(255, 255, 255));
        btnE.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnE);
        btnE.setBounds(290, 10, 70, 50);

        btnF.setBackground(new java.awt.Color(255, 255, 255));
        btnF.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnF);
        btnF.setBounds(360, 10, 70, 50);

        btnG.setBackground(new java.awt.Color(255, 255, 255));
        btnG.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnG);
        btnG.setBounds(430, 10, 70, 50);

        btnH.setBackground(new java.awt.Color(255, 255, 255));
        btnH.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnH);
        btnH.setBounds(500, 10, 70, 50);

        btnI.setBackground(new java.awt.Color(255, 255, 255));
        btnI.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnI);
        btnI.setBounds(570, 10, 70, 50);

        btnJ.setBackground(new java.awt.Color(255, 255, 255));
        btnJ.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnJ);
        btnJ.setBounds(10, 60, 70, 50);

        btnK.setBackground(new java.awt.Color(255, 255, 255));
        btnK.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnK);
        btnK.setBounds(80, 60, 70, 50);

        btnL.setBackground(new java.awt.Color(255, 255, 255));
        btnL.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnL);
        btnL.setBounds(150, 60, 70, 50);

        btnM.setBackground(new java.awt.Color(255, 255, 255));
        btnM.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnM);
        btnM.setBounds(220, 60, 70, 50);

        btnN.setBackground(new java.awt.Color(255, 255, 255));
        btnN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnN);
        btnN.setBounds(290, 60, 70, 50);

        btnO.setBackground(new java.awt.Color(255, 255, 255));
        btnO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnO);
        btnO.setBounds(360, 60, 70, 50);

        btnP.setBackground(new java.awt.Color(255, 255, 255));
        btnP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnP);
        btnP.setBounds(430, 60, 70, 50);

        btnQ.setBackground(new java.awt.Color(255, 255, 255));
        btnQ.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnQ);
        btnQ.setBounds(500, 60, 70, 50);

        btnR.setBackground(new java.awt.Color(255, 255, 255));
        btnR.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnR);
        btnR.setBounds(570, 60, 70, 50);

        btnS.setBackground(new java.awt.Color(255, 255, 255));
        btnS.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnS);
        btnS.setBounds(50, 110, 70, 50);

        btnT.setBackground(new java.awt.Color(255, 255, 255));
        btnT.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnT);
        btnT.setBounds(120, 110, 70, 50);

        btnU.setBackground(new java.awt.Color(255, 255, 255));
        btnU.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnU);
        btnU.setBounds(190, 110, 70, 50);

        btnV.setBackground(new java.awt.Color(255, 255, 255));
        btnV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnV);
        btnV.setBounds(260, 110, 70, 50);

        btnX.setBackground(new java.awt.Color(255, 255, 255));
        btnX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnX);
        btnX.setBounds(330, 110, 70, 50);

        btnW.setBackground(new java.awt.Color(255, 255, 255));
        btnW.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnW);
        btnW.setBounds(400, 110, 70, 50);

        btnY.setBackground(new java.awt.Color(255, 255, 255));
        btnY.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnY);
        btnY.setBounds(470, 110, 70, 50);

        btnZ.setBackground(new java.awt.Color(255, 255, 255));
        btnZ.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        jpTecladoPortugues.add(btnZ);
        btnZ.setBounds(540, 110, 70, 50);

        jDesktopPane1.add(jpTecladoPortugues);
        jpTecladoPortugues.setBounds(10, 450, 650, 170);

        jpPlacardoJogo.setBackground(new java.awt.Color(51, 51, 51));
        jpPlacardoJogo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 51), new java.awt.Color(0, 0, 0)));
        jpPlacardoJogo.setOpaque(false);
        jpPlacardoJogo.setLayout(null);

        lblPlacar.setBackground(new java.awt.Color(0, 102, 51));
        lblPlacar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPlacar.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacar.setText("Placar");
        lblPlacar.setOpaque(true);
        jpPlacardoJogo.add(lblPlacar);
        lblPlacar.setBounds(2, 0, 710, 70);

        lblTotalLetra.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTotalLetra.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalLetra.setText("Total De Letras: 26");
        jpPlacardoJogo.add(lblTotalLetra);
        lblTotalLetra.setBounds(10, 80, 330, 50);

        lblTotalLetra1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblTotalLetra1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalLetra1.setText("Já Mostrados:");
        jpPlacardoJogo.add(lblTotalLetra1);
        lblTotalLetra1.setBounds(360, 80, 300, 50);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jpPlacardoJogo.add(jSeparator1);
        jSeparator1.setBounds(0, 72, 720, 2);

        lblFundoVerde2.setBackground(new java.awt.Color(0, 102, 51));
        lblFundoVerde2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblFundoVerde2.setForeground(new java.awt.Color(255, 255, 255));
        lblFundoVerde2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundoVerde2.setOpaque(true);
        jpPlacardoJogo.add(lblFundoVerde2);
        lblFundoVerde2.setBounds(2, 70, 710, 70);

        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jpPlacardoJogo.add(jSeparator2);
        jSeparator2.setBounds(0, 140, 720, 2);

        lblEscondePlacar.setBackground(new java.awt.Color(0, 102, 51));
        lblEscondePlacar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblEscondePlacar.setForeground(new java.awt.Color(255, 255, 255));
        lblEscondePlacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscondePlacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/libras/placarfundo1.jpg"))); // NOI18N
        lblEscondePlacar.setOpaque(true);
        jpPlacardoJogo.add(lblEscondePlacar);
        lblEscondePlacar.setBounds(2, 140, 710, 560);

        lblTotalErros.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        lblTotalErros.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalErros.setText("Letras Que Erro: ");
        jpPlacardoJogo.add(lblTotalErros);
        lblTotalErros.setBounds(10, 200, 380, 50);

        lblTotalAcertos.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        lblTotalAcertos.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAcertos.setText("Letras Que Acertou: ");
        jpPlacardoJogo.add(lblTotalAcertos);
        lblTotalAcertos.setBounds(10, 150, 380, 50);

        lblFundoVerdeEscuro.setBackground(new java.awt.Color(0, 102, 102));
        lblFundoVerdeEscuro.setOpaque(true);
        jpPlacardoJogo.add(lblFundoVerdeEscuro);
        lblFundoVerdeEscuro.setBounds(3, 140, 710, 100);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/libras/placarfundo2_1.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        jpPlacardoJogo.add(jLabel1);
        jLabel1.setBounds(3, 240, 710, 460);

        jDesktopPane1.add(jpPlacardoJogo);
        jpPlacardoJogo.setBounds(670, 88, 710, 702);

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

        setBounds(0, -26, 1378, 818);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // BOTÃO VOLTA PARA TELA INICIAL DO JOGO
        if (audio != null) {
            audio.stop();
            dispose();
        } else {
            dispose();
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // AO SER ABERTO O FORMULARIO EXECUTE
        sorteiaLibra();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // BOTÃO DA LETRA A
        certoErrado("0");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // BOTÃO DA LETRA B
        certoErrado("1");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // BOTÃO DA LETRA C
        certoErrado("2");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // BOTÃO DA LETRA D
        certoErrado("3");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // BOTÃO DA LETRA E
        certoErrado("4");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        // BOTÃO DA LETRA F
        certoErrado("5");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        // BOTÃO DA LETRA G
        certoErrado("6");
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        // BOTÃO DA LETRA H
        certoErrado("7");
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        // BOTÃO DA LETRA I
        certoErrado("8");
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        // BOTÃO DA LETRA J
        certoErrado("9");
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        // BOTÃO DA LETRA K
        certoErrado("10");
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        // BOTÃO DA LETRA L
        certoErrado("11");
    }//GEN-LAST:event_btnLActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        // BOTÃO DA LETRA M
        certoErrado("12");
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        // BOTÃO DA LETRA N
        certoErrado("13");
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        // BOTÃO DA LETRA O
        certoErrado("14");
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        // BOTÃO DA LETRA P
        certoErrado("15");
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        // BOTÃO DA LETRA Q
        certoErrado("16");
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        // BOTÃO DA LETRA R
        certoErrado("17");
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        // BOTÃO DA LETRA S
        certoErrado("18");
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        // BOTÃO DA LETRA T
        certoErrado("19");
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        // BOTÃO DA LETRA U
        certoErrado("20");
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        // BOTÃO DA LETRA V
        certoErrado("21");
    }//GEN-LAST:event_btnVActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        // BOTÃO DA LETRA X
        certoErrado("23");
    }//GEN-LAST:event_btnXActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        // BOTÃO DA LETRA W
        certoErrado("22");
    }//GEN-LAST:event_btnWActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        // BOTÃO DA LETRA Y
        certoErrado("24");
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        // BOTÃO DA LETRA Z
        certoErrado("25");
    }//GEN-LAST:event_btnZActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpPlacardoJogo;
    private javax.swing.JPanel jpTecladoPortugues;
    private javax.swing.JLabel lblAcerteoAlfabeto;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblEscondePlacar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundoVerde2;
    private javax.swing.JLabel lblFundoVerdeEscuro;
    private javax.swing.JLabel lblImagemBorda;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblMensagemFinal;
    private javax.swing.JLabel lblPlacar;
    private javax.swing.JLabel lblRestam;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalAcertos;
    private javax.swing.JLabel lblTotalErros;
    private javax.swing.JLabel lblTotalLetra;
    private javax.swing.JLabel lblTotalLetra1;
    private javax.swing.JLabel lblVerImagem;
    // End of variables declaration//GEN-END:variables

}
