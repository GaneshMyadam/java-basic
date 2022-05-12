import java.util.*;
class student         //declaring input data from in 1st super class & get and print details of students
{
    Scanner s=new Scanner(System.in);
    int rollno;
    String name;
    void getdata()
    {
        System.out.println("enter no::");
        rollno=s.nextInt();
        System.out.println("enter name::");
        name=s.next();
    }
    void putdata()
    {
        System.out.println("no is::"+rollno);
        System.out.println("name is::"+name);
    }
}
class marks extends student   //1st child class inherits input details from super class
{
    int sub1,sub2,sub3,total=0;
    void getmarks()
    {
         System.out.println("enter marks of subject 1::");
        sub1=s.nextInt();
        System.out.println("enter marks of subject 2::");
        sub2=s.nextInt();
        System.out.println("enter marks of subject 3::");
        sub3=s.nextInt();
    }
    void putmarks()
    {
        System.out.println("marks of subject 1 is::"+sub1);
        System.out.println("marks of subject 2 is::"+sub2);
        System.out.println("marks of subject 3 is::"+sub3);
    }
    void addition()
    {
        total=sub1+sub2+sub3;
        System.out.println("value of addition is::"+total);
    }
}
class result extends marks
{
    int avg;
    void getd()
    {
        avg=(sub1+sub2+sub3)/3;
        System.out.println("value of avg is::"+avg);
    }
}
public class MultilevelInheritance1 {
    public static void main(String args[])
    {
        result rs=new result();
        rs.getdata();
        rs.putdata();
        rs.getmarks();
        rs.putmarks();
        rs.addition();
        rs.getd();
    }
}