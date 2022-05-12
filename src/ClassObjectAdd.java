public class ClassObjectAdd {
        int x=5;
        int y=10;
        int z=x+y;
      public void sum(){
          System.out.println("The of x and y is :");
      }
        public static void main(String[] args) {
            ClassObjectAdd myObj = new ClassObjectAdd();
            myObj.sum();//calling a method
            System.out.println(myObj.z); //passing object as output
        }
}