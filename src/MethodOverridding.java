    class Language {
        public void displayInfo() {
          System.out.println("Common English Language");
        }
      }
      
      class Java extends Language {
        public void displayInfo() {
          System.out.println("Java Programming Language");
        }
      }
      
      public class MethodOverridding {
        public static void main(String[] args) {
      
          // create an object of Java class
          Java j1 = new Java();
          j1.displayInfo();
      
          // create an object of Language class
          Language l1 = new Language();
          l1.displayInfo();
        }
      }