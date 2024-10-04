class SpyNP
{
    int n;
    SpyNP()
    {
        n=132;
    }
    void output()
    {
        int a,s=0,p=1;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+a;
            p=p*a;
            m=m/10;
        }
        if(s==p)
        {
            System.out.println(s+"-is Spy number");
        }
        else 
        {
            System.out.println(s+"-is not Spy number");
        }
    }
    public static void main(String args[])
    {
        SpyNP ob=new SpyNP();
        ob.output();
    }
}
