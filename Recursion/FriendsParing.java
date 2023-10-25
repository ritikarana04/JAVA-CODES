public class FriendsParing {
    public static int FriendPairing(int n) {
        if (n == 1 || n == 2) {
            return n;

        }
        int fnm1 = FriendPairing(n - 1);
        // pair
        int fnm2 = FriendPairing(n - 2);
        int pairWays = (n - 1) * fnm2;
        // totWays
        int totWays = fnm1 + pairWays;
        return totWays;

    }

    public static void main(String args[]) {
        System.out.println(FriendPairing(3));
    }
}
