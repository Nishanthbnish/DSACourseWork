public class Goal_Parser_Interpretation
{
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String c)
    {
        StringBuilder str = new StringBuilder();
//        str.append()
        char ch[] = c.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='G')
                str.append("G");
            else if(ch[i] =='(')
            {
                if(ch[i+1]==')')
                    str.append("o");
                else
                    str.append("al");
            }

        }
        return str.toString();
    }
}
