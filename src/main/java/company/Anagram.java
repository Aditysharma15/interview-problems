package company;

import java.util.Scanner;

/**
 * Created by Tuhin on 4/8/2017.
 */
public class Anagram {




        public int invalid(String str){
            String str1;
            String str2;
            int length= str.length();
            if(length<=1){
                return -1;
            }

            if(length%2==0){
                int mid = length/2;
                str1=str.substring(0,mid);
                str2= str.substring(mid);

                return findAnagaram(str1,str2);
            }
            else{
                return -1;
            }


        }
        public int findAnagaram(String str1, String str2){

            int[] lettersA= new int[128];
            int[] lettersB= new int[128];
            int count=0;
            for(int i = 0 ; i < str1.length() ; i++){
                lettersA[str1.charAt(i)]++;
                lettersB[str2.charAt(i)]++;
                // lettersB[str2.charAt(i)]++;

            }
            for(int i = 0 ; i < str2.length() ; i++){
                lettersA[str2.charAt(i)]--;
               // lettersB[str2.charAt(i)]++;
                // lettersB[str2.charAt(i)]++;

            }
            for(int i = 0 ; i < lettersA.length ; i++){

                if( lettersA[i]!=0 )
                {    System.out.println(lettersA[i]);
                    count+=lettersA[i];
                }
            }
             System.out.println(count);
            return count/2;

        }

        public static void main(String[] args) {
        /* Enter your code here. Red input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            //Scanner s= new Scanner(System.in);



            Anagram sol= new Anagram();
           // int n =s.nextInt();

           // for(int i =0; i <n; i ++){
              String str= "aaabbb";
                System.out.println(sol.invalid(str));
           // }

        }


}
