import java.util.Iterator;
public class HashSet
{
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();//Creating Hashset
        //add
        //Hashset only stores Unique values
        set.add(10);//Takes O(1)
        set.add(11);
        set.add(12);
        set.add(10);
        System.out.println(set); //Display
        System.out.println("The size of set :"+ set.size()); //size
        //Search
        if(set.contains(10)){
            System.out.println("10 is present in memory");
        }
        else {
            System.out.println("Not Present");
        }
        //Delete
        set.remove(10);
        if(!set.contains(10)){
            System.out.println("10 is delete successfully");
        }
        //Iterator
        //hasNext,next
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
