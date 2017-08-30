package company;

import java.util.HashMap;

/**
 * Created by Tuhin on 2/5/2017.
 */
public class Stringadd {


    static int pairNum(int[] arr, int k) {

        HashMap<Integer,Integer> hmap= new HashMap<>();
        HashMap<Integer,Integer> foundPair=new HashMap<>();
        for(int i =0 ; i<arr.length;i++){
            hmap.put(i,arr[i]);

        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int val = k-arr[i];
            if(hmap.containsValue(val)){
                if(!foundPair(arr[i],val,foundPair) && !foundPair(val,arr[i],foundPair)){
                    count++;
                    foundPair.put(arr[i],val);
                }

            }
        }

     return count;

    }

    static int pairNumLong(int[] arr, long k) {

        HashMap<Integer,Long> hmap= new HashMap<>();
        HashMap<Long,Long> foundPair=new HashMap<>();
        for(int i =0 ; i<arr.length;i++){
            hmap.put(i,(long)arr[i]);

        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            long val =(long) k-arr[i];
            if(hmap.containsValue(val)){
                if(!foundPairlong(arr[i],val,foundPair) && !foundPairlong(val,arr[i],foundPair)){
                    count++;
                    foundPair.put((long)arr[i],val);
                }

            }
        }

        return count;

    }
    static boolean foundPairlong(long key,long value, HashMap <Long,Long> pair){

        if(pair.containsKey(key)){
            if(pair.get(key)==value){
                return true;
            }
        }
        return false;

    }


    static boolean foundPair(int key,int value, HashMap <Integer,Integer> pair){

        if(pair.containsKey(key)){
            if(pair.get(key)==value){
                return true;
            }
        }
       return false;

    }











    static int numberOfPairs(int[] arr, long k) {


        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        HashMap<Integer, Integer> numbers2 = new HashMap<Integer, Integer>();

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {

                    if (!numbers.containsKey(arr[i]) && !numbers2.containsKey(arr[j])) {

                        count++;
                        numbers.put(arr[i], i);

                        numbers2.put(arr[j], j);


                    }

                }



            }

        }

        return count;

    }



    public static void addnum(int array[],int sum) {

        int len = array.length;
        if (len==0){
            return;
        }
        int sumTwo, i = 0, j=0, k;





        for (k = 0; k < array.length; k++) {
            sumTwo = sum - array[k];
            //System.out.println("sumTwo "+ sumTwo );
            for (i = 1, j = len - 1; i < j; ) {
                //System.out.println("sumTwo "+ sumTwo + " ARR I " + array[i] + " ARR J " +array[j]);
                if ((array[i] + array[j]) == sumTwo) {
                    System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    break;
                }
                if ((array[i] + array[j]) < sumTwo) {
                    i++;
                }
                if ((array[i] + array[j]) > sumTwo) {
                    j--;
                }





            }


        }
      //  System.out.println(array[i]+" " +array[j]+ " " + array[k]);
        }
       // System.out.println(array[i]+" " +array[j]+ " " + array[k]);

   // -3,-2,1,2,2,3,4,5,6,6,7,8,sum=5=3

    public static void main(String[] args){
       int[] inputArray = {6,1,3,46,1,3,9};
       int[] inputArray1 = {6,6,3,9,3,5,1};
        int[] inputArray3 = {1,1,1,1,1,1,1};
        //Mergesort mergesort=new Mergesort();
        //mergesort.mergeSort(inputArray);
        Stringadd stringadd= new Stringadd();
       // pairNum(inputArray,46);
        System.out.println( pairNumLong(inputArray,47));
        //addnum(inputArray,5);
    }
}




/*for (int i =0; i<array.length; i++){
            sumTwo=sum-array[i];
               for (int j = i+1; j <array.length; j++){
                   if (array[j]<sumTwo){
                       //k=sumTwo-array[j];
                       // find k in array

                   }
                   if (j>sumTwo){

                   }
                   if (j==sumTwo){

                   }

               }
        }*/