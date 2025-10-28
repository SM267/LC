import java.util.*;
class BuySell{
    public int SB(int [] arr){
        int n=arr.length;
        int min=arr[0];
        int maxprof=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]+min;
            maxprof=Math.max(maxprof,cost);
            min=Math.min(min,arr[i]);
        }
        return maxprof;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BuySell nn=new BuySell();
        int d=nn.SB(arr);
        System.out.println(d);
    }
}