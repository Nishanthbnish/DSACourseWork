public class SortSentence
{
    public static void main(String[] args) {
    String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        // Comparator<String> ascOrder = (s1, s2) -> s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
        // String[] words = s.split(" ");
        // Arrays.sort(words, ascOrder);
        // StringBuilder sentence = new StringBuilder();
        // for (int i = 0; i < words.length; i++) {
        // 	String word = words[i];
        // 	sentence.append(word.substring(0, word.length() - 1));
        // 	if (i < words.length - 1) {
        // 		sentence.append(" ");
        // 	}
        // }
        // return sentence.toString();
        // }
        // 2nd solution
//         First make a string array and enter the words separated by spaces
// then make a another array , let it be temp, and insert every string at the given index at its last. ( do not insert the number at its last index ).
// now convert it into string and return it
// HAPPY CODING
        String str[ ] = s.split(" "), temp[] = new String[str.length];
        int n = str.length;
        StringBuilder sb = new StringBuilder();

        for(String s1 : str)
            temp[s1.charAt(s1.length() - 1) - '1'] = s1.substring(0, s1.length() - 1);
        for(int i = 0; i < n - 1; i++)
            sb.append(temp[i]).append(" ");
        sb.append(temp[n - 1]);
        return sb.toString();
    }
}
