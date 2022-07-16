public class Person 
{
    private String name;
    /*public Person()
    {
        name = "Vedanth";
    }
    public Person(String nm)
    {
        nm = "M";
    } */
    // methods
    public void setName(String x)
    {
        name = x;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        Person r = new Person();
        r.setName("vedant");
        System.out.print(r.getName());
    }
}
