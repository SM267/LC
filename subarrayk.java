import java.util.Scanner;

public class subarrayk {
    public static int fun(int[] nums,int k){
        int l=0;
        int n=nums.length;
        int r=0;
        int product=1;
        int count=0;
        while(r<n){
            product*=nums[r];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count ;
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K:");
        int k=sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fun(arr,k));
        
    }
}
