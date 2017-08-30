package company;

/**
 * Created by Tuhin on 2/26/2017.
 */
public class Consective {

    public int[] maxOnes(int[] arr,int max){

        int k ;
        int p=0;
        int j;
        int[] arrayFinal = new int[arr.length];
        for (int i =0; i <arr.length; i ++){
            if (arr[i]==0){
                 j=i+1;
                 if(j>=arr.length){
                     break;
                 }

                if(arr[j]==0){
                     k=j;
                    while(arr[k]!=0){
                        k++;
                        if (k>=arr.length){
                            break;
                        }
                    }
                    arrayFinal[p]=k+1;
                    p++;
                }
                j++;
            }

        }

        return arrayFinal;

    }

    // m is maximum of number zeroes allowed to flip
// n is size of array
    void findZeroes(int arr[], int n, int m)
    {
        // Left and right indexes of current window
        int wL = 0, wR = 0;

        // Left index and size of the widest window
        int bestL = 0, bestWindow = 0;

        // Count of zeroes in current window
        int zeroCount = 0;

        // While right boundary of current window doesn't cross
        // right end
        while (wR < n)
        {
            // If zero count of current window is less than m,
            // widen the window toward right
            if (zeroCount <= m)
            {
                if (arr[wR] == 0)
                {  zeroCount++;}
                wR++;
            }

            // If zero count of current window is more than m,
            // reduce the window from left
            if (zeroCount > m)
            {
                if (arr[wL] == 0)
                {zeroCount--;}
                wL++;
            }

            // Updqate widest window if this window size is more
            if (wR-wL > bestWindow)
            {
                bestWindow = wR-wL;
                bestL = wL;
            }
        }

        // Print positions of zeroes in the widest window
        for (int i=0; i<bestWindow; i++)
        {
            //System.out.println(bestL+ " O "+bestWindow+" hello");
            if (arr[bestL+i] == 0)
            {
                int val= bestL+i;
                System.out.println("bestL+i = " + val + " " );
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0};
        int m =2;
        int n= arr.length;
        Consective consective= new Consective();
        consective.findZeroes(arr,n,m);
    }
}
