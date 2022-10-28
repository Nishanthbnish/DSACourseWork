import java.sql.SQLOutput;
import java.util.Arrays;

public class No_of_string_appear_in_substring_word
{
    public static void main(String[] args) {
        String [] s = {"a","abc","bc","d"};
        String s1 ="abc";
//        System.out.println(numOfStrings(s,s1));
//        System.out.println(judgeCircle("RRDD"));
        //Reverse word in String |||
//        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(canReach("011010" ,2,3));
    }

    public static boolean canReach(String s, int minJump, int maxJump)
    {
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length() - 1; j++) {
//                if(i + minJump <= j <= Math.min(i + maxJump, s.length() - 1) && s[j] == 0){
//
//                }
//            }

            if(s.charAt(maxJump) == 0){
                if(s.charAt(minJump) == 0){
                    return true;
                }
            }
            return false;
        }


        public static String reverseWords(String s) {
            String[] strArr = s.split(" ");
            StringBuilder bWord;
            StringBuilder finalStr = new StringBuilder();

            for (String value : strArr) {
                bWord = new StringBuilder(value);
                bWord.reverse();
                finalStr.append(bWord).append(" ");
            }

            return finalStr.toString().trim();
        }

    public static boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                left++;

            } else if (ch == 'R') {
                right++;
            } else if (ch == 'U') {
                up++;
            } else if (ch == 'D') {
                down++;
            }
        }
        return left == right && up == down;
        //one more solution
//        e
    }
    public static int numOfStrings(String[] patterns, String word)
    {
        StringBuilder s = new StringBuilder();
        s.reverse();
        int count = 0;
        for (String str: patterns) {
            if(word.contains(str)){
                count++;
            }
        }
        return count;
    }


}
