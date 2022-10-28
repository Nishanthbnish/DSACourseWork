import java.util.Arrays;

public class Relative_sort_array
{
    public static void main(String[] args) {
        int [] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
//    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        var count = new int[1001];
//        for (var num:arr1) count[num]++;
//        int idx=0;
//        for (var num:arr2){
//            while(count[num]-->0) arr1[idx++]=num;
//        }
//        for (int num=0;num<count.length;num++){
//            while(count[num]-->0) arr1[idx++]=num;
//        }
//        return arr1;
//    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int c = 0;
        for (int i = 0; i < l2; i++) {
            int a = arr2[i];
            for (int j = c; j < l1; j++) {
                if (arr1[j] == a) {
                    int t = arr1[c];
                    arr1[c] = arr1[j];
                    arr1[j] = t;
                    c++;
                }
            }
        }
        Arrays.sort(arr1, c, l1);
        return arr1;
    }
}
