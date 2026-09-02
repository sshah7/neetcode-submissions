class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> store = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(store.containsKey(nums[i])){
                store.put(nums[i], store.getOrDefault(nums[i],0)+1);
            }else{
                store.put(nums[i],1);
            }
        }

        int[] result = store.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return result;
    }
}
