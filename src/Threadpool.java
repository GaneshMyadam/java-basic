import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRun implements Runnable{
private String name;
public MyRun(String name){
    this.name = name;
}
public void run(){
    System.out.println("Strating Thread\n" +name);
    try {
        Thread.sleep(1000);
    } catch (Exception e) {
        e.printStackTrace();
    }
System.out.println("End of Thread\n " +name);
}
}
public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
           Runnable r = new MyRun("My working thread - " +i);
           executorService.execute(r);
        }
    }
    
}