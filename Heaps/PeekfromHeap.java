import java.util.*;

public class PeekfromHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            // add at last idx
            arr.add(data);
            int x = arr.size() - 1;// x is child idx
            int par = (x - 1) / 2;// par idx

            while (arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

            }
        }

        public int peek() {
            return arr.get(0);

        }

    }

    public static void main(String args) {

    }
}
