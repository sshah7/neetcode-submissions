class Solution {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        boolean changed = true;
        while (changed) {
            changed = false;
            int[] next = arr.clone();
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    next[i]++;
                    changed = true;
                } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    next[i]--;
                    changed = true;
                }
            }
            arr = next;
        }
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }
}