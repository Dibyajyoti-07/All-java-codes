class Length
{
    int Length = 7;
    int Breadth = 10;
    void show()
    {
        System.out.println("The Length is--"+Length);
        System.out.println("The Breth is--"+Breadth);
    }
}
class Breadth extends Length
{
    int Circumference = 2*(Length+Breadth);
    void calculate()
    {
        System.out.println("The Result is--"+Circumference);
    }
    public static void main(String args[])
    {
        Breadth obj = new Breadth();
        obj.show();
        obj.calculate();
    }
}
