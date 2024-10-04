import java.util.Scanner;
public class HappyNF
{
    public void HappyNF(int n)
    {
        int a,s=0;
        while(n>0||s>9)
        {
            if(n==0)
            {
                n=s;
                s=0;
            }
            a=n%10;
            s=s+a*a;
            n=n/10;
        }
        if(s==1)
        {
            System.out.println(s+"--Happy Number");
        }
        else 
        {
            System.out.println(s+"-Not Happy Number");
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value:");
        x=in.nextInt();
        HappyNF ob=new HappyNF();
        ob.HappyNF(x);
    } 
} 