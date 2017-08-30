package company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Tuhin on 2/12/2017.
 */
public class UniqueChar  {

    public boolean unique(String str) {
        HashMap<Character,Integer> hashMap = new HashMap();
        int count=1;
        boolean returnValue=true;
        for (int i =0 ; i < str.length(); i ++){
            if (hashMap.containsKey(str.charAt(i))){
                //System.out.println(hashMap.get(str.charAt(i)));
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
            }
            else {
                hashMap.put(str.charAt(i), count);
            }
        }
       for (int value: hashMap.values()) {
           if (value > 1) {
               returnValue = false;
           }

       }
       return returnValue;
    }

public boolean uniqueCharsArray (String str){

        if(str.length()>128)
        {
            return false;
        }

        boolean[] char_val=new boolean[128];

        for (int i =0 ; i <str.length(); i ++) {
            if (char_val[str.charAt(i)] == true) {
                return false;

            }
            char_val[str.charAt(i)] = true;
        }
        return true;
    }

    public boolean oneEditAway(String first, String second)
    {

        boolean returnVal=false;
         if ((first.length()-second.length())==1){
             returnVal=insertSec(first,second);
         }
         if ((first.length()-second.length())==-1){
            returnVal=insertSec(second,first);
         }
         if (first.length()==second.length()){
            returnVal=replace(first,second);
         }
         return returnVal;
    }

    public boolean replace(String first,String second){


        char[] firstArray= first.toCharArray();

        boolean foundDiff=false;

        for (int i =0,j=0;i<firstArray.length;i++,j++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
            }
            foundDiff = true;
        }
        return true;
    }

    public boolean insertSec(String first,String second){


        char[] firstArray= first.toCharArray();
        int i=0;
        int j=0;
        boolean foundDiff=false;
        while(( i <first.length())&&(j<second.length())) {

            if (first.charAt(i) != second.charAt(i)) {
                 if (j>i){
                    return false;
                }
                i++;
            }
            else{
                i++;
                j++;
            }

        }
      return true;
    }



    public boolean permutation(String str,String secondStr){
    if (str.length()!=secondStr.length()){
        return false;
    }
    int[] letters=new int[128];
    char[] strArray=str.toCharArray();
    for (char c:strArray)
        letters[c]++;
    for (int i = 0 ; i <secondStr.length();i++){
        int val=secondStr.charAt(i);
        letters[val]--;
        if (letters[val]<0){
            return false;
        }
    }
    return true;
    }

    public int[] arrayShift(int[] array,int shift){


        int len=array.length;
        int[] opArray=new int[len];

        for(int i =len-1;i>=0;i--) {


            if (((i - shift)%len) < 0)  {
                 System.out.println("FFF" + (((i - shift) % len) + len));

                opArray[((i - shift) % len) + len] = array[i];
            }
            else{
                opArray[i - shift] = array[i];
            }

           // System.out.println(( i-shift)%len);
           // if (((i - shift)%len) < 0) {
             //   System.out.println("FFF" + (((i - shift) % len) + len));
            //}
        }
        return opArray;
    }



    public static void main(String[] args){
       UniqueChar uniqueChar=new UniqueChar();
      /*  System.out.println(uniqueChar.unique("Tuhinaditi"));
        System.out.println(uniqueChar.unique("Aditi"));
        System.out.println(uniqueChar.permutation("abnple","pleanb"));
        System.out.println(uniqueChar.permutation("aabbll","mmbbll"));*/
        int[] a={5,4,6,7,8,9,0};
        int[] opArray=new int[a.length];
        opArray=uniqueChar.arrayShift(a,2);
        for(int val:opArray){
            System.out.print(val);

        }
        for(int val:a){
            System.out.print(val);
        }
    }
}
