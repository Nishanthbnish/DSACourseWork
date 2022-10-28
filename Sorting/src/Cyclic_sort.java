import java.util.Arrays;

public class Cyclic_sort
{
    public static void main(String[] args) {
        int [] arr ={3,2,10,1,10}; //For no of series values only
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int [] arr){
        int i = 0;
        while(i < arr.length){
            int index = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[index]){
                swapIndex(arr, i, index);
            }
            else {
                i++;
            }
        }
    }
    static void swapIndex(int []arr, int fist, int second){
        int temp = arr[fist];
        arr[fist] = arr[second];
        arr[second] = temp;

    }
}
