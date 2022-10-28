public class reverse_a_Number
{

    public static void main(String[] args) {
        int s = -121;
//        reverse(s);
//        System.out.println(sum);
        System.out.println(reverse2(s));
        System.out.println(reversesum(s,0));
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        String s1 = String.valueOf(sb.reverse());
        if(s.equals(s1)){
            return true;
        }
        return false;
        //2nd Solution
    //String s = String.valueOf(x);
        //
        //        int num = s.length();
        //
        //        int count = s.length()/2;
        //
        //        int i=0;
        //        while(i<count){
        //            if(s.charAt(i)!=s.charAt(num-1-i)) {
        //               return false;
        //            }
        //            i++;
        //        }
        //        return true;
        //
        //}
    }
    static int sum = 0;
    static void reverse(int n){
        if( n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }
    static int reversesum(int n,int add){
        if( n == 0){
            return add;
        }
        int rem = n % 10;
        add = add * 10 + rem;
        return reversesum(n/10,add);
    }
    public static int reverse2(int n){
        int digits = (int) (Math.log10(n)) + 1; //To find base of the number
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return (int) (rem * (Math.pow(10,digits - 1)) + helper(n/10 , digits - 1));
    }

}
