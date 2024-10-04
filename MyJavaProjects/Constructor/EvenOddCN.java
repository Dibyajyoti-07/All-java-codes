class EvenOddCN
{
    int n;
    EvenOddCN(int x)
    {
        n=x;
    }
    void output()
    {
        if(n%2==0)
        {
            System.out.println(n+"--is a Even number");
        }
        else 
        {
            System.out.println(n+"--is odd number");
        }
    }
}
class newEvenOdd
{
    public static void main(String args[])
    {
        EvenOddCN ob=new EvenOddCN(36);
        ob.output();
    }
}