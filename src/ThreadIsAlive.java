//main class extends thread class
public class ThreadIsAlive extends Thread {
    public static int salary = 10;
    //main driver method
  
    public static void main(String[] args) {
        ThreadIsAlive thread = new ThreadIsAlive();
        //thread started
      thread.start();
      // Wait for the thread to finish
      while(thread.isAlive())
       {
      System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " +salary);
    salary++;
    System.out.println("Main: " + salary);
    }
    public void run() {
      salary++;
    }
  }