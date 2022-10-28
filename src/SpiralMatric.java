import java.util.ArrayList;
import java.util.List;
public class SpiralMatric
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();
        int [][]matrix={
                {1,2,3},{4,5,6},{7,8,9}
        };
        list.add(spiralOrder(matrix));
        System.out.println(list);

//        List<Integer> list=spiralOrder(matrix);
//        for(int x:list)
//        {
//            System.out.println(x);
//        }

    }
//    public static List spiralOrder(int[][] matrix) {
//        List ans = new ArrayList<>();
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int rowstart = 0, rowend = m-1, colstart = 0, colend = n-1;
//
//        while(rowstart <= rowend || colstart < colend){
//            if(rowstart <= rowend) {
//                for(int col = colstart; col <= colend; col++)
//                    ans.add(matrix[rowstart][col]);
//                rowstart++;
//            }
//            if(colstart <= colend) {
//                for(int row = rowstart; row <= rowend; row++)
//                    ans.add(matrix[row][colend]);
//                colend--;
//            }
//            if(rowstart <= rowend) {
//                for(int col = colend; col >= colstart; col--)
//                    ans.add(matrix[rowend][col]);
//                rowend--;
//            }
//            if(colstart <= colend) {
//                for(int row = rowend; row >= rowstart; row--)
//                    ans.add(matrix[row][colstart]);
//                colstart++;
//            }
//        }
//        return ans;
//    }
// 2nd solution
    public  static List spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int left=0; int right=matrix[0].length;
        int top=0; int bottom=matrix.length;

        while(left<right && top<bottom)
        {
            int i=0;
            //moving left 👉 right or iterating on top row.
            for(i=left;i<right;i++)
            {
                list.add(matrix[top][i]);
                // System.out.println(matrix[top][i]);
            }
            top++;
            //moving top 👇 bottom or iterating on right column.
            for(i=top;i<bottom;i++)
            {
                list.add(matrix[i][right-1]);
                //System.out.println(matrix[i][right-1]);
            }
            right--;

            //handling the testCase for (One row _or_ One column) eg: {1,2,3}=>1 2 3 2 1 and eg: {{1},{2},{3}} => 1 2 3 2
            if(!(left<right && top<bottom)) break;

            //moving right 👈 left or iterating on bottom row.
            for(i=right-1;i>=left;i--)
            {
                list.add(matrix[bottom-1][i]);
                //System.out.println(matrix[bottom-1][i]);
            }
            bottom--;

            //moving bottom 👆 top or iterating on left column.
            for(i=bottom-1;i>=top; i--)
            {
                list.add(matrix[i][left]);
                //System.out.println(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}
