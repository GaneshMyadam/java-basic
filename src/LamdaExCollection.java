import java.util.TreeSet;

public class LamdaExCollection {
    public static void main(String[] args) {
        //with lamda using treeset collection
        TreeSet<Integer> tr=new TreeSet<Integer>((ex1,ex2) ->(ex1<ex2)?1:(ex1>ex2)?-1:0);
        tr.add(5);
        tr.add(15);
        tr.add(10);
        tr.add(25);
        System.out.println(tr);
    }
    
}
