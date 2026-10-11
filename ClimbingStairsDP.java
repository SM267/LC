import java.util.*;

public class ClimbingStairsDP {
    //recurstion then memoization
    public int solve(int[] cost,int n,int[] dp){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=cost[n]+Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
    }
    public int dptabulation(int[] cost,int n){
        int[] dp=new int [n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public int spcaecompdp(int []arr,int n){
        int prev1=arr[0];
        int prev2=arr[1];
        for(int i=2;i<n;i++){
            int cur=arr[i]+Math.min(prev1,prev2);
            prev1=prev2;
            prev2=cur;
        }
        return Math.min(prev1, prev2);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ClimbingStairsDP ms=new ClimbingStairsDP();
        int dd=ms.spcaecompdp(arr,n);
        System.out.println(dd);

    }
}
/*
class Solution {
    public int solve(int[] cost,int n){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        return cost[n]+Math.min(solve(cost,n-1),solve(cost,n-2));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        return Math.min(solve(cost,n-1),solve(cost,n-2));
    }
}
*/