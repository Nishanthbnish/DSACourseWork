import java.util.Arrays;

public class Kt_missing_positive_number
{
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }
//    public static int findKthPositive(int[] arr, int k) {
//        int i=1;
//        while(k>0){
//            if(isPresent(arr,i)==-1){
//
//                k--;
//
//            }
//
//            i++;
//        }
//        return i-1;
//    }
//
//    static int  isPresent(int ar[],int target){
//        int l=0;
//        int r=ar.length-1;
//        while(l<=r){
//            int mid=l+(r-l)/2;
//            if(ar[mid]==target){
//                return mid;
//            }else if(ar[mid]>target){
//                r=mid-1;
//            }else{
//                l=mid+1;
//            }
//        }
//        return -1;
//    }
    //3rd solution
    public static int findKthPositive(int[] arr, int k) {
        if(k < arr[0])
            return k;

        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(countMissing(arr[mid], mid) < k) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return arr[end] + k - countMissing(arr[end], end);
    }

    static int countMissing(int num, int idx) {
        return num - idx - 1;
    }
}
