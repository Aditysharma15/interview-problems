package company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tuhin on 3/7/2017.
 */
public class Dynamic {


    int countways(int n){
        int[] memo= new int [n+1];
        Arrays.fill(memo,-1);
       // int mem=countWays(n,memo);
      //  return countWays(n,memo);
        System.out.println(comp(countWays(n,memo),countWaysDP(n,memo)));
        return countWaysDP(n,memo);

    }
   public boolean comp(int a,int b){
        if(a==b){
            return true;

        }
        return false;
    }
    public  int countWays(int n, int[] map) {
        if (n < 0)
            return map[n] = 0;
        else if (n == 0)
            return map[n] = 1;
        else if (map[n] == -1){
            int x = countWaysDP(n - 1, map);
            int y = countWaysDP(n - 2, map);
            int z = countWaysDP(n - 3, map);
        //  map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
            map[n] = x + y + z;
    }
            return map[n];
    }

    public  int countWaysDP(int n, int[] map) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if (map[n] > -1)
            return map[n];
        else {
            int x=countWaysDP(n - 1, map);
            int y =countWaysDP(n - 2, map);
            int z =  countWaysDP(n - 3, map);
          //  map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
            map[n]=x+y+z;
            return map[n]; }
    }

    public static void main(String[] args) {
        Dynamic dy= new Dynamic();
        System.out.println(dy.countways(90));

    }

    }