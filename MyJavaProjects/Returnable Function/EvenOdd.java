
import java.util.Scanner;
public class EvenOdd
{
    public int EvenOdd(int n)
    {
        int m=n,f=0;
        if(m%2==0)
        {
            f=1;
        }
        return(f);
    }
    public static void main (String args[])
    {
        int x,p;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value ");
        x=in.nextInt();
        EvenOdd ob = new EvenOdd();
        p=ob.EvenOdd(x);
        if(p==1)
        {
            System.out.println("Even Number"+p);
        }
        else
        {
            System.out.println("Odd Number"+p);
        }
    }
}
