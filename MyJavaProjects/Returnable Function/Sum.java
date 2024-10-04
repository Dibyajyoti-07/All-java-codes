import java.util.Scanner;
public class Sum
{
    public int Sum(int n, int m)
    {
        int s=0;
        s=n+m;
        return(s); 
    }
    public static void main(String args[])
    {
        int a,b,p;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the values :");
        a=in.nextInt();
        b=in.nextInt();
        Sum ob = new Sum();
        p = ob.Sum(a,b);
        System.out.println("The result is :"+p);
    }
}

