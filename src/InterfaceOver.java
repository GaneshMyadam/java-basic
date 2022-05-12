interface Circle{
void area_circle();
void circum_circle();
}

interface Square{
void area_square();
void circum_square();
}

interface Rectangle{
void area_rect();
void circum_rect();
}

class Shapes implements Circle,Square,Rectangle{

public void area_circle(int r){
double area=3.14*Math.sqrt(r);
System.out.println("Area of Circle :" + area);
}

public void circum_circle(int r){
double circum=6.28*r;
System.out.println("Circumference of Circle :" + circum);
}

public void area_square(int a){
int area=a*a;
System.out.println("Area of Square :"+ area);
}

public void circum_square(int a){
int circum=4*a;
System.out.println("Circumference of Square :"+ circum);
}

public void area_rect(int l,int b){
int area=l*b;
System.out.println("Area of Rectangle :"+ area);
}

public void circum_rect(int l,int b){
int circum=2*l+b;
System.out.println("Circumference of Rectangle :"+ circum);
}

public void area_rect() {
    
    
}
public void circum_rect() {
    
    
}

public void area_square() {
    
    
}

public void circum_square() {
   
    
}

public void area_circle() {
    
    
}

public void circum_circle() {
    
    
}
}

public class InterfaceOver {
public static void main(String args[]){
Shapes sh=new Shapes();

sh.area_circle(3);
sh.circum_circle(3);
sh.area_square(4);
sh.circum_square(4);
sh.area_rect(10,20);
sh.circum_rect(10,20);
}
}

