package abstraction;

abstract class Shape{
     int b = 20;
    public void display(){
      System.out.println("This is display method");
    }
    abstract public void calculateArea();
 }
 
 public class This extends Shape{
    public static void main(String args[]){
       This obj = new This();
       obj.display();
      obj.b=200;
   }
   public void calculateArea(){}

 }