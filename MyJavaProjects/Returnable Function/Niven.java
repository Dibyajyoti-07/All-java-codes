import java.util.Scanner;
public class Niven
{
    public int Niven(int n)
    {
        int m=n, a,s=0,f=0;
        while(m>0)
        {
            a=m%10;
            s=s+a;
            m=m/10;
        }
        if(n%s==0)
        {
            f=1;
        }
        return(f);
    }
    public static void main(String args[])
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value :");
        x=in.nextInt();
        Niven ob=new Niven();
        y=ob.Niven(x);
        if(y==1)
        {
            System.out.println("Niven Number"+y);
        }
        else
        {
            System.out.println("Not Niven Number"+y);
        }
    }
}
