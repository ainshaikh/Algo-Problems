// import java.io.*;
// import java.util.*;

// public class FirstIndexLastIndex{
//     public static void main(String[] args) throws Exception{
        
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int []arr = new int [n];
//         for(int i = 0; i<arr.length; i++){
//             arr[i] = scn.nextInt();
//         }
//         int target = scn.nextInt();

//         int [] ans = {-1,-1};
//         int lo = 0;
//         int hi = arr.length-1;

//            //for first index
//         while(lo<=hi){
//         int mid = (lo+hi)/2;
//             if(target == arr[mid]){
//                 ans[0] = mid;
//                 // continue searching in left part
//                 hi = mid-1;
//             }
//             else if(target > arr[mid]){
//                 lo = mid+1;
//             }
//             else{
//                 hi = mid-1;
//             }
//         }

//         // for last index

//         lo = 0;
//         hi = arr.length;
//         while(lo <=hi){
//             int mid = (lo + hi) / 2;
//             if(target == arr[mid]){
//                 ans[1] = mid;
//                 // continue searching in right part
//                 lo = mid+1;
//             }
//             else if(target > arr[mid]){
//                 hi = mid +1;
//             }
//             else{
//                 lo = mid -1;
//             }

//          }
//          System.out.println(ans);


//     }
// }


import java.io.*;
import java.util.*;

public class FirstIndexLastIndex{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int [] arr = new int [n];
    for(int i=0; i<arr.length; i++){
        arr[i]= scn.nextInt();
    }
    int data = scn.nextInt();

    int lo = 0;
    int hi = arr.length-1;
    int fi = -1;

    while ( lo<=hi ) {
        int mid = (lo+hi)/2;
        if(data > arr[mid]){
            lo = mid+1;
        }
        else if (data < arr[mid]) {
            hi = mid-1;
            
        } else {
            fi = mid;
            hi = mid-1;
            
        }
    }
        
        System.out.println(fi);

       
       
        lo = 0;
        hi = arr.length-1;
        int li = -1;

    while ( lo<=hi ) {
        int mid = (lo+hi)/2;
        if(data > arr[mid]){
            lo = mid+1;
        }
        else if (data < arr[mid]) {
            hi = mid-1;
            
        } else {
            li = mid;
            lo = mid+1;
            
        }
        
        
    }
        
        System.out.println(li);


    

 }

}