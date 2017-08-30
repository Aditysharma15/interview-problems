package company;

import java.util.HashMap;

/**
 * Created by Tuhin on 4/18/2017.
 */
public class Wbreak {

    public static void wBreak(String value){

        HashMap<String,Boolean> hmap=new HashMap<>();
        hmap.put("I",true);
        hmap.put("am",true);
        hmap.put("ace",true);
        hmap.put("a",true);
        hmap.put("acer",true);
        hmap.put("man",true);
        int len= value.length();
        int iter=1;
        int k=1;
        while(iter!=len-1){
            //k=iter+k;
            for(int i =0 ; k<=len;i++){

                if(hmap.containsKey(value.substring(i,k)))
                {
                    System.out.println("true");
                    System.out.println(value.substring(i,k));
                }
                k++;
            }
            iter++;
            k=iter;
        }

    }

    public static void main(String[] args) {
        wBreak("Iamacernotman");
    }


}
