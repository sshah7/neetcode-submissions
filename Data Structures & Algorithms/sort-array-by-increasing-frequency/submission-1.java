class Solution {
    public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> store = new HashMap<>();
    for (int num : nums)
        store.put(num, store.getOrDefault(num, 0) + 1);


    return store.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue()
        .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
        .flatMap(e -> Collections.nCopies(e.getValue(), e.getKey()).stream())
        .mapToInt(Integer::intValue)
        .toArray();
}
}