import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_sort
{
    public static void main(String[] args)
    {
        int [] arr = { 3,2,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step ,max item will come at last respective index
            for (int j = 1; j < arr.length - i ; j++) { // j <= arr.length -i - 1 : This will also work
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr [j] =arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            //if you did not swap for perticular value of i, it meanse the array is sorted hence stop the sorting
            if(!swapped){ //!false = true
                break;
            }
        }

    }
}
