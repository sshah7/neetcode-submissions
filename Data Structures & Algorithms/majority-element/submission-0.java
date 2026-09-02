class Solution {
    public int majorityElement(int[] nums) {
        int k=0;
        int majority= nums.length/2;
        Map<Integer,Integer> store = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            store.put(nums[i], store.getOrDefault(nums[i],0)+1);
        }

        k = store.entrySet().stream()
            .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
            .findFirst()
            .get()
            .getKey();

        return k;
    }
}