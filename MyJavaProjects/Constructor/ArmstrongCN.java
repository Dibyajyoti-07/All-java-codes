class ArmstrongCN
{
    int n;
    ArmstrongCN(int m)
    {
        n=m;
    }
    void output()
    {
        int a,s=0;
        int num=n;
        while(num>0)
        {
            a=num%10;
            s=s+a*a*a;
            num=num/10;
        }
        if(s==n)
        {
            System.out.println(s+"--is Armstrong Number");
        }
        else
        {
            System.out.println(s+"--is not Armstrong Number");
        }
    }
}
class newArmstrong
{
    public static void main(String args[])
    {
        ArmstrongCN ob=new ArmstrongCN(153);
        ob.output();
    }
}