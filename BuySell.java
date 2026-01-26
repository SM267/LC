import java.util.*;
class BuySell{
    public int SB(int [] arr){
        int n=arr.length;
        int min=arr[0];
        int max=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]+min;
            max=Math.max(max,cost);
            min=Math.min(min,arr[i]);
        }
        return max;
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


class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;
    }
}
