Brute Force Solution
  class Solution{
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum1; 
        int sum2;
        for(int i=0;i<n;i++){
            sum1=0;
            sum2=0;
            for(int j=i-1;j>=0;j--){
                sum1=sum1+nums[j];
            }
            for(int k=i+1;k<n;k++){
                sum2=sum2+nums[k];
            }
            if(sum1==sum2){
                return i;
            }
        }
       return -1;
    }
}

Optimal
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}
