import java.util.*;

class FourSum {
    public List<List<Integer>> sum(int[] nums, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        int n = nums.length;
        if (n < 4)
            return ll;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ll.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        int leftVal = nums[left];
                        while (left < right && nums[left] == leftVal) {
                            left++;
                        }

                        int rightVal = nums[right];
                        while (left < right && nums[right] == rightVal) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ll;
    }
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