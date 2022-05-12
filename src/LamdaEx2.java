interface Drawable{  
    public void draw(int width);  
}  
  
public class LamdaEx2 {  
    public static void main(String[] args) {    
        //with lambda  
        Drawable d2=(width)->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw(10);  
    }  
    
}  
