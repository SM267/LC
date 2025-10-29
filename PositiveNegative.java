import java.util.*;

class PositiveNegative {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;

        for (int num : nums) {
            if (num > 0)
                pos[posCount++] = num;
            else
                neg[negCount++] = num;
        }
        int[] result = new int[n];
        int i = 0, p = 0, ng = 0;

        while (p < posCount && ng < negCount) {
            result[i++] = pos[p++];
            result[i++] = neg[ng++];
        }

        while (p < posCount) {
            result[i++] = pos[p++];
        }

        while (ng < negCount) {
            result[i++] = neg[ng++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNegative sol = new PositiveNegative();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (positive and negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sol.rearrangeArray(nums);
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
