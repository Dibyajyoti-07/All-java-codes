import java.util.Scanner;
public class Automorphic
{
    public int Automorphic(int n)
    {
        int sum=0,c=0,f=0;
        int num=n;
        int m=n*n;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        sum=m%(int)Math.pow(10,c);
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
        System.out.println("Enter the value");
        x=in.nextInt();
        Automorphic ob=new Automorphic();
        y=ob.Automorphic(x);
        if(y==1)
        {
            System.out.println(y+"is the Automorphic Number");
        }
        else 
        {
            System.out.println(y+"is not the Automorphic Number");
        }
    }
}