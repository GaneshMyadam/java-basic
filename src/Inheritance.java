public class Inheritance {
		  protected String brand = "Ford";        
		  public void honk() {                    
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Car extends Inheritance {
		  private String modelName = "Mustang";    
		  public static void main(String[] args) {

		    // Create a myCar object
		    Car myCar = new Car();
		    myCar.honk();
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
		}

