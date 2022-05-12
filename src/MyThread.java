public class MyThread 
{  
// Main method  
public static void main(String argvs[])  
{  
// creating an object of the Thread class using the constructor Thread(String name)   
Thread th= new Thread("My first thread");  
  
// Thread is started
th.start();  
// getting the thread name by invoking the getName() method  
String str = th.getName();  
System.out.println("Thread name is-> "+str);  
}  
} 