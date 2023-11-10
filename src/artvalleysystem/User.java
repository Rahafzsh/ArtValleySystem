
package artvalleysystem;
//for Emails, doing domains checker

import java.sql.Date;
import java.util.ArrayList;
   // public static final Pattern VALID_EMAIL_ADDRESS_REGEX =Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    //public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("^\\s*\\d{10}");
    //public static final Pattern VALID_PASSWORD =Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$");
    //VALID_EMAIL_ADDRESS_REGEX.matcher(string you want to check).find())

public class User {
    public String name;
    private String phoneNumber;
    private int age;
    private String email;
    private String password;
private Date mydate;
    public User() {
    }

    public User(String name, String phoneNumber, String email, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
public boolean EmailChecker(String email){
    String[] Domains={"gmail", "hotmail", "yahoo", "icloud", "outLook"};
    
    boolean valid=false;
    if(email.contains("@")&& email.endsWith(".com")){
        int atPos=email.indexOf("@");
    int dotPos=email.indexOf(".com");
    for (int i = 0; i < Domains.length; i++) {
       if(Domains[i].equalsIgnoreCase(email.substring(atPos+1,dotPos))){
       valid=true;
       break;
       }
           
    }}

return valid;

}

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + ", email=" + email + ", password=" + password + '}';
    }
    
    
}

class Artist extends User{
     private int noOfArt=0;
     ArrayList<ArtWork> myArt=new ArrayList<>();
    String typeOfArt;
    private int numberOfBoughtArt=0;

        public Artist(String typeOfArt, String name, String phoneNumber, String email, String password) {
            super(name, phoneNumber, email, password);
            this.typeOfArt = typeOfArt;
        }

    Artist() {
        myArt=null;
        typeOfArt=null;
    }
     public void addArt(){
         //form for add art
     noOfArt++;}
     public void removeArt(){
         //gui for choosing art to remove it
     noOfArt--;}
     public void updateArt(String name){
         for(ArtWork i: myArt)
             if(i.name.equalsIgnoreCase(name))
               System.out.println("update");//form for updating art
     }
}

class Customer extends User{

class Cart{
    ArrayList<ArtWork> artCart=new ArrayList<>();//change to super class of art
    double totalPrice;

    public Cart() {
    }
    
    public void buy(){
    artCart.clear();
    totalPrice=0;
    }
    
    public void addArt(ArtWork A){
    artCart.add(A);
    }
    
    public void deleteArt(ArtWork A){
    if(artCart.remove(A))
            System.out.println(A+" is removed from your cart");
    else
            System.out.println("we couldn't find "+A+" in your cart");
    }
    public void calculateTotalPrice(){
        int price=0;
        for(ArtWork i:artCart)
            price+=i.getPrice();
        totalPrice=price;
    }
    public void display(){
        
    System.out.println("--------------------------------------");
    System.out.printf("%-10s%s\n","name","price");
    System.out.println("--------------------------------------");
    for(ArtWork i: artCart)
            System.out.printf("%-10s %-4.2f\n",i.name,i.getPrice());
    }

        @Override
        public String toString() {
            return  "artCart :" + artCart.toString() + " totalPrice : " + totalPrice;
        }
    
    

}

private Address home;
Cart myCart;
    public Customer() {
        this.home=new Address();
        this.myCart=new Cart();
        
    }

    public Customer(String name, String phoneNumber,String email, String password, Address home) {
        super(name, phoneNumber, email, password);
        this.home=new Address(home);
    }

    

   public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home=home;
    }

  
    


}
class Address{
String city, street;
int additionalNumber, zipcode;
    public Address() {
        
    }

    public Address(String city, String street, int zipcode, int additionalNumber) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.additionalNumber = additionalNumber;
    }

    Address(Address home) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    