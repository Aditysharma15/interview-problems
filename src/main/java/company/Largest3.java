package company;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Tuhin on 2/28/2017.
 */
public class Largest3 {


    public void calculate3(int[] arr){
        HashSet<Integer> large= new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i =0; i <arr.length; i ++){
            if(large.isEmpty()) {
                if (arr[i] > max) {
                    large.add(arr[i]);
                }
            }
            else{

            }
        }

    }
}
