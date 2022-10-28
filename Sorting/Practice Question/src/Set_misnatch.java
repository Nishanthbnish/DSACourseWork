import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set_misnatch
{
    public static void main(String[] args) {
        int [] arr ={1,2,2,4};
        int [] ans = missingNumber(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] missingNumber(int[] nums)
    {
        ///int [] ans = new int[Integer.MAX_VALUE];
        List<Integer> list = new ArrayList<>(); //interface
        int i = 0;
        while(i < nums.length){
            int index = nums[i] - 1; //[1,n]
            if(nums[i] != nums[index]){
                swap(nums, i , index);
            }
            else{
                i++;
            }
        }
        //search for first missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){  //[1,n]
               return new int[]{nums[index],index + 1}; //For duplicate value : (2) is Repeated

            }
        }
            return new int[]{-1,-1};

    }
    static void swap(int []arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
