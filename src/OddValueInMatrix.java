import java.util.Arrays;
import java.util.ArrayList;

public class OddValueInMatrix {
    public static void main(String[] args) {
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        int ans = oddCells(2, 3, indices);
        System.out.println(ans);

    }
    //17ms solution
//    public static int oddCells(int m, int n, int[][] indices)
//    {
//
//        int[][] arr= new int[m][n];
//
//        for(int i=0;i<indices.length;i++)
//        {
//            int row = indices[i][0];
//            int col = indices[i][1];
//
//
//         for(int j=0;j<n; j++){
//             arr[row][j]++;
//         }
//            for(int j=0;j<m; j++){
//                arr[j][col]++;
//            }
//
//        }
//        for(int[] a:arr){
//            System.out.println(Arrays.toString(a));
//        }
//        int counter = 0;
//        for(int i = 0; i < m; i++) {
//            for(int j = 0; j < n; j++) {
//                if(arr[i][j] % 2 != 0) {
//                    counter++;
//                }
//            }
//        }
//
//    return counter;
//}

    //My Solution

//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<n;j++){
//                arr[i][j]=0;
//            }
//        }
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0, k=0; j<arr.length;j++,k++){
//                //indices[i][j]=indices[i][j]^1;
//                arr[i][j] = arr[i][j]^indices[i][j];
//            }
//        }
//        for(int[] a:arr){
//            System.out.println(Arrays.toString(a));
//        }

    //2ms solution
    public static int oddCells(int m, int n, int[][] indices)
      {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=0;
            }
        }
        ArrayList <Integer> l=new ArrayList();
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[0].length;j++){
                l.add(indices[i][j]);
            }
            int a=l.get(0);
            int b=l.get(1);
            l.clear();
            for(int k=0;k<n;k++){
                arr[a][k]=arr[a][k]+1;
            }
            for(int k=0;k<m;k++){
                arr[k][b]=arr[k][b]+1;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;

 }
}
