import java.util.Arrays;

public class Median_of_two_sorted_array
{
    public static void main(String[] args) {
        int [] nums1={1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] ans =new int[n+m];
        int pos=0;
        for (int element : nums1) {
            ans[pos] = element;
            pos++;
        }

        for (int element : nums2) {
            ans[pos] = element;
            pos++;
        }
        Arrays.sort(ans);
        int len = ans.length;
        if (n % 2 != 0)
            return (double)ans[len / 2];

        return (double)(ans[(len - 1) / 2] + ans[len / 2]) / 2.0;

    }


}
