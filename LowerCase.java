/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String result = args[0];
        System.out.println(lowerCase(result));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
            String result = " ";
            char ch = ' ';
            for (int i = 0; i < s.length(); i++) {
                
                //check valid alphabet and it is in Uppercase
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    ch = (char)(s.charAt(i) + 32);
                }
                //else keep the same alphabet or any character
                else {
                    ch = (char)(s.charAt(i));
                }
                
                result += ch; // concatenation, append c to result
            }
            return result;
        }
    }