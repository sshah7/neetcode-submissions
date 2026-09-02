class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int diff = target - numbers[right];
            if(diff == numbers[left]){
                return new int[]{left+1,right+1};
            }else if(numbers[left]<diff){
                left++;
            }else{
                right--;
            }
        }
        return new int[2];

    }
}
