
//import packages
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//main driver class
public class ThreadPoolChached {
    // main method that throws an runtime interrupt Exception
    public static void main(final String[] arguments) throws InterruptedException {
        // calling a Executor service class object to invoke cachedthreadpool
        ExecutorService executor = Executors.newCachedThreadPool();
        // Cast the object to its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        // Stats before tasks execution
        System.out.println("Maximum allowed threads: " + pool.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + pool.getPoolSize());
        System.out.println("Currently executing threads: " + pool.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + pool.getTaskCount());
        // creating the task to the executor object
        executor.submit(new Task());
        executor.submit(new Task());
        // Stats after tasks execution
        System.out.println("Maximum allowed threads: " + pool.getMaximumPoolSize());
        System.out.println("Current threads in pool: " + pool.getPoolSize());
        System.out.println("Currently executing threads: " + pool.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): " + pool.getTaskCount());
        // Destroy the executor object
        executor.shutdown();
    }

    // thread class by implementing Runnable interface
    static class Task implements Runnable {
        // overriden run method
        public void run() {
            try {
                System.out.println("Running Task! Thread Name: " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Task Completed! Thread Name: " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}