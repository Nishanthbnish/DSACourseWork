import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_The_Duplicates_from_the_Array
{
    public static void main(String[] args) {
        int[] a1 ={0,0,1,1,1,2,2,3,3,4};
        int [] a2 = {3,2,2,3};
        System.out.println(removeDuplicates(a1));
        System.out.println(removeDuplicatesValue(a2,3));
        //minimum cost to move chips
        int [] a3 = {1,2,3};
        System.out.println(minCostToMoveChips(a3));
    }
    public static int removeDuplicates(int[] nums)
    {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }
    public static int removeDuplicatesValue(int[] nums,int target) {
        int i = 0;
        for (int n : nums)
            if (n != target)
                nums[i++] = n;
        System.out.println(Arrays.toString(nums));
        return i;
    }
//    ArrayList<Integer> list = new ArrayList<>();
////    Arrays.sort(nums);
//    for (int i = 0; i < nums.length ; i++) {
//        if(nums[i] != target){
//            list.add(nums[i]);
//        }
//    }
//    System.out.println(list);
//    return list.size();

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int n:position) {
            if(n % 2 == 0){
                even++;
            }
        }
        return Math.min(even,position.length - even);
    }
}
