import java.util.ArrayList;

public class Maximum {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(22);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);

                // or
                // max=Math.max(max,list.get(i));
            }
        }
        System.out.println("max element=" + max);

    }
}
