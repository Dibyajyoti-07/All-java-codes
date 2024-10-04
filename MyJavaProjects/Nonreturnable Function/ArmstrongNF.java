import java.util.Scanner;
public class ArmstrongNF
{
    public void ArmstrongNF(int n)
    {
        int a,s=0;
        int m=n;
        while(m>0)
        {
            a=m%10;
            s=s+a*a*a;
            m=m/10;
        }
        if(s==n)
        {
            System.out.println(s+"--Armstrong Number");
        }
        else 
        {
            System.out.println(s+"--Not Armstrong Number");
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value:");
        x=in.nextInt();
        ArmstrongNF ob=new ArmstrongNF();
        ob.ArmstrongNF(x);
    }
}