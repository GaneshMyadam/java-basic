/*Character class method Example*/
import java.util.regex.*; 
public class RegExChar {
    
public static void main(String args[]){  
System.out.println(Pattern.matches("[amn]", "abcd")); //false (not a or m or n)  
System.out.println(Pattern.matches("[amn]", "a"));  //true (among a or m or n)  
System.out.println(Pattern.matches("[amn]", "ammmna"));  //false (m and a comes more than once)  
}
} 
