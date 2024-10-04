import java.util.Scanner;
public class SumOfTwoNumbers
{
    public void sum(int n, int m)
    {
        int sum=0;
        sum=n+m;
        System.out.println(sum+"is the result");
    }
    public static void main(String arg[])
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value :");
        x=in.nextInt();
        y=in.nextInt();
        SumOfTwoNumbers ob=new SumOfTwoNumbers();
        ob.sum(x,y);
    }
}