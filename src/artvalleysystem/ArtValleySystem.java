
package artvalleysystem;

import java.util.ArrayList;


public class ArtValleySystem {
public static ArrayList<Customer> clist= new ArrayList<>();
    
    public static void main(String[] args) {
       SignIn f= new SignIn();
       f.setSize(550, 700);
       f.setVisible(true);
    }
}
