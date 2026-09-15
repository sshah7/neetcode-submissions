class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer> store = new HashSet<>();
        int[] result = new int[2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!store.add(grid[i][j])) {
                    result[0] = grid[i][j];
                }
            }
        }
        
        for (int num = 1; num <= n * n; num++) {
            if (!store.contains(num)) {
                result[1] = num;
                break;
            }
        }
        
        return result;
    }
}