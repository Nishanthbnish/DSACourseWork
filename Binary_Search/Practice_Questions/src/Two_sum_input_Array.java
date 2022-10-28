import java.util.Arrays;

public class Two_sum_input_Array
{
    public static void main(String[] args)
    {
    int []arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));


    }
    public static int[] twoSum(int[] numbers, int target)
    {
        int start = 0;
        int end = numbers.length-1;
        int [] ans =new int [2];
        while(start < end ){
            if(numbers[start] + numbers[end] == target){
                ans[0]=start + 1;
                ans[1] = end + 1;
            }
            if(numbers[start] + numbers[end] > target){
                end --;
            }
            else{
                start++;
            }
        }
        return ans;

    }
    //One more solution
    //public int[] twoSum(int[] numbers, int target) {
    //        //set two pointers - left and right, similar to binary search
    //        int left = 0;
    //        int right = numbers.length - 1;
    //        while (left < right) {
    //            int sum = numbers[left] + numbers[right];
    //            if (sum == target) {
    //                return new int[]{left + 1, right + 1};
    //            }
    //            else if (sum < target)
    //                left++;
    //            else
    //                right--;
    //        }
    //        return new int[]{0,0};
    //    }
}
