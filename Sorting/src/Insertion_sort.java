import java.util.Arrays;

public class Insertion_sort
{
    public static void main(String[] args) {
        int [] arr ={5,3,2,4,1,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void sortColors(int[] arr)
    {
        for(int i = 0; i< arr.length -1 ;i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swapindex(arr,j-1,j);
                }
                else {
                    break;
                }
            }
        }
    }
   static void swapindex(int []arr,int fist,int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
