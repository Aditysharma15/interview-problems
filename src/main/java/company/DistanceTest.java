package company;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Tuhin on 2/3/2017.
 */
public class DistanceTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void fileOpen() throws Exception {

    }

    @Test
    public void nearestCoffeeOneElementArray() throws Exception {
        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("StarbucksSeattle2,47.5869,-122.3368");

        dist.nearestCoffee(0,0,fileLines);
    }
    @Test
    public void nearestCoffeeOneElementArrayValueNonZero() throws Exception {
        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("StarbucksSeattle2,47.5869,-122.3368");

        dist.nearestCoffee(45.6,28.9,fileLines);
    }
    @Test
    public void nearestCoffeeOneElementArrayNull() throws Exception {
        Distance dist= new Distance();
        ArrayList<String> fileLines=null;
        //fileLines.add("StarbucksSeattle2,47.5869,-122.3368");

        dist.nearestCoffee(45.6,28.9,fileLines);
    }
    @Test
    public void nearestCoffeeIntegerValue() throws Exception {
        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("StarbucksSeattle2,47,122");
        fileLines.add("StarbucksSeattle3,49,78");
        fileLines.add("StarbucksSeattle1,40.34,122.45");
        dist.nearestCoffee(45,28,fileLines);
    }

    @Test
    public void nearestCoffeeAllZeros() throws Exception {
        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("StarbucksSeattle1,0,0");
        fileLines.add("null,0,0");
        fileLines.add("StarbucksSeattle2,0,0");
        dist.nearestCoffee(45,28,fileLines);
    }

    @Test
    public void nearestCoffeeShopNull() throws Exception { // it prins null as place name is it correct?

        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();

        fileLines.add("null,0,0");

        dist.nearestCoffee(45,28,fileLines);
    }
    @Test
    public void nearestCoffeeShopNaxDouble() throws Exception { // it prins null as place name is it correct?

        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("null,178,0");

        dist.nearestCoffee(45, Double.MAX_VALUE,fileLines);
    }

    @Test
    public void nearestCoffeeShopEmptyString() throws Exception { // it prins null as place name is it correct?

        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("");

        dist.nearestCoffee(45, Double.MAX_VALUE,fileLines);
    }


    @Test
    public void nearestCoffeeShopCoordinateString() throws Exception { // it prins null as place name is it correct?

        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("Hello,jdd,jk");

        dist.nearestCoffee(45, Double.MAX_VALUE,fileLines);
    }

    @Test
    public void nearestCoffeeShopCoordinateNaN() throws Exception { // it prins null as place name is it correct?

        Distance dist= new Distance();
        ArrayList<String> fileLines=new ArrayList<>();
        fileLines.add("Hello,NaN,NaN");

        dist.nearestCoffee(45, Double.MAX_VALUE,fileLines);
    }
}