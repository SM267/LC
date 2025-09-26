import java.util.*;
public class ArrSortRotate {
        public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            if (nums[i] > nums[next]) {
                count++;
            if (count > 1) return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean result = check(nums);
        System.out.println(result);
    }
}