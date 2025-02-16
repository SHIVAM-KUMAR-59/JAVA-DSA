/*
 Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * ( n + 1) / 2);
        int arraySum = 0;
        for(int i = 0; i < n; i++){
            arraySum += nums[i];
        }

        int diff = sum > arraySum ?  sum - arraySum :  arraySum - sum;
        return diff;
    }
}