class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=0)  return false; 
        for (int left = 0; left < nums.length; left++) {
            for (int right = left + 1; right < nums.length; right++) {
                if (nums[left] == nums[right] && Math.abs(left-right)<=k) {
                    return true;
                }
            }
        }
        return false;
    }
}