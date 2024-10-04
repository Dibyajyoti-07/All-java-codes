import java.util.Scanner;
public class Narssistic
{
    public int Narssistic(int n)
    {
        int a,s=0,c=0,f=0;
        int m=n;
        int num=n;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        while(m>0)
        {
            a=m%10;
            s=s+(int)Math.pow(a,c);
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
        Narssistic ob=new Narssistic();
        y=ob.Narssistic(x);
        if(y==1)
        {
            System.out.println("Narssistic Number"+y);
        }
        else
        {
            System.out.println("Not Narssistic Number"+y);
        }
    }
}