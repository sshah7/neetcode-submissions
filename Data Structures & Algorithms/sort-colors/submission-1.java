class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right = nums.length -1;
        int curr=0;

        while(curr<=right){
            int temp =0;
            if(nums[curr] == 0){
                temp = nums[left];
                nums[left] = nums[curr];
                nums[curr] = temp;
                left++;
                curr++;
            }else if(nums[curr] == 2){
                temp = nums[right];
                nums[right] = nums[curr];
                nums[curr] = temp;
                right--;
            }else{
                curr++;
            }
        }
    }
}