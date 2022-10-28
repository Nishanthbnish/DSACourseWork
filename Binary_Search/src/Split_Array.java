//410. Split Array Largest Sum
public class Split_Array {
    public static void main(String[] args) {
int [] arr={1,2,3,4,5};
        System.out.println(splitArray(arr,2));
    }
    public static int splitArray(int[] nums, int m) {
    int start =0;
    int end =0;
    for(int i=0 ;i < nums.length;i++){
        start = Math.max(start, nums[i]); //max value in array
        end += nums[i];//sum of all array
    }
    //Binary Search
        while(start < end){
            //try for the middle as potential answer
            int mid = start + (end - start)/2;

            //calculate how many pices you can divide this in with this max sum
            int sum = 0;
            int pices = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add this in this subarray make new one
                    //say you add this num in new subbarray then sum= num
                    sum = num;
                    pices++;
                }
                else {
                    sum += num;
                }
            }

            if(pices > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
