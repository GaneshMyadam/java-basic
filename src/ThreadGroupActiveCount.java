//Thread class
class ThreadNew extends Thread {
    // constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    // overriding the run method
    public void run() {

        for (int j = 0; j < 1000; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
    }
}

public class ThreadGroupActiveCount {
    // main Driver class
    public static void main(String argvs[]) {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("The parent group of threads");
        new ThreadNew("first", tg);
        // th1.start();
        System.out.println("Starting the first");
        new ThreadNew("second", tg);
        // th2.start();
        System.out.println("Starting the second");
        // checking the number of active thread by invoking the activeCount() method
        System.out.println("The total number of active threads are: " + tg.activeCount());
    }
}