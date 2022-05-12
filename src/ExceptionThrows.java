import java.io.*;  
class M{  
 void method()throws IOException{   //declaring an exception
  throw new IOException("device error");  //exception handled when occurs;
 }  
}  
public class ExceptionThrows{  
   public static void main(String args[]){  
    try{  
     M m=new M();  //creating an object for class M
     m.method();  // calling a method
    }catch(Exception e){
        System.out.println("exception handled");
    }     
    System.out.println("normal flow...");  
  }  
}  