class Fruit
{
    String kind;
    double cost;
    double amount;
    // creating a object as a reference.
    public Fruit(String k,double c,double a) // constructor
    {
        kind =k;
        cost =c;
        amount =a;
    }
    // creating the methods for fruit class.
    public String getFruit()
    {
        return kind + " :: cost: $" + cost;
    }
    public double getCost()
    {
        return cost * amount;
    }
    //main function.
    public static void main(String[] args) 
    {
        Fruit fruit= new Fruit("appple",5,12);
        String newfruit = fruit.getFruit();
        double totalcost = fruit.getCost();
        System.out.println("The kind of fruit: "+ newfruit);
        System.out.println("Total cost of fruit: "+ totalcost);
    }
}
