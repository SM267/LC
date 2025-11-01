import java.util.*;

public class NextPermutations {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j=n-1;
        if(i>=0){
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    //2 1 5 4 3 0 0   2 3 5 4 1 0 0
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NextPermutations np = new NextPermutations();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }
        np.nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}