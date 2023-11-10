
package artvalleysystem;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MyCart extends javax.swing.JFrame  {
String myph;
public static Customer cust= new Customer(); 
public static ArrayList<String > artistPhoneNumbers= new ArrayList<>();
public static ArrayList<ImageIcon>images = new ArrayList<>();
public static ArrayList<Integer> limit = new ArrayList<>();
public static int size=0;
public static JPanel[] panels; 
public static JLabel[]Itemspic;
public static JTextArea[] details;


    public boolean AddArt(String artname, String ArtistUsername, int amount, boolean isPaint){
        boolean added=false;
        String query;
       if(isPaint){
          query=  "SELECT * FROM PAINT, artist WHERE username='"+ArtistUsername+"' and ARTNAME ='"+artname+"' and PAINT.phonenumber=artist.phonenumber";
        }else {
        query= "SELECT * FROM SCULPTURE ,artist WHERE username='"+ArtistUsername+"' and ARTNAME ='"+artname+"' and SCULPTURE.phonenumber=artist.phonenumber";
        }
       try(Connection c= DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
           Statement st= c.createStatement();
           ResultSet r=st.executeQuery(query)){
 
       while(r.next()){//take art from DB to cart 
         byte[] img = r.getBytes("pic");
         ImageIcon image = new ImageIcon(img);
         Image im = image.getImage();
         Image myImg = im.getScaledInstance(150, 150,Image.SCALE_SMOOTH);
         ImageIcon newImage= new ImageIcon(myImg);
         images.add(newImage);
         limit.add(r.getInt("QUANTITY") );   
         if(isPaint){
           if(!checkForDuplicate(r.getString("ARTNAME"),r.getString("PHONENUMBER"))){//check for duplicate
             cust.myCart.addArt(new Paint(r.getString("ARTNAME"), amount, r.getDouble("PRICE"), r.getInt("MADEYEAR"), r.getString("DESCRIPTION"), r.getString("COLORTYPE"), r.getInt("WIDTH"), r.getInt("HIEGHT")));
             artistPhoneNumbers.add(r.getString("PHONENUMBER"));}
           else//deuplicate
            {images.remove(images.size()-1);
            throw new Exception("the art already in your cart");} 
           }
          else {//it sculpture
             if(!checkForDuplicate(r.getString("ARTNAME"),r.getString("PHONENUMBER")))//check for duplicate
              { cust.myCart.addArt(new Sculpture(r.getString("ARTNAME"),amount, r.getDouble("PRICE"), r.getInt("MADEYEAR"), r.getString("DESCRIPTION"), r.getString("MATERIAL")));  
              artistPhoneNumbers.add(r.getString("PHONENUMBER"));}
             else//duplicate
              {images.remove(images.size()-1);
             throw new Exception("the art already in your cart");
              }
             }
       added=true;
        } 
       }
       catch(SQLException sql){JOptionPane.showMessageDialog(null, sql.getMessage());}
       catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
 return added;
    }
    private boolean checkForDuplicate(String artName,String artistPhoneNumber)
    {
        for(int i=0;i<cust.myCart.artCart.size();i++)
            if(cust.myCart.artCart.get(i).name.equals(artName)&&artistPhoneNumbers.get(i).equals(artistPhoneNumber))
             return true;
        return false;
    }

    public MyCart(String ph){
        super("My Cart");
       this.myph=ph;
       
    initComponents();
    }
private void displaycart(JPanel panel){
    JLabel empty;
    Box boxy= Box.createVerticalBox();
    size=cust.myCart.artCart.size();
    panels=new JPanel[size];
    Itemspic=new JLabel[size];
    details=new JTextArea[size];

    if(!cust.myCart.artCart.isEmpty()){
        for (int i = 0; i < cust.myCart.artCart.size(); i++) {
            panels[i]=new JPanel(new GridLayout(1,4,0,0));
           Itemspic[i]= new JLabel();
           Itemspic[i].setIcon(images.get(i));
           details[i]=new JTextArea(cust.myCart.artCart.get(i).toString());
           details[i].setEditable(false);
           panels[i].add(Itemspic[i]);
           panels[i].add(details[i]);       
        }
        
        handler h=new handler();
        for (int i = 0; i < size; i++)//mouse clicked adapter
            Itemspic[i].addMouseListener(h);
        
        for (int i = 0; i < size; i++) 
            boxy.add(panels[i]);
    }
    else{
     empty=new JLabel("Your cart is empty!");
     empty.setFont(new java.awt.Font("Sukar", 0, 18));
     empty.setForeground(new java.awt.Color(0, 51, 102));
     boxy.add(empty);
     }
    calculatePrice();
    panel.add(boxy);

}
 void logOut(){//if customer log out then we make the cart empty
 if(!cust.myCart.artCart.isEmpty()){
cust.myCart.artCart.clear();
size=0;
limit.clear();
images.clear();}
 }
class handler extends MouseAdapter{
    
 @Override
 public void mouseClicked(MouseEvent evt){
     int ins=JOptionPane.showConfirmDialog(null, "Do you want to delete this item?", "Delete", JOptionPane.YES_NO_OPTION,  JOptionPane.PLAIN_MESSAGE);
     if(ins==JOptionPane.YES_OPTION)
     {for(int i = 0; i < Itemspic.length; i++){
            if(Itemspic[i] == evt.getSource()){
                // shifting labels with pics & text areas
                for(int j = i; j < Itemspic.length - 1; j++){
                    Itemspic[j] = Itemspic[j+1];
                    details[j]=details[j+1];
                }
                cust.myCart.artCart.remove(i);
                images.remove(i);
                break;
            }
        }
     //refresh the panel
     itemspanel.removeAll();
     itemspanel.revalidate();
     itemspanel.repaint();
     displaycart(itemspanel);
     }
 }
}
private void calculatePrice(){
        double price=0;
        for (int i = 0; i < cust.myCart.artCart.size(); i++) {
            price+=cust.myCart.artCart.get(i).Quantity*cust.myCart.artCart.get(i).getPrice();  
        }
        totallabel.setText(price+"SR");
        totallabel.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CartTab = new javax.swing.JScrollPane();
        CartPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        totallabel = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemspanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CartTab.setAutoscrolls(true);

        CartPanel.setBackground(new java.awt.Color(255, 255, 255));
        CartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sukar", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Price :");
        CartPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        totallabel.setFont(new java.awt.Font("Sukar", 0, 24)); // NOI18N
        totallabel.setForeground(new java.awt.Color(255, 255, 255));
        totallabel.setText(" SR");
        CartPanel.add(totallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Sukar", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 51, 102));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/dustbin.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        CartPanel.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 60));

        checkout.setBackground(new java.awt.Color(255, 255, 255));
        checkout.setFont(new java.awt.Font("Sukar", 1, 24)); // NOI18N
        checkout.setForeground(new java.awt.Color(0, 51, 102));
        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/order.png"))); // NOI18N
        checkout.setText("Check Out");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        CartPanel.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 210, 60));

        jLabel3.setFont(new java.awt.Font("Sukar", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ــــــــــــــــــــــــــــــــــــــــــــ My Cart ـــــــــــــ");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CartPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        itemspanel.setAutoscrolls(true);
        itemspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itemspanel.setLayout(new java.awt.GridBagLayout());
        displaycart(itemspanel);
        jScrollPane1.setViewportView(itemspanel);
        itemspanel.getAccessibleContext().setAccessibleParent(jScrollPane1);

        CartPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 490, 330));

        jButton1.setText("< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CartPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 130, 50));
        jButton1.getAccessibleContext().setAccessibleParent(itemspanel);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artvalleysystem/blueback.png"))); // NOI18N
        CartPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 560, 710));

        CartTab.setViewportView(CartPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CartTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CartTab, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
       Date today= new Date(Calendar.getInstance().getTime().getTime());
       Bill bill=new Bill(cust.myCart.artCart);
       int i;
       if(!cust.myCart.artCart.isEmpty()){
          try(Connection c= DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
              PreparedStatement p=c.prepareStatement("INSERT INTO TORDER ( PHONENUMBER, QUANTITY, PRICE, ORDERDATE) VALUES ( ? ,? , ? , ?)")
             )
            {p.setString(1, myph);
            p.setInt(2, bill.getQuantity());
            p.setDouble(3, bill.getPrice());
            p.setDate(4, today);
            i=p.executeUpdate();
            if(i==1){
               JOptionPane.showMessageDialog(this, bill.toString()+" is added sucessfully ","Check out",JOptionPane.INFORMATION_MESSAGE );
               updateDB();}
            else
               JOptionPane.showMessageDialog(this, "an error happened \n sorry "+bill.toString()+" is not added try again please","AddArtwork ",JOptionPane.ERROR );       
        
          }
          catch(SQLException sql){
              JOptionPane.showMessageDialog(null, sql.getMessage());
          
          }
       }
       else{
        JOptionPane.showMessageDialog(null, "Sorry, your cart empty. you cannot check out");}
    
    }//GEN-LAST:event_checkoutActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

    if(!cust.myCart.artCart.isEmpty()){
     cust.myCart.artCart.clear();
     size=0;
     limit.clear();
     images.clear();
     itemspanel.removeAll();
     itemspanel.revalidate();
     itemspanel.repaint();
     displaycart(itemspanel);
     }
    else{
      JOptionPane.showMessageDialog(null, "Your Cart already empty");}
        
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerGui c= new CustomerGui(myph);
        c.pack();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // MyCart c = new MyCart(myph);
               // c.pack();
                // c.setLocationRelativeTo(null);
                //c.setVisible(true);
            }
        });
    }
    private void updateDB(){
    int billID=-1;
    Statement s;
    ResultSet rs;
    String sql="";

        for (int i = 0; i < cust.myCart.artCart.size(); i++) {
            if(cust.myCart.artCart.get(i) instanceof Paint)
            sql="update paint set quantity=? where artname='"+cust.myCart.artCart.get(i).name+"' and phonenumber='"+artistPhoneNumbers.get(i)+"'";

            else if(cust.myCart.artCart.get(i) instanceof Sculpture)
            sql="update Sculpture set quantity=? where artname='"+cust.myCart.artCart.get(i).name+"' and phonenumber='"+artistPhoneNumbers.get(i)+"'";
            
            try(Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sampleForArtvalley","art","art");
                PreparedStatement pst=con.prepareStatement(sql);//to reduce quantity
                PreparedStatement pre=con.prepareStatement("insert into orderart (custphonenumber,id,artistphonenumber,artname,qunatity) values (?,?,?,?,?)")//regidter each art on order art
                ){
                pst.setInt(1, limit.get(i)-cust.myCart.artCart.get(i).Quantity);
                int r=pst.executeUpdate();
                if(r==1)//quantity reduced
                {
                 s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                 rs=s.executeQuery("select ID from torder");//get auto incerment id from bill table
                if(rs.last())
                     billID=rs.getInt(1);
                
                pre.setString(1, myph);
                pre.setInt(2, billID);
                pre.setString(3, artistPhoneNumbers.get(i));
                pre.setString(4, cust.myCart.artCart.get(i).name);
                pre.setInt(5, cust.myCart.artCart.get(i).Quantity);
                if(pre.executeUpdate()!=1)
                    JOptionPane.showMessageDialog(null, "something is wrong in update DB-insert into orderArt table");
                
                }
            }  
            catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
        }
        
        cust.myCart.artCart.clear();
        size=0;
        limit.clear();
        images.clear();
        itemspanel.removeAll();
        itemspanel.revalidate();
        itemspanel.repaint();
        displaycart(itemspanel);  
        calculatePrice();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CartPanel;
    private javax.swing.JScrollPane CartTab;
    private javax.swing.JButton checkout;
    private javax.swing.JButton clear;
    private javax.swing.JPanel itemspanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totallabel;
    // End of variables declaration//GEN-END:variables

   
   
}
