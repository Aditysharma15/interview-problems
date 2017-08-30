package company;

import java.util.HashMap;

/**
 * Created by Tuhin on 3/23/2017.
 */
public class ShortSuperSeq {

    public void shortSuperSeq(int[] bigArr , int[] smallArr){
        HashMap<Integer,Integer> map=mapFill(smallArr);
       int start=-1;
       int end=-1;
       int diff=0;

       for(int i=0 ; i<bigArr.length; i++){
           if(end!=-1){
               System.out.print(start + " ");
               System.out.print(end + " ");
               /*arr[k][0]=start;
               arr[k][1]=end;
               k++;*/
               diff= end-start;
               System.out.print(diff);
               map=mapFill(smallArr);
               end=-1;
               i=start;
               continue;
           }
           if(map.containsKey(bigArr[i])){
               if(map.size()==smallArr.length){
                   start=i;
               }
               map.remove(bigArr[i]);
               if(map.isEmpty()){
                   end=i;
               }
           }
           System.out.println();
       }
    }

    public HashMap<Integer,Integer> mapFill(int[] smallArr){
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i= 0 ; i <smallArr.length; i ++) {
            hmap.put( smallArr[i],i);
        }
        return hmap;
    }

    public static void main(String[] args) {
        ShortSuperSeq shortSuperSeq= new ShortSuperSeq();
        int[] bigArr={7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7};
        int[] smallArr={1,5,9,7};
        shortSuperSeq.shortSuperSeq(bigArr,smallArr);
    }
}
