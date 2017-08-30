package company;

import java.util.HashSet;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class SumSwap {

    public void sumSwap(int[] arr1, int[] arr2){





        int array1Sum=sumArray(arr1);
        int array2Sum=sumArray(arr2);
        int target=(array1Sum+array2Sum)/2;
        HashSet<Integer> set= new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        int[] result=null;
        for(int i=0; i<arr2.length ; i++){
                if(set.contains(target-arr2[i])){
                    result[0]=target-arr2[i];
                }

        }


    }

    public int sumArray(int[] arr){
        int sum=0;
        for(int i=0 ; i<arr.length;i++){
            sum += arr[i];

        }
        return sum;
    }
}
