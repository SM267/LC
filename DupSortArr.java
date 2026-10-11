import java.util.*;
class DupSortArr{
    public void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    static int removeDuplicates(int[] nums){
        int n=nums.length;
        int l=0,r=1;
        while(r<n){
            if (nums[l] == nums[r])r++;
            else l++;nums[l]=nums[r];r++;
        }
        return l+1;
    } 
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }
}