// public class PowerofN {
//     public static int optimizedPowerofn(int a, int n) {
//         if (n == 0) {
//             return 1;

//         }
//         int halfPowerSq = optimizedPowerofn(a, n / 2) * optimizedPowerofn(a, n / 2);
//         // n is odd
//         if (n % 2 != 0) {
//             halfPowerSq = a * halfPowerSq;
//         }
//         return halfPowerSq;
//     }

//     public static void main(String args[]) {
//         int a = 2;
//         int n = 10;
//         System.out.println(optimizedPowerofn(a, n));
//     }
// }

public class PowerofN {
    public static int optimizedPowerofn(int a, int n) {
        if (n == 0) {
            return 1;

        }
        int halfPower = optimizedPowerofn(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // int halfPowerSq = optimizedPowerofn(a, n / 2) * optimizedPowerofn(a, n / 2);
        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        int a = 2;
        int n = 10;
        System.out.println(optimizedPowerofn(a, n));
    }
}
