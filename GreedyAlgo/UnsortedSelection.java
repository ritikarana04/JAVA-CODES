import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class UnsortedSelectioncode {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int n = start.length;
        int activites[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        Arrays.sort(activites, Comparator.comparingInt(o -> o[2])); // Sort by end times

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activites[0][0]); // Always select the first activity
        int lastEnd = activites[0][2];

        for (int i = 1; i < n; i++) {
            if (activites[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
