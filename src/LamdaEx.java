interface Abc{
    public void display();

}
    public class LamdaEx {
        public static void main(String[] args) {
            //with lamda
           Abc obj1 = ()-> {System.out.println("Hiii");
        };
            obj1.display();   
        }   
}
