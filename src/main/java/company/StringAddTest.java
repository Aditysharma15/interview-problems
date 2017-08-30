package company;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Tuhin on 2/7/2017.
 */
public class StringAddTest {

@Test
    public void emptyArray(){
    Stringadd stringAdd = new Stringadd();
    int[] empty={};
    stringAdd.addnum(empty,9);
    //assertEquals();
}


    @Test
    public void samelEments(){
        Stringadd stringAdd = new Stringadd();
        int[] same={1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        stringAdd.addnum(same,0);

    }


    @Test
    public void NegativeyArray(){
        Stringadd stringAdd = new Stringadd();
        int[] empty={-1,-2,-5,-9,-6,3,-1,-6,-7};
        stringAdd.addnum(empty,0);

    }

    @Test
    public void mixzeroArray(){
        Stringadd stringAdd = new Stringadd();
        int[] empty={0,4,3,2,10,3,0,4,5,0};
        stringAdd.addnum(empty,8);

    }


}
