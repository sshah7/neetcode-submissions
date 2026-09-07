class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        
        for (int i = 0; i < n; i++) {
            // Reset to 1 when we hit a zero (since product of empty = 1)
            prefix *= nums[i];
            suffix *= nums[n - 1 - i];
            
            max = Math.max(max, Math.max(prefix, suffix));
            
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }
        
        return max;
    }
}