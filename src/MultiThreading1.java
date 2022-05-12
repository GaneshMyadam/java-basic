
class MultiThreading1 implements Runnable{  
    public void run(){  
    System.out.println("task one");  
    }  
      
    public static void main(String args[]){  
        //passing annonymous object of MultiThreading1 class
    Thread t1 =new Thread(new MultiThreading1());  
    Thread t2 =new Thread(new MultiThreading1());  
    t1.start();  
    t2.start();  
      
     }  
    }  