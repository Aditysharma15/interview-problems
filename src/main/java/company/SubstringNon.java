package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Tuhin on 3/30/2017.
 */
public class SubstringNon {


    public static void substringNonrepeat(String str){
        HashMap<Character,Integer> hmap= new HashMap<>();
        int maxSize=0;
        ArrayList<String> list= new ArrayList<>();
        String longSubString = "";
        HelperSubstringNonRepeatChar helperSubstringNonRepeatChar = new HelperSubstringNonRepeatChar();
        boolean flag=false;
        for(int i =0 ; i < str.length(); i++){

            if(!hmap.containsKey(str.charAt(i))){
                hmap.put(str.charAt(i),1);
                longSubString+=str.charAt(i);

            }
            else{
                flag=true;
                int size= hmap.size();
                longSubString = "";
                    Iterator it = hmap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry)it.next();
                        char key=(Character)entry.getKey();
                        //System.out.println(entry.getKey() + " = " + entry.getValue());
                        longSubString+=key;

                        it.remove(); // avoids a ConcurrentModificationException
                        hmap.remove(key);
                       // System.out.println("size"+ hmap.size());
                    }

                    i=i-size;
                    //System.out.println("String i " + longSubString);
                    list.add(longSubString);
                   // maxSize=longSubString.length();
                int len=longSubString.length();
                //helperSubstringNonRepeatChar = new HelperSubstringNonRepeatChar();
                if(len>helperSubstringNonRepeatChar.getLength()) {
                    helperSubstringNonRepeatChar.setWord(longSubString);
                    helperSubstringNonRepeatChar.setLength(longSubString.length());
                }
            }

        }
        if(flag==false) {
            helperSubstringNonRepeatChar.setWord(longSubString);
            helperSubstringNonRepeatChar.setLength(longSubString.length());
        }
        //System.out.println("String i " + longSubString);
        System.out.println("obj " + helperSubstringNonRepeatChar.getWord() + " " + helperSubstringNonRepeatChar.length);

    }

    public static void main(String[] args) {
     /*  substringNonrepeat("abcabcbb");
       substringNonrepeat("pwwkew");
       substringNonrepeat("bbbbbbbb");
        substringNonrepeat("c");
        substringNonrepeat("abc");
        substringNonrepeat("");*/
        substringNonrepeat("aab");
    }

}
