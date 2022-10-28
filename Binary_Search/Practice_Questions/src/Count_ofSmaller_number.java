import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_ofSmaller_number
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr={5,2,6,1};
        list = (ArrayList<Integer>) countSmaller(arr);
        for (Integer n: list) {
            System.out.println(list.get(n));
        }

    }
    public static List<Integer> countSmaller(int[] nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        int start = 0;
        int end =nums.length-1;
        while(start < end){
            int mid = start +(end -start)/2;
            int count =0;
            for(int i = start;i < end;i++){
                if(start == -1 || end == -1)
                {
                    list.add(0);
                }
                if(start < end){
                    count ++;
                    end =end-1;
                }
            }
            start = start + 1;
            list.add(count);
        }
        return list;
    }
}
