import java.util.*;

public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int n=nums.length;
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MaximumSubarray rarr = new MaximumSubarray();
        System.out.println(rarr.maxSubArray(arr));
    }
}
/*class Solution {
    public int maxSubArray(int[] nums){
        int n=nums.length;
        int p1=nums[0];
        int p2=nums[0];
        int maxi=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            p1=Math.max(p1+nums[i],nums[i]);
            p2=Math.max(p2,p1);
        }
        return p2;
    }
}*/