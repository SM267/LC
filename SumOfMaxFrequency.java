import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int maxFrequencyElements(int[] nums) {  // plural "Elements"
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for (int f : map.values()) {
            max = Math.max(max, f);
        }

        int result = 0;
        for (int f : map.values()) {
            if (f == max) {
                result += f;
            }
        }

        return result;
    }
}

public class SumOfMaxFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int ans = sol.maxFrequencyElements(nums);
        System.out.println("Output: " + ans);

        sc.close();
    }
}
