import java.util.ArrayList;
import java.util.Collections;

//import java.util.* ; we can also use this it will import all the methods and interfaces and the code will run successfully 

public class Sorting {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(9);

        System.out.println(list);
        Collections.sort(list);// it will sort in ascending order
        System.out.println(list);

        // desceneding order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }

}
