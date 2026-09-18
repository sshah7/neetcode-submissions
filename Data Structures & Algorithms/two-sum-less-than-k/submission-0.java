class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int maxCount=-1;
        int left = 0;
        int right= nums.length-1;;
        Arrays.sort(nums);
        while(left < right){
            int target = k - nums[left];
            if(target <= nums[right]){
                right--;
            }else{
                maxCount = Math.max(maxCount, nums[right]+ nums[left]);
                left++;
            }
        }
        return maxCount;
    }
}
