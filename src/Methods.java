
public class Methods {
	 static void myMethod() {
		    System.out.println("I just got executed!");   //also example for method overloading
		  }
		  static int myMethod(int x, int y) {
		    return x + y;
		  }


	public static void main(String[] args) {
			 
			    myMethod();
			    int z = myMethod(5, 3);
			    System.out.println(z);
	}

}
