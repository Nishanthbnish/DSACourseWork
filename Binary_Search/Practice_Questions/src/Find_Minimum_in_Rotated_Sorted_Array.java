public class Find_Minimum_in_Rotated_Sorted_Array
{
    public static void main(String[] args) {
    int[] arr ={11,13,15,17};
        System.out.println(pivot(arr));
    }
    public static int pivot (int [] nums){
        int start =0 ;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] < nums[mid+1]){
                return nums[start];
            }

            else{
                start = mid+1;
            }
        }
        return -1;
    }
    //public int findMin(int[] nums) {
    //         int start =0 ;
    //        int end = nums.length-1;
    //        while(start < end){
    //            int mid = start + (end - start)/2;
    //            if( nums[mid] < nums[end]){
    //                end =mid;
    //            }
    //
    //            else{
    //                start = mid+1;
    //            }
    //        }
    //        return nums[start];
    //    }
}
