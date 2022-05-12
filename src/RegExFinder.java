import java.util.regex.*;  
import java.util.Scanner;  
public class RegExFinder {
     
    public static void main(String[] args){    
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {    
                System.out.println("Enter regex pattern:");  
                Pattern pattern = Pattern.compile(sc.nextLine());    //Enter a pattern
                System.out.println("Enter text:");  
                Matcher matcher = pattern.matcher(sc.nextLine());   //text that is used to match in the pattern 
                boolean found = false;    
                while (matcher.find()) {    
                    System.out.println("I found the text "+matcher.group()+" starting at index "+    
                     matcher.start()+" and ending at index "+matcher.end());    
                    found = true;    
                }    
                if(!found){    
                    System.out.println("No match found.");    
                }    
            }
        }    
    }    
}  
