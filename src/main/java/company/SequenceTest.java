package company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Tuhin on 2/8/2017.
 */
public class SequenceTest
{

    @Test
    public void testSomething() {
        //int[] arr={};
        //Mergesort.mergeSort(arr);
       // Assert.assertEquals("[]", Arrays.toString(arr));

        assertEquals(new Sequence().sequence("1 3 2 5"), 4);
    }
}
