
public class Condtional {
	public static void main(String[] args) {
		int time = 22;
		if (time < 10) { // if statement
			System.out.println("Good morning");
		} else if (time < 20) { // else if statement
			System.out.println("Good day");
		} else {
			System.out.println("Good evening");
		}
		String result = (time < 18) ? "Good day." : "Good evening."; // trinory conditional statement
		System.out.println(result);

	}
}
