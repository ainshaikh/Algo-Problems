import java.io.*;
import java.util.*;
public class TheStateofWakanda2orDiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [][] arr = new int [n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int g=0; g<arr.length; g++){
            for(int i=0, j=g; j<arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
