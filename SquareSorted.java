import java.util.*;
class SquareSorted {
    static public int[] ss(int [] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=(int) Math.pow(nums[i],2);
        }
        for(int num:nums){
            System.out.print(num+",");
        }
        System.out.println();
        Arrays.sort(nums);
        for(int num:nums){
            System.out.print(num+",");
        }
        return nums;
    }
    static void s1(int [] nums,int f) {
        if(f==nums.length){
            return;
        }
        nums[f]=nums[f]*nums[f];
        s1(nums,f+1);
    }
    static void  prt(int [] nums) {
        for(int num:nums){
            System.out.print(num+",");
        }
        System.out.println();
    }
    public int[] ss1(int [] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int pos=n-1;
        int[] result=new int[n];
        while(l<=r){
            if(Math.abs(nums[l])> Math.abs(nums[r])){
                result[pos]=(int)Math.pow(nums[l],2);
                l++;
            }
            else{
                result[pos]=(int)Math.pow(nums[r],2);
                r--;
            }
            pos--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // bruteforce ss(arr);
        // recursion s1(arr,0);
        SquareSorted o=new SquareSorted();
        int[] result = o.ss1(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
