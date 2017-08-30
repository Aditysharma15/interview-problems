package company;

/**
 * Created by Tuhin on 4/1/2017.
 */
public class CircularArray {

    public void circularLeft(int[] arr){
        int[] b= new int[arr.length];

        int k =7;
        int len= arr.length;
        for(int i =arr.length-1 ; i>=0 ; i--){
           // System.out.println("i = " +  " "+ i%arr.length);
           int val= i-k;
           //System.out.println("len-k%len = " + val);
           if((i-k)>=0){
                b[i-k]=arr[i];
             //   System.out.println("b[i-k] = " + b[i-k]);
            }
            else{
                       b[len-k+i]=arr[i];
               // b[(arr.length+k)%i]=arr[i];
            }
        }
        System.out.println("B");
        for(int i=0 ; i<b.length ; i++){
            System.out.print(" "+ b[i] );
            //System.out.println("B");

        }
        System.out.println(" A");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(" "+ arr[i] );
            //System.out.println("B");

        }


    }

    public static void main(String[] args) {
        CircularArray circularArray= new CircularArray();
        int[] arr={1,3,4,9,2,3,5};
        circularArray.circularLeft(arr);
    }
}
