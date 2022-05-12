//thread implementation using Runnable interface
public class ThreadRunnable implements Runnable {
    public static void main(String[] args) {
        ThreadRunnable obj = new ThreadRunnable();
      Thread thread = new Thread(obj);
      //invoking thread outside
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    //thread invoking method using run()
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
