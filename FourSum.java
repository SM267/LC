import java.util.*;

class FourSum {
    public List<List<Integer>> sum(int[] nums, int target) 
    {
        int n = nums.length;
        List<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(nums);
        
    }
    /* Better Solution
    public List<List<Integer>> sum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int p=j+1,q=n-1;
                if(p<q){
                    int sums=nums[i]+nums[j]+nums[p]+nums[q];
                    if(sums<target){
                        p++;
                    }else if(sums>target){
                        q--;
                    }else{
                        ll.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;
                    }
                }
            }
        }
        return ll;
    }
    */
    /*
     * Brute Force
     * public List<List<Integer>> sum(int[] nums, int target) {
     * List<List<Integer>> l = new ArrayList<>();
     * int n = nums.length;
     * for (int i = 0; i < n; i++) {
     * for (int j = i + 1; j < n; j++) {
     * for (int k = j + 1; k < n; k++) {
     * for (int m = k + 1; m < n; m++) {
     * if (nums[i] + nums[j] + nums[k] + nums[m] == target) {
     * l.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
     * Arrays.sort(nums);
     * }
     * }
     * }
     * }
     * }
     * return l;
     * }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();
        FourSum s = new FourSum();
        List<List<Integer>> result = s.sum(nums, target);
        System.out.println("Quadruplets that sum to target: " + result);
    }
}