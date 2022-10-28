import java.util.Arrays;
import java.util.HashSet;

import static java.time.LocalTime.MAX;

public class Intersection_of_two_array
{
    public static void main(String[] args)
    {
        int [] nums1={4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
//    public static int[] intersection(int[] nums1, int[] nums2)
//    {
//        int [] ans =new int[3];
//        for (int i = 0; i < nums2.length; i++) {
//            ans[i] = Binarysearch(nums1,nums2[i]);
//
//        }
//        return ans;
//    }

    public static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                return arr[mid];
        }
        return -1;


    }
    //Real solution for this
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);  //add unique elements only
                }
            }
        }
        int arr[] =new int[set.size()]; //learn from this setting the size for array in diffrent approch
        int j =0;         //for itteration in array

        for(int i :set){
            arr[j] =i;
            j++;
        }
        return arr;
    }
    //Leetcode Ans
    //public int[] intersection(int[] nums1, int[] nums2) {
    //    HashSet<Integer> set1 = new HashSet<Integer>();
    //    for (Integer n : nums1) set1.add(n);
    //    HashSet<Integer> set2 = new HashSet<Integer>();
    //    for (Integer n : nums2) set2.add(n);
    //
    //    set1.retainAll(set2);
    //
    //    int [] output = new int[set1.size()];
    //    int idx = 0;
    //    for (int s : set1) output[idx++] = s;
    //    return output;
    //  }
}
