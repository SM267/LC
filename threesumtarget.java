import java.util.*;

class threesumtarget{
    int ssum(int [] nums,int target){
        int n=nums.length;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target:");
        int t=sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        threesumtarget o=new threesumtarget();
        System.out.println(o.ssum(arr,t));
    }
}