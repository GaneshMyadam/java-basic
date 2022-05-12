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
public class ThreadGroupPrior {
    // main method
    public static void main(String argvs[]) throws InterruptedException {
        // creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");
        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");
        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");
        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");
        // get the max priority of thread group
        int priority = tg.getMaxPriority();
        // print the priority in cansole
        System.out.println("The maximum priority of the parent ThreadGroup: " + priority);
    }
}