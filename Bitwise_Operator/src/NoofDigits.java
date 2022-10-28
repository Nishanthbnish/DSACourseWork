public class NoofDigits
{
    public static void main(String[] args) {
        // n =343223 ,base = 10 (decimal)
        int n = 10 ;// number of digits
        int base = 2; // binary (10) - -> 1010

        int ans = (int) (Math.log(n)/Math.log(base)) + 1;  //Formula to find the digits in binary Numbers or any decimals or octals
        System.out.println(ans); // return 4


    }
}
