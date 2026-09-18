class Solution {
    public int minimumDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int minCount = Integer.MAX_VALUE;
      int left = 0;
      int right = left + k - 1;

      while (right < nums.length) {
        minCount = Math.min(minCount, nums[right] - nums[left]);
        left++;
        right++;
      }
      return minCount;
    }
}