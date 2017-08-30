package company;

/**
 * Created by Tuhin on 4/5/2017.
 */
public class ArrayRotatePointFind {

    public static int arrayPoint(String[] array,int start,int end){
        if(start>end){
            return -1;
        }
        int mid= (start+end)/2;

        if(array[mid].compareTo(array[start])>0)
        {
            return arrayPoint(array,mid,end);
        }
        else if(array[mid].compareTo(array[start])<0){

            return arrayPoint(array,start,mid);
        }
        //if ((array[mid].compareTo(array[mid-1])<0) || (array[mid].compareTo(array[mid+1])>0))
        else
        {
            return mid+1;
        }
       // return mid;
    }

    public static void main(String[] args) {

        String[] words = new String[]{
                "ptolemaic",
                "puoo",
                "qdooi",
                "qeop",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "yggg",
                "zrtt",
                "asymptote", // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
               "karpatka",
                "othellolagkage",



        };

        System.out.println(arrayPoint(words,0,words.length-1));
    }
}
