/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artvalleysystem;

/**
 *
 * @author hudaalswaidan
 */
public class UpdateArtWork extends javax.swing.JFrame {

    /**
     * Creates new form AdminInfo
     */
    String phone;
    public UpdateArtWork(String p) {
        phone=p;
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

        exitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        exitButton1 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        Rpating = new javax.swing.JRadioButton();
        Rpating1 = new javax.swing.JRadioButton();
        Rpating2 = new javax.swing.JRadioButton();
        Rpating3 = new javax.swing.JRadioButton();
        Rpating4 = new javax.swing.JRadioButton();
        Rpating5 = new javax.swing.JRadioButton();
        jSculpture = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        exitButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Artwork");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 89, 146), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 89, 146));
        jLabel4.setText("Art id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 60, 27));

        jTextField1.setText("Enter art id here");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 302, 34));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 160, 200));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 89, 146));
        jLabel2.setText("Price:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 60, 27));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 89, 146));
        jLabel5.setText("Type of art: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 90, 27));

        jTextField2.setText("Enter price here");
        jTextField2.setMinimumSize(new java.awt.Dimension(10, 34));
        jTextField2.setPreferredSize(new java.awt.Dimension(80, 34));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 302, -1));

        exitButton1.setBackground(new java.awt.Color(204, 204, 204));
        exitButton1.setFont(new java.awt.Font("Sukar", 1, 20)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(17, 89, 146));
        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 101, 44));

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setFont(new java.awt.Font("Sukar", 1, 20)); // NOI18N
        saveButton.setForeground(new java.awt.Color(17, 89, 146));
        saveButton.setText("Save");
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 101, 44));

        jLabel7.setFont(new java.awt.Font("Sukar", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Update Artwork");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        backButton.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(17, 89, 146));
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/12.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 54));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 89, 146));
        jLabel10.setText("Description:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, 27));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Describe your artwork");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 500, 300, -1));

        jTextField4.setText("Enter year of art here");
        jTextField4.setMinimumSize(new java.awt.Dimension(10, 34));
        jTextField4.setPreferredSize(new java.awt.Dimension(80, 34));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 302, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 89, 146));
        jLabel15.setText("Art name:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, 27));

        jTextField7.setText("Enter art name to update");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 302, 34));

        Rpating.setText("ID");
        Rpating.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RpatingItemStateChanged(evt);
            }
        });
        Rpating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpatingActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        Rpating1.setText("Type");
        Rpating1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Rpating1ItemStateChanged(evt);
            }
        });
        Rpating1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rpating1ActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        Rpating2.setText("Price");
        Rpating2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Rpating2ItemStateChanged(evt);
            }
        });
        Rpating2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rpating2ActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        Rpating3.setText("Description");
        Rpating3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Rpating3ItemStateChanged(evt);
            }
        });
        Rpating3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rpating3ActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 130, -1));

        Rpating4.setText("Year");
        Rpating4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Rpating4ItemStateChanged(evt);
            }
        });
        Rpating4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rpating4ActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, -1));

        Rpating5.setText("Paint");
        Rpating5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Rpating5ItemStateChanged(evt);
            }
        });
        Rpating5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rpating5ActionPerformed(evt);
            }
        });
        jPanel1.add(Rpating5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        jSculpture.setText("Sculpture");
        jSculpture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSculptureActionPerformed(evt);
            }
        });
        jPanel1.add(jSculpture, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 89, 146));
        jLabel9.setText("Year:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 60, 27));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if(evt.getSource()==backButton){
            new ArtistPage(phone).setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void RpatingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RpatingItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_RpatingItemStateChanged

    private void RpatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpatingActionPerformed

    private void Rpating1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Rpating1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating1ItemStateChanged

    private void Rpating1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rpating1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating1ActionPerformed

    private void Rpating2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Rpating2ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_Rpating2ItemStateChanged

    private void Rpating2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rpating2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating2ActionPerformed

    private void Rpating3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Rpating3ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_Rpating3ItemStateChanged

    private void Rpating3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rpating3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating3ActionPerformed

    private void Rpating4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Rpating4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating4ItemStateChanged

    private void Rpating4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rpating4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating4ActionPerformed

    private void Rpating5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Rpating5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating5ItemStateChanged

    private void Rpating5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rpating5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rpating5ActionPerformed

    private void jSculptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSculptureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSculptureActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new UpdateArtWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rpating;
    private javax.swing.JRadioButton Rpating1;
    private javax.swing.JRadioButton Rpating2;
    private javax.swing.JRadioButton Rpating3;
    private javax.swing.JRadioButton Rpating4;
    private javax.swing.JRadioButton Rpating5;
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jSculpture;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
