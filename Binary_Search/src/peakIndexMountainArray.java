public class peakIndexMountainArray
{
    public static void main(String[] args) {
 int [] arr={6,5,4,3,8,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr)
    {
        int start=0;
        int end= arr.length;

        while(start < end){
            int mid= start +(end - start)/2;

            if(arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;//or end which both point at same position
    }

}
