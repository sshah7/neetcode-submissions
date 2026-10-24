class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int count=0;
        int zeroes=0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0)    zeroes++;
            while(k<zeroes){
                if(nums[left]==0) zeroes--;
                left++;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}