
public class Arrays {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);// access an element in array
		cars[0] = "Opel";
		System.out.println("After change in element:\n"+cars[0]);
		System.out.println("lenght of array is\n"+cars.length);// find length of an array
		for (String i : cars) {
			  System.out.println(i);
			}
	}

}
