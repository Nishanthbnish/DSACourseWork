public class Perfect_square
{
    public static void main(String[] args) {
        int num= 25;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;//16
        if(num == 1){ // 1 == 1 : true
            return true;
        }
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid * mid == num){ //4 * 4 == 16 :true
                return true;
            }
            else if( mid > num/mid){ //num/mid basically : 16/8 = 8 > 2 : end = 7;
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
}
