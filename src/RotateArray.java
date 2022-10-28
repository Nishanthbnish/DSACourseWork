import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args)
    {
     int[] nums={477181,661861,837383,492412,935349,84343};
     rotate(nums,2);
    }

    //0ms
    public static void reverse(int[] nums, int start, int end)
        {
            while(start < end)
            {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;end--;
            }
        }
        public static void rotate(int[] nums, int k)
        {
            int len = nums.length;
            if(k > len) k = k % len;
            int count = len - k;

            reverse(nums, 0, count - 1);
            reverse(nums, count, len - 1);
            reverse(nums, 0, len - 1);
            System.out.println(Arrays.toString(nums));

        }


//5ms
//public void rotate(int[] nums, int k)
// {
//    int N = nums.length;
//    k %= N;
//        if (k == 0 || N == 1) return;

    // startIdx: index you start at, track to prevent cycle
    // currIdx: current index you are on in cycle
    // currNum: number you are about to swap to
    // totalSwaps: count of amount of swaps made
//    int startIdx = 0, currIdx = 0, currNum = nums[0], totalSwaps = 0;
//
//        while (totalSwaps < N) {
//    currIdx = (currIdx + k) % N;
//
//    // swap
//    int temp = nums[currIdx];
//    nums[currIdx] = currNum;
//    currNum = temp;
//    totalSwaps++;
//
//    if (currIdx == startIdx && totalSwaps < N) {
//        startIdx++;
//        currIdx = startIdx;
//        currNum = nums[currIdx];
//    }
//}
    //My solution
//    public static void rotate(int[] nums, int k)
//    {
//        int n= nums.length;
//        while(k>0){
//            int temp=0;
//            temp=nums[n-1];
//            nums[n-1]=0;
//            for(int i=n-1; i>=0;i--){
//                if(i==0){
//                    nums[i]=temp;
//                }
//                else {
//                    nums[i]=nums[i-1];
//                }
//            }
//            k--;
//
//        }
//        System.out.println(Arrays.toString(nums));
//
//
//    }
}
