package company;

import java.math.BigDecimal;

/**
 * Created by Tuhin on 2/7/2017.
 */
public class Roundoff {



        public static double TwoDecimalPlaces(double number)
        {
            //Write your code here
            System.out.println(number);
           // double val=number*100;
           // System.out.println(val);
           /* if ((val%10)>=5){
                number=((val+1));
                System.out.println("num "+ number);
                number=Double.valueOf(number/100);
                System.out.println("num 2 "+ number);
            }
            else{
                number=val-1;
                number=Double.valueOf(number/100);
            }*/
            //double val=Math.floor(number*100)/100;
            //String.format("%.2f", number);
            //float localresult =Float.parseFloat(itemquantity*itemamount);
            BigDecimal bd = new BigDecimal(Double.toString(number));
            bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
            number=bd.doubleValue();
            return number;
        }

        public static void main (String[] args){
            Roundoff roundoff= new Roundoff();
            System.out.println(roundoff.TwoDecimalPlaces(4.659725356));
        }
}
