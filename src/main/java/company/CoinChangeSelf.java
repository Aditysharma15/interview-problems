package company;

/**
 * Created by Tuhin on 4/16/2017.
 */
public class CoinChangeSelf {
    
    public static int minCoinChange(int[] coins, int sum){
        int coinslength = coins.length;
        if(coinslength==0 || sum== 0){
            return 0;
        }
        int[][] result= new int[coinslength+2][sum+1];
        for(int c=0;c<=sum;c++){
            result[0][c]=c;
//            System.out.println("result = " + result[0][c]);
        }
        for(int r=1;r<=coinslength;r++){
            result[r][0]=0;
  //          System.out.println("result = " + result[r][0]);
        }
        for(int r=1;r<=coinslength;r++){
            System.out.println();
            for(int c=1;c<=sum;c++){

                if(coins[r-1]>result[0][c]){
                    result[r][c] = result[r-1][c];
                }
                else{
                    result[r][c] = Math.min(result[r-1][c],result[r][c-coins[r-1]]+1);
                }
                System.out.print(" " + result[r][c]);
            }
        }
        System.out.println(" \n result[coinslength][sum] = " + result[coinslength][sum]);
             return result[coinslength][sum];
    }


    public static int possibleCoinChange(int[] coins, int sum){
        int coinslength = coins.length;
        if(coinslength==0 || sum== 0){
            return 0;
        }
        int[][] result= new int[coinslength+2][sum+1];
        System.out.println(result.length);
        for(int c=0;c<=sum;c++){
            result[0][c]=c;
            result[1][c]=0;

//            System.out.println("result = " + result[0][c]);
        }
        for(int r=1;r<result.length;r++){
            result[r][0]=1;
            //          System.out.println("result = " + result[r][0]);
        }
        int i=0;
        for(int r=2;r<result.length;r++){
            System.out.println();
            for(int c=1;c<result[0].length;c++){

                if(coins[i]>result[0][c]){
                    result[r][c] = result[r-1][c];
                }
                else{
                    result[r][c] = result[r-1][c]+ result[r][result[0][c]-coins[i]];
                }
               //System.out.print(" " + result[r][c]);
            }
            i++;
        }

        for(int r=0;r<result.length;r++){
            System.out.println();
            for(int c=0;c<result[0].length;c++) {
                System.out.print(" " + result[r][c]);
            }
        }
        System.out.println(" \n result[coinslength][sum] = " + result[result.length-1][result[0].length-1]);
        return result[result.length-1][result[0].length-1];
    }


    public static void main(String[] args) {
        int[] coins={1,2,3,5};
        minCoinChange(coins,11);
        int[] coins1={1,2,3};
        possibleCoinChange(coins1,7);
    }
}
