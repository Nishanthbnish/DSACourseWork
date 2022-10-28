import java.util.Arrays;

public class Richest_customer_Wealth
{
    public static void main(String[] args)
    {
     int [][]arr = {
             {1,2,3},
             {3,2,1}
     };
     int ans= maximumWealth(arr);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts)
    {
        int max=0;
        for(int i=0;i< accounts.length; i++){
            int ans1=0;
            for(int j=0;j<accounts[i].length; j++){
                ans1+=accounts[i][j];

            }
            if(ans1>max)
                max=ans1;

        }
        return max;


    }
}
