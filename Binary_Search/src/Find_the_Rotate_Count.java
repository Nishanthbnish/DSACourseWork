import java.util.Arrays;

public class Find_the_Rotate_Count
{
    public static void main(String[] args)
    {
        int []arr={4,5,6,7,0,1,2};
        System.out.println(pivotCount(arr));

    }
    public  static  int pivotCount(int[]arr){
        int pivot = pivot(arr);
        return pivot + 1;
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
    //this will not work on non duplicate values
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
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //skip the duplicate
                //note  what if these ele as start and end where the pivot
                //check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start ++;
                //check if end is pivot
                if(nums[end] <nums[end-1]){
                    return end-1;
                }
                end --;
            } else if (nums[start] < nums[mid]|| (nums[start] == nums[mid] && nums[mid] > nums[end]) ) {
                start = mid+1;
            }
            else
                end = mid-1;

        }
        return -1;
    }
}

