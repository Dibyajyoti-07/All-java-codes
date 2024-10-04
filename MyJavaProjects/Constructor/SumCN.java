class SumCN
{
    int a,b;
    SumCN(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        int s=0;
        s=a+b;
        System.out.println(s+"-is the result");
    }
}
class newSum
{
    public static void main(String args[])
    {
        SumCN ob=new SumCN(7,10);
        ob.display();
    }
}
