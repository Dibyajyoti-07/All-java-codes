import java.util.Scanner;
public class NarssisticNF
{
    public void NarssisticNF(int n)
    {
        int a,s=0,c=0;
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
            System.out.println(s+"--Narssistic Number");
        }
        else 
        {
            System.out.println(s+"--Narssistic Number");
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value:");
        x=in.nextInt();
        NarssisticNF ob=new NarssisticNF();
        ob.NarssisticNF(x);
    }
}