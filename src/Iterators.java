
public class Iterators {

	public static void main(String[] args) {
		System.out.println("Example while Loop");
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		System.out.println("Example DO WHILE Loop");
		int j = 0;
		do {
		  System.out.println(j);
		  j++;
		}
		while (j < 5);
		System.out.println("Example for Loop");
		for (int k = 0; k <= 10; k = k + 2) {
			  System.out.println(k);
			}
		System.out.println("Example FOR-EACH loop");
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String z : cars) {
		  System.out.println(z);
		}

	}

}
