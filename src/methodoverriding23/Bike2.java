package methodoverriding23;

public class Bike2 extends Vehical{
    //defining the same method as in the parent class
    public void run(){

       System.out.println("Bike is running safelt");

   }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();// Creating object
        obj.run();// calling method
    }
}
