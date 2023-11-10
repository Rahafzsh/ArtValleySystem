package artvalleysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




    public class DeleteArtWork extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps ;
    
    public void ConnecrDb(){
        try{
      con = DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
         }
    }
    
   
             String phonenumber;
    public DeleteArtWork(String p) {
        super("Delete Art ");
        initComponents();
        ConnecrDb();
         phonenumber=p;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Type = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RSculpture = new javax.swing.JRadioButton();
        Rpating = new javax.swing.JRadioButton();
        ArtName = new javax.swing.JComboBox<>();

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/16.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/12.png"))); // NOI18N

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(17, 89, 146));
        deleteButton.setText("Delete ArtWork");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sukar", 1, 28)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/Artwork.png"))); // NOI18N
        jLabel7.setText(" Deleting ArtWork");
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        RSculpture.setBackground(new java.awt.Color(255, 255, 255));
        Type.add(RSculpture);
        RSculpture.setText("Sculpture");
        RSculpture.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RSculptureItemStateChanged(evt);
            }
        });

        Rpating.setBackground(new java.awt.Color(255, 255, 255));
        Type.add(Rpating);
        Rpating.setText("Paint");
        Rpating.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RpatingItemStateChanged(evt);
            }
        });

        ArtName.setForeground(new java.awt.Color(17, 89, 146));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(435, 435, 435))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Rpating)
                        .addGap(36, 36, 36)
                        .addComponent(RSculpture))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(deleteButton)
                                .addGap(623, 623, 623)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArtName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rpating)
                            .addComponent(RSculpture))
                        .addGap(18, 18, 18)
                        .addComponent(ArtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(deleteButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void RpatingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RpatingItemStateChanged
        String sql = "SELECT artname FROM PAINT where PHONENUMBER='"+phonenumber+"'";
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            ArtName.removeAllItems();

            while(rs.next())
            ArtName.addItem(rs.getString(1));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());}
        finally{
            try {
            rs.close();
            st.close();
            }
            catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_RpatingItemStateChanged

    private void RSculptureItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RSculptureItemStateChanged
        try {
            ArtName.removeAllItems();
            st = con.createStatement();
            String sql ="SELECT artname FROM SCULPTURE where PHONENUMBER='"+phonenumber+"'";
            rs = st.executeQuery(sql);
            while(rs.next())
            ArtName.addItem(rs.getString(1));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());}
        finally{
            try {
            rs.close();
            st.close();
            }
            catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_RSculptureItemStateChanged

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            ConnecrDb();
            int ans =JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected Artwork?","Deleting Artwork",JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION){
                if(RSculpture.isSelected()){
                    String sql = "DELETE FROM SCULPTURE WHERE ARTNAME=? AND PHONENUMBER='"+phonenumber+"'";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,ArtName.getItemAt(ArtName.getSelectedIndex()));
                    int i=ps.executeUpdate();
                    if(i==1)
                    JOptionPane.showMessageDialog(this, "Artwork has been deleted..");
                    else{
                        JOptionPane.showMessageDialog(this, "Artwork has NOT been deleted..");}
                }

                if(Rpating.isSelected()){
                    String sql = "DELETE FROM PAINT WHERE ARTNAME=? AND PHONENUMBER='"+phonenumber+"'";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,ArtName.getItemAt(ArtName.getSelectedIndex()));
                    int i=ps.executeUpdate();
                    if(i==1)
                    JOptionPane.showMessageDialog(this, "Artwork has been deleted..");
                    else{
                        JOptionPane.showMessageDialog(this, "Artwork has NOT been deleted..");}
                }
            }

        } 
        
        catch(SQLException ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
        catch(Exception ex){ JOptionPane.showMessageDialog(null, ex.getMessage());}
        
        finally{
            try {
            rs.close();
            st.close();
            }
            catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
           ArtistPage a = new ArtistPage(phonenumber);
            a.pack();
            a.setLocationRelativeTo(null);
            a.setVisible(true);
            setVisible(false);
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
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
            java.util.logging.Logger.getLogger(DeleteArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteArtWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          DeleteArtWork d = new DeleteArtWork("");
                d.pack();
                d.setLocationRelativeTo(null);
                d.setVisible(true); 
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ArtName;
    private javax.swing.JRadioButton RSculpture;
    private javax.swing.JRadioButton Rpating;
    private javax.swing.ButtonGroup Type;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
   
}
