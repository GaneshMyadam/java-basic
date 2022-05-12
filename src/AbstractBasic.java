//abstract class
abstract class Bike{ 
    //abstract method 
    abstract void run();  
  }  
  class Honda extends Bike{  
  void run()
  {
      System.out.println("running safely");
    }  
    //main driver class
  public static void main(String args[]){  
   Bike obj = new Honda();  
   obj.run();  
  }  
  }  