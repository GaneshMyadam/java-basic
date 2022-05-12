public class ThreadDeamon extends Thread{  
    public void run(){  
     if(Thread.currentThread().isDaemon()){//checking for daemon thread  
      System.out.println("daemon thread work");  
     }  
     else{  
     System.out.println("user thread work");  
    }  
    }  
    public static void main(String[] args){  
        ThreadDeamon t1=new ThreadDeamon();//creating thread  
        ThreadDeamon t2=new ThreadDeamon();  
        ThreadDeamon t3=new ThreadDeamon();  
     
     t1.setDaemon(true);//now t1 is daemon thread  
       
     t1.start();//starting threads  
     t2.start();  
     t3.start();  
    }  
   }  