
import java.util.ArrayList;

public class Monotonic {
    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                inc = false;
            if (A.get(i) < A.get(i + 1))
                dec = false;

        }
        return inc || dec;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        System.out.println(isMonotonic(nums1)); // Output: true (monotonic increasing)

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(2);
        nums2.add(1);
        System.out.println(isMonotonic(nums2)); // Output: true (monotonic decreasing)

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);
        System.out.println(isMonotonic(nums3)); // Output: false (not monotonic)

        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.add(1);
        nums4.add(1);
        nums4.add(1);
        System.out.println(isMonotonic(nums4)); // Output: true (monotonic with equal elements)
    }
}
