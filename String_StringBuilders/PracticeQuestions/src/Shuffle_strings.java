import java.util.Arrays;

public class Shuffle_strings
{
    public static void main(String[] args)
    {
       String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
        System.out.println(Arrays.toString("G()al".toCharArray()));
    }
    public static String restoreString(String s, int[] indices)
    {
        char [] ans = new char[indices.length];
        String str = "";
        for (int i = 0; i < ans.length; i++) {
            ans[indices[i]]= s.charAt(i);
        }
        str = String.valueOf(ans);
        return str;

    }
}

