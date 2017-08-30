package company;

/**
 * Created by Tuhin on 3/10/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recipes {

    public void calculateCost(int[] pantry, int[] cost, int[][] recipe, int n) {
        if (pantry == null || cost == null || recipe == null) {
            validate();
            return;
        }
        if ((recipe.length == 0) || (n == 0) || (cost.length == 0)) {
            System.out.println("0");
            return;
        }


        HashMap<Integer, Integer> costRecipe = new HashMap<>();

        for (int r = 0; r < recipe.length; r++) {
            int costOfRecipe = 0;
            for (int c = 0; c < recipe[0].length; c++) {
                if (recipe[r][c] == 1) {
                    if (!findInPantry(c, pantry)) {
                        costOfRecipe = costOfRecipe + seeCost(c, cost);
                    }
                }

            }
            costRecipe.put(r, costOfRecipe);
        }
        for (Map.Entry<Integer, Integer> iter : costRecipe.entrySet()) {
            System.out.println(iter.getValue());
        }
        int result = findLeastCost(costRecipe, n);

        System.out.println(result);
    }

    public int findLeastCost(HashMap<Integer, Integer> costRecipe, int n) {
        int[] list = new int[costRecipe.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> iter : costRecipe.entrySet()) {
            list[i] = (iter.getValue());
            i++;
            System.out.println(iter.getValue());
        }
        Arrays.sort(list);
        int[] resultArray = new int[n];
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum = sum + list[k];
        }
        return sum;
    }

    public boolean findInPantry(int c, int[] pantry) {
        HashMap<Integer, Integer> pantryMap = new HashMap<>();
        for (int i = 0; i < pantry.length; i++) {
            pantryMap.put(pantry[i], i);
        }
        return pantryMap.containsKey(c);
    }

    public int seeCost(int c, int[] cost) {
        HashMap<Integer, Integer> costMap = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            costMap.put(i, cost[i]);
        }
        return costMap.get(c);

    }

    public static void validate() {
        throw new IllegalArgumentException();

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            int q = in.nextInt();
            if (q < 1 || q > 20) {
                validate();
            }
            for (int a0 = 0; a0 < q; a0++) {
                int r = in.nextInt();
                if (r < 1 || r > 30 ) {
                    validate();
                }
                int p = in.nextInt();
                if (p < 1 || p > 13) {
                    validate();
                }
                int n = in.nextInt();
                if (n < 1 || n > Math.min(10, r)) {
                    validate();
                }
                int m = in.nextInt();
                if (m < 0 || m > p) {
                    validate();
                }
                int[] pantry = new int[m];

                for (int pantry_i = 0; pantry_i < m; pantry_i++) {

                    pantry[pantry_i] = in.nextInt();

                }
                int[] cost = new int[p];
                for (int cost_i = 0; cost_i < p; cost_i++) {
                    cost[cost_i] = in.nextInt();

                }
                int[][] recipe = new int[r][p];
                for (int recipe_i = 0; recipe_i < r; recipe_i++) {
                    for (int recipe_j = 0; recipe_j < p; recipe_j++) {
                        recipe[recipe_i][recipe_j] = in.nextInt();
                    }
                }
                Recipes recipes = new Recipes();
                recipes.calculateCost(pantry, cost, recipe, n);
                // your code goes here
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

   /*public static void main(String[] args) {
        Recipes recipes = new Recipes();
        int[] pantry= {1,2};
        int[] cost= {2,3,4,5,1,9};
        int[][] recipe ={{1,1,0,0,0,1},{ 1,0,0,0,1,0},{0,0,0,1,0,0}};
        int n =2;
       recipes.calculateCost(pantry,cost,recipe,n);
   }*/

    }
}


