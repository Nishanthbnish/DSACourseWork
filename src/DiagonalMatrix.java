public class DiagonalMatrix
{
    public static void main(String[] args)
    {
        int[][]mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] mats={
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(diagonalSum(mat));

    }
    //My and copied solution
//    public static int diagonalSum(int[][] mat)
//    {
//        int sum=0,add=0;
//        int n=mat.length;
//        for(int i=0;i<mat.length;i++){
//            for(int j=0 ; j<mat[i].length;j++)
//            {
//                if( i == j ){
//                    sum+=mat[i][j];} //1st diagonal
//                    //if(mat[i][j]==mat[i][j])
//                    //sum+=mat[i][mat.length-1-j];
//                if((i+j == (n-1)) && i != j)
//                    sum += mat[i][j];
//
//            }
//        }
//        return sum;
//    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < mat.length; i ++) {
            sum += mat[i][i];
            sum += mat[n - i - 1][i];
        }
        return n % 2 == 0 ? sum : sum - mat[n / 2][n / 2];
    }
}
