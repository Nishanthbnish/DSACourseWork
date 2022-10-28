public class Reverse_Prefix_of_word
{
    public static void main(String[] args) {
        String str = "abcdefd";
        System.out.println(reversePrefix(str,'d'));
    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb ;
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if(ch == word.charAt(i)){
                index = i;
                break;
            }
        }
        sb = new StringBuilder(word.substring(0,index + 1));
        sb.reverse();
        String s = String.valueOf(sb.append(word.substring(index + 1,word.length())));

        return s;
    }
}
