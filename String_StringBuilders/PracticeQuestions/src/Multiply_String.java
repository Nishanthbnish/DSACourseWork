public class Multiply_String
{
    public static void main(String[] args) {
        System.out.println(multiply("123456879","987654321"));
        String [] s = {"flow","flying","flew"};
        System.out.println(longestCommonPrefix(s));
        String alpha = "abc";
        System.out.println(validPalindrome(alpha));
    }

    //valid palindrome
//    public static boolean isPalindrome(String s)
//    {
//        //My Solution
//        String str = s.replaceAll("[^a-zA-Z0-9]", "");
//        String lower = str.toLowerCase();
//        StringBuilder sb = new StringBuilder(lower);
//        String reverse = sb.reverse().toString();
//        if(reverse.equals(lower)){
//            return true;
//        }
//        return false;
//        //One More Solution
////             s = s.replaceAll("[^A-Z0-9a-z]", "").toLowerCase();
////             int left = 0, right = s.length() - 1;
////             while(left<right){
//////
////                 if(!(s.charAt(left++) == s.charAt(right--))) return false;
////             }
////             return true;
//
//    }
    //Valid palindrome
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // delete left or right
                return helper(s, i + 1, j) || helper(s, i, j - 1);
            }
        }

        return true;
    }

    private static boolean helper(String s, int start, int end) {
        int i = start, j = end;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }




    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++)
        {
            String currString = strs[i];

            while(!currString.startsWith(prefix))
            {
                int s =prefix.length() - 1;
                prefix = prefix.substring(0,s);
            }
        }
        return prefix;
    }
    public static String multiply(String num1, String num2) {
        long n = 0,m = 0;
        String[] arr = num1.split( " ");
        String[] arr1 = num2.split( " ");

        StringBuilder sb =new StringBuilder();
        for (String s: arr) {
           n = Integer.parseInt(s.substring(0,s.length()));
        }
        for (String s: arr1) {
            m = Integer.parseInt(s.substring(0,s.length()));
        }
        long ans = n * m;
        return String.valueOf(ans);
    }
}
