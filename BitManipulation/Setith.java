public class Setith {
    public static int seTthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        System.out.println((seTthBit(10, 2)));
    }
}
