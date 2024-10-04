class ArmstrongNP
{
    int n;
    ArmstrongNP()
    {
        n=153;
    }
    void output()
    {
        int a,s=0;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+(int)Math.pow(a,3);
            m=m/10;
        }
        if(s==n)
        {
            System.out.println(s+"-is Armstrong Number");
        }
        else 
        {
            System.out.println(s+"-is not Armstrong Number");
        }
    }
    public static void main(String args[])
    {
        ArmstrongNP ob=new ArmstrongNP();
        ob.output();
    }
}
