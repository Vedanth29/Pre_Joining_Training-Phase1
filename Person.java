//class definition
public class Person         //class representing a Person
{
    public String name;     //string representing the name of the person

    public Person()         //A constructor in Java is a special method that is used to initialize objects.
                            //The constructor is called when an object of a class is created.
    {
        name = "Vedanth M";
    }
    public Person(String nm)
    {
        name = nm;
    }
    public void setName(String name)
    {
    this.name = name;
    }
}
//creating a instance of class
class People
{
    public static void main(String[] args)  //main function
    {
        Person r = new Person("Vedanth");  //creating object to class Person
    }
}
