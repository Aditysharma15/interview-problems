package company;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class MaxAliveYear {

    public int maxAliveYear(int[] birth,int[] death,int min,int max){

        int currentAlive=0;
        int k=0;
        int maxAliveYear=0;
        max=Integer.MIN_VALUE;
        for(int i=0; i<birth.length; i++){


            while(death[k]>=birth[i]){
                currentAlive--;
                k++;
            }

                currentAlive++;
            if(max<currentAlive){
                max=currentAlive;
                maxAliveYear=birth[i];
            }

        }

      return maxAliveYear;

    }
}
