// Problem: 3Sum (LeetCode)
// Approach: Sort + Two Pointers
// Time Complexity: O(n^2)
// Space Complexity: O(1) (excluding output)

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> tuples = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0;i < n - 2;i++){
        int j = i+1,k = n - 1;
        
        if(i > 0 && nums[i] == nums[i-1]) continue;// skip duplicate first number
        
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0){
            tuples.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
            k--;
            while(j < k && nums[j] == nums[j-1]) j++;
            }else if(sum < 0) j++;
            else k--;

        }
       }

       return tuples;
    }
}
