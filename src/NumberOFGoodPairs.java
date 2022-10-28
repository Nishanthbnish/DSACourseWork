import java.util.Arrays;

public class NumberOFGoodPairs
{
    public static void main(String[] args) {
        int [] nums={1,2,3,1,1,3};
        int n=numIdenticalPairs(nums);
        char[]c;
        System.out.println(n);

    }
//    public static int numIdenticalPairs(int[] nums)
//    {
//        int count=0;
//        int n=nums.length;
//        for(int i=0;i< n ; i++){
//            for(int j=i+1;j<n;j++)
//            {
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//
//            }
//
//
//        }
//        return count;
        public static int numIdenticalPairs(int[] nums) {
            int pairs = 0;
            int cnt[] = new int[101];   // count array

            for(int i=0; i<nums.length; i++)
                cnt[nums[i]]++;             //incrementing the corrsponding value based on occurance

            for(int i=1; i<cnt.length; i++){
                int n = cnt[i];
                if(n >= 2)                  // if >=2 then only pair can be formed!!
                    pairs += (n* (n-1))/2;  // nC2 = (n * (n-1))/2
            }
            return pairs;
        }

    }

