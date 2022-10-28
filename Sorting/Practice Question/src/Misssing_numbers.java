import java.util.Arrays;

public class Misssing_numbers
{
    public static void main(String[] args) {
        int [] arr ={3,4,-1,1};

        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums)
    {
        int i = 0;
        while(i < nums.length){
            int index = nums[i] - 1; //[0,n]
                if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[index] ){
                    swap(nums, i , index);
                }
                else{
                    i++;
                }
        }
        //search for first missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        //case 2: return length of the array if it is sorted
        return nums.length + 1;

    }
    static void swap(int []arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
