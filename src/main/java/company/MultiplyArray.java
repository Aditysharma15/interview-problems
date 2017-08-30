package company;

/**
 * Created by Tuhin on 2/9/2017.
 */
public class MultiplyArray {

    public int DPmulArray(int val){
        int[] array= {1,2,3,4,1,2};
        //int[] opArray=new int[array.length];
        //int product;


        for(int i =array.length-1 ; i !=0; i --){
            val=DPmulArray(val)*val;
        }
        System.out.println(val+" PR");
        return val;

    }
   // 1,2,3,4,5,1

    public int[] multiplyArray(int[] array) {
        int product = 1;
        int[] outputArray=new int[array.length];
        //int flag ;
        //1,2,3,4,5
        int j;
        for (int i = 0; i < array.length; i++) {
            product=1;
             if (i==array.length-1){
                 for (int k = 0; k != i; k++) {

                     product = product *array[k];


                 }
                 outputArray[i]=product;
             }

            for ( j = i + 1;j<array.length ; j++) {

                if (i > 0) {
                    if (j == array.length - 1) {
                        for (int k = 0; k != i; k++) {

                            product = product *array[k];


                        }
                    }

                }

                    product = product * array[j];

                outputArray[i]=product;
            }
        }
        for (int i =0 ; i <outputArray.length; i ++) {
            System.out.println(outputArray[i]);
        }
        return outputArray;
    }


    public static void main(String[] args){
        int[] inputArray = { 3,2,1,2,3,-1};
       // Mergesort mergesort=new Mergesort();
        MultiplyArray mul= new MultiplyArray();
            mul.DPmulArray(1);
       System.out.println(mul.multiplyArray(inputArray).length);
        //addnum(inputArray,5);
    }
}
