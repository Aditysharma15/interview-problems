package company;

/**
 * Created by Tuhin on 2/9/2017.
 */
public class MoveZeros {


    public int[] moveZero(int[] inputArray){

        int size = inputArray.length;
        if (size==0){
            return inputArray;
        }
        int k=0;
        for(int i = size-1; i!=0 ;i--){
            if(inputArray[i]!=0){
                continue;
            }
            else{
                    if(k>=i){
                        return inputArray;
                    }

                    while ((inputArray[k] == 0)&&(k<=i)) {
                        k++;
                  }
                    if ((inputArray[k] != 0) && (k<=i)) {
                        swap(inputArray,i, k);
                        k++;
                    }

            }

        }
        return inputArray;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void printArray(int[] inputArray){
        for (int i =0 ; i <inputArray.length;i++){
            System.out.print(inputArray[i]);
        }
    }

    public static void main(String[] args){
        int[] inputArray={0,0,0,0,1,3,4,9,1};
        MoveZeros mv=new MoveZeros();
        int[] out=mv.moveZero(inputArray);
        mv.printArray(out);
    }
}
