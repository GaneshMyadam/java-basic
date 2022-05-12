import java.util.regex.*;
public class RegEx1 {
        public static void main(String[] args) {
          Pattern pattern = Pattern.compile("GlobalEdge", Pattern.CASE_INSENSITIVE); //creating a pattern
          Matcher matcher = pattern.matcher("visit GlobalEdge!"); //string to be match with pattern
          boolean matchFound = matcher.find(); //returns boolean for the given is string matches the pattern
          if(matchFound) {
            System.out.println("Match found");
          } else {
            System.out.println("Match not found");
          }
        }
      }
