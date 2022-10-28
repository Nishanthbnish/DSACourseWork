import java.util.Arrays;

public class Stream
{
    public static void main(String[] args) {
        String s = "avabcacad";
        skip("",s);
        System.out.println(skip1(s));
        System.out.println(skipApple("bacapplevbca"));
//        System.out.println(skipAppNotApple("bacapplvbca"));
    }
    public static String skipAppNotApple(String up){
        if(up.isEmpty()){ //when up = " "
            return ""; //return empty string
        }
        //skip app when string is not apple
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));//b ,cacad;
        }
    }
    public static String skipApple(String up){
        if(up.isEmpty()){ //when up = " "
            return ""; //return empty string
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));//b ,cacad;
        }
    }
    private static String  skip1(String up)
    {
        if(up.isEmpty()){ //when up = " "
            return ""; //return empty string
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip1(up.substring(1)); // p = " ", cacad;
        }
        else{
            return ch + skip1(up.substring(1));//b ,cacad;
        }

    }

    private static void skip(String p,String up)
    {
        if(up.isEmpty()){ //when up = " "
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1)); // p = " ", cacad;
        }
        else{
            skip(p + ch,up.substring(1));//b ,cacad;
        }
    }
    public static String removeConsecutiveDuplicates(String input)
    {
        if (input.length() <= 1)
            return input;
        if (input.charAt(0) == input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
    }
}
