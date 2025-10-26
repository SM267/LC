import java.util.Scanner;

//import static java.lang.classfile.TypeKind.INT;
//import static sun.nio.cs.Surrogate.MIN;

class MajoritySumNext{
    /*public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    } */
    public int maxSubArray(int[] nums){
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
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
        MajoritySumNext d = new MajoritySumNext();
        int result = d.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}