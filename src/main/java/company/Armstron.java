package company;

import java.util.zip.DeflaterInputStream;

/**
 * Created by Tuhin on 2/27/2017.
 */
public class Armstron {

    public boolean armstrong(int n){
        DigitArmstrong digitArmstrong= new DigitArmstrong();
        digitArmstrong=calculateNumberOfDigit(n);
        int value=0;
        for (int i=0; i<digitArmstrong.getRemainder().size();i++) {

            value=value+ multiply(digitArmstrong.getRemainder().get(i), digitArmstrong.count);
        }
        if(value==n){
            return true;
        }
        else
        {
            return false;
        }

    }

    public DigitArmstrong calculateNumberOfDigit(int n ){
        DigitArmstrong digitArmstrong= new DigitArmstrong();
        int count=0;
        while(n>0) {
            digitArmstrong.getRemainder().add( n % 10);
            n = n / 10;
            count++;
        }
        digitArmstrong.count=count;
        return digitArmstrong;
    }

    public int multiply(int val,int count){
        int result=1;
        for (int i =0; i <count; i++){
            result=result*val;
        }
        return result;
    }

    public static void main(String[] args) {
        Armstron armstrong= new Armstron();
        System.out.println(armstrong.armstrong(120));
    }

}
