import java.util.Arrays;

public class Selection_Sort
{
    public static void main(String[] args)
    {
        int [] arr ={5,3,2,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxEle(arr, last);
            swapindex(arr , maxIndex , last);

        }

    }

    static int getMaxEle(int [] arr, int end){
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if(arr [max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapindex(int []arr,int fist,int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
