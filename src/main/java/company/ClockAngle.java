package company;

/**
 * Created by Tuhin on 4/6/2017.
 */
public class ClockAngle {

    public static double returnAngle(int hour, int min,int sec){

        if(hour < 0 || hour > 12 || min < 0 || min >= 60 || sec < 0 || sec >=60 ){
            return -1;
        }

   // hour hand 1 min
        double valHour= 3.0/6.0;
        System.out.println(valHour);
        double secHour= 1.0/10.0;
        System.out.println("secour = " + secHour);
        double result= Math.abs(((min*6)+((secHour)*sec))-((30*hour)+(min*valHour)));
        if(result>180){
            result=360-result;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        returnAngle(06,30,0);

    }
}
