import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet
{
    //Uisng Recursion
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> list = subset(arr);
        List<List<Integer>> lists = subsetDuplicate(arr);
        List<List<Integer>> sum = CombinationSum(arr,5)     ;
        for (List<Integer> ans:sum) {
            System.out.print(ans+ " ");
        }
    }
    public static List<List<Integer>> subsetDuplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0;i < arr.length;i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static List<List<Integer>> CombinationSum(int [] arr,int target){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        if(outer.isEmpty()){
            return outer;
        }
        int ans = 0;
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                ans = ans + num;
                if(ans == target){
                internal.add(ans);}
                outer.add(internal);
            }
        }
        return outer;
    }
}
