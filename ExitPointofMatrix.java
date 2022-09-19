import java.io.*;
import java.util.*;
public class ExitPointofMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int [n][m];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int dir = 0;
        int i = 0;
        int j = 0;
        while(true){
            dir = (dir+arr[i][j]) % 4; // this gives 0 value 

            if(dir == 0){
                // east direction
                j++;
            }
            else if(dir == 1){
                // south
                i++;
            }
            else if(dir == 2){
                //west
                j--;
            }
            else if(dir == 3){
                // north
                i--;
            }

// for negative values
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i == arr.length){
                i--;
                break;
            }
            else if(j == arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
