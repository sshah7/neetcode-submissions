class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> store = new HashMap<>();


        for(int n: nums){
            store.put(n, store.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer, Integer>> res = new ArrayList<>(store.entrySet());
        int[] result = res.stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .mapToInt(entry -> entry.getKey())
                .toArray();

        return result;

    }
}
