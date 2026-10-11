import java.util.*;
public class MinimumJumpsEnd {
    public static int max(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
        if (num > max) max = num;
    }
    return max;
    }
    int count=0;
    public int jumps(int []arr,int n){
        if(arr[0]==0) return -1;
        int i=0;
        if(i<n){
        int maxi=max(jumps(arr[i+1]),n);
        count++;
        }
        return Math.min(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
/*for(int i=0;i<n;i++){
            for(int j=arr[])
        } */