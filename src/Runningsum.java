import java.util.Arrays;

public class Runningsum
{
//    public static int[] runningSum(int[] nums)
//    {
//        int n=nums.length;
//        for(int i=1;i< n;i++)
//        {
//
//
//            nums[i]+= nums[i-1];//{0,1,2,3,4)
//
//
//        }
//        return nums;
//    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0,j=0;i<n;i++,j=j+2){
            ans[j]=nums[i];
            ans[j+1]= nums[i+n];
        }


        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,};
        int []n=shuffle(nums,3);
        System.out.println(Arrays.toString(n));

    }
}
