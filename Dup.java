    import java.util.HashSet;
    import java.util.Scanner;

    public class Dup {
        static int findDuplicate(int[] nums) {
            HashSet<Integer> hs=new HashSet<>();
            int n=nums.length;
            int i=0;
            while(i<n){
                if(hs.contains(nums[i])){
                    break;
                }
                hs.add(nums[i]);
                i++;
            }
            System.out.println(nums[i]);
            return nums[i];
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            findDuplicate(arr);
        }
    }




    /*
    class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        int i=0;
        int n1=0;
        while(i<n){
            if(hs.contains(nums[i])){
                n1=nums[i];
            }
            hs.add(nums[i]);
            i++;
        }
        return n1;
    }
}
     */

/*

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int n2=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                n2=nums[i];
            }
        }
        return n2;
    }
}*/