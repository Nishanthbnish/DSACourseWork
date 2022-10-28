import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap
{
    public static void main(String[] args) {
        //Create
        //Country and population
        HashMap<String,Integer> map = new HashMap<>();

        //Insert
        map.put("India",120);
        map.put("China",150);
        map.put("US",30);
        map.put("China",160);

        //Display will be in Unordered way
        System.out.println(map);

        //Search
        if(map.containsKey("India")){
            System.out.println("Key is present in the map");
        }
        else {
            System.out.println("key is not Present in the map");
        }

        //Iteration 1st method => Using map.entrySet()
        for (Map.Entry<String,Integer> e : map.entrySet()){ //map.entrySet() = > to access key and value
            System.out.println(e.getKey() +" " + e.getValue());
        }

        //Iteration using 2nd method => map.KeySet()
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key+" "+map.get(key)); //keys = Key(Map), map.get(key) = values
        }

        //Remove
        map.remove("China");//it removes key and value
        System.out.println(map);
    }
}

