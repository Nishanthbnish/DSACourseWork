import java.util.ArrayList;
import java.util.Arrays;

public class mace_Real_Backtracking
{
    public static void main(String[] args) {
        boolean [][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        //Starts from [r,c] = [0,0] and Obstacle is present at [2,2]
//        maceObstacle("",maze,0,0);

        //Print mace paths using array
        int [][] arr = new int[maze.length][maze[0].length];
        maceObstaclePath("",maze,0,0,arr,1);
    }

    static void maceObstacle(String p,boolean[][] maze, int r, int c){//Row and col
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return; //Skip it
        }
        maze[r][c] = false; //After each funtion call in the first time making the row and col = false
        if(r < maze.length - 1) {
            maceObstacle(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length - 1) {
            maceObstacle(p + 'R',maze, r, c + 1);
        }
        if(r > 0){
            maceObstacle(p + 'U', maze,r - 1, c);
        }
        if(c > 0){
            maceObstacle(p + 'L', maze,r , c - 1);
        }
        //this line where the function will be over
        //so before the function gets removed, also remove the chances that were made by the that function
        maze[r][c] = true; //when returning or comming back to the previous function making it to true.
    }

    //To get actual Path
    static void maceObstaclePath(String p,boolean[][] maze, int r, int c,int [][] path,int step){//Row and col
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int [] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
//            System.out.println();
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return; //Skip it
        }
        maze[r][c] = false; //After each funtion call in the first time making the row and col = false
        path[r][c] = step;  //Add the step number in the array
        if(r < maze.length - 1) {
            maceObstaclePath(p + 'D', maze,r + 1, c,path,step + 1);
        }
        if(c < maze[0].length - 1) {
            maceObstaclePath(p + 'R',maze, r, c + 1,path,step + 1);
        }
        if(r > 0){
            maceObstaclePath(p + 'U', maze,r - 1, c,path,step + 1);
        }
        if(c > 0){
            maceObstaclePath(p + 'L', maze,r , c - 1,path,step + 1);
        }
        //this line where the function will be over
        //so before the function gets removed, also remove the chances that were made by the that function
        maze[r][c] = true; //when returning or comming back to the previous function making it to true.
        path[r][c] = 0;  //After adding the step and by completing the recursion call make it 0.
    }
}
