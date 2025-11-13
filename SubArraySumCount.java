import java.util.*;
public class SubArraySumCount {
    public void sac(int[] arr,int k){
        int n=arr.length;
        
    }
/* BruteForceApproach
 class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
 */
   public static void main(String[] var0) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        SubArraySumCount obj = new SubArraySumCount();
        obj.sac(arr, k);
   }
}
