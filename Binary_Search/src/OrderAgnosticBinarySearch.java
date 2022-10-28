public class OrderAgnosticBinarySearch
{
    public static void main(String[] args)
    {
        int [] arr={-1,0,2,4,5,33,63,78,232,354,876};//Ascending Order
        int [] arrs={875,832,12,7,6,5,4,3,2,1,-3,-9}; //Desending Order
        int target=12;
        int ans=Binarysearch(arrs,target);
        System.out.println(ans);

    }

    public static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;
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
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    //More easy Solution above
//    public static void checkAscOrDes(int []arr)
//    {
//        int start= arr.length-1;
//        int target = 1;
//        int f=0;
//        if(arr[start] > arr[f]){
//            int ans=Binarysearch(arr,target);
//            System.out.println(ans);
//        }
//        else{
//            int ans=BinarysearchDes(arr,target);
//            System.out.println(ans);
//        }
//    }
//    //Increasing Sorts
//    public static int Binarysearch(int[] arr,int target){
//        int start = 0;
//        int end= arr.length-1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if (target < arr[mid]) {
//                end = mid -1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            }
//            else
//                return mid;
//        }
//        return -1;
//
//
//    }
//
//    //decreasing Sort
//    public static int BinarysearchDes(int[] arr,int target){
//        int start = 0;
//        int end= arr.length-1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if (target > arr[mid]) {
//                end = mid - 1;
//            } else if (target < arr[mid]) {
//                start = mid + 1;
//            }
//            else
//                return mid;
//        }
//        return -1;
//
//
//    }
}
