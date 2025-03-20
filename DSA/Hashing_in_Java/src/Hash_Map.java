import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // key , vlaue
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("US", 49);
        map.put("China", 590);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // look up and search operation

        // if (map.containsKey("India"))
        // System.out.println("Key present in the map");
        // else
        // System.out.println("Key does not exit.");

        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        // loop for hash map
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // remove part
        map.remove("China");
        System.out.println(map);
        System.out.println(map.size());
    }
}
