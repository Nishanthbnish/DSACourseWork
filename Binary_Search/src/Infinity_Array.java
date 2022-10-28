public class Infinity_Array
{
    public static void main(String[] args)
    {
        int []nums={2,3,4,5,6,7,8,15,16,17,25,67,135};
        int ans=ans(nums,6);
        System.out.println(ans);

    }
    public static int ans(int [] nums,int target)
    {
        int start=0;
        int end=1;
        while(target > nums[end])
        {
            int newStart = end +1;
            end = end + (end - start + 1 )*2; //Doubling size of array * 2
            start=newStart;

        }
        return Binarysearch(nums,target,start,end);

    }

    public static int Binarysearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                return mid;
        }
        return -1;


    }
}
