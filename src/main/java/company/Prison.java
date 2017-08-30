package company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tuhin on 3/26/2017.
 */
public class Prison {

    static long prison(int m, int n, int[] h, int[] v) {
        if(h.length==0 && v.length==0){
            return 1;
        }
        int[][] matrix=new int[m][n];
        //Arrays.fill(matrix, 1);

        for(int i=0 ; i<m; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j]=1;
                System.out.println( matrix[i][j]);

            }
        }



        long val=1;
        for(int i =0 ; i <h.length; i++){

        }
        for(int i =0 ; i <v.length; i++){

        }
        return val;

    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        long res;
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());


        int _h_size = 0;
        _h_size = Integer.parseInt(in.nextLine().trim());
        int[] _h = new int[_h_size];
        int _h_item;
        for(int _h_i = 0; _h_i < _h_size; _h_i++) {
            _h_item = Integer.parseInt(in.nextLine().trim());
            _h[_h_i] = _h_item;
        }


        int _v_size = 0;
        _v_size = Integer.parseInt(in.nextLine().trim());
        int[] _v = new int[_v_size];
        int _v_item;
        for(int _v_i = 0; _v_i < _v_size; _v_i++) {
            _v_item = Integer.parseInt(in.nextLine().trim());
            _v[_v_i] = _v_item;
        }

        res = prison(_n, _m, _h, _v);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}

   /* public static void main(String[] args) {
        int n =3;
        int m=2;
        int[] h ={1};
        int[] v={1};
        prison(n,m,h,v);

    }*/


