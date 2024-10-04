import java.util.Scanner;
public class Kaprekar
{
    public int Kaprekar(int n)
    {
        int s,p,c=0,f=0,sum=0;
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
        Kaprekar ob=new Kaprekar();
        y=ob.Kaprekar(x);
        if(y==1)
        {
            System.out.println(y+"-is Kaprekar Number");
        }
        else 
        {
            System.out.println(y+"-is not Kaprekar Number");
        }
    }
}