package company;

import java.util.Arrays;

/**
 * Created by Tuhin on 3/28/2017.
 */
public class CoinChange {

    static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }

    public static int dynamic(int[] v, int amount) {
        int[][] solution = new int[v.length + 1][amount + 1];

        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= v.length; i++) {
            solution[i][0] = 1;
        }

        // if no coins given, 0 ways to change the amount
        for (int i = 1; i <= amount; i++) {
            solution[0][i] = 0;
        }

        // now fill rest of the matrix.

        for (int i = 1; i <= v.length; i++) {
            for (int j = 1; j <= amount; j++) {
                // check if the coin value is less than the amount needed
                if (v[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    solution[i][j] = solution[i - 1][j]
                            + solution[i][j - v[i - 1]];
                } else {
                    // just copy the value from the top
                    solution[i][j] = solution[i - 1][j];
                }
            }
        }
        return solution[v.length][amount];
    }


    // Driver Function to test above function
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
    }

}
