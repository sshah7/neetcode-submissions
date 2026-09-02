class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            store.put(nums[i], store.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length/3;
        result = store.entrySet().stream()
                .filter(entry -> entry.getValue()>n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return result;
    }
}