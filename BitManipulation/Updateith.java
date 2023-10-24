public class Updateith {
    public static int clearIthBitt(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);

        // } else {
        // return setIthBit(n, i);
        // }
        // }

        n = clearIthBitt(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
