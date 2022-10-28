import java.util.Arrays;

public class TransposeMatrix
{
    public static void main(String[] args)
    {
        int [][] matrix={
                {1,2,3},
                {4,5,6}
                //{7,8,9}
        };
        int [][]arr=transpose(matrix);
        for(int [] n : arr ){
            System.out.println(Arrays.toString(n));
        }

    }
    public static int[][] transpose(int[][] matrix)
    {


        int n=matrix.length;
        int[][] mat=new int[matrix[0].length][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
}
