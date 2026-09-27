class Solution {
    public void nextPermutation(int[] nums) {
    int i = nums.length - 2;

    // Step 1: find pivot (first nums[i] < nums[i+1] from the right)
    while (i >= 0 && nums[i] >= nums[i + 1]) i--;

    if (i >= 0) {
        // Step 2: find rightmost element bigger than pivot, swap
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) j--;
        swap(nums, i, j);
    }

    // Step 3: reverse everything after pivot
    reverse(nums, i + 1, nums.length - 1);
}

private void swap(int[] a, int i, int j) {
    int t = a[i]; a[i] = a[j]; a[j] = t;
}

private void reverse(int[] a, int l, int r) {
    while (l < r) swap(a, l++, r--);
}
}