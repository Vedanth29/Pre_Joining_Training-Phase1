public class Vehicle    // Class
{
    String a = "audi";         // Data
    String b = "bmw"; 
    int c = 10;
    int d;
    public void mymethod()     // Methods
    {
        System.out.println(a + " " + b + " " + c);
    }
    public static void main(String[] args) // Main function
    {
        Vehicle r = new Vehicle();      // Object
        r.mymethod();
    }
}
