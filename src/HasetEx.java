
import java.util.HashSet;
public class HasetEx {
	  public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    for (String i : cars) {
	    	  System.out.println(i);
	    	}
	    cars.size();
	    cars.contains("Mazda");
	    cars.remove("Volvo");


	  }
	}


