/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.leecottrell.swinghello;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class payroll extends javax.swing.JFrame {

    /**
     * Creates new form payroll
     */
    public payroll() {
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

        payLabel = new javax.swing.JLabel();
        payField = new javax.swing.JTextField();
        hoursLabel = new javax.swing.JLabel();
        hoursField = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        grossPayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        payLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payLabel.setText("Pay rate");

        payField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        hoursLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hoursLabel.setText("Hours");

        hoursField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hoursField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursFieldActionPerformed(evt);
            }
        });

        calcButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gross Pay");

        grossPayLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        grossPayLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calcButton)
                        .addGap(53, 53, 53)
                        .addComponent(clearButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                            .addComponent(hoursField))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grossPayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grossPayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payField))
                .addGap(11, 11, 11)
                .addComponent(hoursLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton)
                    .addComponent(clearButton))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        // TODO add your handling code here:
        /*
            strip data from the form    input
            do something with the data  processing
            display the output          output
         */

        //strip data from the form
        double rate = 15;
        double hours = 40;
        double grossPay = 0;
        //???
        //strip
        try {
            rate = Double.parseDouble(this.payField.getText());
        } catch (NumberFormatException nex) {
            JOptionPane.showMessageDialog(this, "Rate field must be an number",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.payField.selectAll();
            this.payField.requestFocus();
            return;//stop the function from running
        }
        try {
            hours = Double.parseDouble(this.hoursField.getText());
        } catch (NumberFormatException nex) {
            JOptionPane.showMessageDialog(this, "Hours field must be an number",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.hoursField.selectAll();
            this.hoursField.requestFocus();
            return;//stop the function from running
        }
        
        if(rate <= 0  ){
            JOptionPane.showMessageDialog(this, "Rate field must be larger than 0, you entered " + rate,
                    "Error", JOptionPane.ERROR_MESSAGE);
            //this.payField.setText("");
            this.payField.selectAll();
            this.payField.requestFocus();
            return;//stop the function from running
        }
        
         if(hours <= 0  ){
            JOptionPane.showMessageDialog(this, "Hours field must be larger than 0",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.hoursField.selectAll();
            this.hoursField.requestFocus();
            return;//stop the function from running
        }

        //do the math
        grossPay = rate * hours;

        //output
        this.grossPayLabel.setText("$" + grossPay);

    }//GEN-LAST:event_calcButtonActionPerformed

    private void hoursFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        //change the contents of the text fields and the output - done
        //put the cursor back into the first text field

        this.payField.setText("");
        this.hoursField.setText("");
        this.grossPayLabel.setText("$0.00");
        this.payField.requestFocus();
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel grossPayLabel;
    private javax.swing.JTextField hoursField;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField payField;
    private javax.swing.JLabel payLabel;
    // End of variables declaration//GEN-END:variables
}
