
public class Strings {
	public static void main(String[] args) {
		String txt = "Welcome to java";
		System.out.println("The length of the txt string is:" + txt.length());
		System.out.println(txt.toUpperCase()); // uppercase of words
		System.out.println(txt.toLowerCase()); // lowercase of words
		System.out.println(txt.indexOf("to")); // index of the described word
		System.out.println(txt + " and C");
		String txt1 = " and C";
		System.out.println(txt + "" + txt1);// concat 2 strings
		System.out.println(txt.concat(txt1));// concat string using concat method

	}

}
