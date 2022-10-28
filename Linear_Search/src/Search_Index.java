import java.lang.annotation.Target;
import java.util.Arrays;

public class Search_Index
{
    public static void main(String[] args) {
        int [] []arr ={
                {1,8,9,-1},
                {6,-8,5},
                {3,6444,622,-3},
                {5 , 42 ,35, 9,534}
        };

        System.out.println(max(arr));
        System.out.println(min(arr));

        int [] ans= index(arr,622);
        System.out.println(Arrays.toString(ans));

    }

    //Finding Index Value in an array
    public static int[] index(int [][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};
        //For Index Problem only

    }


    //Finding Maximum value
    public static int max(int [][] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] > max ){
                    max=arr[i][j];

                }
            }
        }
        return max; //For Index Problem only

    }
    //Finding Minimum value
    public static int min(int [][] arr){
        int min=Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;

                }
            }
        }
        return min; //For Index Problem only

    }
}
