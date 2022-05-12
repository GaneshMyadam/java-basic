 class Library
{
String lname;
int id;
public Library(String libname,int ID)
{
lname=libname;
id=ID;

}
}
public class SingleInheritance2 extends Library {
public SingleInheritance2(String x1,int x2)
{
super(x1, x2);       //passing argument to parent class constructor
}
public void display()
{
System.out.println(super.lname+" and "+id);
}
public static void main(String[] args)
{
SingleInheritance2 c = new SingleInheritance2("Local Library",101);
c.display();
}
}