
public class Exception extends Throwable {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
    static int divide(int a, int b) throws ArithmeticException
    {
        if(b == 0){
            throw new ArithmeticException("Please do not divide by 0");
        }
        return a/b;
    }
}
