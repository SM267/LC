import java.util.*;
class TwoSum{
    public static int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0,right=n-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int t = sc.nextInt();
        System.out.println(twoSum(arr,t));
    }
}
