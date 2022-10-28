import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
     ArrayList<Integer> list= new ArrayList<>();
     list.add(10);
     list.add(20);
     list.add(90);
     System.out.println(list);
     list.set(1,99);//modifying the values
        System.out.println(list);

        for(int i=0;i <5;i++ ){
            list.add(in.nextInt());
        }
        System.out.println(list);

        for(int i=0;i <list.toArray().length;i++ ){
            System.out.print(list.get(i)+" ");
        }



    }
}
