package company;

/**
 * Created by Tuhin on 2/25/2017.
 */
public class Bublesort {

    public int[] bubbleSort(int[] unsorted){

        int i =0,k=0,j=1;
        while(k!=unsorted.length){

            for ( j=1; j < unsorted.length; j ++){
                if(unsorted[i]>unsorted[j]){
                    swap(unsorted,i,j);
                }

                i++;
            }
          k++;
            i=0;
        }
        return unsorted;
    }

    public int[] insertionSort(int[] unsorted){

        int i=1;
        int temp;


        while(i<unsorted.length){

            for (int j=i; j>0;j--){



                if(unsorted[j-1]>unsorted[j]){
                    temp=unsorted[j];
                    unsorted[j]=unsorted[j-1];
                    unsorted[j-1]=temp;
                }

            }
         i++;

        }
        return unsorted;
    }

    public int[] quesSort(int[] unsorted){

      int n= unsorted.length;

      for(int j=0; j<n-1;j++){
          for( int k =0;k<n-j-1;k++){
              if(unsorted[k ]< unsorted[k+1]){
                  swap(unsorted,unsorted[k],unsorted[k+1]);
              }
          }
      }

        return unsorted;
    }



    public void swap(int[] unsorted,int i , int j){
        int temp=unsorted[i];
        unsorted[i]=unsorted[j];
        unsorted[j]=temp;

    }

    void print(int[] array){
        for (int val:array){
            System.out.print("val = " + val + ",");
        }

    }

    public static void main(String[] args) {
        Bublesort bublesort= new Bublesort();
        int[] array={67,4,65,2,44,2,424,0,5};
         int[] array1={0,1,2,3};
        // bublesort.print(bublesort.bubbleSort(array));
         bublesort.print(bublesort.quesSort(array1));

    }
}
