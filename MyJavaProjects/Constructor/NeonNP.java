class NeonNP
{
    int n;
    NeonNP()
    {
        n=9;
    }
    void output()
    {
        int a,s=0;
        int m=n*n;
        while(m>0)
        {
            a=m%10;
            s=s+a;
            m=m/10;
        }
        if(s==n)
        {
            System.out.println(s+"-is Nron number");
        }
        else 
        {
            System.out.println(s+"-is not Neon number");
        }
    }
    public static void main(String args[])
    {
        NeonNP ob=new NeonNP();
        ob.output();
    }
}