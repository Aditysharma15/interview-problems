package company;

import static java.lang.StrictMath.abs;

/**
 * Created by Tuhin on 2/6/2017.
 */
public class Stringaddbinary {
    int[] a ;
    int length;
    public void sort(int[] numbers)
    {
        if (numbers == null || numbers.length == 0)
            {    return;
            }
    this.a = numbers;
    length = numbers.length;
        int p =binaryadd(0, length - 1);
    }



    int binaryadd(int low, int  high){

        int i  = low;
/*
        for (int digit:a){
            System.out.print(" "+digit );
        }
        //int j=a.length-1;*/
        int j=high ;
        System.out.println(" array le " + a.length);
        int pivotindex=abs((i+j/2));
        int pivot = a[abs((i+j/2))];
        System.out.println("Pivot "+ pivot);
        while(i<=j){

           while(a[i]<pivot){
               // a=swap(a,i,j);

               // System.out.println("i "+i);
                i++;
            }
            while(a[j]>=pivot){
                // a=swap(a,i,j);

                // System.out.println("i "+i);
                j--;
            }
            if (i<j) {
                swap(a,i,j);
                i++;
                j--;
            }

            }
        //if (low < j) { binaryadd(low, j); } if (i < high) { binaryadd(i, high); }


           /* int indx=j;
            if (a[j]<indx){
                j++;
            }*/



       /*     if (a[i]>=pivot){
                System.out.println("B a[i]  "+ a[i] + " a[j]"+ a[j]);
                a=swap(a,i,j);
                System.out.println("A a[i]  "+ a[i] + " a[j]"+ a[j]);
                j--;
                //System.out.println("j " +j);
            }*/

        int idx = j;
        if (a[i] > pivot)
        {
        swap(a, i,pivotindex );
        }
        System.out.println((pivot));

        System.out.println("value of j " + j + " value of i " + i);

        for (int digit:a){
        System.out.print(" "+digit);
        }
        System.out.println("\n I am i " + i + "-"+a[i]+ " I am j " + j + "-"+a[j]);

        return pivot;
    }


    void swap(int arr[],int a,int b){
       // System.out.println("Ba "+a+ " b "+ b);
//        for (int digit:arr){
//            System.out.print(" "+digit );
//        }
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
     // System.out.println("Aa "+a+ " b "+ b);
      /*  for (int digit:arr){
            System.out.print(" "+digit );
        }*/
        //
        // return arr;
    }

    public static void main(String args[]){
        Stringaddbinary sb= new Stringaddbinary();
        //int arr[]=new int[11];
        int arr[]= {1,2,5,9,3,7,10,0,3,8};

        sb.sort(arr);

    }
}
