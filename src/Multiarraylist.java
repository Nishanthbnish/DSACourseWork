import java.util.ArrayList;
import java.util.Scanner;

public class Multiarraylist
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner s= new Scanner(System.in);
        //Intiallise

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //Declaring

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(s.nextInt());
            }
        }
        System.out.println(list);
    }
}
