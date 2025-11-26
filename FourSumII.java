import java.util.*;
public class FourSumII {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                count += map.getOrDefault(-(c + d), 0);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n];
        int[] nums4 = new int[n];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n; i++) nums1[i] = sc.nextInt();

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) nums2[i] = sc.nextInt();

        System.out.println("Enter elements of nums3:");
        for (int i = 0; i < n; i++) nums3[i] = sc.nextInt();

        System.out.println("Enter elements of nums4:");
        for (int i = 0; i < n; i++) nums4[i] = sc.nextInt();

        int result = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println("Total number of tuples with sum 0 = " + result);
    }
}
