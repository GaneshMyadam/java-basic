//thread implementing by extending thread class
public class ThreadBasic extends Thread {
    public static void main(String[] args) {
        //calling a thread class object
        ThreadBasic thread = new ThreadBasic();
        //invoking thread class outside of thread
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    //invkoing thread class inside a thread by run() method
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
