class ProductCN
{
    int a,b,c;
    ProductCN(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void output()
    {
        int p=1;
        p=a*b*c;
        System.out.println(p+"=is the result");
    }
}
class newProduct
{
    public static void main(String args[])
    {
        ProductCN ob=new ProductCN(3,5,7);
        ob.output();
    }
}