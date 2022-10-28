//1095. Find in Mountain Array
public class MoutainArrayHard
{
    public static void main(String[] args) {
    int []arr={1,2,3,4,5,3,1};
        System.out.println(search(arr,3));
    }
    static int search(int []arr ,int target){
        int peak =peakIndexInMountainArray(arr);
        int firsttryASC = Binarysearch(arr,target,0,peak);

        if(firsttryASC!= -1){
            return firsttryASC;
        }
        return Binarysearch(arr,target,peak+1,arr.length);
    }

    //First find the peak value
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
        return end;//or end which both point at same position
    }
    //Find Element in arr if it's in ASC or DSC
    public static int Binarysearch(int[] arr,int target,int start,int end){
        boolean asc=arr[start] <arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(asc){
                if (target < arr[mid]) {
                    end = mid -1;
                } else  {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
