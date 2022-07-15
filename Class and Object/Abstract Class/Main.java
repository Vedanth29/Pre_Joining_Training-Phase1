abstract class main // abstract class
{
   public abstract void vehicletype();   // abstraction method which does not have any body
   public void mymethod1()   // normal method which contain print statement
   {
    System.out.println("hello i am riding a vehicle");
   }
}

class Plane extends main // Subclass of abstract class which inherit property from main class
{   
    public void vehicletype() {
      
      System.out.println("hello i am riding a plane"); //normal method of subclass which contain body
    }
}
  
class Main 
{
    public static void main(String[] args) // main function
    {
        Plane r = new Plane(); //creating object from sub class
            r.vehicletype();  //calling methods
            r.mymethod1();
    }
}
