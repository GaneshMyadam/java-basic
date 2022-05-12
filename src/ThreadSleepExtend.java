//extending thread class
public class ThreadSleepExtend extends Thread{    
    public void run()
    {    
     for(int i=1;i<5;i++)
     {   
     // the thread will sleep for the 1000 milli seconds  i.e, 1 second  
       try
       {
           Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }    
       System.out.println(i);    
     }    
    }    
    public static void main(String args[]){    
        ThreadSleepExtend t1=new ThreadSleepExtend();    
        t1.start();        
    }    
   }   