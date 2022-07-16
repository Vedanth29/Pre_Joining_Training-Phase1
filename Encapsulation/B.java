class A     // class A
{
    private int value;      // "data hiding"
    
    public void setValue(int x)     //"data abstraction" work- method which read only(void)
    {
        value = x;
    }
    public int getValue()       // method which write only(int)
    {
        return ++value;
    }
}
class B
{
    public static void main(String[] args) {
        A r = new A();      // craeted a object
        r.setValue(100);      // set value in "value variable"
        System.out.println(r.getValue());
    }
}
