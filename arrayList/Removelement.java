import java.util.ArrayList;

public class Removelement {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // remove element
        list.remove(2);

        System.out.println(list);
    }
}
