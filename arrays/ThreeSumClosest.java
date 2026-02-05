// Problem: 3Sum Closest
// Pattern: Sorting + Two Pointers

import java.util.*

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n= nums.length;
        int best =nums[0] + nums[1] + nums[2];;

        for (int i=0; i< n-2 ; i++){
            int j=i+1; int k=n-1; 
            
            if(i > 0 && nums[i]== nums[i-1]) continue;

            while( j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (sum==target){
                    return sum;
                }
                else if ( Math.abs(sum - target) < Math.abs(best - target)) {
                    best= sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;   
                }
            }
        }
    return best;
    }
}
