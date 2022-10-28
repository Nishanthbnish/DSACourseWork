public class Count_Zeros
{
    public static void main(String[] args) {
        System.out.println(helper(3020504));

    }

    static int helper(int n){
        return count(n,0);
    }
    public  static  int count(int n,int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return count(n/10, count + 1);
        }
        else {
            return count(n/10 , count);
        }
    }

}
