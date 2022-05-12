//thread class
class ThreadNew extends Thread {
    // constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    // overriding the run() method
    public void run() {

        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

// main driver class
public class ThreadGroupEnum {
    // main method
    public static void main(String argvs[]) throws InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        new ThreadGroup(tg, "the child group");

        new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        new ThreadNew("the second", tg);
        System.out.println("Starting the second");
        // returning the number of threads kept in this array
        Thread[] grp = new Thread[tg.activeCount()];
        int cnt = tg.enumerate(grp);
        for (int j = 0; j < cnt; j++) {
            System.out.println("Thread " + grp[j].getName() + " is found.");
        }
    }
}