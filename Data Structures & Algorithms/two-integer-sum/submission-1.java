class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        
        int left=0;
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            if((!store.isEmpty() && store.containsKey(result))){
                return new int[]{store.get(result), i};
            }else{
                store.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
