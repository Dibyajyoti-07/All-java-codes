class Grandfather
{
    String Grandfather = "Ramakanta Sarkar";
    String father = "Biman Cahndra Sarkar";
    String son = "Dibyajyoti Sarkar";
    void display()
    {
        System.out.println("My Grandfathe is--"+Grandfather);
        System.out.println("My Father is--"+father);
        System.out.println("My Name is--"+son);
    } 
}
class father extends Grandfather
{
    String Relation = "Father's Father";
    void show()
    {
        System.out.println("Relation is--"+Relation);
    }
} 
class son extends father
{
    String Relationship = "Son's Father";
    void does()
    {
        System.out.println("Relation is--"+Relationship);
    }
    public static void main(String args[])
    { 
        son obj = new son();
        obj.display();
        obj.show();
        obj.does();
    }
}