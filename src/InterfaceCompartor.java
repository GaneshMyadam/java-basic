import java.util.*;
 
// Class 1
// A class to represent a Employee
class Employee {
 
    // Attributes of a Employee
    int empid;
    String name, address;
 
    // Constructor
    public Employee(int empid, String name, String address)
    {
 
        // This keyword refers to current instance itself
        this.empid = empid;
        this.name = name;
        this.address = address;
    }
 
    // Method of Employee class
    // To print Employee details in main()
    public String toString()
    {
 
        // Returning attributes of Employee
        return this.empid + " " + this.name + " "
            + this.address;
    }
}
 
// Class 2
// Helper class implementing Comparator interface
class Sortbyempid implements Comparator<Employee> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Employee a, Employee b)
    {
 
        return a.empid - b.empid;
    }
}
 
// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Employee> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(Employee a, Employee b)
    {
 
        return a.name.compareTo(b.name);
    }
}
 
// Class 4
// Main class
public class InterfaceCompartor {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Employee type
        ArrayList<Employee> ar = new ArrayList<Employee>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Employee(100, "Ganesh", "Hyderabad"));
        ar.add(new Employee(101, "Vikranthi", "Mumbai"));
        ar.add(new Employee(102, "Hussain", "Bihar"));
        ar.add(new Employee(103, "Parvez", "Bihar"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting Employee entries by empid
        Collections.sort(ar, new Sortbyempid());
 
        // Display message on console for better readability
        System.out.println("\nSorted by EmpId");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting Employee entries by name
        Collections.sort(ar, new Sortbyname());
 
        // Display message on console for better readability
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}