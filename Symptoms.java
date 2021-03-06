/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emayn
 */
public class Symptoms extends javax.swing.JFrame {

    /**
     * Creates new form Symptoms
     */
    public Symptoms() {
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

        jLabel1 = new javax.swing.JLabel();
        Cough = new javax.swing.JCheckBox();
        SOB = new javax.swing.JCheckBox();
        SoreThroat = new javax.swing.JCheckBox();
        Fever = new javax.swing.JCheckBox();
        Nausea = new javax.swing.JCheckBox();
        NoSympt = new javax.swing.JCheckBox();
        StartDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Symptoms:");

        Cough.setText("Cough");
        Cough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoughActionPerformed(evt);
            }
        });

        SOB.setText("Shortness of Breath");
        SOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOBActionPerformed(evt);
            }
        });

        SoreThroat.setText("Sore Throat");
        SoreThroat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoreThroatActionPerformed(evt);
            }
        });

        Fever.setText("Fever");
        Fever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeverActionPerformed(evt);
            }
        });

        Nausea.setText("Nausea");
        Nausea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NauseaActionPerformed(evt);
            }
        });

        NoSympt.setText("No Symptoms");
        NoSympt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoSymptActionPerformed(evt);
            }
        });

        StartDate.setToolTipText("Enter symptoms start date");
        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cough)
                            .addComponent(Fever))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nausea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SOB)
                                .addGap(18, 18, 18)
                                .addComponent(SoreThroat))))
                    .addComponent(NoSympt))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cough)
                    .addComponent(SOB)
                    .addComponent(SoreThroat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fever)
                    .addComponent(Nausea)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(NoSympt)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoughActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoughActionPerformed

    private void SOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SOBActionPerformed

    private void SoreThroatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoreThroatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoreThroatActionPerformed

    private void FeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeverActionPerformed

    private void NauseaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NauseaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NauseaActionPerformed

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void NoSymptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoSymptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoSymptActionPerformed

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
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Symptoms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Symptoms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cough;
    private javax.swing.JCheckBox Fever;
    private javax.swing.JCheckBox Nausea;
    private javax.swing.JCheckBox NoSympt;
    private javax.swing.JCheckBox SOB;
    private javax.swing.JCheckBox SoreThroat;
    private javax.swing.JTextField StartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
