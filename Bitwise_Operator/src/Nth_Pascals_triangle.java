public class Nth_Pascals_triangle
{
    public static void main(String[] args) {
        System.out.println(pascals(4));
        // System.out.println(Math.pow(2,4-1));
    }
    public static int pascals(int n){
        return  1 << (n-1); //1 + 3 + 3 + 1 = 8
    }
}
