public class HappyNumber
{
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(n > 10){
            int temp = n;
            for (int i = 0; i < n; i++) {
                int ans = 0;
                String s = String.valueOf(temp);
                for (int j = 0; j < s.length(); j++) {
                    ans += (int) Math.pow(s.charAt(j), 2);
                }
                if (ans == 1) {
                    return true;
                }
                temp = ans;
            }
        }
        return false;
    }
}
