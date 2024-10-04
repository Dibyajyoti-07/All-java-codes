import java.util.Scanner;
public class Armstrong
{
    public int Armstrong(int n)
    {
        int a,s=0;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+a*a*a;
            m=m/10;
        }
        return(s);
    }
    public static void main (String args[])
    {
        int x,p;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value :");
        x=in.nextInt();
        Armstrong ob = new Armstrong();
        p=ob.Armstrong(x);
        if(p==x)
        {
            System.out.println("Armstrong Number"+p);
        }
        else
        {
            System.out.println("Not Armstrong Number"+p);
        }
    }
}