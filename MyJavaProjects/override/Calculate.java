public class Calculate
{
    double volume(double r)
    {
        double X = 4/3*3.14*r*r*r;
        return(X);
    }
    int volume(int s)
    {
        int y=s*s*s;
        return(y);
    }
    double volume(double l, double b, double h)
    {
        double z=l*b*h;
        return(z);
    }
    public static void main(String args[])
    {
        int n;
        double m,p;
        Calculate obj=new Calculate();
        m=obj.volume(33.56);
        n=obj.volume(7);
        p=obj.volume(24.67,69.23,10.66);
        System.out.println("Volume of the Cube="+n);
        System.out.println("Volume of the sphere="+m);
        System.out.println("Volume of the Cuboid="+p);
    }
}
