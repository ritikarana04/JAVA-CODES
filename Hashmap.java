import java.util.*;

public class Hashmap {
    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert values in hashMaps-O(1) constant time opertaion
        hm.put("India", 150);
        hm.put("Indonesia", 100);
        hm.put("Ireland", 50);
        hm.put("US", 50);

        System.out.println(hm);
        // Get -O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia "));
        // ConstainsKey-O(1)
        System.out.println(hm.containsKey("India"));// true
        System.out.println(hm.containsKey("Canada"));// false
    }

}
