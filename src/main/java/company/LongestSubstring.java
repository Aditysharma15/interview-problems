package company;

import java.util.*;

/**
 * Created by Tuhin on 3/20/2017.
 */
public class LongestSubstring {

    public  int  lgsub(String a, String b, int max){
        if(a==null || b==null){
            return 0;
        }

        if(a=="" || b==""){
            return max;
        }
        char[] a1= a.toCharArray();
        char[] b1= b.toCharArray();

        int count=0;
        int i ,index=0;
        for(i =0 ; i <a1.length; i ++){
            index=b.indexOf(a1[i]);
            if(index==-1){
               continue;
            }
            else{
                while(index!=b.length()-1 && a1[i]==b1[index]){
                    index++;
                    i++;
                    count++;
                }
                if (count>max){
                    max=count;

                }

                System.out.println(count);
                count=0;

              break;

            }
        }
        if(i<a.length()) {
            lgsub(a.substring(i), b.substring(index), max);
        }//int retVal=Collections.max(countList);
        return max;
    }

    public int getMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();



        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.next();
        }
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            // your code goes here
        }*/
        LongestSubstring longestSubstring=new LongestSubstring();
        System.out.println("MAX Val"+longestSubstring.lgsub("probieren","birkerem",Integer.MIN_VALUE));
        System.out.println("MAX Val"+longestSubstring.lgsub("probieren","sadasment",Integer.MIN_VALUE));
        System.out.println("MAX Val"+longestSubstring.lgsub("birkerem","sadasment",Integer.MIN_VALUE));
        //System.out.println("Max Val "+longestSubstring.getMax(longestSubstring.countList));
    }

}
