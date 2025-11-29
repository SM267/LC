import java.util.*;

public class MinimumSumTriplet {

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void sort(int[] a) {
        int n = a.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }
    }

    public int mst(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            return -1;
        }

        Arrays.sort(nums);

        int sum = nums[0] + nums[1] + nums[2];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ab = sc.nextInt();
        int[] nums = new int[ab];

        for (int i = 0; i < ab; i++) {
            nums[i] = sc.nextInt();
        }

        MinimumSumTriplet aa = new MinimumSumTriplet();
        int d = aa.mst(nums);

        System.out.println(d);
    }
}
/*class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int j = 1; j < n - 1; j++) {
            int leftMin = Integer.MAX_VALUE;
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j] && nums[i] < leftMin) {
                    leftMin = nums[i];
                }
            }
            if (leftMin == Integer.MAX_VALUE) continue;

            int rightMin = Integer.MAX_VALUE;
            for (int k = j + 1; k < n; k++) {
                if (nums[k] < nums[j] && nums[k] < rightMin) {
                    rightMin = nums[k];
                }
            }
            if (rightMin == Integer.MAX_VALUE) continue;

            int sum = leftMin + nums[j] + rightMin;
            if (sum < ans) {
                ans = sum;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
 */