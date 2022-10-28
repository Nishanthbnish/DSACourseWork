import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort_Recursion
{
    public static void main(String[] args) {
        int [] arr = {8,3,4,12,5,6};
        int [] l1 = {1,2,4};
        int [] l2 = {1,3,4};
//        arr = mergersort(arr);
//        System.out.println(Arrays.toString(arr));
        mergersortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(mergeList(l1,l2));
    }
    private static ArrayList<Integer> mergeList(int[] first, int[] second) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                list.add(first[i]);
                i++;
            }
            else {
                list.add(second[j]);
                j++;
            }
        }
        //For remaining elements in the array of first or second ex first [1,4,6,3,2,46] second[5,3,2,6]
        while (i < first.length){
            list.add(first[i]);
            i++;
        }
        while (j < second.length){
            list.add(second[j]);
            j++;
        }
        return list;
    }
    public static int[] mergersort(int [] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int [] left = mergersort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergersort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int [] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //For remaining elements in the array of first or second ex first [1,4,6,3,2,46] second[5,3,2,6]
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    //Not creating any new ogject modifying to the original array
    public static void mergersortInplace(int [] arr,int s,int e){
        if(e - s == 1){
            return; //base condition
        }

        int mid = (s + e)/2;
        mergersortInplace(arr,s,mid);
        mergersortInplace(arr,mid,e);

        mergeinplace(arr,s,mid,e);
    }

    private static void mergeinplace(int[] arr,int s,int mid,int e) {
        int [] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //For remaining elements in the array of first or second ex first [1,4,6,3,2,46] second[5,3,2,6]
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length;l++){
            arr[s + l] = mix[l];
        }
    }
}
