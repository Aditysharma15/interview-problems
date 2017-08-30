package company;

import java.util.HashMap;

/**
 * Created by Tuhin on 4/15/2017.
 */
public class Student {

    public boolean checkRecord(String s) {

        HashMap<Character, Integer> hmap= new HashMap<>();
        for(int i =0; i<s.length();i++){
            if(i+2<=s.length()-1) {

                if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
            if (!hmap.containsKey(s.charAt(i)))
            {
                hmap.put(s.charAt(i),1);
            }
            else{
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
        }
        for(char c:hmap.keySet()){
            if(c=='A' && hmap.get('A')>1 ){
                return false;
            }
            if(c=='L' && hmap.get('L')>2 ){

            }
        }

        return true;
    }


    public void checkRecord(int n) {

        String val="alp";



    }


    public static void paren(int[] num){
        float[][] valueTable= new float[num.length+1][num.length+1];
        for(int i=1; i <=num.length; i++){
            valueTable[0][i]=num[i-1];

        }
        for(int j=1; j <=num.length; j++){
            valueTable[j][0]=num[j-1];
        }
        for(int i=1; i <valueTable.length; i++){
            for(int j=1; j <valueTable.length; j++) {
                valueTable[i][j]=(float)valueTable[i][0]/(float)valueTable[0][j];

            }

        }
        for(int i=0; i <valueTable.length; i++){
            System.out.println("row " +i);
            for(int j=0; j <valueTable.length; j++) {

                System.out.print (valueTable[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] num={1000,100,10,2};
        paren(num);
    }

}
