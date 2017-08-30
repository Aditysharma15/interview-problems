package company;

/**
 * Created by Tuhin on 4/18/2017.
 */
public class MatrixMaxOne{
    public void matrixMaxOne(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] result= new int[row][col];
        for(int r=0; r<row ; r++){
            for(int c=0; c<col ; c++){
                if(r==0 || c==0 || matrix[r][c]==0){
                    result[r][c]=matrix[r][c];
                }
            }
        }

        for(int r=1; r<row ; r++){
            for(int c=1; c<col ; c++){
                result[r][c]= Math.min(Math.min(result[r-1][c],result[r][c-1]),result[r-1][c-1])+1;
            }
        }

    }

}
