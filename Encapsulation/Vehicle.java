class Cars
{
    private String carname;
    
    public void setCarname(String x)
    {
        carname = x;
    }
    public String getCarname()
    {
        return carname;
    }
}
class Vehicle{
    public static void main(String[] args) {
        Cars r = new Cars();
        r.setCarname("bmw");
        System.out.println(r.getCarname());
    }
}
