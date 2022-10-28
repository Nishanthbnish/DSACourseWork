import java.util.Arrays;

public class Quick_Sort
{
    public static void main(String[] args) {
        int [] arr = {5,7,8,1,2,3,10};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));;
    }
    //O
    public static void sort(int [] nums,int low,int high){ //low and high for the real index of the array
        //base condition
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) /2;
        int pivot  = nums[m]; //finding the mid-element in the array

        while (s <= e){ //while starts and end get volatilized
            while(nums[s] < pivot) { //if the pivot element is greater than the LHS s++{
                s++;
            }
            while(nums[e] > pivot) { //if the pivot element is lesser than the RHS e++{
                e--;
            }
            if(s <= e){ //If the element is not sorted according to the pivot (swap)
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;  //increment and decrement the arrays
                e--;
            }
            sort(nums,low,e);
            sort(nums,s,high);
        }
    }
}
