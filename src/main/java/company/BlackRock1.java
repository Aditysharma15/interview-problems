package company;

/**
 * Created by Tuhin on 4/2/2017.
 */
public class BlackRock1 {


    static int[] arbitrage(String[] quotes) {
        double baseamount=100000;
        double usdEuroRate;
        double euroGBPRate;
        double GbpUsdRate;
        int[] returnArray=new int[quotes.length];
        for(int i=0; i<quotes.length ; i++){

            String[] prices=quotes[i].split(" ");

            if (prices.length==0){
                System.out.println("No comma separated value in Array ");
                break;
            }
            if (prices.length!=3) {

                System.out.println("Insufficient or extra arguments provided");
                break;
            }
            usdEuroRate=Double.parseDouble(prices[0]);
            euroGBPRate=Double.parseDouble(prices[1]);
            GbpUsdRate=Double.parseDouble(prices[2]);
            returnArray[i]=calculate(baseamount,usdEuroRate,euroGBPRate,GbpUsdRate);
            System.out.println( returnArray[i]);
        }



        return returnArray;

    }


    public static  int calculate( double baseamount,double usdEuroRate,double euroGBPRate,double GbpUsdRate){
        double amountTobuyEur= baseamount/usdEuroRate;
        System.out.println("amountTobuyEur = " + amountTobuyEur);
        double amountToBuyGBP= amountTobuyEur/euroGBPRate;
        System.out.println("amountToBuyGBP = " + amountToBuyGBP);
        double amountToBuyUSD= amountToBuyGBP/GbpUsdRate;
        System.out.println("amountToBuyUSD = " + amountToBuyUSD);
        int profit;
        if(amountToBuyUSD>baseamount){
            profit=(int)(amountToBuyUSD-baseamount);
        }
        else{
            profit=0;
        }
        return profit;
    }


    public static void main(String[] args) {
        String[] input={"1.1837 1.3829 0.6102", "1.1234 1.2134 1.2311"};
        arbitrage(input);
    }
}
