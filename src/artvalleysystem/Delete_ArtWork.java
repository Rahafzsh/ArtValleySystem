/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artvalleysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author hudaalswaidan
 */
public class Delete_ArtWork extends javax.swing.JFrame {
 Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps ;
    
    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/Artvalley";
    private static final String USERNAME = "art";
    private static final String PASSWORD = "art";
    
    Connection ConnecrDb(){
        try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD );
      
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
         }
        return null;
    }
   
             String phonenumber;
    public Delete_ArtWork(String p) {
        initComponents();
        ConnecrDb();
        Table();
         phonenumber=p;

    }
    
    
private void Table(){
   
 try{
       if(RSculpture.isSelected()){
    String sql ="SELECT * from SCULPTURE where PHONENUMBER=? ";
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));}
       
       else if (Rpating.isSelected()){
           String sql = "SELECT * from PAINT where PHONENUMBER=?";
           ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));}
         
       
    }catch(SQLException ex){       
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
        }
         catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
         }
        
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RSculpture = new javax.swing.JRadioButton();
        Rpating = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 89, 146), 2, true));

        backButton.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(17, 89, 146));
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 89, 146));
        jLabel1.setText("Enter the name of the art you want to delete:");

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/16.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/12.png"))); // NOI18N

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Sukar", 1, 20)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(17, 89, 146));
        deleteButton.setText("Delete ArtWork");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton1.setBackground(new java.awt.Color(204, 204, 204));
        exitButton1.setFont(new java.awt.Font("Sukar", 1, 20)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(17, 89, 146));
        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sukar", 1, 28)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/Artwork.png"))); // NOI18N
        jLabel7.setText(" Deleting ArtWork");
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        RSculpture.setBackground(new java.awt.Color(255, 255, 255));
        RSculpture.setText("Sculpture");
        RSculpture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSculptureActionPerformed(evt);
            }
        });

        Rpating.setBackground(new java.awt.Color(255, 255, 255));
        Rpating.setText("Paint");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(435, 435, 435))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(Rpating)
                                .addGap(46, 46, 46)
                                .addComponent(RSculpture))
                            .addComponent(jLabel5))
                        .addGap(485, 485, 485)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RSculpture)
                            .addComponent(Rpating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton1)
                            .addComponent(deleteButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RpatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpatingActionPerformed
        // TODO add your handling code here:
        ButtonGroup group = new ButtonGroup();
        group.add(Rpating);
        group.add(RSculpture);
    }//GEN-LAST:event_RpatingActionPerformed

    private void RpatingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RpatingItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RpatingItemStateChanged

    private void RSculptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSculptureActionPerformed
        // TODO add your handling code here:
        ButtonGroup group = new ButtonGroup();
        group.add(Rpating);
        group.add(RSculpture);
    }//GEN-LAST:event_RSculptureActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    try{
            ConnecrDb();
            rs = ps.executeQuery();
            int ans =
            JOptionPane.showConfirmDialog(Delete_ArtWork.this, "Are you sure you want to"
                + " delete the selected Artwork?","Deleting Artwork",JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION){
                if(RSculpture.isSelected()){
                    String sql = "DELETE FROM SCULPTURE WHERE ARTNAMES=?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,jTextField1.getText());
                    int i=ps.executeUpdate();
                    if(i==1)
                    JOptionPane.showMessageDialog(Delete_ArtWork.this, "Artwork has been deleted..");
                }}
                else{
                    JOptionPane.showMessageDialog(Delete_ArtWork.this, "Artwork has NOT deleted..");}

                if(Rpating.isSelected()){
                    String sql = "DELETE FROM PAINT WHERE ARTNAMES=?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,jTextField1.getText());
                    int i=ps.executeUpdate();
                    if(i==1)
                    JOptionPane.showMessageDialog(Delete_ArtWork.this, "Artwork has been deleted..");
                }
                else{
                    JOptionPane.showMessageDialog(Delete_ArtWork.this, "Artwork has NOT deleted..");}

            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println("");

            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
                ex.printStackTrace();

            }
          Table();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if(evt.getSource()==backButton){
            new ArtistPage(phonenumber).setVisible(true);
            setVisible(false);
        }
        
    }//GEN-LAST:event_backButtonActionPerformed
    
    
 
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
            java.util.logging.Logger.getLogger(Delete_ArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_ArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_ArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_ArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          //  new Delete_ArtWork().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RSculpture;
    private javax.swing.JRadioButton Rpating;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
   
}
