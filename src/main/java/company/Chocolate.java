package company;

import java.util.Scanner;

/**
 * Created by Tuhin on 3/10/2017.
 */
public class Chocolate {

        public void calculateChoc(int[] squares,int n, int d,int m ){
            if(m<1||m>12||d<1||d>31||n>100|n<1){
                System.out.println("Wrong parameters");
                return;
            }
            if(m>n){
                System.out.println("this cannot be calculate partiction is gretaer than size of array");
                return;
            }
            int lower=0;
            int upper=0;
            int sum=0;
            int k=0;
            int result=0;
            for(int i =0 ; i <n;i++){
                sum=squares[i];

                if(m==1){
                 if(sum==d){
                     result++;
                 }

                }
                else {
                    lower = i;

                    upper = lower + 1;
                    k = 0;

                    while (k < m - 1 && upper > lower && upper < n) {
                        sum = sum+ squares[upper];
                        if (sum == d) {
                            result++;
                        }
                        upper++;
                        lower++;
                        k++;
                    }
                }
            }
            System.out.println("hi"+ result);
        }
  /*  void subArraySum(int arr[], int n, int d,int m)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > d && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == d)
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return;
    }*/

    public void calculateChoc2(int[] squares,int n, int d,int m ) {
        if (m < 1 || m > 12 || d < 1 || d > 31 || n > 100 || n < 1||squares==null||squares.length==0) {
            throw new IllegalArgumentException();


        }
        if (m > n) {
            throw new IllegalArgumentException();
            //System.out.println("Wrong parameters");
            //return;
        }
        int sum = 0;
        int result = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(squares[i]<0||squares[i]>5){
                throw new IllegalArgumentException();

              //  System.out.println("Wrong parameters");
                //return;
            }
            sum = sum + squares[i];
            k++;
            if (sum == d && k == m) {
                result++;
                if(i>0){
                    i--;
                }
                sum = 0;
                k=0;
            }


        }

    }

    void subArraySum(int arr[], int n, int sum,int m)
    {

        if (m < 1 || m > 12 || sum < 1 || sum > 31 || n > 100 || n < 1||arr==null||arr.length==0||arr.length!=n) {
            throw new IllegalArgumentException();


        }
        if (m > n) {
            throw new IllegalArgumentException();

        }
        int curr_sum, i, j;
        int k=1;
        int result=0;
        // Pick a starting point
        for (i = 0; i < n; i++)
        {
            if (arr[i]>5||arr[i]<1){
                throw new IllegalArgumentException();
            }
            curr_sum = arr[i];
             k=1;
            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++)
            {
                if (curr_sum == sum && k==m)
                {
                 //   int p = j - 1;
                   // System.out.println("Sum found between indexes " + i
                     //       + " and " + p);
                    result++;

                    break;
                }
                if (curr_sum > sum || j == n|| k==m)
                    break;
                curr_sum = curr_sum + arr[j];
                k++;
            }
        }

        System.out.println("No subarray found");
        System.out.println("Hi" + result);

    }


    /*public void calculate(int[] arr,int n,int sum,int m){

        int curr_sum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum)
            {
                System.out.println( ("Sum found between indexes %d and %d", start, i-1));
                return 1;
            }
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        //printf("No subarray found");
        return 0;
    }
*/
    public static void main(String[] args) {
            /*Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] squares = new int[n];
            for(int squares_i=0; squares_i < n; squares_i++){
                squares[squares_i] = in.nextInt();
            }
            int d = in.nextInt();
            int m = in.nextInt();*/
            Chocolate c=new Chocolate();
            int[] square={1,2,3,1,2,1,2};
            int[] square2={4};

      /*      c.calculateChoc2(square2,1,4,1);
            c.calculateChoc2(square2,1,4,1);

            c.calculateChoc( square,7,3,2);
            c.calculateChoc( square,1,4,2);*/
            //testcases
            int[] squares={1,2,1,3,2};
            c.subArraySum(squares,5,3,2);

        int[] squares2={1,1,1,1,1,1};
        c.subArraySum(squares2,6,3,2);

        int[] squares3={4};
        c.subArraySum(squares3,1,4,1);

            // your code goes here
        }


}
