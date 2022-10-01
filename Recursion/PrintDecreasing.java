// package Recursion;
import java.io.*;
import java.util.*;
public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pDI(n);
        
    }

    public static void pDI(int n){
        // base case
        if(n==0){
            return;
        }

        // my work
        System.out.println(n);

        // faith

        pDI(n-1);
        

    }
}
