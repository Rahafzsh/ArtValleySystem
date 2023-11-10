
package artvalleysystem;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;

public abstract class ArtWork {
String name;
private double price;
private int year;
String description;
int Quantity;

    public ArtWork( String name, double price, int year, String description,int quantity) {
        try{
          if(price<1 || year<1||quantity<0) 
              throw new Exception("You entered a negative value!!");
        this.name = name;
        this.price = price;
        this.year = year;
        this.description = description;
        Quantity=quantity;}
        catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)throws Exception {
        try{
            if(price<1)
            throw new Exception("You entered a negative value!!");
        this.price = price;}
        catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception {
         try{
             if(year<1)
            throw new Exception("You entered a negative value!!");
        this.year = year;}
         catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPrice:" + price + "\nYear:" + year + "\ndescription:" +description + "\nQuantity=" + Quantity ;
    }
}
class Paint extends ArtWork{

String paintingType;
private double width;
private double hieght;

    public Paint(String name,int quantity, double price,int year,String description, String paintingType , double width, double hieght) {
           super(  name, price, year, description,quantity);
        try{if(width<1 || hieght<1)
            throw new Exception("You entered a negative value!!");
        this.paintingType = paintingType;
        this.width = width;
        this.hieght = hieght;}
        catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
       
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Exception {
        try{if(width<1)
            throw new Exception("You entered a negative value!!");
        this.width = width;}
        catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
        
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) throws Exception{
        try{if(hieght<1)
            throw new Exception("You entered a negative value!!");
        this.hieght = hieght;}
        catch(InputMismatchException e){
        System.err.println(e.getMessage());}
        catch(Exception e){
        System.err.println(e.getMessage());}
    }

}
class Sculpture extends ArtWork{
String material;

    public Sculpture(String name,int quantity, double price, int year, String description, String material){
        super( name, price, year, description,quantity);
        this.material = material;
    }

}
class Bill{
private double price;
private int quantity;
private ArrayList<ArtWork> art=new ArrayList<>();
private Date date;
private int ID;

    public Bill(ArrayList<ArtWork> c) {
        date=Date.valueOf(LocalDate.now());
        art.addAll(c);
        quantity=art.size();
        price=0;
        for(ArtWork i:art )
            price+=i.getPrice(); 
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    

    public Bill(int ID, int quantity, double price,  Date date) {
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return  "ID :" + ID +"\nQuantity:" + quantity +  "\nPrice: " + price + " SR "+ "\norder date:" + date;
    }
    
    
    

}
