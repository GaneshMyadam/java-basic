    class Calculate{
        int sum(int i,int j)
        {
        return i+j;                
        }
        int subract(int i,int j)
        {
        return i-j;
        }
        }
        public class SingleInhertance1 extends Calculate {     //extending superclass propeties
        int mul(int a, int b)
        {
        return a*b;
        }
        int divide(int c, int d)
        {
        return c/d;
        }
        public static void main(String args[]) {
         SingleInhertance1 calc= new SingleInhertance1();
        System.out.println(calc.sum(2,2));         //calling sum method
        System.out.println(calc.subract(12,6));     //calling subtract method       
        System.out.println(calc.mul(8,9));         //calling multiplication method
        System.out.println(calc.divide(2,2));      //calling divide method
        }
        }
