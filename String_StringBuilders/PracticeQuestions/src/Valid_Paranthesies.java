import java.util.Stack;

public class Valid_Paranthesies {
    public static void main(String[] args) {
        String s = "(){}[";
        System.out.println(isValid(s));
    }

    public static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

    public static boolean isValid(String s) {
        //Deque<Character> s=new ArrayDeque<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
            } else {
                if (st.isEmpty() == true)
                    return false;
                else if (matching(st.peek(), s.charAt(i)) == false)
                    return false;
                else
                    st.pop();
            }
        }
        return (st.isEmpty() == true);
    }
}
