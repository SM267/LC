import java.util.*;
public class Minimumofthe_maximini {
    public static int min(int[] arr) {
    int min = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
    }
    return min;
}
public static int max(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
        if (num > max) max = num;
    }
    return max;
}
    public void minimaxi(int[] arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0]; 
        for(int i=0;i<n;i++){
        int[] temp = arr.clone();
        for (int j = 0; j < i; j++) temp[j] += k;
        for (int j = i; j < n; j++) temp[j] -= k;
        int minH = min(temp);
        int maxH = max(temp);
        res = Math.min(res, maxH - minH);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();
        Minimumofthe_maximini mmm=new Minimumofthe_maximini();
        mmm.minimaxi(arr, n);
    }
}