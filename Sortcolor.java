import java.util.*;
class Sortcolor{
    public static void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sc(int [] nums){
        int n =nums.length;
        int r=n-1,l=0,m=0;
        while(m<=r){
            if(nums[m]==0){
                swap(nums,m,l);
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,r);
                r--;
                
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
        sc(arr);
    }
}