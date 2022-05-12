class Employee{
    private static Employee emp = null; //static variable with type Employee
    private Employee(){   //A private constructor intializing 
        System.out.println("Constructor invoked for only one object");
    }
    public static Employee getInstance()//static method to create an instance of the Singleton class   
    // we can also create a method with the same name as the class name 
    {//lazy intializing
        if (emp == null)   
        emp = new Employee();  
        return emp;
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        Employee.getInstance();
    }   
}
