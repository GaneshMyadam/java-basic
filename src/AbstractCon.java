//abstract class
abstract class Bike{
    //absract constructor  
    Bike()
    {
        System.out.println("bike is created");
    }  
    abstract void run();  
    void changeGear()
    {
        System.out.println("gear changed");
    }  
  }  
 //Creating a Child class which inherits Abstract class  
  class Honda extends Bike{  
  void run(){
      System.out.println("running safely..");
    }  
  }  
 //Creating a Test class which calls abstract and non-abstract methods  
  public class AbstractCon{  
      //main driver class
  public static void main(String args[])
  {  
   Bike obj = new Honda();  
   obj.run();  
   obj.changeGear();  
  }  
 }  