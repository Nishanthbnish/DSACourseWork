public class Excel_Sheet_coloum
{
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
        System.out.println();
    }
    public static int titleToNumber(String s) {
        int result = 0,a= 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
            // a = result = i;
        }
        System.out.println(a);
        return result;
    }
}
