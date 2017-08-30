package company;

/**
 * Created by Tuhin on 2/7/2017.
 */


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

    public class MergeSortTest {

        @Test
        public void reverseInput(){
            int[] arr={22,21,19,18,15,14,9,7,5};
            Mergesort.mergeSort(arr);
            assertEquals("[5, 7, 9, 14, 15, 18, 19, 21, 22]", Arrays.toString(arr));

        }
        @Test
        public void emptyInput(){
            int[] arr={};
            Mergesort.mergeSort(arr);
            assertEquals("[]", Arrays.toString(arr));
        }

        @Test
        public void alreadySorted(){
            int[] arr={1,2,3,4,5,6,7,8,9,10};
            Mergesort.mergeSort(arr);
            assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(arr));
        }

    }

