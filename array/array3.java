import java.util.*;

public class array3 {

    public static int getlargestandsmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // LARGEST INFINITY
        int smallest = Integer.MAX_VALUE;// SMALLEST INFINITY

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {

                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value  is:" + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 5, 8 };
        System.out.println("largest value is :" + getlargestandsmallest(numbers));
    }
}
