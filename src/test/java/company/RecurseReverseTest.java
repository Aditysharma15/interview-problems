package company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tuhin on 2/25/2017.
 */
public class RecurseReverseTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reverse() throws Exception {
            RecurseReverse recurseReverse= new RecurseReverse();
        //System.out.println(recurseReverse.reverse("Ramji"));
            String returnString= recurseReverse.reverse("Ramji");
            assertEquals("ijmaR",returnString);
    }

}