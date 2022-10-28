import java.util.Arrays;

public class Reverse_using_swap
{
    public static void main(String[] args) {
        int[] arr={1,53,2,56,78,33,32,1,4,22,2};
         reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int [] arr){
        int start=0;
        int end= arr.length-1;//predefined
        while (end > start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int [] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
