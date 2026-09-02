class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int left = target - nums[i];
            if(store.containsKey(left)){
                result[0] = store.get(left);
                result[1] = i;
            }else{
                store.put(nums[i], i);
            }
        }
        return result;
    }
}
