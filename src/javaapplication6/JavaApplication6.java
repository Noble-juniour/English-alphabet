
package javaapplication6;
import java.util.*;
public class JavaApplication6 {
    public static void main(String[] args) {
      
        char[] alphabet = new char[26];
        
        for(int i = 0; i < 26; i++)
        {
            alphabet[i] = (char)(97 + i);
        }
        System.out.println(Arrays.toString(alphabet));

    }
    
}
