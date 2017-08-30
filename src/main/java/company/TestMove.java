package company;

/**
 * Created by Tuhin on 3/31/2017.
 */


// To execute Java, please define "static void main" on a class named Solution.

// i =  { 1, 2, 5, 10 }
// o =  { 100, 50, 20, 10 }

public class TestMove {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] arr={1,2,5,10};
        productOfrestElements(arr);
    }

    public static void productOfrestElements(int[] input){
        int product=1;
        for (int i=0 ; i<input.length ; i++){

            product = product*input[i];
        }
        System.out.println("Product is " + product);
        int[] output=new int[input.length];
        System.out.print("Output is " );
        for (int i=0 ; i<input.length ; i++){
            output[i]=(product/input[i]);
            System.out.print(output[i] + " ");
        }

    }

}

  /*  Values in array:

        0 -1
        all zeros
        all 1s
        Integer_Max_Val
        Integer_Min_Val
        Same number
        Negative Numbers
        Array of length zero
        Null as array
        Double/Long -- compile time error
        two zeros
        Normal input numers
        acending numbers
        descending numbers
        Length of array is high
        one element array
        two element array
  */