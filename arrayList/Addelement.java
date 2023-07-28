import java.util.ArrayList;

public class Addelement {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // element can also be added O(n) linear time

        list.add(2, 6);

        System.out.println(list);

    }

}
