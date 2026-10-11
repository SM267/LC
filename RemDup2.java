import java.util.*;
public class RemDup2 {
    public static int removeDuplicates1(int[] nums){
        int l=0,r=1;
        int count=1;
        while(r<nums.length){
            if(nums[l]==nums[r]){
                count++;
                l++;
                r++;
                if(count>2){
                    while(nums[l]!=nums[r]){
                        nums[l]=nums[r];
                        r++;
                    }
                }
            }
            else{
                l++;
                r++;
            }
        }
        return l+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates1(arr);
    }
}//             l r cout=3            l   r 
// Input:  [1,1,1,2,2,3] [1 1 2]  1 1 1 1 2 2 3
// Output: [1,1,2,2,3]
        //  l r
// Input:  [0,0,1,1,1,1,2,3,3]
// Output: [0,0,1,1,2,3,3]

// Input:  [1,1,2,2,3,3]
// Output: [1,1,2,2,3,3]

// Input:  [1,2,3,4]
// Output: [1,2,3,4]
    //    
// Input:  [1,1,1,1,1]
// Output: [1,1]

// Input:  []
// Output: []