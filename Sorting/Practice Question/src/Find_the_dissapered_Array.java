import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//448. Find All Numbers Disappeared in an Array
//Asked in Google
public class Find_the_dissapered_Array
{
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};

        System.out.println(missingNumber(arr));
    }
    public static List<Integer> missingNumber(int[] nums)
    {
        //int [] ans = new int[Integer.MAX_VALUE];
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
                list.add(index + 1);

            }
        }
        //case 2: return length of the array if it is sorted
        return list;

    }
    static void swap(int []arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
