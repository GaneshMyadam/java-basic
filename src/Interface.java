
// A simple interface
interface In{
    
    // public, static and final
    final int a = 10;
  
    // public and abstract
    void display();
}
  
// A class that implements the interface.
class Employee implements In {
    
    // Implementing the capabilities of
    // interface.
    public void display(){ 
      System.out.println("Employee Id is"+a); 
    }
}
    public class Interface{
    // Driver Code
    public static void main(String[] args) {
        
        Employee tmp = new Employee();
        tmp.display();
}
}