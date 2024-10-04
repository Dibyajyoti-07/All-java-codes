class Father
{
    String Father = "Biman Chandra Sarkar";
    String Son = "Dibyajyoti Sarkar";
    void does()
    {
        System.out.println("My Father is--"+Father);
        System.out.println("My Name is--"+Son);
    } 
}
 class Son extends Father
{
    String Relation = "Guardian";
    void show()
    {
        System.out.println("The Result is--"+Relation);
    }
    public static void main(String args[])
    {
        Son obj=new Son();
        obj.show();
        obj.does();
    }
}