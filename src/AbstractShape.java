
//abstract class
abstract class Shape{  
    //abstract method
    abstract void draw();  
    }    
    //class Rectangles extends properties of abstract class Shape
    class Rectangle extends Shape{  
    void draw()
    {
        System.out.println("drawing rectangle");
    }  
    }  
    //class Circle extends properties of abstract class Shape
    class Circle1 extends Shape{  
    void draw()
    {
        System.out.println("drawing circle");}  
    }  
    public class AbstractShape {  
    public static void main(String args[]){  
        //invoking Circle class by shape abstract class
    Shape s=new Circle1();
    s.draw();  
    }  
    }  