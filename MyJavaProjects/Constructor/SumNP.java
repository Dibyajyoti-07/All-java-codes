class SumNP
{
    int a,b,c;
    SumNP()
    {
        a=7;
        b=10;
        c=15;
    }
    void output()
    {
        int s=0;
        s=a+b+c;
        System.out.println(s+"-is the result");
    }
    public static void main(String args[])
    {
        SumNP ob=new SumNP();
        ob.output();
    }
}