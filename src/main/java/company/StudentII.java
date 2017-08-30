package company;

/**
 * Created by Tuhin on 4/15/2017.
 */
public class StudentII {
    static final int M = 1000000007;

    public static  int checkRecord(int n) {
        long[] PorL = new long[n + 1]; // ending in P or L, no A
        long[] P = new long[n + 1]; // ending in P, no A
        PorL[0] = P[0] = 1; PorL[1] = 2; P[1] = 1;

        for (int i = 2; i <= n; i++) {
            P[i] = PorL[i - 1];
            PorL[i] = (P[i] + P[i - 1] + P[i - 2]) % M;
        }

        long res = PorL[n];
        System.out.println("res = " + (int) res);
        for (int i = 0; i < n; i++) { // inserting A
            long s = (PorL[i] * PorL[n - i - 1]) % M;
            res = (res + s) % M;
        }
        System.out.println((int)res);
        return (int) res;
    }

    public static void main(String[] args) {
        checkRecord(3);

    }
}
