import java.util.ArrayList;
import java.util.Arrays;

public class Foctors_Of_Number
{
    public static void main(String[] args) {
        int n = 20;
        factors3(n);
    }

    //O(n)
    private static void factors1(int n) {
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    //O(sqrt(n))
    private static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i)
                {
                    System.out.print(i +" ");
                }
                System.out.print(i + " " + n/i + " "); //i = 1,2,4,5, n/i = 20/1 (20) ,20/2 (10)
                //vice versa multiplication
                //1 * 20 = 20 * 1
                //2 * 10 = 10 * 2
            }
        }
    }

    //O(log n) in both time and space
    private static void factors3(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i)  //this checks with 36/6 == 6 // print 6
                {
                    System.out.print(i +" ");
                }
                System.out.print(i + " ");
                list.add(n/i); //20,10,5
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) { //print this in descending order
            System.out.print(list.get(i) + " "); //print this in sorted order
        }
    }

}
