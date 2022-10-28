import java.util.Arrays;

public class recurision_patterns
{
    public static void main(String[] args) {
        //triangle2(4,0);
        int [] arr = {64,25,12,1};
        //bubblesort(arr,arr.length ,0);
        Selection(arr,arr.length ,0 ,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(isPowerOfThree(45));
    }
    public static boolean isPowerOfThree(int n) {
        if(n == -1){return false;}
        if(n == 0){return false;}
        int count = 0;
        int temp = n;
        while(n > 0){
             if(n%3 == 0){
                 count++;
             }
            n= n/3;
        }
        if(Math.pow(3,count) == temp){
            return true;
        }
        else {
            return false;
        }

    }
    //Selection sort
    private static void Selection(int [] arr,int r, int c,int max) {
        if(r == 0){
            return;
        }
        if(c < r){ // till end of the row
            if (arr[c] > arr[max]){
                Selection(arr,r,c+1, c);
            }
            else {
            Selection(arr,r,c + 1,max );
            }
        }
        else {
            //swap
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            Selection(arr,r-1,0,0);
        }
    }

    //Bubble sort
    private static void bubblesort(int [] arr,int r, int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr,r,c + 1 );
        }
        else {
            bubblesort(arr,r-1,0);
        }
    }
    private static void triangle2(int r, int c) {
        if(r == 0){
            return;
        }
        if(c < r){
            triangle2(r,c + 1 );
            System.out.print("* ");
        }
        else {
            triangle2(r-1,0);
            System.out.println();

        }
    }
    private static void triangle(int r, int c) {
    if(r == 0){
        return;
    }
    if(c < r){
        System.out.print("* ");
        triangle(r,c + 1 );
    }
    else {
        System.out.println();
        triangle(r-1,0);
    }
    }


}
