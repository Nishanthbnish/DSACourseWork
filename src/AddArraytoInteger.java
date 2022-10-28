import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArraytoInteger
{
    public static void main(String[] args) {
        int []num={9,9,9,9,9,9,9,9,9,9};
        int k=1;
        System.out.println( addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();

        int i = num.length;
        while(--i >= 0 || k > 0) {
            if(i >= 0)
                k += num[i];

            res.add(k % 10);
            k /= 10;
        }
        Collections.reverse(res);

        return res;
    }


    //My soltion
//    public static List<Integer> addToArrayForm(int[] num, int k)
//    {
//        ArrayList <Integer> list= new ArrayList<>();
//        ArrayList <Integer> list2= new ArrayList<>();
//        long res=0;
//        for(int i=0;i<num.length;i++){
//            res=res*10+num[i];
//        }
//        res=res+k;
//        int n= num.length;
//
//            while(res >0){
//                int rem=(int)res%10;
//                res=res/10;
//                list.add(rem);
//            }
//            for(int i=list.size()-1;i>=0;i--){
//                list2.add(list.get(i));
//            }
//
//        return list2;
//    }

    //2nd solution
//    public List addToArrayForm(int[] num, int k)
//    {
//        int carry = 0, sum;
//
//        List<Integer> list = new LinkedList<>();
//
//        for(int i=num.length-1; i>-1; i--)
//        {
//            sum = carry + (k%10) + num[i];
//            list.add(sum%10);
//            carry = sum > 9 ? sum/10 : 0;
//            k /= 10;
//        }
//
//        int rest = k + carry;
//        while(rest > 0)
//        {
//            list.add(rest%10);
//            rest /= 10;
//        }
//
//        Collections.reverse(list);
//        return list;
//    }
}
