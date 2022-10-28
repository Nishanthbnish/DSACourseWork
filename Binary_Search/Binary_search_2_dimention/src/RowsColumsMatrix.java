import java.util.ArrayList;
import java.util.Arrays;

public class RowsColumsMatrix
{
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {20,29,37,49},
                {33,34,39,50}
        };
        System.out.println(Arrays.toString(search(matrix,37)));



    }
    static int [] search(int [][] matrix,int target){
        int row =0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }
            else {
                col --;
            }
        }
        return new int[]{-1,-1};
    }
//    int count = 0 ; int row = 0 ; int col = grid[0].length -1 ;
//    //we take 3 variable 1 will count the no of negative integers and row is the row
//    //on which we are on and col will be the last column ;
//
//        while(row < grid.length && col >= 0){
//    //we have to be in range so these parameters ;
//
//    //first we check if the last element of the first row is -ve or not bcz it's the smallest element on the row ;
//    if(grid[row][col] < 0){
//        count = count + (grid.length -row);
//        //if yes then we shift to the previous column ;
//        col--;
//    }else if( grid[row][col] >= 0){//if not then we shift the row by +1 ;
//        row ++ ;
//    }
//}
//    //return the no of -ve integers ;
//        return count ;r
}
