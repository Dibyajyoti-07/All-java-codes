import java.util.Scanner;
public class Magic
{
    public int Magic(int n)
    {
        int a,s=0,f=0;
        while(n>0 || s>9)
        {
            if(n==0)
            {
                n=s;
                s=0;
            }
            a=n%10;
            s=s+a;
            n=n/10;
        }
        if(s==1)
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
        Magic ob=new Magic();
        y=ob.Magic(x);
        if(y==1)
        {
            System.out.println(y+"Magic Number");
        }
        else
        {
            System.out.println(y+"Not Magic Number");
        }
    }
}