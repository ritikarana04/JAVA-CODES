import java.util.*;

public class Knapsack {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 }; // Corrected the weight array
        int w = 50;
        double ratio[][] = new double[val.length][2];

        // Calculate the value-to-weight ratio for each item
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Sort items by the value-to-weight ratio in descending order
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        int capacity = w;
        int finalVal = 0;

        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // Include the whole item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // Include a fraction of the item
                finalVal += (int) (ratio[i][1] * capacity);
                break; // We've filled the knapsack
            }
        }

        System.out.println("Final value = " + finalVal);
    }
}
