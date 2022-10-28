public class BinarySearch_Algorithm
{
    public static void main(String[] args)
    {
        int [] arr={-1,0,2,4,5,33,63,78,232,354,876};
        int ans=Binarysearch(arr,63);

    }

    public static int Binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        int mid = start + (end - start)/2;
        while(start <= end){
            if (target < arr[mid]) {
                end = end -1;
            } else if (target > arr[mid]) {
                start = start+ 1;
            }
            else
                return mid;
        }
        return -1;


    }
}
