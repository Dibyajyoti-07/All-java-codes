import java.util.Scanner;
public class Spy
{
    public int Spy(int n)
    {
        int a,s=0,p=1,f=0;
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
        Spy ob=new Spy();
        y=ob.Spy(x);
        if(y==1)
        {
            System.out.println("Spy Number"+y);
        }
        else 
        {
            System.out.println("Not Spy Number"+y);
        }
    }
}