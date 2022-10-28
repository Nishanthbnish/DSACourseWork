import java.util.Arrays;

public class FindXorSumOfAllPairs
{
    public static void main(String[] args) {
    int [] arr1 = {1,2,3} ;
    int [] arr2 = {6,5};
        System.out.println(getXORSum(arr1,arr2));
    }
//    public  static int getXORSum(int[] arr1, int[] arr2) {
//    int [] ans =  new int[arr1.length * arr2.length];
//        int temp = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                ans [temp] = arr1[i] & arr2[j];
//                temp++;
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < ans.length; i++) {
//            sum = sum ^ ans[i];
//        }
////        System.out.println(Arrays.toString(ans));
//        return sum;
//    }
    //2nd solution
     public static int getXORSum(int[] a, int[] b) {
            int xor_a = 0;
            int xor_b = 0;
            for(int e : a){
                xor_a ^= e;
            }
            for(int e : b){
                xor_b ^= e;
            }
            return xor_a & xor_b;
        }
}
