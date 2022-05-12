public class MethodOverloadingDataType {
             // this method accepts int
        private static void display(int a){
            System.out.println("Got Integer data.");
        }
            // this method  accepts String object
        private static void display(String a){
            System.out.println("Got String object.");
        }
            public static void main(String[] args) {
            display(100);
            display("Hello");
        }
    }
