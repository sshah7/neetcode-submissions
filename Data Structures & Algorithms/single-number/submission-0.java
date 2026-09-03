class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> store = new HashMap<>();
       for(int i=0; i<nums.length; i++){
            store.put(nums[i], store.getOrDefault(nums[i],0)+1);
       }
       int result = store.entrySet().stream()
                    .filter(a -> a.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .get(); 

        return result;
    }
}