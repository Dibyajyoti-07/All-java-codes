class EvenOddNP
{
    int n;
    EvenOddNP()
    {
        n=58;
    }
    void output()
    {
        if(n%2==0)
        {
            System.out.println(n+"-is Even Number");
        }
        else 
        {
            System.out.println(n+"-is Odd number");
        }
    }
    public static void main(String args[])
    {
        EvenOddNP ob=new EvenOddNP();
        ob.output();
    }
}