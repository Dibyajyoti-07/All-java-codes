class AverageCN
{
    int a,b,c;
    AverageCN(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }    
    void output()
    {
        int s=0;
        s=s+(a+b+c)/3;
        System.out.println(s+"is the Result");
    }
}
class newAverage
{
    public static void main(String args[])
    {
        AverageCN ob=new AverageCN(2,3,10);
        ob.output();
    }
}