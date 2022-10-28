public class Patterns
{
    public static void main(String[] args) {
//        pattern1(4);
        pattern19(5);
    }

    public static void pattern19(int n){
        for (int row = 0; row < 2 * n ; row++) {
            //for inner col loop how much stars required
            int col = row > n ? 2 * n - row : row ; //difference we have to find or relationship .
            for (int j = 0; j < col ; j++) {
                System.out.print(" *");
            }
            int spaces = 5;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row ; j++) {
                System.out.print(" *");
            }
//            for (int j = 0; j < 2 * col ; j++) {
//                System.out.print("* ");
//            }
            System.out.println();
        }

    }


    public static void pattern8(int n){
        for (int i = 0; i < n ; i++) {
            //for inner col loop how much stars required
            int col = i > n ? 2 * n - i : i ; //difference we have to find or relationship .
            int spaces = n - col;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for (int row = 0; row <= n ; row++) {
            //for inner col loop how much stars required
            //int col = row > n ? 2 * n - row : row ; //difference we have to find or relationship .
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = n; col > row ; col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }for (int i = 0; i <= n ; i++) {
            //for inner col loop how much stars required
            int col =  i ; //difference we have to find or relationship .
            int spaces = n - col;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void  pattern18(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            //for inner col loop how much stars required
            int colu = row > n ? 2 * n - row : row; //difference we have to find or relationship .
            int spaces = n - colu;
            for (int s = 0; s <= spaces; s++) {
                System.out.print("*");
            }

            for (int col = colu; col >= 1; col--) { //4,3,2,1
                System.out.print(" ");
            }
            for (int col = 2; col <= colu; col++) { //2,3,4
                System.out.print(" ");
            }
            for (int s = 0; s <= spaces; s++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void pattern31(int n){
        //for outer for loop run n times
        int original = n;
        n =2*n;
        for (int row = 1; row < n ; row++) {
            for (int col = 1; col < n  ; col++) {
                int everyIndex = original + 1 - Math.min(Math.min(n - row, n - col),Math.min(row,col));
                System.out.print(everyIndex + "  ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int row = 0; row <= 2 * n ; row++) {
            //for inner col loop how much stars required
            int colu = row > n ? 2 * n - row : row ; //difference we have to find or relationship .
            int spaces = n - colu;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            for (int col = colu; col >= colu; col--){ //4,3,2,1
                System.out.print("*" + " ");
            }
            for (int s = 0; s < colu; s++) {
                System.out.print("    ");
            }
            for (int col = colu; col <= colu ; col++) { //2,3,4
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
    }
    public static void pattern17(int n){
        for (int row = 1; row <= 2 * n ; row++) {
            //for inner col loop how much stars required
            int colu = row > n ? 2 * n - row : row ; //difference we have to find or relationship .
            int spaces = n - colu;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

                for (int col = colu; col >= 1; col--){ //4,3,2,1
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= colu ; col++) { //2,3,4
                    System.out.print(col+ " ");
                }

            System.out.println();
        }
    }
    public static void pattern30(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){ //4,3,2,1
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++) { //2,3,4
                System.out.print(col+ " ");
            }
            System.out.println();
        }

    }
    public static void pattern28(int n){
        //for outer for loop run n times
        for (int i = 0; i < 2 * n ; i++) {
            //for inner col loop how much stars required
            int col = i > n ? 2 * n - i : i ; //difference we have to find or relationship .
            int spaces = n - col;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            int space = 1;
            for (int j = 0; j < col ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        //for outer for loop run n times
        for (int i = 0; i < 2 * n ; i++) {
            //for inner col loop how much stars required
            int col = i > n ? 2 * n - i : i ; //difference we have to find or relationship .
            for (int j = 0; j < col ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        //for outer for loop run n times
        for (int i = 1; i <= n ; i++) {
            //for inner col loop how much stars required
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n){
        //for outer for loop run n times
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        //for outer for loop run n times
        for (int i = 1; i <= n ; i++) {
            //for inner col loop how much stars required
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
//        //for outer for loop run n times
//        for (int i = 1; i <= n ; i++) {
//            //for inner col loop how much stars required
//            for (int j = n; j >= i ; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
        for (int i = 0; i < n ; i++) {
            //for inner col loop how much stars required
            for (int j = 0; j < n - i ; j++) { // If I starts from 1 then formula will be col : n - i + 1
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
