import java.util.Arrays;

public class Add_Binary_value
{
    public static void main(String[] args) {
    String a = "11" ,b = "1";
        //System.out.println(addBinary(a,b));
       int n = 01111;
        //System.out.println(reverseBits(n));
        System.out.println(countbit(n));
        System.out.println(Arrays.toString(countingbit(5)));

    }
    //Counting Bit 338

    static int[] countingbit(int n){

        int [] ans = new int [n + 1];
        for (int i = 0; i <= n ; i++) {
            int count = 0;
            int temp = i;
            while ( temp > 0){
                if((temp & 1) == 1){
                    count ++;}
                //n = n & (n-1);
                temp = temp >> 1;
        }
            ans[i] = count;
        }
        return ans;
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);

        int carry = 0;
        for(int i = 1; i <= maxLen; i++) {
            int sum = carry;

            if (aLen - i >= 0) sum += (a.charAt(aLen - i) - '0');
            if (bLen - i >= 0) sum += (b.charAt(bLen - i) - '0');

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) result.insert(0, carry);

        return result.toString();
    }

    //Count the bit

    static int countbit(int n){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((n & 1) == 1){
                count ++;}
            //n = n & (n-1);
            n = n >> 1;
        }
        return count;
    }
    //reverse the bit
    public static int reverseBits(int n) {
        if (n == 0) return 0;
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((n & 1) == 1) rev++;
            n >>= 1;
        }
        return rev;

        //int ans=0;
        //        for(int i=0;i<32;i++)
        //        {
        //            ans<<=1;
        //            ans |=(n&1);
        //            n>>=1;
        //        }
        //        return ans;
    }

}
