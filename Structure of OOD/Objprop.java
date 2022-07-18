// object properties
class Objprop{
    public static void main(String[] args) 
    {
        Fruit fruit= new Fruit("appple",5);
        String newfruit = fruit.getKind();
        double totalcost = fruit.getCost();
        System.out.println("The kind of fruit: "+ newfruit);
        System.out.println("Total cost of fruit: "+ totalcost);
    }
}
class Fruit
{
    private String kind;    // accessing the private members
    private double cost;

    public Fruit(String k,double c)
    {
        this.kind = k;  //this keyword represents object
        this.cost = c;
    }
    public String getKind()
    {
        return this.kind;
    }
    public double getCost()
    {
        return this.cost = 12;
    }
}
