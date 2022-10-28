public class Number_Ofzeros
{
    public static void main(String[] args) {
        System.out.println(helper(14));
    }
    public static int helper(int n){
        return numberZero(n ,0);
    }

    private static int numberZero(int n, int steps) {
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return numberZero(n/2,steps +1);
        }
        else {
            return numberZero(n-1,steps + 1);
        }
    }

}
