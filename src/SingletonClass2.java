class Employee{
    //static variable with type Employee
    private static Employee emp = new Employee();  
    //private Constructor 
    private Employee(){  
    }
    public static Employee getInstance()//static method to create an instance of the Singleton class   
    // we can also create a method with the same name as the class name 
    {//lazy intializing  
        return emp;
    }
    protected static void temp(){
        System.out.println("Single object is created");
    }
}
public class SingletonClass2 {
    public static void main(String[] args) {
    }   
}
