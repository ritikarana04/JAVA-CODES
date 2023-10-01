import java.util.*;

public class HashmapOperations {
    public static void main(String args[]) {

        // create-O(1)
        HashMap<String, Integer> hm = new HashMap<>();
        // add values
        hm.put("India", 150);
        hm.put("china", 500);
        hm.put("South africa", 50);

        // // remove -O(1)
        // System.out.println(hm.remove("china"));
        // System.out.println(hm);

        // SIZE
        System.out.println(hm.size());
        // Is empty
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
