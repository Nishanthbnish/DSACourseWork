public class Ceiling_and_flooring
{
    public static void main(String[] args)
    {
        int [] arr={-1,0,2,4,5,33,63,78,232,354,876};
        int ans=Binarysearch(arr,62);
        System.out.println(ans);

    }

    public static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else
                return mid;
        }
        //return arr[start]  for Ceiling
        return arr[end];//Flo0ring


    }

}
