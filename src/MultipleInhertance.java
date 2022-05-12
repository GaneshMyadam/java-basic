    interface i1
{
    void getdata();
     int a=10;
}
interface i2 extends i1 
{
    void getd();
    int b=20;
}
interface i3 extends i1
{
    void getd1();
     int c=30;
}
interface i4 extends i2,i3
{
    void getd2();
     int d=40;
}
class demo1 implements i4
{
    public void getdata()
    {
        System.out.println("value of a is::"+a);
    }
    public void getd()
    {
        System.out.println("value of b is::"+b);
    }
    public void getd1()
    {
        System.out.println("value of c is::"+c);
    }
    public void getd2()
    {
        System.out.println("value of d is::"+d);
    }
}
public class MultipleInhertance {
    public static void main(String args[])
    {
        demo1 d=new demo1();
        d.getdata();
        d.getd();
        d.getd1();
        d.getd2();
    }
}
