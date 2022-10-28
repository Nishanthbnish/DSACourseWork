public class _Atmost_Equilent_strings
{
    public static void main(String[] args) {
        String s1 = "cccddabba";
        String s2 = "babababab";

        System.out.println(checkAlmostEquivalent(s1,s2));

    }


    public static boolean checkAlmostEquivalent(String word1, String word2) {

//        for (int i = 0; i <word1.length() ; i++) {
//            int count = 0,add = 0,temp = 0;
//            for (int j = 0; j < word2.length(); j++) {
//                if(word1.charAt(i) == word1.charAt(j)){
//                    count++;
//                }
//                if(word1.charAt(i) == word2.charAt(j)){
//                    add++;
//                }
//            }
//
//             temp = count - add;
//            if(temp > 3){
//                return false;
//            }
//        }
//        return true;
        //2nd solution
        int[] tally1 = new int[26];
        int[] tally2 = new int[26];

        for (char ch : word1.toCharArray()) {
            tally1[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            tally2[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(tally1[i] - tally2[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
