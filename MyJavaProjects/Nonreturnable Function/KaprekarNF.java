import java.util.Scanner;
public class KaprekarNF
{
    public void KaprekarNF(int n)
    {
        int s,p,c=0,sum=0;
        int m=n;
        int num=n*n;
        while(m>0)
        {
            c++;
            m=m/10;
        }
        s=num/(int)Math.pow(10,c);
        p=num%(int)Math.pow(10,c);
        sum=s+p;
        if(sum==n)
        {
            System.out.println(s+"-is Kaprekar Number");
        }
        else
        {
            System.out.println(s+"-is not Kaprekar Number");
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value:");
        x=in.nextInt();
        KaprekarNF ob=new KaprekarNF();
        ob.KaprekarNF(x);
    }
}