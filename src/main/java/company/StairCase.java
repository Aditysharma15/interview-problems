package company;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Tuhin on 2/22/2017.
 */
public class StairCase {


    public static void main(String[] args) {
      /*  Scanner in = new Scanner(System.in);
        System.out.println("give N");
        int n = in.nextInt();*/
        StairCase stairCase= new StairCase();
        stairCase.stairCase(6);
    }



    public void stairCase(int n){

        for (int i =n ;i >=1; i--){
            int j=0,k=0;
            while (j!=(i-1)){
                System.out.print(" ");
                j++;
            }
            while(k!=(n-j)){
                System.out.print("#");
                k++;
            }

            System.out.println();


        }


    }
}
