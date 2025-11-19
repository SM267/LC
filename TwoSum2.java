import java.util.*;

public class TwoSum2 {
    public int sum(int[] nums, int target) {
        int n = nums.length;
        int s = n - 1;
        int i = 0;
        Arrays.sort(nums);
        while (i < s) {
            if (nums[i] + nums[s] > target) {
                s--;
            } else if (nums[i] + nums[s] < target) {
                i++;
            } else {
                System.out.println(+i + "," + s);
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSum2 ts = new TwoSum2();
        int result = ts.sum(nums, target);
        System.out.println("Result: " + result);
    }
}

/*
 * class Solution {
 * public int[] twoSum(int[] numbers, int target) {
 * int i = 0;
 * int j = numbers.length - 1;
 * while (i < j) {
 * if (numbers[i] + numbers[j] == target) {
 * return new int[]{i + 1, j + 1};
 * } else if (numbers[i] + numbers[j] < target) {
 * i++;
 * } else {
 * j--;
 * }
 * }
 * return new int[]{-1, -1};
 * }
 * }
 * 
 */