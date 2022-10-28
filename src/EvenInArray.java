public class EvenInArray
{
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums)
    {
        int n=nums.length,count=0,ans=0;
        for(int i=0;i<n;i++)
        {
            int div=nums[i];
            while(div >0){
                //int rem=div%10;
                div=div/10;
                count++;
            }
            if(count % 2 == 0)
                ans++;
                count=0;
        }
        return ans;

    }
}
