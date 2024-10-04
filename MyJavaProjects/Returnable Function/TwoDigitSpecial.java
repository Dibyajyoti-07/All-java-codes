import java.util.Scanner;
public class TwoDigitSpecial
{
    public int TwoDigitSpecial(int n)
    {
        int a,s=0,p=1,f=0,sum=0;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+a;
            p=p*a;
            m=m/10;
        }
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
        TwoDigitSpecial ob=new TwoDigitSpecial();
        y=ob.TwoDigitSpecial(x);
        if(y==1)
        {
            System.out.println("Two Digit Special Number"+y);
        }
        else 
        {
            System.out.println(y+"is Not Two Digit Special Number");
        }
    }
}