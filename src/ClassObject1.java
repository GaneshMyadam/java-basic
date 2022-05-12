  class Bicycle {
      
        // method of class
        void race() {
        System.out.println("Throttle...");
        }
    }
     
      class ClassObject1 {
          public static void main(String[] args) {
              
    
      // create object
      Bicycle sportsBicycle = new Bicycle();
      Bicycle mybike =new Bicycle();
      // access field and method
      sportsBicycle.race(); 
      //calling barking method
      mybike.race();
       // calling barking method
    }
}