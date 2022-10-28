import java.util.ArrayList;

public class Subseq
{
    public static void main(String[] args) {
        subseq("","abc");
        subseqAscii("","abc"); //to print Ascci value of the charecter
        System.out.println(subSeqReq("","abc"));
    }
    public static ArrayList<String> subSeqReq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReq(p + ch ,up.substring(1)); //take
        ArrayList<String> right =subSeqReq(p,up.substring(1));
        left.addAll(right);
        return left;

    }

    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch ,up.substring(1)); //take
        subseq(p,up.substring(1)); //ignore it
    }

    public static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch ,up.substring(1)); //take
        subseqAscii(p,up.substring(1)); //ignore it
        subseqAscii(p + (ch + 0),up.substring(1));
    }
}
