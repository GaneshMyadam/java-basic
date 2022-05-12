
import java.util.HashMap;
public class HashEX {

	  public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put(1, "London");
	    capitalCities.put(2, "Berlin");
	    capitalCities.put(3, "Oslo");
	    capitalCities.put(4, "Washington DC");
	    System.out.println(capitalCities);
	    for (Integer i : capitalCities.keySet()) { //print all items
	    	  System.out.println(i);
	    	}
	    capitalCities.size(); //size of hashmap
	    capitalCities.get(1); //access an item
	    capitalCities.remove(2); // remove an item
	    capitalCities.clear(); //remove all elements
	  }
	}
