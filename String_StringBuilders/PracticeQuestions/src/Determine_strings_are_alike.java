public class Determine_strings_are_alike
{
    public static void main(String[] args)
    {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s)
    {
//        StringBuilder s1 = new StringBuilder();

        String s1 = s.toLowerCase();
        int n = s1.length()/2;
        int c1 = 0,c2 = 0;
        for(int i = 0 ;i < n;i++){
            if(s1.charAt(i) == 'a'||s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u'){
                c1 ++;
            }
        }
        for(int i = n ;i < s1.length();i++){
            if(s1.charAt(i) == 'a'||s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u'){
                c2 ++;
            }
        }
        if(c1 == c2){
            return true;
        }
        return false;
    }
}
