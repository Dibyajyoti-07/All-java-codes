class HappyCN
{
    int n;
    HappyCN(int m)
    {
        n=m;
    }
    void output()
    {
        int a,s=0;
        while(n>0 || s>9)
        {
            if(n==0)
            {
                n=s;
                s=0;
            }
            a=n%10;
            s=s+a*a;
            n=n/10;
        }
        if(s==1)
        {
            System.out.println(s+"--is the Happy number");
        }
        else 
        {
            System.out.println(s+"--is not the Happy number");
        }
    }
}
class newHappy
{
    public static void main(String args[])
    {
        HappyCN ob=new HappyCN(32);
        ob.output();
    }
}