/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artvalleysystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author hudaalswaidan
 */
public class ShowArtwork extends javax.swing.JFrame {

    String phonenumber;
    public ShowArtwork(String p ) {
        initComponents();
        phonenumber=p;
        fillTable();
        fillTable2();
}
    public void fillTable(){
       paint ob;
        ArrayList<paint> list=new ArrayList();
        try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select pic,artname,price,madeYear,username from paint,artist where artist.phonenumber=paint.phonenumber AND paint.phonenumber='"+phonenumber+"'"))
            
        {
            while(rs.next()){
             ob=new paint(rs.getString("artname"),rs.getInt("madeyear"),rs.getDouble("price"),rs.getBytes("pic"));
            list.add(ob);}
            //String name, int year, double price, String des, byte[] Image
        String[] columnName = {"Picture","Name","Price","Made year"};
        Object[][] rows = new Object[list.size()][5];
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).Image != null){
            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).Image).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
            rows[i][0] = image;
            }
            else
                rows[i][0] = null;
                
            rows[i][1] = list.get(i).name;
            rows[i][2] = list.get(i).price;
            rows[i][3] = list.get(i).year;

        }
        
        TheModel model = new TheModel(rows, columnName);
        jTable1.setModel(model);
        jTable1.setRowHeight(120);
        //set size of table
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(170);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
        //set table header names
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Picture");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Price");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Made year");
        //set left Alignment
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(leftRenderer);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
 
  public void fillTable2(){
             SCULPTURE ob;
        ArrayList<SCULPTURE> list=new ArrayList();
        try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select pic,artname,price,madeYear,username from SCULPTURE,artist where artist.phonenumber=SCULPTURE.phonenumber AND SCULPTURE.phonenumber='"+phonenumber+"'"))
            
        {
            while(rs.next()){
             ob=new SCULPTURE(rs.getString("artname"),rs.getInt("madeyear"),rs.getDouble("price"),rs.getBytes("pic"));
            list.add(ob);}
            //String name, int year, double price, String des, byte[] Image
        String[] columnName = {"Picture","Name","Price","Made year"};
        Object[][] rows = new Object[list.size()][5];
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).Image != null){
            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).Image).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
            rows[i][0] = image;
            }
            else
                rows[i][0] = null;
                
            rows[i][1] = list.get(i).name;
            rows[i][2] = list.get(i).price;
            rows[i][3] = list.get(i).year;

        }
        
        TheModel model = new TheModel(rows, columnName);
        jTable2.setModel(model);
        jTable2.setRowHeight(120);
        //set size of table
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(170);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
        //set table header names
        jTable2.getColumnModel().getColumn(0).setHeaderValue("Picture");
        jTable2.getColumnModel().getColumn(1).setHeaderValue("Name");
        jTable2.getColumnModel().getColumn(2).setHeaderValue("Price");
        jTable2.getColumnModel().getColumn(3).setHeaderValue("Made year");
        //set left Alignment
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(leftRenderer);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        ImageIconLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArtWork");

        jPanel1.setBackground(new java.awt.Color(17, 89, 146));
        jPanel1.setForeground(new java.awt.Color(17, 89, 146));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Yu Gothic", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Picture", "name", "Price", "Artist Username", "Made year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 510, 120));

        jTable2.setFont(new java.awt.Font("Yu Gothic", 0, 13)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Picture", "name", "Price", "Artist Username", "Made year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(true);
        jTable2.setGridColor(new java.awt.Color(102, 102, 102));
        jTable2.setOpaque(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 510, 120));

        jLabel3.setFont(new java.awt.Font("Sukar", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sculpture");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 120, 40));

        jLabel2.setFont(new java.awt.Font("Sukar", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Painting");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 40));

        backButton.setFont(new java.awt.Font("Sukar", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(17, 89, 146));
        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));
        jPanel1.add(ImageIconLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/10.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 290));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ                 ــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 560, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ                ـــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 560, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
           ArtistPage s = new ArtistPage(phonenumber);
           s.pack();
           s.setLocationRelativeTo(null);
           s.setVisible(true); 
           setVisible(false);
           setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int row=jTable1.getSelectedRow();
        String ArtName=jTable1.getModel().getValueAt(row, 1).toString();
        String ArtistUsername=jTable1.getModel().getValueAt(row, 3).toString();
        //new AddArtWork(phonenumber,ArtistUsername,ArtName).setVisible(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         int row=jTable2.getSelectedRow();
        String ArtName=jTable2.getModel().getValueAt(row, 1).toString();
        String ArtistUsername=jTable2.getModel().getValueAt(row, 3).toString();
        //new AddArtWork(phonenumber,ArtistUsername,ArtName).setVisible(true);
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(ShowArtwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowArtwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowArtwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowArtwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               ShowArtwork s = new ShowArtwork("");
                s.pack();
                s.setLocationRelativeTo(null);
                s.setVisible(true);                
            }
        });
    }
    
 class paint {

     String name;
     int year;
     double price;
     String username;
     byte[] Image;

    public paint(String name, int year, double price, byte[] Image) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.Image = Image;
    }
 
}
  class SCULPTURE {

     String name;
     int year;
     double price;
     String username;
     byte[] Image;

    public SCULPTURE(String name, int year, double price, byte[] Image) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.Image = Image;
    }
 
}

 class TheModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;

    
    public TheModel(Object[][] data, String[] columnName){
        this.rows = data;
        this.columns = columnName;
    }
    @Override
    public Class getColumnClass(int column){
        if(column == 0)return Icon.class;
        else {//System.out.println(column+" is "+getValueAt(0,column).getClass());
        return getValueAt(0,column).getClass();}
    }
    @Override
    public int getRowCount() {return this.rows.length;}

    @Override
    public int getColumnCount() {return this.columns.length;}

    @Override
    public Object getValueAt(int i, int i1) {return this.rows[i][i1];}
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageIconLabel1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
