package artvalleysystem;

public class CustomerGui extends javax.swing.JFrame {
    String phonenumber;
    public CustomerGui(String phonenumber) {
        this.phonenumber=phonenumber;
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Frame = new javax.swing.JTabbedPane();
        HomeTab = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProfileTab = new javax.swing.JScrollPane();
        ProfilePanel = new javax.swing.JPanel();
        InfoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        OrderButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        CartButton = new javax.swing.JButton();
        addressButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/unnamed.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer interface");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 500));

        Frame.setBackground(new java.awt.Color(255, 255, 255));
        Frame.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Frame.setForeground(new java.awt.Color(0, 51, 102));

        HomeTab.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        HomeTab.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Sukar", 1, 30)); // NOI18N
        jButton7.setForeground(new java.awt.Color(17, 89, 146));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/women.png"))); // NOI18N
        jButton7.setText("Scluptures");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 280, 130));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Sukar", 1, 30)); // NOI18N
        jButton8.setForeground(new java.awt.Color(17, 89, 146));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/man.png"))); // NOI18N
        jButton8.setText("Paintings");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 270, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/logoo.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 200, 240));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/12 copy.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/Blueee.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 660));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        HomeTab.setViewportView(jPanel2);

        Frame.addTab("Home Page", HomeTab);

        ProfilePanel.setBackground(new java.awt.Color(255, 255, 255));
        ProfilePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(ProfilePanel);
        ProfilePanel.setLayout(null);

        InfoButton.setBackground(new java.awt.Color(204, 204, 204));
        InfoButton.setFont(new java.awt.Font("Sukar", 1, 26)); // NOI18N
        InfoButton.setForeground(new java.awt.Color(17, 89, 146));
        InfoButton.setText("Personal Information");
        InfoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });
        ProfilePanel.add(InfoButton);
        InfoButton.setBounds(90, 230, 340, 70);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sukar", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome ");
        ProfilePanel.add(jLabel4);
        jLabel4.setBounds(60, 120, 280, 60);

        OrderButton.setBackground(new java.awt.Color(204, 204, 204));
        OrderButton.setFont(new java.awt.Font("Sukar", 1, 26)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(17, 89, 146));
        OrderButton.setText("My Orders");
        OrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        ProfilePanel.add(OrderButton);
        OrderButton.setBounds(90, 390, 340, 70);

        LogoutButton.setBackground(new java.awt.Color(204, 204, 204));
        LogoutButton.setText("Log out");
        LogoutButton.setFont(new java.awt.Font("Sukar", 1, 26));
        LogoutButton.setForeground(new java.awt.Color(17, 89, 146));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        ProfilePanel.add(LogoutButton);
        LogoutButton.setBounds(190, 560, 140, 40);

        CartButton.setBackground(new java.awt.Color(204, 204, 204));
        CartButton.setFont(new java.awt.Font("Sukar", 1, 26)); // NOI18N
        CartButton.setForeground(new java.awt.Color(17, 89, 146));
        CartButton.setText("My Cart");
        CartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartButtonActionPerformed(evt);
            }
        });
        ProfilePanel.add(CartButton);
        CartButton.setBounds(90, 310, 340, 70);

        addressButton.setBackground(new java.awt.Color(204, 204, 204));
        addressButton.setFont(new java.awt.Font("Sukar", 1, 26)); // NOI18N
        addressButton.setForeground(new java.awt.Color(17, 89, 146));
        addressButton.setText("My Saved  Address");
        addressButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressButtonActionPerformed(evt);
            }
        });
        ProfilePanel.add(addressButton);
        addressButton.setBounds(90, 470, 340, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/artback.png"))); // NOI18N
        ProfilePanel.add(jLabel8);
        jLabel8.setBounds(0, 0, 540, 630);

        ProfileTab.setViewportView(ProfilePanel);

        Frame.addTab("Profile", ProfileTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressButtonActionPerformed
        SavedAddress s= new SavedAddress(phonenumber);
        s.phoneNumber=phonenumber;
            s.pack();
            s.setLocationRelativeTo(null);
            s.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_addressButtonActionPerformed

    private void CartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartButtonActionPerformed
        MyCart cc=new MyCart(phonenumber);
        cc.myph=phonenumber;
           cc.pack();
            cc.setLocationRelativeTo(null);
           cc.setVisible(true);
           setVisible(false);
        
    }//GEN-LAST:event_CartButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        SignIn s = new SignIn();
            s.pack();
            s.setLocationRelativeTo(null);
            s.setVisible(true);
            setVisible(false);
       MyCart a= new MyCart(phonenumber);
       a.myph=phonenumber;
       a.logOut();//empty cart
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        MyOrders m= new MyOrders(phonenumber);
        m.phonenumber=phonenumber;
        m.pack();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        AdminInfo c= new AdminInfo(phonenumber, false);
        c.phonenumber=phonenumber;
            c.pack();
            c.setLocationRelativeTo(null);
            c.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_InfoButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Paintings p= new Paintings(phonenumber);
       p.phonenumber=phonenumber;
       p.pack();
       p.setLocationRelativeTo(null);
       p.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Scluptures sc =new Scluptures(phonenumber);
        sc.pack();
        sc.setLocationRelativeTo(null);
        sc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerGui c = new CustomerGui("");
                c.pack();
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CartButton;
    private javax.swing.JTabbedPane Frame;
    private javax.swing.JScrollPane HomeTab;
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JScrollPane ProfileTab;
    private javax.swing.JButton addressButton;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    
}
