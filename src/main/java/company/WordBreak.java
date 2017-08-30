package company;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Tuhin on 4/3/2017.
 */
public class WordBreak {





    public boolean WordBreak(String[] arr, String word) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], i);

        }
        return findWord(hmap, word);
    }

   /* public boolean wordBreakrecur(String word, HashMap<String, Integer> hmap){
        if(word.length()==0){
            return true;
        }

        for(int i =0; i <word.length(); i++){

            if(hmap.containsKey(word.substring(0,i)) && wordBreakrecur(word.substring(i,,hmap){
                return true;
            }
        }
    }
*/

    public boolean PfindWord(HashMap<String, Integer> hmap, String word) {
        boolean[] memo = new boolean[word.length() + 1];
        Arrays.fill(memo, false);

        for (int i = 1; i <= word.length(); i++) {

            if (hmap.containsKey(word.substring(0, i))) {
                memo[i] = true;
            }
            if (memo[i] == true) {
                for (int j = i + 1; j <= word.length(); j++) {
                    if (hmap.containsKey(word.substring(i, j - i))) {
                        memo[i] = true;
                    }

                }

            }

        }
        return false;
    }

    public boolean findWord(HashMap<String, Integer> hmap, String word) {

     boolean[] memo = new boolean[word.length() + 1];
        Arrays.fill(memo, false);

        for (int i = 1; i <= word.length(); i++) {

            if (memo[i] == false && hmap.containsKey(word.substring(0, i))) {
                memo[i] = true;

            }
            if (memo[i] = true) {

                if (i == word.length()) {
                    return true;
                }
                for (int j = i + 1; j <= word.length(); j++) {

                    if (memo[j] == false && hmap.containsKey(word.substring(i, j - i))) {
                        memo[j] = true;
                    }
                    if (j == word.length() || memo[j] == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}