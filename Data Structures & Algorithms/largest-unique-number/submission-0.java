class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxNumber = -1;
    
        for(int i=0; i<nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        for(int num : count.keySet()) {
            if(count.get(num) == 1) {
                maxNumber = Math.max(maxNumber, num);
            }
        }

        return maxNumber;
    }
}