public class Check_If_Two_String_Arrays_are_Equivalent
{
    public static void main(String[] args)
    {
        String [] w1 = {"abc", "d", "defg"};
        String [] w2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(w1,w2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb1.append(word2[i]);
        }
        String s1 = sb.toString();
        String s2 = sb1.toString();
        return s1.equals(s2);
    }
}
