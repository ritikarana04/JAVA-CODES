public class Clearith {
    public static int clearITHbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.println(clearITHbit(10, 1));
    }
}
