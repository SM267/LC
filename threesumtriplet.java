import java.util.*;
public class threesumtriplet {
    public void ssum(int[] nums,int n){
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j = i + 1;
            int k = nums.length - 1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                j++;
                k--;
            }
            else if(sum<0){
                j++;
            }
            else{
                k--;
            }
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        threesumtriplet o=new threesumtriplet();
        o.ssum(arr,n);
    }
}
