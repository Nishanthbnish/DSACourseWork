public class Single_Element_In_sorted_array
{
    public static void main(String[] args) {
        int []nums={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] arr) {

        // We can do it in O(n) using only xor of every element

        // Binary Search Approach - O(logn)

        int n = arr.length;
        int lo = 0, hi = n-2;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid] == arr[mid^1]){
                lo = mid+1;
                int p=arr[mid^1];
                System.out.println(p);
            } else{
                hi = mid-1;
            }
        }

        return arr[lo];
    }
}
