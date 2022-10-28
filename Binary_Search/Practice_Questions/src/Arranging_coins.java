public class Arranging_coins
{
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {
//        long start = 1;
//        long end = n;
//        long res = 0;
//        while(start<=end){
//            long mid =start + (end-start)/2;
//            long coins= (mid/2) * (mid+1);
//            if(coins > n)
//                end = mid-1;
//            else
//                start = mid + 1;
//                res = Math.max(mid,res);
//
//        }
//        return (int)res;
//        one more ans
//        return ((int) Math.sqrt(1 + (long) n << 3) - 1) >> 1;

        //3rd soln
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }

}
