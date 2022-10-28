import java.util.Arrays;
import java.util.OptionalInt;

public class Longest_substring
{
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }
    public static int lengthOfLongestSubstring(String s) {
        String str = s;
        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) !=str.charAt(j)) {
                    temp++;
                }
            }
             //str = s.substring(0,temp);
            str.subSequence(0,temp);
            System.out.println(str);
        }
        return s.length();
    }

}
