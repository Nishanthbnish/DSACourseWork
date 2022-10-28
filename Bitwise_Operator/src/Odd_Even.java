public class Odd_Even
{
    public static void main(String[] args) {
        System.out.println(isvalid(75));
        int [] arr = {2,3,3,2,5,6,5,4,4};
        System.out.println(unique(arr));
    }

    private static boolean isvalid(int n)
    {
        return (n & 1) == 1; // any number and with 1 is number itself
    }
    public static int unique(int [] arr){
        int unique = 0;
        for (int n: arr) {
            unique = unique ^ n;
        }
        return unique;
    }

}
