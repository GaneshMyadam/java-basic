import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    // Driver class
    public static void main(String[] args) throws Exception // runtime exception throws to main method
    {
        // creating an ExecutorService object to Create a threadpool with 3 threads
        // Executed concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // iterate threads in the threadpool
        for (int i = 0; i < 10; i++) {
            // assigning task no.
            int taskNo = i;
            // lamda expression for threadpool and calls executorservice
            executorService.execute(() -> {
                String message = Thread.currentThread().getName() + ": Task" + taskNo;
                System.out.println(message);
            });

        }

    }
}
