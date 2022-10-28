//33. Search in Rotated Sorted Array
public class SearchInRotatedSortedArray
{
    public static void main(String[] args)
    {
    int [] arr ={1,2,3,5,6,0};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int target)
    {
        int pivot= pivot(nums);

        if(pivot == -1){
            return Binarysearch(nums,target,0,nums.length-1);
        }
        if( nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0] ){
            return Binarysearch(nums,target,0,pivot-1);
        }
        return Binarysearch(nums,target,pivot+1,nums.length-1);

    }
    public static int Binarysearch(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                return mid;
        }
        return -1;


    }
//this will not work in duplicate values
    public static int pivot (int [] nums){
        int start =0 ;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }if (nums[mid] <= nums[start]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

}
