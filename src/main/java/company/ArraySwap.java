package company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Tuhin on 3/22/2017.
 */
public class ArraySwap {

    public void swapValue(int[] arr1, int[] arr2){

        if(arr1==null||arr2==null){
            return;
        }

        int sum1=sum(arr1);
        int sum2=sum(arr2);
        int larger=sum1>sum2?sum1:sum2;
        int smaller=larger==sum1?sum2:sum1;
        int value;
        if((larger-smaller)%2!=0){
            return;
        }
        else {
            value = (larger - smaller) / 2;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i =0 ; i <arr1.length; i++){
            hmap.put(i,arr1[i]);

        }

        for(int i =0 ; i <arr2.length; i++) {
            if(hmap.containsValue(arr2[i]-value)){
                System.out.print(arr2[i]-value);
                System.out.println(arr2[i]);
                break;
            }
        }

       System.out.println(value);
        }

    public int sum(int[] arr){
        int sum=0;
        for (int i =0 ; i <arr.length; i ++){
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        ArraySwap arraySwap= new ArraySwap();
        int[] arr1={4,1,2,1,1,2};
        int[] arr2={3,6,3,3,2,};
        arraySwap.swapValue(arr1,arr2);
    }
}
