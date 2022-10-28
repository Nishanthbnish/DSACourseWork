import java.util.Arrays;

public class Flipping_an_image
{
    public static void main(String[] args) {
        int [][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int [][] a = flipAndInvertImage(arr);
        for (int[] num: a) {
            System.out.println(Arrays.toString(num));
        }
        //System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image)
    {
        for (int[]row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {  //Find the Mid value )till mid value for loop must run
                //swap the array
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;  //to fid the last value int the multi array
                row[image[0].length - i -1] = temp;
            }
        }
        return image;
    }
}
