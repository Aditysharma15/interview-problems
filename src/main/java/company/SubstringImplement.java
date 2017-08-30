package company;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tuhin on 2/5/2017.
 */
public class SubstringImplement {

    String subString(String source,int index) {

            if ((source.length() < index)|| (index<0))  {
                throw new StringIndexOutOfBoundsException();
            }


        if (source == null) {
            throw new NullPointerException();
        }


        int i;
        String returnString="";
        for (i = 0; i < source.length(); i++) {
                if (i>=index){
                    returnString=returnString+ source.charAt(i);
                }

            }

        return returnString;

            }


    String subString(String source,int startIndex,int endIndex) {

        if ((source.length() < startIndex)|| (source.length() < endIndex)||(startIndex<0)||(endIndex<startIndex))  {
            throw new StringIndexOutOfBoundsException();
        }


        if (source == null) {
            throw new NullPointerException();
        }

        boolean jFlag=false;
        int i,j;
        String returnString="";
        for (i = 0,j=0; i < source.length(); i++,j++) {
            if (i>=startIndex){
                if(jFlag==false){
                    j=0;
                    jFlag=true;
                }
                if(j<(endIndex-startIndex)) {
                    returnString = returnString + source.charAt(i);

                }
            }

        }

        return returnString;

    }


    public static void main(String[] args){
        SubstringImplement simp = new SubstringImplement();
        //System.out.println(simp.subString("kavita",9));
        String a="Ramji";
       // System.out.println(a.substring(0,0));
        String source="Ramji my god will make it happen";
       // System.out.println(source.substring(10));
        //System.out.println(simp.subString(source,10));
        System.out.println(simp.subString(source,5,5));
        System.out.println(source.substring(5,5));

    }

    }



