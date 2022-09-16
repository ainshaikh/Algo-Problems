import java.io.*;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int [][]one = new int [r1][c1];
        for(int i=0; i<one.length; i++){
            for(int j=0; j< one[0].length; j++){
                one[i][j] = scn.nextInt();
            }
        }

        int r2 = scn.nextInt();
        int c2  =scn.nextInt();

        int[][] two = new int[r2][c2];
        for(int i=0; i<two.length; i++){
            for(int j =0; j<two[0].length; j++){
                two[i][j] = scn.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid Input");
            return;
        }

        int [][] product = new int[r1][c2];  // making matrix first's row and      second's column.

        for(int i=0; i<product.length; i++){   //initial zero values
            for(int j=0; j<product[0].length; j++){ // providing  value
                for(int k=0; k<c1; k++){  // filling values and c1==r2
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        for(int i=0; i<product.length; i++){
            for(int j=0; j<product[0].length; j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
