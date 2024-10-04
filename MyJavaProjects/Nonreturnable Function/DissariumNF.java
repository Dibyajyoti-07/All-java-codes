import java.util.Scanner;
public class DissariumNF
{
    public void DissariumNF(int n)
    {
        int a,s=0,c=0;
        int num=n;
        int m=n;
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
            c--;
        }
        if(s==n)
        {
            System.out.println(s+"--Dissarium Number");
        }
        else 
        {
            System.out.println(s+"--Not Dissarium Number");
        }
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value:");
        x=in.nextInt();
        DissariumNF ob=new DissariumNF();
        ob.DissariumNF(x);
    }
}