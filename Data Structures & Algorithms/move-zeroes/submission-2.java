class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while(right<nums.length){
            int temp=0;
            if(nums[right] == 0 ){
                right++;
            }else if(nums[left]==0 && nums[right] !=0){
                temp= nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right++;
                left++;
            }else{
                left++;
                right++;
            }
        }
        return;
    }
}