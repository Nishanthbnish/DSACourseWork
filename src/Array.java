import java.util.Arrays;
import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int [][]arr= new int[3][3]; //row is mandatory

        int [][] ar={
                {1,2,3,4},
                {2,3},
                {1,8,6,5,3}
        };
        //1 D
//        int [] arr=new int[5];
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=s1.nextInt();
//        }
//
////        for(int num: arr){
////            System.out.print(num);
////        }
//        System.out.println(Arrays.toString(arr));

        for(int row=0; row < arr.length; row++){
            for (int col=0; col < arr[row].length; col++ ){
                arr[row][col]= s1.nextInt();
            }
        }
//        for(int row=0; row < arr.length; row++){
//            for (int col=0; col < arr[row].length; col++ ){
//                System.out.print( arr[row][col]+ " ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = arr[i][j]^2;
            }
        }

        for(int [] n : arr ){
            System.out.println(Arrays.toString(n));
        }

        for(int row=0; row < ar.length; row++){
            System.out.println(Arrays.toString(ar[row]));
        }
    }
}
