import java.util.Arrays;

public class FlippingAnImage
{
    public static void main(String[] args)
    {
        int [][] arr={
                {1,1,0},{1,0,1},{0,0,0}};
//        int [][] arr ={
//                {1,1,0,0},{
//                    1,0,0,1},{0,1,1,1},{1,0,1,0}
//        };
        flipAndInvertingImage(arr);
        for(int [] n : arr ){
            System.out.println(Arrays.toString(n));
        }


    }
    public static int[][] swap(int [][] a)
    {
        for(int i=0;i<a.length; i++) {
            int b = a[i].length-1;
            for (int j = 0; j < a[i].length/2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][b];
                a[i][b] = temp;
                b--;
            }
        }
        return a;

    }
// my solution
//    public static int[][] flipAndInvertingImage(int[][] image){
//        int [][] t=swap(image);
//        for(int i=0;i<t.length;i++){
//            for(int j=0;j<t[i].length;j++){
//                if(t[i][j]==0){
//                   t[i][j]=1;
//                }
//                else {
//                    t[i][j]=0;
//                }
//            }
//        }
//        return t;
//    }

    //3rd solution
//    int n = image.length;
//    int[][] ans = new int[n][n];
//
//    //flip an image horizontally
//    for(int i = 0; i < n; i++){
//    for(int j = 0, k = n-1; j < n; j++, k--){
//        ans[i][j] = image[i][k];
//        //Invert an image
//        if(ans[i][j] == 0) ans[i][j] = 1;
//        else ans[i][j] = 0;
//    }
//}
//    return ans;
    public static int[][] flipAndInvertingImage(int[][] image) {
    int [] [] res = new int [image.length][image.length];
    for(int i=0;i<image.length;i++){
        for(int j=0;j<image.length;j++){
            res[i][j] = image[i][image.length-1-j]^1;
        }
    }
    return res;}
}
