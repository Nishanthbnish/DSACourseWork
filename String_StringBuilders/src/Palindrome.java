public class Palindrome
{
    public static void main(String[] args)
    {
        String name = null;
        String ip = "1.1.1.1";
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.replace(0,ip.length(),"."));
        System.out.println(ip.replace(".","[.]"));
        System.out.println(palindrome(name));


    }
    //O(n) Complexity

    static boolean palindrome(String str){
        if(str == null || str.length()== 0){
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i); //Strart ++
            char end = str.charAt(str.length() - 1 - i); //comming from back end of the string // End --;
            if(start != end){
                return false;
            }

        }
        return true;
    }
    public String breakPalindrome(String str) {
        if(str == null || str.length()== 0){
            return "";
        }
        if(str.length() == 1){
            return "";
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i); //Strart ++
            char end = str.charAt(str.length() - 1 - i); //comming from back end of the string // End --;
            if(start != end){
                return str;
            }

        }
        StringBuilder myName = new StringBuilder(str);
        myName.setCharAt(2, 'a');
        String s = String.valueOf(myName);
        return s;
    }
    //Replace Charecter in perticular position
    public String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
    public static String defangIPaddr(String address)
    {
        return address.replace(".","[.]");

    }
}
