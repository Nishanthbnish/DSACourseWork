public class Prime_Number_On_set_Bits
{
    public static void main(String[] args)
    {
        int l = 10, r = 15;
        System.out.println(countPrimeSetBits(l,r));
        System.out.println(1 & 6);

    }
    public static int countPrimeSetBits1(int L, int R) {
        int ans = 0;
        for (int x = L; x <= R; ++x)
            if (isSmallPrime(Integer.bitCount(x)))
                ans++;
        return ans;
    }
    public static boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }
    public static int countPrimeSetBits(int left, int right) {
        int ans =0;
        for (int i = left; i <= right ; i++) {
            int count = 0;
            int temp = i;
            while ( temp > 0){
                if((temp & 1) == 1){
                    count ++;}
                temp = temp >> 1;
            }
            ans = ans + prime(count);
        }
        return ans;
    }
    public static int prime(int n){
        int c = 2,count = 0;
        if(n == 1)
        {
            return 0;
        }
        while(c * c <= n){
            if(n % 2 == 0){
                return 0;
            }
            c = c + 1;
        }
        return 1;
    }
}
