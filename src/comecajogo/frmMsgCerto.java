/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comecajogo;

/**
 *
 * @author DANIEL_VE160
 */
public class frmMsgCerto extends javax.swing.JDialog {

    /**
     * Creates new form frmMsgCerta
     */
    public frmMsgCerto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);//desabilita o botão fechar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblChance3 = new javax.swing.JLabel();
        lblChance2 = new javax.swing.JLabel();
        lblChance1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Próximo");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 10, 100, 30);

        lblChance3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblChance3.setForeground(new java.awt.Color(0, 204, 255));
        lblChance3.setText("3");
        getContentPane().add(lblChance3);
        lblChance3.setBounds(170, 150, 40, 50);

        lblChance2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblChance2.setForeground(new java.awt.Color(0, 204, 255));
        lblChance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChance2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblChance2);
        lblChance2.setBounds(240, 150, 50, 50);

        lblChance1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblChance1.setForeground(new java.awt.Color(0, 204, 255));
        lblChance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChance1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblChance1);
        lblChance1.setBounds(310, 100, 40, 40);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/msgCerto.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 343, 211);

        setSize(new java.awt.Dimension(346, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel lblChance1;
    public javax.swing.JLabel lblChance2;
    public javax.swing.JLabel lblChance3;
    public javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables
}
