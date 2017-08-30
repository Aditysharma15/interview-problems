package company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tuhin on 2/12/2017.
 */
public class SubstringImplementTest {
    SubstringImplement substringImplement;
    @Before
    public void setUp() throws Exception {
        substringImplement=new SubstringImplement();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void subStringEmptyStrings() throws Exception {
        String source="";
        assertEquals(source.substring(0),substringImplement.subString(source,0));
        assertEquals(source.substring(0,0),substringImplement.subString(source,0,0));
    }

    @Test (expected=StringIndexOutOfBoundsException.class)
    public void subStringTestNegativeIndex() throws Exception {
        String source="Ramji";
        assertEquals(source.substring(0),substringImplement.subString(source,-2));
        assertEquals(source.substring(0,0),substringImplement.subString(source,-2,0));
    }




    @Test (expected=StringIndexOutOfBoundsException.class)
    public void TestStringIndexGreaterthanStringlength()throws Exception {
        String source="Ramji";
        assertEquals(source.substring(0),substringImplement.subString(source,10));
        assertEquals(source.substring(0,0),substringImplement.subString(source,9,10));

    }

    @Test
    public void subString1() throws Exception {
        String source="Ramji my god will make it happen";
        assertEquals(source.substring(10),substringImplement.subString(source,10));
        assertEquals(source.substring(9,10),substringImplement.subString(source,9,10));

    }

    @Test
    public void main() throws Exception {

    }

}