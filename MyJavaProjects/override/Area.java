public class Area 
{
    double area(double a, double b, double c)
    {
        double s=(a+b+c)/2;
        double x=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return(x);
    }
    double area2(double d, double e, double f)
    {
        double y=1/2*f*(d+e);
        return(y);
    }
    double area( double g, double h)
    {
        double z= 1/2*g*h;
        return(z);
    }
    public static void main(String args[])
    {
        double m,n,o;
        Area obj=new Area();
        m=obj.area(12.34, 10.45, 6.78);
        n=obj.area2(12,9, 6);
        o=obj.area(24.56, 33.33);
        System.out.println("Area of Scalene triangle="+m);
        System.out.println("Area of Trapezium="+n);
        System.out.println("Area of Rhombus="+o);
    }
}