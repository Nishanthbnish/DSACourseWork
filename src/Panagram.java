public class Panagram
{
    public static void main(String[] args) {
        String sentence="nishanth";
        System.out.println( checkIfPangram(sentence));
//        if(sentence.equals(sentence)){
//
//        }
    }


//    public static boolean checkIfPangram(String sentence)
//    {
//        String s;
//        char c=' ';
//        if(sentence.length()<26){
//            return false;
//        }
//        else {
//            String str = "abcdefghijklmnopqrstuvwxyz";
//            for (int i = 0; i < sentence.length(); i++)
//            {
//                int t=sentence.indexOf(str.charAt(i));
//                if (t == -1) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }


    public static boolean checkIfPangram(String sentence)
    {
        // 'a' = 97 , 'z'=122
        for (int i=97; i<=122; i++)
        {
            boolean flag=false;

            // loop to iterate over the string

            for (int j=0;j<sentence.length();j++ )
            {
                // if this 'if' condition is false
                // anywhere the sentence is no Pangram
                char s=sentence.charAt(j);
                if ( i == s)
                {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return false;
        }
        return true;
    }
}
