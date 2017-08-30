package company;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class MaxContigousSeq {

    public int maxSubSeq(int[] array){

        int sum=0;
        int maxSum=0;
        for (int i=0; i<array.length ; i++){
            sum+=array[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            else if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
