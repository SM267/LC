import java.util.*;

public class LongestConsecutiveMatch {
    public int findLongestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int nn : set) {
            if (!set.contains(nn - 1)) {
                int count = 1;
                int cn = nn;
                while (set.contains(cn + 1)) {
                    cn++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
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

/*
 * int n = nums.length;
 * Arrays.sort(nums);
 * int count = 1;
 * int longest = 1;
 * for (int i = 0; i < n - 1; i++) {
 * if (nums[i + 1] == nums[i]) {
 * continue;
 * } else if (nums[i + 1] == nums[i] + 1) {
 * count++;
 * } else {
 * count = 1;
 * }
 * longest = Math.max(longest, count);
 * }
 * return longest;
 * }
 */