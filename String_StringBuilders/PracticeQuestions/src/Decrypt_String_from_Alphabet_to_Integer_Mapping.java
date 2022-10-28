public class Decrypt_String_from_Alphabet_to_Integer_Mapping
{
    public static void main(String[] args) {
        String s = "12#11#12";
    }
    public static String freqAlphabets(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)=='#') {
                int x=((s.charAt(i-1) -'0'+(s.charAt(i-2)-'0')*10)+96);
                str.append((char)x);
                i=i-2;
            }
            else {
                int x=s.charAt(i)-'0'+96;
                str.append((char)x);
            }
        }
        return (str.reverse().toString());
    }
}
