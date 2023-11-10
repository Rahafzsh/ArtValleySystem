package artvalleysystem;

import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("^\\s*\\d{10}");
    public static final Pattern VALID_PASSWORD =Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$*%^&+=])(?=\\S+$).{8,20}$");
    public SignUp() {
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

        signUpType = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        custRadio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        userName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");

        jPanel1.setBackground(new java.awt.Color(17, 89, 146));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameField.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 254, -1));

        jLabel2.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Email.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 254, -1));

        pass.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 254, -1));

        jLabel5.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 254, -1));

        jLabel6.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birth date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        signUpType.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Artist");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                custRadioItemStateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        custRadio.setBackground(new java.awt.Color(255, 255, 255));
        signUpType.add(custRadio);
        custRadio.setForeground(new java.awt.Color(255, 255, 255));
        custRadio.setSelected(true);
        custRadio.setText("Customer");
        custRadio.setOpaque(false);
        custRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                custRadioItemStateChanged(evt);
            }
        });
        jPanel1.add(custRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel7.setText("Street:");
        jLabel7.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jLabel8.setText("City:");
        jLabel8.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jTextField1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 250, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Riyadh\t", "Zulfi\t", "Makkah\t", "Madinah\t", "Jeddah\t", "Taif\t", "Yunbu\t", "Dammam\t", "Ras Tanura\t", "Jubail Industrial City\t", "Khobar\t", "Dhahran\t", "Hafr Al-Batin\t", "Badr\t", "Tabuk\t", "Amlaj\t", "Wadi as Surr\t", "Buraidah\t", "Unaizah\t", "Ha'il\t", "Abha\t", "Al Bahah\t", "Khamis Mmushait\t", "Najran\t", "Sakaka\t", "Turaif\t", "Rafha\t", "Al Qurayyar\t", "Al Qurayyat\t", "Jizan\t", "Aaar\t", "Jubai\t", "Hail\t", "Rabigh\t", "Taif\t", "Bahah\t", "Hofuf\t", "Dhahran\t", "Tayma\t", "Yanbu\t", "Haradh" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setForeground(new java.awt.Color(0, 51, 153));
        jComboBox1.setOpaque(false);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CityItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 250, -1));

        jButton1.setText("SignUp");
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sukar", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, 30));

        jLabel9.setText("ZIP code:");
        jLabel9.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11564", "15941", "24230", "20012", "21577", "26513", "30799", "32241", "32816", "35541", "34424", "34464", "39923", "46357", "47711", "48313", "49549", "51431", "51911", "55425", "61321", "65525", "61961", "61441", "75471", "75311", "76321", "77425", "77451", "88723", "73311", "35412", "55211", "25725", "26312", "65511", "36362", "32225", "45511", "46424", "36699" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setEnabled(false);
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 250, -1));

        jLabel11.setText("Additinal number:");
        jLabel11.setFont(new java.awt.Font("Sukar", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        jTextField2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/rows.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 70, 170, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/sign.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 184, 210));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/rows.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 174, -1));

        datePicker1.setOpaque(false);
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        userName.setEditable(false);
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 250, -1));

        jLabel13.setText("Artist Username:");
        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 20));

        jButton2.setText("Exit");
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(17, 89, 146));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_custRadioItemStateChanged
      if(custRadio.isSelected())
        {jTextField1.setEditable(true);
        jComboBox1.setEnabled(true);
        jTextField2.setEditable(true);
        userName.setEditable(false);
        userName.setText("");}
      else
        {jTextField1.setEditable(false); 
        jComboBox1.setEnabled(false);
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
        jTextField2.setEditable(false); 
        jTextField2.setText("");
        userName.setEditable(true);}
    }//GEN-LAST:event_custRadioItemStateChanged

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        String msg="";
        boolean f=true,cust=(jTextField1.getText().equals("")||jComboBox1.getSelectedIndex()==-1);
            if(Email.getText().equals("")||phone.getText().equals("")||NameField.getText().equals("")||pass.getPassword().length==0)//check calender
                {msg="you must fill every thing"; f=false;}
            else if(custRadio.isSelected()&&cust)
                {msg="customers must fill thier address"; f=false;}
            else if(!VALID_EMAIL_ADDRESS_REGEX.matcher(Email.getText()).find())
                {msg="Inavlid Email"; f=false;}
            else if(!VALID_PHONE_NUMBER.matcher(phone.getText()).find())
                {msg="phone number must be 10 digits"; f=false;}
            else if(!VALID_PASSWORD.matcher(String.valueOf(pass.getPassword())).find())
                {msg=String.valueOf(pass.getPassword())+"\npassword must be: \n1-8-20 charecter\n2-at least one digit\n3-at least one upper case letter\n4-at least one lower case letter\n5-at least one special charecter\n6-without whitespace "; f=false;}
 
        if(!f)        
           JOptionPane.showMessageDialog(null, msg,"SignUp" ,JOptionPane.ERROR_MESSAGE );
        else 
        {
        try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art"))
        {PreparedStatement pst;
        int i;
         if(custRadio.isSelected())
         {pst=con.prepareStatement("INSERT INTO CUSTOMER(NAME,PHONENUMBER,PASS,EMAIL,BDATE,CITY,ZIPCODE,ADDNUM, STREET) VALUES (?,?,?,?,?,?,?,?,?)");
         pst.setString(1, NameField.getText());
         pst.setString(2, phone.getText());
         pst.setString(3, encrypt(pass.getText()));
         pst.setString(4, Email.getText());
         pst.setDate(5, java.sql.Date.valueOf(datePicker1.getDate()));
         pst.setString(6,jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
         pst.setString(7,jComboBox2.getItemAt(jComboBox1.getSelectedIndex()));
         pst.setInt(8, Integer.parseInt(jTextField2.getText()));
         pst.setString(9,jTextField1.getText());
         i=pst.executeUpdate();
         }
         else
         { 
         pst=con.prepareStatement("INSERT INTO ARTIST(NAME,PHONENUMBER,PASS,EMAIL,BDATE,USERNAME) VALUES (?,?,?,?,?,?)");
         pst.setString(1, NameField.getText());
         pst.setString(2, phone.getText());
         pst.setString(3, encrypt(pass.getText()));
         pst.setString(4, Email.getText());
         pst.setDate(5, java.sql.Date.valueOf(datePicker1.getDate()));
         pst.setString(6, userName.getText());
         i=pst.executeUpdate();
         }
         if(i==1)
         {JOptionPane.showMessageDialog(null,"Welcome "+NameField.getText(),"SignUp" ,JOptionPane.PLAIN_MESSAGE);
         if(custRadio.isSelected())
         {CustomerGui c=new CustomerGui(phone.getText());
          c.pack();
          c.setLocationRelativeTo(null);
          c.setVisible(true);
         setVisible(false);}
         else
          {ArtistPage r =new ArtistPage(phone.getText());
            r.pack();
            r.setLocationRelativeTo(null);
            r.setVisible(true);
          setVisible(false);}   
         }   
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage(),"SignUp" ,JOptionPane.ERROR_MESSAGE );}//
        catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Additinal number must be integer","SignUp" ,JOptionPane.ERROR_MESSAGE );}
        catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(),"SignUp" ,JOptionPane.ERROR_MESSAGE );}
        }
    }//GEN-LAST:event_signUpActionPerformed
 public  String encrypt(String s1) {
  StringBuffer sb=new StringBuffer();
  for(int i=0;i<s1.length();i++){
   char c=s1.charAt(i);
   if(i%2==0){
    if(c==122)// if z make it a
     c=(char) 97;
    else{
     c=(char) (c+1);}}
   else{
    if(c==97)
     c=(char) 122;
    else
     c=(char) (c-1);}

sb.append(c);}
return sb.toString();
}  
    private void CityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CityItemStateChanged
        jComboBox2.setSelectedIndex(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_CityItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new SignIn().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

                                        

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             SignUp a = new SignUp(); 
             a.pack();
             a.setLocationRelativeTo(null);
             a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField NameField;
    private javax.swing.JRadioButton custRadio;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phone;
    private javax.swing.ButtonGroup signUpType;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}