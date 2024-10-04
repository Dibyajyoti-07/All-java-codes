class Header
{
    int Score = 144;
    void heads()
    {
        System.out.println("Hey I'm Cristiano Ronaldo !..Number of Headrers I scored--"+Score);
    }
}
class Freekick extends Header
{
    String Yards = "40 Yeards";
    void freekick()
    {
        System.out.println("Hey I'm Cristiano Ronaldo !..At Manchester I scored a FreeKick from--"+Yards);
    }
}
class Bicycle extends Freekick
{
    String Against = "Juventus-Gigi Buffon";
    void bicycle()
    {
        System.out.println("Hey I'm Cristiano Ronaldo !..In the Champions League Semi Final I scored a Bicycle against--"+Against);
    }
}
class Ronaldo
{
    public static void main(String args[])
    {
    Header hed = new Header();
    Freekick free = new Freekick();
    Bicycle bic = new Bicycle();
    hed.heads();
    free.freekick();
    bic.bicycle();
    }
}
