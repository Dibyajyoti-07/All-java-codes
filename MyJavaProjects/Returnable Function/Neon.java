import java.util.Scanner;
public class Neon
{
    public int Neon(int n)
    {
        int a,s=0,f=0;
        int m=n*n;
        while(m>0)
        {
            a=m%10;
            s=s+a;
            m=m/10;
        }
        if(s==n)
        {
            f=1;
        }
        return(f);
    }
    public static void main(String args[])
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value:");
        x=in.nextInt();
        Neon ob=new Neon();
        y=ob.Neon(x);
        if(y==1)
        {
            System.out.println("Neon Number"+y);
        } 
        else
        {
            System.out.println("Not Neon Number"+y);
        }
    }
}