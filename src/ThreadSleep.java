import java.lang.Thread;  
public class ThreadSleep
{  
    // main method  
public static void main(String args[])  
{  
//exception handling for a thread is written in try block  
try
 {  
for (int j = 0; j < 5; j++)  
{  
  
// The main thread sleeps for the 1000 milliseconds, which is 1 sec  
// whenever the loop runs  
Thread.sleep(1000);  
  
// displaying the value of the variable  
System.out.println(j);  
}  
}  
catch (Exception e)   
{  
// catching the exception  
System.out.println(e);  
}  
}  
}  