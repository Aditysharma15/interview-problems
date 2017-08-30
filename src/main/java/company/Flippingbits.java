package company;

import java.util.BitSet;

/**
 * Created by Tuhin on 4/10/2017.
 */
public class Flippingbits {


    public void unsignedFlipped( int  number){
        BitSet bitSet= new BitSet(32);

        int num=convertBinary(number);
        System.out.println(num);
        number=number^1;

        System.out.println(number);

    }

    public int convertBinary(int number){

        java.util.Stack s= new java.util.Stack();
         while(number!=0){
           s.push(number%2);
            number=number/2;
        }

        while(!s.isEmpty())
        { s.pop();}
    return 1;
    }

    public static void main(String[] args) {
        Flippingbits flippingbits= new Flippingbits();
        flippingbits.unsignedFlipped(8);
    }
}
