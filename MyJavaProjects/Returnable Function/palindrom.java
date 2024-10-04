import java.util.Scanner;
public class palindrom 
{
    public int palindrom(int n)
    {
        int a,s=0,f=0;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+a*a;
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
        palindrom ob=new palindrom();
        y=ob.palindrom(x);
        if(y==1)
        {
            System.out.println(y+"Palindrom Number");
        }
        else
        {
            System.out.println(y+"Not palindrom Number");
        }
    }
}