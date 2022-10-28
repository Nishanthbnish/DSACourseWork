import java.util.Arrays;

public class Find_the_index_of_the_First_occurence_in_string
{
    public static void main(String[] args) {
        String s1 = "sadbutsad";
        String s2 = "sad";
        //String str = String.valueOf(s1.startsWith("sadu")); it Checks with begining with first index till that "sadu";
        //System.out.println(str); (Print False = "sadu")   (print True for "Sad")
        System.out.println(strStr(s1,s2));
    }
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            String t = haystack.substring(i);
            if(t.startsWith(needle)){
                return i;
            }
        }
        return -1;
    }

}