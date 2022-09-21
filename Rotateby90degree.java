import java.io.*;
import java.util.*;

import javax.security.auth.x500.X500Principal;

public class Rotateby90degree{

    public static void display(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // return;
    }
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // for transpose

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse 
        int li = 0;
        int ri = arr[0].length-1;
        while(li < ri){

        for(int i=0; i<arr.length; i++){
            int temp = arr[i][li];
            arr[i][li] = arr[i][ri];
            arr[i][ri] = temp;
          
        }
        li++;
        ri--;
    }
        display(arr);
    }
    
}