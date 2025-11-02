import java.util.*;

public class LongestConsecutiveMatch {
    public int findLongestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (!ls(nums, x - 1)) {
                int currentCount = 1;
                while (ls(nums, x + 1)) {
                    x = x + 1;
                    currentCount++;
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
        }

        return maxCount;
    }

    public boolean ls(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongestConsecutiveMatch np = new LongestConsecutiveMatch();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        int length = np.findLongestConsecutive(nums);
        System.out.println("Length of longest consecutive sequence: " + length);
    }
}
