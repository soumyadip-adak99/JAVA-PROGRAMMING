package Hashing.Practice;

/**
 * "chennai" -> "bengaluru"
 * "mumbai" -> "delhi"
 * "goa" -> "chennai"
 * "delhi"-> "goa"
 * 
 * mumbai -> delhi -> goa -> chennai -> bengaluru
 */
import java.util.Map;
import java.util.HashMap;

public class Itinerary {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.println(start);
    }

    public static String getStart(Map<String, String> map) {
        Map<String, String> revMap = new HashMap<>();

        for (String key : map.keySet()) {
            // key = key | value = map.get(key)
            revMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
}
