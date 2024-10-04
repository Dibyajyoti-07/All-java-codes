import java.util.Scanner;
public class MagicNF
{
    public void MagicNF(int n)
    {
        int a,s=0;
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
            System.out.println(s+"- is Magic Number");
        }
        else 
        {
            System.out.println(s+"-is not Magic Number");
        }
    }
    public static void main (String args[])
    {
    int x;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the value:");
    x=in.nextInt();
    MagicNF ob=new MagicNF();
    ob.MagicNF(x);
    }
}