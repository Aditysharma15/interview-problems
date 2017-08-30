package company;

import java.util.Arrays;

/**
 * Created by Tuhin on 2/25/2017.
 */
public class BinarySearch {

    int mid;

    public boolean binarySearch(int[] array, int value){

        int length= array.length;

        if (length==0){
            return false;
        }
        mid=Math.abs(length/2);
        if(array[mid]==value){
            return true;
        }
        if(array[mid]>value){
            array= Arrays.copyOfRange(array,0,mid-1);
            return binarySearch(array,value);
        }
        else if(array[mid]<value){
            array=Arrays.copyOfRange(array,mid+1,array.length);
            return binarySearch(array,value);
        }

            return false;


    }

    public int binarySearch2(int[] array, int start, int end,int value){

        int mid=(start+end)/2;

        if (end<start){
            return -1;
        }
        //mid=Math.abs(length/2);
        if(array[mid]>value){
            //array= Arrays.copyOfRange(array,0,mid);
            return binarySearch2(array,start,mid-1,value);
        }
        else if(array[mid]<value){
            //array=Arrays.copyOfRange(array,mid+1,end);
            return binarySearch2(array,mid+1,end,value);
        }
        else {
            return mid;
        }

    }



    public static void main(String[] args) {
        BinarySearch binarySearch= new BinarySearch();
        int[] array={3,6,8,9,10,15,18};
        System.out.println(binarySearch.binarySearch(array,4));
    }




}
