package company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;

/**
 * Created by Tuhin on 4/11/2017.
 */
public class ContiSubArray {

    public void contiSubArray(int[] array, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hmap.put(i, array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + array[i + 1] % k == 0) {
                System.out.println("array = " + array[i] + " " + array[i + 1]);
            }
        }
    }
}