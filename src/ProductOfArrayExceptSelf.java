import java.util.Arrays;

public class ProductOfArrayExceptSelf
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4 };
        int []n=productExceptSelf(nums);

        System.out.println(Arrays.toString(n));
    }

    //My Solution
//    public static int[] productExceptSelf(int[] nums)
//    {
//        int[] ans=new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            int mul=1;
//            for(int j=0;j<nums.length;j++){
//                if(i!=j)
//                    mul=mul*nums[j];
//            }
//            ans[i]=mul;
//        }
//        return ans;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output = new int[N];

        output[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i - 1] * output[i - 1];//now output has all products from left to right stored ;
        }

        int R = 1;//using this for multiplying in place of right array ;
        for (int i = N - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }
        return output;
    }
}
