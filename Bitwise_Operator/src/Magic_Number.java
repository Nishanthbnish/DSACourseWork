public class Magic_Number
{
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;  //6 in Binary :- 110 & 1 = last digit (the value itself)
            n = n >> 1;  //Right Shifting the n value so to next element of the number. 11 _0_= (0) is taken out.
            ans += last * base; // 0 * 5^1 + 1 * 5^2 + 1 * 5^3 = 150
            base = base * 5;
        }
        //

        System.out.println(ans); //150
    }
}
