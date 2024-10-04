import java.util.Scanner;
public class Dissarium
{
    public int Dissarium(int n)
    {
        int a,s=0,c=0;
        int m=n;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        while(n>0)
        {
            a=n%10;
            s=s+(int)Math.pow(a,c);
            n=n/10;
            c--;
        }
        return(s);
    }
    public static void main(String args[])
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value:");
        x=in.nextInt();
        Dissarium ob=new Dissarium();
        y=ob.Dissarium(x);
        if(y==x)
        {
            System.out.println(y+"=Dissarium Number");
        }
        else
        {
            System.out.println(y+"=not Dissarium Number");
        }
    }
}