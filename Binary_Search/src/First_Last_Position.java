import java.util.Arrays;

public class First_Last_Position
{
    public static void main(String[] args)
    {
        int [] nums ={5,7,7,8,8,10};
        int [] ans= searchRange(nums,8);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target)
    {
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        int [] ans = {-1,-1};
        ans[0]= start;
        ans[1]= end;
        return ans;

    }
    public static int search(int [] nums,int target,boolean findnextrange){
        int start=0;
        int end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end -start)/2;

            if(target < nums[mid]){
                end = mid -1 ;

            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findnextrange) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }


        }
        return ans;



    }



}
