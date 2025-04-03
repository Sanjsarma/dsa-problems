//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/?envType=daily-question&envId=2025-04-02
// O(n^3) brute force
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i<nums.length; i++){
            for (int j=i+1; j<nums.length;j++) {
                for (int k=j+1; k<nums.length;k++) {
                        max = Math.max(max,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }

        if (max<0) {
            return 0;
        } 
        return max;
    }
}

//greedy : 
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int k=2; k<nums.length;k++) {
            int maxPrefix = nums[0];
                for (int j=1; j<k;j++) {
                        max = Math.max(max,(long)(maxPrefix-nums[j])*nums[k]);
                        maxPrefix = Math.max(maxPrefix, nums[j]);
                }
        }

        return max;
    }
}

//O(n) solution
// (nums[i]-nums[j])*nums[k] : 
// nums[i] - nums[j] : should be max.
// nums[i[ : should be max
    
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        long iMax = 0, dMax = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, (dMax * nums[i]));
            dMax = Math.max(dMax, (iMax - nums[i]));
            iMax = Math.max(iMax, nums[i]);
        }
        return res;
    }
}
