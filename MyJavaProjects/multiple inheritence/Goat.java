interface Ronaldo
{
    public abstract void execute7();
}
interface Messi
{
    public abstract void execute10();
}
class goat implements Ronaldo,Messi
{
    public void execute7()
    {
        System.out.println("Peter Drury : 7 wonders in the world may be else where, but the 8th one is here ! Cr7 undefeated");
    }
    public void execute10()
    {
        System.out.println("Peter Drury : The little boy from Rosario Santa Fe has just pitched up in heaven! World champion LM10 ");
    }
    public static void main(String[] args)
    {
        goat obj = new goat();
        obj.execute7();
        obj.execute10();
    }
}

