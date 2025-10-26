<<<<<<< HEAD
import java.util.HashMap;
class Solution
{
    public int[] twoSum(int[] nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int remain=target-nums[i];
            if(map.containsKey(remain))
            {
                return new int[]{map.get(remain),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
=======
import java.util.Arrays;
import java.util.Scanner;
class Solution {
    private int[] nums;
    private int target;
    public Solution(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }
    public int[] twoSum()
    {
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int right = indexedNums.length - 1;

        while (left < right) {
            int currentSum = indexedNums[left][0] + indexedNums[right][0];

            if (currentSum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
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

        Solution solution = new Solution(nums, target);
        int[] result = solution.twoSum();

        if (result.length > 0) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
>>>>>>> ba8736c (Initial commit)
}