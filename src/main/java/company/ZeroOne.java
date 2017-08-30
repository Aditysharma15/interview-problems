package company;

/**
 * Created by Tuhin on 4/17/2017.
 */
public class ZeroOne {

    
        public class Cost {
            int cost0;
            int cost1;
            public Cost(int cost0, int cost1) {
                this.cost0 = cost0;
                this.cost1 = cost1;
            }
        }
        public int findMaxForm(String[] strs, int m, int n) {
            if(strs == null || strs.length == 0) {
                return 0;
            }
            int[][] dp = new int[m+1][n+1];
            for(int i = 0; i < strs.length; i++) {
                System.out.println();
                Cost c = findcost(strs[i]);
                for(int j = m; j >= c.cost0; j--) {
                    for(int k = n; k >= c.cost1; k--) {
                        dp[j][k] = Math.max(dp[j][k], dp[j-c.cost0][k-c.cost1] + 1);
                        System.out.print(" " + dp[j][k]);
                    }
                }
            }
            System.out.println("dp[m][n] = " + dp[m][n]);
            return dp[m][n];
        }

        protected Cost findcost(String str) {
            int count0 = 0;
            int count1 = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '0') {
                    count0++;
                   // System.out.println("count0 = " + count0);
                }else {
                    count1++;
                    //System.out.println("count1 = " + count1);
                }
            }
            return new Cost(count0, count1);
        }

    public static void main(String[] args) {
        ZeroOne zeroOne= new ZeroOne();
        String[] arr= {"10","001","111001","1","0"};
        zeroOne.findMaxForm(arr,2,3);
    }
}

