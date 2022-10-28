public class Digit_sum_product
{
    public static void main(String[] args) {
        System.out.println(Digit_sum(1342));
        System.out.println(Digit_product(1342));
    }
    static int Digit_sum(int n){
        if(n == 0){  // base condition
            return 0;
        }
        return Digit_sum(n/10) + (n % 10);
    }
    static int Digit_product(int n){
        if(n % 10 == n){  // base condition
            return n;
        }
        return Digit_product(n /10) * (n % 10);
    }
}
