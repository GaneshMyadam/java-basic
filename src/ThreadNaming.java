public class ThreadNaming extends Thread{  
    public void run(){  
     System.out.println("running...");  
    }  
   public static void main(String args[]){  
       //creating a thread 1-> t1
    ThreadNaming t1=new ThreadNaming();  
    //creating a thread 2-> t2
    ThreadNaming t2=new ThreadNaming();  
    //print the thread name in cansole of thread t1
    System.out.println("Name of t1:"+t1.getName());  
    //print the thread name in cansole of thread t2
    System.out.println("Name of t2:"+t2.getName());  
    //running a thread t1 
    t1.start();  
    //running a thread t2
    t2.start();  
    //intializing a name for the thread t1 and t2
    t1.setName("Ganesh");  
    t2.setName("Ganni");
    System.out.println("After changing name of t1:"+t1.getName());  
    System.out.println("After changing name of t2:"+t2.getName());
   }  
  }