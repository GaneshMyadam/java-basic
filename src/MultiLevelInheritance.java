    class Electronics {                                           //super class
        public Electronics(){                           
        System.out.println("Class Electronics");
        }
        public void deviceType() {
        System.out.println("Device Type: Electronics");
        }
        }
        class Television extends Electronics {                  //1st child class
        public Television() {
        System.out.println("Class Television");
        }
        public void category() {
        System.out.println("Category - Television");
        }
        }
        class LED extends Television {                        //2nd child class for 1st child class
        public LED() {
        System.out.println("Class LED");
        }
        public void display_tech() {
        System.out.println("Display Technology- LED");
        }
        }
        public class MultiLevelInheritance {
        public static void main(String[] args) {
        LED led = new LED();
        led.deviceType();
        led.category();
        led.display_tech();
        }
    }
