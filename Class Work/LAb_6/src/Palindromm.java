import java.util.*;

public class Palindromm {
    public static boolean isPalindromeSentence(String sentence) {
        Stack <String> p = new Stack<>();
        
        boolean c;
        
        for (int i = 0; i < sentence.length(); i++) {
            c = Character.isAlphabetic(sentence.charAt(i));
            char a;
            
            if (c)  {
                a = Character.toLowerCase(sentence.charAt(i));
                p.push (a + "");
            }
            else  {
                i++;
            }
        }
        String reversed = "";
        while (!p.isEmpty())    {
            reversed += p.pop();
        }

        return sentence.equals(reversed);
    }
    
    public static void main(String args[])
    {
        System.out.println(Palindromm.isPalindromeSentence("daa"));
    }
}