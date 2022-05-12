class MultiThreading extends Thread{  
    public void run(){  
      System.out.println("task one");  
    }  
    public static void main(String args[]){  
        MultiThreading t1=new MultiThreading();  
        MultiThreading t2=new MultiThreading();  
        MultiThreading t3=new MultiThreading();  
     t1.start();  
     t2.start();  
     t3.start();  
    }  
   }  
