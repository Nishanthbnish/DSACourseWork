import java.util.ArrayList;

public class permutation
{
    public static void main(String[] args) {
//    Permutation("","abc");
        System.out.println(PermutationList("","abc"));
//        System.out.println(PermutationCount("","abc"));
    }
    //Count of the permutation using recursion
    public static int  PermutationCount(String p ,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);  //p = ab => 0 till i th value
            String second = p.substring(i,p.length()); // p => ab => 0 till end of the p length()
            count = count + PermutationCount(first + ch + second,up.substring(1));
        }
        return count;
    }

    //Return count using argument

    public static void Permutation(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);  //p = ab => 0 till i th value
            String second = p.substring(i,p.length()); // p => ab => 0 till end of the p length()
            Permutation(first + ch + second,up.substring(1));
        }
    }
    public static ArrayList<String> PermutationList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(PermutationList(first + ch + second,up.substring(1)));
        }
        return ans;
    }
}
