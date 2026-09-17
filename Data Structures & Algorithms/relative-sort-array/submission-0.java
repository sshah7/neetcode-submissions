class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> store = new HashMap<>();
        int[] result = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            store.put(arr1[i], store.getOrDefault(arr1[i], 0) + 1);
        }
        int idx = 0;
        for (int num : arr2) {
            while (store.getOrDefault(num, 0) > 0) {
                result[idx++] = num;
                store.put(num, store.get(num) - 1);
            }
        }
        List<Integer> remaining = new ArrayList<>();
        for (int key : store.keySet()) {
            while (store.get(key) > 0) {
                remaining.add(key);
                store.put(key, store.get(key) - 1);
            }
        }
        Collections.sort(remaining);
        for (int num : remaining) {
            result[idx++] = num;
        }
        return result;
    }
}