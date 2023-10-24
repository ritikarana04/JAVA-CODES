import java.util.*;

public class OddorEven {
    public static void EvenorOddCheck(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number ");
        }

    }

    public static void main(String args[]) {
        EvenorOddCheck(3);
        EvenorOddCheck(11);
        EvenorOddCheck(10);
    }
}