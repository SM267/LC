//public class 3Sum{

//}
/*BRUTE force approach
 * 
 * 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    st.add(Arrays.asList(nums[i], nums[left], nums[right]));
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return new ArrayList<>(st);
    }
}




import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
 */

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    int leftVal = nums[left];
                    while (left < right && nums[left] == leftVal) {
                        left++;
                    }

                    // Skip duplicates for right
                    int rightVal = nums[right];
                    while (left < right && nums[right] == rightVal) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++; // need a bigger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }
        return result;
    }
}