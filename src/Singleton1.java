class SingletonClassExample   
{   
private static SingletonClassExample s = null;    // static variable s of type Singleton   
public String str;  // variable of type String      
private SingletonClassExample()   //private constructor of the Singleton class that restricted to this class itself
{   
str = "it is an example of singleton class.";   
}    
public static SingletonClassExample getInstance()   //static method to create an instance of the Singleton class   
// we can also create a method with the same name as the class name 
{   
//lazy initialization  
if (s== null)   
s = new SingletonClassExample();   
return s;   
}   
} 
class Singleton1 
{   
public static void main(String args[])   
{   
// instantiating Singleton class with variable a   
SingletonClassExample a = SingletonClassExample.getInstance();     
System.out.println("String from a is " + a.str);     
}   
}   