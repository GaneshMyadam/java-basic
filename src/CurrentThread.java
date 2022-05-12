class CurrentThread extends Thread{  
    public void run(){  
        //invoking current thread and get the name of current thread
     System.out.println(Thread.currentThread().getName());  
    }  
    public static void main(String args[]){  
        CurrentThread t1=new CurrentThread();  
        CurrentThread t2=new CurrentThread();  
     
     t1.start();  
     t2.start();  
    }  
   }  