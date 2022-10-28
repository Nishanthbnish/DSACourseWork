import java.util.HashSet;
import java.util.Set;

public class Contains_duplicate
{
    public static void main(String[] args)
    {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] nums) {
        //My solution
//         Arrays.sort(arr);
//          for (int i = 0; i < arr.length; i++) {
//                 for (int j = 1; j < arr.length - i; j++) {
//                     if (arr[j] == arr[j - 1]) {
//                         return true;
//                     }
//                     }


//             }

//          return false;
        Set set = new HashSet<>();
        for (int arr : nums) {
            if (!set.add(arr)) {
                return true;
            }
        }

        return false;
    }
}
