import java.util.Arrays;

public class Last_word
{
    public static void main(String[] args) {
    String s ="   fly me   to   the moon  ";
        String str = s.replaceAll("\\s", " ");;

        System.out.println(str.trim());
        String ans = s.substring(str.length());
        System.out.println(ans.length());
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
