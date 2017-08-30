package company;

import java.util.HashSet;

/**
 * Created by Tuhin on 2/27/2017.
 */


public class PairSum{

    public void sumPair(int arr[],int k){
        HashSet<Integer> visitedSet = new HashSet<>();
        int findNumber;
        HashSet<Integer> returnSet= new HashSet<>();
        for (int i =0 ; i <arr.length; i++){
            findNumber =k-i;
            if(visitedSet.contains(findNumber)){

                returnSet.add(findNumber);
            }
            else{
                visitedSet.add(arr[i]);
            }


        }



    }
}