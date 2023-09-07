import java.util.PriorityQueue;

public class PqJCF {
    public static void main(String args[]) {
        // 1 ,2 3,4 ,5
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();

        }
    }
}
