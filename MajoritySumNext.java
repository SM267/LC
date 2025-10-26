import java.util.Scanner;

//import static java.lang.classfile.TypeKind.INT;
//import static sun.nio.cs.Surrogate.MIN;

class MajoritySumNext{
    public int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                maxi=max(maxi,sum);
            }
        }
        return {System.out.print(maxi)};
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
        MajoritySumNext d=new MajoritySumNext();
        d.maxSubArray(nums);
    }
}