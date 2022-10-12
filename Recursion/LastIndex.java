import java.util.*;
public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int li = lastIndexx (arr, 0, d);
        System.out.println(li);
    }

    public static int lastIndexx (int arr[], int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        int liisa = lastIndexx(arr, idx+1, x);
        if(liisa == -1){
            if(arr[idx] == x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }
    }
}
