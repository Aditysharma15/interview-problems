package company;

import java.util.ArrayList;

/**
 * Created by Tuhin on 2/8/2017.
 */
public class Sequence {



        public int sequence(String str) {
            int flag = 1;
            int k;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            if (str.length() == 0) {
                return 0;
            }
            String[] seq = str.split(" ");

            int[] results = new int[seq.length];

            for (int iter = 0; iter < seq.length; iter++) {

                try {
                    results[iter] = Integer.parseInt(seq[iter]);
                } catch (NumberFormatException nfe) {
                    return 1;
                }
            }
                k = results[0];

                for (int i = 0; i < results.length; i++) {


                    if (results[i] == k) {

                        k++;
                        continue;
                    } else {
                        arr.add(k);
                        i--;
                     k++;
                    }


                }
                System.out.println("missing numbers are ");
                for (int r : arr) {
                    System.out.println(" " + r);
                }
                return arr.get(0);
            }



    public static void main(String[] args){
        //int[] inputArray = { -2,-3,1,1,2,3,4,5,6,6,7,8};
        Sequence seq=new Sequence();
        System.out.println("SEQ  " +seq.sequence("1 3 2 5"));
    }

}



   /*  int val=int ascii(char)
                if (val<64 || val>90 || val<97 || val>122){
                    return 1;
                }*/


                    /*for (int j =i+1;j<seq.length;j++){
                             if(seq[i]+1==seq[j]){
                                 flag=0;
                                 break;
                             }
                             else {
                                 System.out.println(seq[i]+1);
                             }



                }*/