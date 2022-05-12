interface Inter{  
    void a();  
    void b();  
    void c();  
    void d();  
    }  
      
    abstract class Abr implements Inter{  
    public void c()
    {
        System.out.println("I am c");
    }  
    }  
      
    class M extends Abr{  
    public void a()
    {
        System.out.println("I am a");
    }  
    public void b()
    {
        System.out.println("I am b");
    }  
    public void d()
    {
        System.out.println("I am d");
    }  
    }  
      
    class AbstractWithInterface {  
    public static void main(String args[]){  
    Inter obj=new M();  
    obj.a();  
    obj.b();  
    obj.c();  
    obj.d();  
    }
}  