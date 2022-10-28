import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mace_Problem
{
    public static void main(String[] args) {
        System.out.println(mace(3,3)); //For count how much possibility can be done
        macePath("",3,3);//for possibility of the Path
        System.out.println(macePathList("",3,3)); //For list
        System.out.println(macePathListDiagonal("",3,3)); //Checking for diagonal
        boolean [][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        //Starts from [r,c] = [0,0] and Obstacle is present at [2,2]
        maceObstacle("",maze,0,0);
        System.out.println(maceObstacleList("",maze,0,0)); //using List
    }

    static int mace(int r,int c){//Row and col
        if(r == 1 || c == 1){
            return 1;
        }
        int left = mace(r - 1,c);
        int right = mace (r,c - 1);
        return left + right;
    }
    static void macePath(String p,int r,int c){//Row and col
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1) {
            macePath(p + 'D', r - 1, c);
        }
        if(c > 1) {
            macePath(p + 'R', r, c - 1);
        }
    }
    static ArrayList<String> macePathList(String p, int r, int c){//Row and col
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
             list.addAll(macePathList(p + 'D', r - 1, c));
        }
        if(c > 1) {
             list.addAll(macePathList(p + 'R', r, c - 1));
        }
        return list;
    }
    static ArrayList<String> macePathListDiagonal(String p, int r, int c){//Row and col
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(macePathListDiagonal(p + 'D', r - 1, c - 1));
        }
        if(r > 1) {
            list.addAll(macePathListDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1) {
            list.addAll(macePathListDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }
    //There are only 2 possibility
    static void maceObstacle(String p,boolean[][] maze, int r, int c){//Row and col
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return; //Skip it
        }
        if(r < maze.length - 1) {
            maceObstacle(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length - 1) {
            maceObstacle(p + 'R',maze, r, c + 1);
        }
    }
    static ArrayList<String> maceObstacleList(String p,boolean[][] maze, int r, int c){//Row and col
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list; //Skip it
        }
        if(r < maze.length - 1) {
            list.addAll(maceObstacleList(p + 'D', maze,r + 1, c));
        }
        if(c < maze[0].length - 1) {
            list.addAll(maceObstacleList(p + 'R',maze, r, c + 1));
        }
        return list;
    }
}
