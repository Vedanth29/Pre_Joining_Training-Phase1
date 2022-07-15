abstract class vehicle
{
    int a =10;
    int b =20;
    public abstract void vehicletype();
    public void mymethod1()
    {
        System.out.println("hello i am riding the vehicle 1");
    }
    public void mymethod2()
    {
        System.out.println(a + " " + b);
    }
}

class Plane extends vehicle
{
    public void vehicletype()
    {
        System.out.println("Hello i am riding aeroplane");
    }
}
class Main1
{
    public static void main (String[] args) 
    {
        Plane r = new Plane();
        r.vehicletype();
        r.mymethod2();
        r.mymethod1();
    }
}
