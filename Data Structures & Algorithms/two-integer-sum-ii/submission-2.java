class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int diff = target - numbers[right];
            if(diff == numbers[left]){
                return new int[]{left+1,right+1};
            }if(numbers[left]<diff){
                left++;
            }if(numbers[left]>diff){
                right--;
            }
        }
        return new int[]{};

    }
}
