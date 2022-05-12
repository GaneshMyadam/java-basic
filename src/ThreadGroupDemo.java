public class ThreadGroupDemo implements Runnable {
    public void run() {
        // get the name of current thread
        System.out.println(Thread.currentThread().getName());
    }

    // Driver class
    public static void main(String[] args) {
        // create a runnable interface for class ThreadGropDemo
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        // Calling a ThreadGroup Constructor and named as PArent ThreadGroup
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        // calling t1 runnable interface with threadgroup
        Thread t1 = new Thread(tg1, runnable, "one");
        // start thread exection t1
        t1.start();
        // calling t2 runnable interface with threadgroup
        Thread t2 = new Thread(tg1, runnable, "two");
        // start thread exection t1
        t2.start();
        // calling t3 runnable interface with threadgroup
        Thread t3 = new Thread(tg1, runnable, "three");
        // start thread exection t1
        t3.start();
        // print the t1 thread name
        System.out.println("Thread Group Name: " + tg1.getName());
        // t1 thread property list will be generated
        tg1.list();

    }
}