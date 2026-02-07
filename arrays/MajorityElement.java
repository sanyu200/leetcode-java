// Problem: Majority Element (LeetCode)
// Pattern: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)  

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int majority = nums[0];
        int count = 0;

        // Count consecutive equal elements
        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
                if (count >= n / 2) {
                    majority = nums[i];
                }
            } 
            else {
                count = 0;
            }
        }
        return majority;
    }
}
